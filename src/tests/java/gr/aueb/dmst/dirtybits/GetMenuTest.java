import java.util.Scanner;

public class GetMenuTest {

	public static void main (String[] args) {
		int language = getMenuTest();
	}

	public static int getMenuTest() {

		Scanner input = new Scanner(System.in);
		int language = 0;
		int selection;
		System.out.println("Press 1 for Greek/ ������ 1 ��� ��������:");
		System.out.println("Press 2 for English/ ������ 2 ��� �������:");
		System.out.println("Press 3 to exit/ ������ 3 ��� �����:\n");

		try {

			language = input.nextInt();
			System.out.println();

			while ((language != 1) && (language != 2) && (language != 3)) {
				System.out.print("Please press 1 or 2 or 3\n");
				System.out.print("Press 1 for Greek:\n"
						+ "Press 2 for English:\nPress 3 to exit\n");
				language = input.nextInt();
			}

			if (language == 1) {
				System.out.println("������������� 1 ��� ������ �� �������"
						+ " ��� ���� ���  �������:");
				System.out.println("������������� 2 ��� ������ �� ��������"
						+ " ����������� ��� ������ ��� �������� ���:\n");

				selection = input.nextInt();
				System.out.println();
				while ((selection != 1) && (selection != 2)) {
					System.out.print("�������� �������������� 1 � 2\n");
					selection = input.nextInt();
					System.out.println();
				}
				if (selection == 1) {
					System.out.println("������������� ��� ������� ��� "
							+ "�������� ��� �� ��������� ��� ����� "
							+ "����������� �����:\n\n");
				} else {
					System.out.println("������������� �� path ��� "
							+ "��������� �� ������ ��� �� ��������� "
							+ "��� ����� ����������� �����:\n");
				}
			} else if (language == 2) {
				System.out.println("Press 1 if you want to test the "
						+ "spelling of a text that you will type:");
				System.out.println("Press 2 if you want to test the "
						+ "spelling of a file that you will choose:\n");

				selection = input.nextInt();
				System.out.println();
				while ((selection != 1) && (selection != 2)) {
					System.out.print("Please press 1 or 2\n");
					selection = input.nextInt();
					System.out.println();
				}
				if (selection == 1) {
					System.out.println("Type a text in English and we "
							+ "will check if the spelling is correct:\n\n");
				} else {
					System.out.println("Please insert the path of the "
							+ "file and we will check if the spelling "
							+ "is correct:\n");
				}
			} else {
				Runtime.getRuntime().exit(1);
			}
		} catch (Exception e) {

			System.out.println("\nError: You can only use 1 or 2 or 3");
			getMenuTest();
		}

		return language;

	} /* end o method */

}