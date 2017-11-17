import java.util.Map;
import java.util.TreeMap;
public class Menu {

	public static void main(String args[]) {

		Spellcheck Spell = new Spellcheck();
		int choice = getMenu();
		String text = getGreekInput();
		System.out.printf("\n");
		Spell.spellcheck(choice,text);
		

	}
	
	
	public static int getMenu() {



			System.out.println("Press 1 for Greek:\nPress 2 for English:\n");

			int choice = input.nextInt();

			while( (choice != 1) && (choice != 2) ) {
			  		System.out.print("You should choose either 1 or 2\n");
			        System.out.print("Press 1 for Greek:\nPress 2 for English:\n");
			        choice = input.nextInt();
	      		}

			if(choice == 1) {
			System.out.println("Πληκτρολόγησε ένα κείμενο στα ελληνικά και θα ελέγξουμε άμα είναι ορθογραφικά σωστό:\n\n");



			} else {
			System.out.println("Type a text in English and we will check if the spelling is correct:\n\n");


			}

			return choice;

	}  /* Τέλος getMenu */
	
	public static String getGreekInput() {    /* Μέθοδος που σου επιτρέπει να διαβάζεις Strings στα ελληνικά */

		        System.out.flush();          		/* Καθαρίζει τη μνήμη  */

		        try {
		            BufferedReader in = new BufferedReader(new InputStreamReader(System.in, "cp737"));    /* Χειρισμός εξαίρεσης  */
		            return in.readLine();
		        } catch (Exception e) {
		            return "Error: " + e.getMessage();
		        }

	}  /* Τέλος μεθόδου getGreekInput */

	
	


}
