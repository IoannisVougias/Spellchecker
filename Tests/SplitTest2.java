import java.util.Scanner;


public class SplitTest2 {

	public static void main (String[] args) {

		String text = "������ ��    ����";

		String[] splittedArray = text.split("[^�-��-��-�]+");

		String[] array = splittedArray;

		if (array[2].equals("����")) {
			System.out.println("well done team!");
			System.out.println("To programma douleuei osa kena kai na exei anamesa stis le3eis");
		} else {
			System.out.println("try again");
			System.out.println(array[0]);
		}

		for  (int i=0 ; i< array.length;i ++) {
			if(array[i] != null) {
				System.out.println();
				System.out.println(array[i]);
		        System.out.println("\n");
			}
		}
	}
}