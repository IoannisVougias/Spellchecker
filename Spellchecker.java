import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Spellchecker {




	public static void main(String args[]) {


	    Scanner input = new Scanner(System.in);

		System.out.println("���� ������� ��� �� ��� �� ��� ����� ����������� �����\n\n");


        String keimeno = getGreekInput();           /* ������� ������� getGreekInput */

		String[] Pinakas = keimeno.split(" ");  /* ������� ��� String ��� ����� � ������� �� ��������� ������ */

		for  (int i=0 ; i< Pinakas.length;i ++) {
			System.out.println("\n");            /* ���� */
			System.out.println(Pinakas[i]);      /* �������� ��� ������ */
            System.out.println("\n");            /* ���� */
		}










	}
	private static String getGreekInput() {    /* ������� ��� ��� ��������� �� ��������� Strings ��� �������� */

	        System.out.flush();          /* ��������� �� �����  */

	        try {                       /* ��������� ���������  */
	            BufferedReader in = new BufferedReader(new InputStreamReader(System.in, "cp737"));    /* � ���������� ���������� ��� ��������*/
	            return in.readLine();
	        } catch (Exception e) {
	            return "Error: " + e.getMessage();
	        }
    }



}