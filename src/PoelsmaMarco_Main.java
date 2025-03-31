import java.util.Scanner;
import java.util.ArrayList;
import models.PoelsmaMarco_Character;
import java.io.File;
import java.time.Year;
public class PoelsmaMarco_Main {
    public static ArrayList<PoelsmaMarco_Character> characters = new ArrayList<>();
    public static void main (String[] args) {
        //Ejercicio 1
        try {
            File file = new File("lib/characters-one-piece.csv");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split("&");
                characters.add(new PoelsmaMarco_Character(
                        line[0],
                        Integer.parseInt(line[1]),
                        Integer.parseInt(line[2]),
                        Year.parse(line[3]),
                        line[4]
                ));
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            for (PoelsmaMarco_Character character : characters) {
                System.out.println(character);
            }
            System.out.println("Total characters: " + characters.size());
        }
        //Ejercicio 2
        try {
            File file = new File("lib/characters-one-piece.csv");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(";");
                characters.add(new PoelsmaMarco_Character(
                        line[0],
                        Integer.parseInt(line[1]),
                        Integer.parseInt(line[2]),
                        Year.parse(line[3]),
                        line[4]
                ));
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            for (PoelsmaMarco_Character character : characters) {
                System.out.println(character);
            }
            System.out.println("Total characters: " + characters.size());
        }
    }

}