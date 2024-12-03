
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input= new Scanner(System.in);

        System.out.println("Gestione del cliente");

        System.err.println("Scrivi il nome del cliente: ");
        String nome= input.nextLine();

        System.out.println("Scrivi il cognome del cliente");
        String cognome= input.nextLine();

        System.out.println("Data di nascita: [dd/MM/yyyy]");
        String data_nascita= input.nextLine();
        DateTimeFormatter formattatore=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data_nascita_formattata= LocalDate.parse(data_nascita, formattatore);

        System.out.println("Inserisci il numero di telefono:");
        String cellulare= input.nextLine();

        System.out.println("Inserisci delle note: ");
        String note= input.nextLine();

        System.out.println("inserisci l'email: ");
        String email=input.nextLine();

        System.out.println("Inserisci la psw: ");
        String psw=input.nextLine();

        System.out.println("Inserisci l'username: ");
        String username=input.nextLine();

        System.out.println("inserisci la data e ora di iscrizione: [dd/MM/yyyy HH:mm]");
        String data_iscrizione= input.nextLine();
        DateTimeFormatter formattatore2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime data_iscrizione_formattata= LocalDateTime.parse(data_iscrizione, formattatore2);

        input.close();

        System.out.println("-----------------------------");

        System.out.println("Le caratteristiche del cliente sono: ");
        System.out.println("Nome: "+nome);
        System.out.println("Cognome: "+cognome);
        System.out.println("Data di nascita: "+data_nascita_formattata);
        System.out.println("Cellulare: "+cellulare);
        System.out.println("Note: "+note);
        System.out.println("Email: "+email);
        System.out.println("La psw è: "+psw);
        System.out.println("l'username è: "+username);
        System.out.println("La data di iscrizione è: "+data_iscrizione_formattata);

        System.out.println("Grazie per l'uso");
        


    }
}
