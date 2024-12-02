package Piatto;
import java.util.Scanner;
public class Piatto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Scrivi il nome del piatto");
		String nome= input.nextLine();
		
		System.out.println("Scrivi una breve descrizione del piatto");
		String descrizione= input.nextLine();
		
		System.out.println("Scrivi il prezzo del piatto");
		double prezzo=input.nextDouble();
		input.nextLine();
		
		System.out.println("Il piatto è disponibile?");
		boolean disponibile=input.nextBoolean();
		input.nextLine();
		
		System.out.println("A che tipologia apprtiene?");
		System.out.println("1)Tipologia pesce");
		System.out.println("2)Tipologia carne");
		System.out.println("3)Tipologia frutta");
		System.out.println("4)Tipologia crostacei");
		System.out.println("5)Tipologia dolce");
		byte tipologia=input.nextByte();
		input.nextLine();
		
		System.out.println("Scrivi gli allergeni: ");
		String allergeni=input.nextLine();
		
		System.out.println("Ci sono foto? ");
		String foto=input.nextLine();
		
		System.out.println("Quante calorie ha il piatto?: ");
		short calorie=input.nextShort();
		input.nextLine();
		
		System.out.println("Quali variazioni prevede il piatto?:");
		String variazione=input.nextLine();
		
		System.out.println("Le caratteristiche del tuo piatto sono qui elencate: ");
		System.out.println("Il nome del piatto è: "+nome);
		System.out.println("La descrizione è: "+descrizione);
		System.out.println("Il prezzo è: "+prezzo);
		System.out.println("Disponibilità: "+disponibile);
		if (tipologia==1) {
			System.out.println("La tipologia appartiene alla classe: pesce");
		
		}
		else if (tipologia==2) {
			System.out.println("La tipologia appartiene alla classe: carne");
		}
		else if (tipologia==3) {
			System.out.println("La tipologia appartiene alla classe: frutta");
		}
		else if (tipologia==4) {
			System.out.println("La tipologia appartiene alla classe: crostacei");
		}
		else {
			System.out.println("La tipologia appartiene alla classe: dolce");
		}
		
		System.out.println("Gli allergeni sono: "+allergeni);
		System.out.println("Ci sono foto: "+foto);
		System.out.println("Le calorie del piatto sono: "+calorie);
		System.out.println("Le variazioni disponibili sono: "+variazione);
		
		input.close();
		
	}

}
