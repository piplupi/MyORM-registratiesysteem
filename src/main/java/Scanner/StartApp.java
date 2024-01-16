package Scanner;

import java.util.Scanner;

public class StartApp {

    private static StudentScanner studentInfo = new StudentScanner();
    private static DocentScanner docentInfo = new DocentScanner();
    private static OnderdeelScanner onderdeelInfo = new OnderdeelScanner();

    public void runApp() {

        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        System.out.println("Welcome!!!");
        System.out.println("Select an Option \n1 Onderdelen\n2 Studenten\n3 Docenten\n0 Exit");
        int option;
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();
        switch (option) {
            case 1:
                onderdeelInfo.OnderdeelPage();

            case 2:
                studentInfo.StudentPage();
//
//            case 3:
//                docentInfo.DocentPage();

            case 0:
                System.exit(0);

            default:
                System.out.println("Please enter a valid option");
        }

    }

}
