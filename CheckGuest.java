
import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        // Elenco invitati
        String [] namesG = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
       
        // Richiesta nominativo
        System.out.println("Come ti chiami? (inserisci nome e cognome oppure nome d'arte)");
        String name = scan.nextLine();

        for(int i = 0; i < namesG.length; i++){
            if (namesG[i].equals(name)) {
                System.out.println(("Entri pure ") + name + (", la stavamo aspettando"));
            }else{
                System.out.println("È meglio che se ne vada, non è sull'elenco");
                break;
            }
        }

    }
}