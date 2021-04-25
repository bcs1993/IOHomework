import java.io.*;
import java.util.Scanner;

public class Main {
    // public static void main(String[] args) throws IOException {
    //    BufferedWriter bw = new BufferedWriter(new FileWriter("contacts.txt"));
    // }
    public static void main(String[] args) {
     //  addFavoriteTvShow();
            getFavShows();
            
    }
    public static void addFavShows() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Model\\fav-shows.txt"));
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Add favorite TV shows");
                String show = scanner.nextLine();
                bw.write(show + "\n");
                System.out.println("Success: added " + show);
                System.out.println("Add another show? (y/n");
                String userInput = scanner.nextLine();
                if (!userInput.equals("y")) {
                    break;
                }
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO Exception when writing to fav-show.txt: " + e.getMessage());
        }

    }
    public static void getFavShows() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Model\\fav-shows.txt"));
            String fileData;
            while ((fileData = br.readLine()) != null) {
                System.out.println(fileData);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO Exception when reading from fav-shows.txt " + e.getMessage());
        }
    }



}

