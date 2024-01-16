package Scanner;

import designPatterns.Builder.OnderdeelService;
import service.DocentService;

import java.util.Scanner;

public class DocentScanner {

    private static Scanner scanner;
    private static DocentService docentService;
    private static OnderdeelService onderdeelService;
    private static StartApp start = new StartApp();

//    public void DocentPage(){
//        mainMenu();
//
//        int option;
//        scanner = new Scanner(System.in);
//        do {
//            option = scanner.nextInt();
//            scanner.nextLine();
//            switch (option) {
//                case 1: //zie alle studenten
//                    displayAlleDocenten();
//                    mainMenu();
//                    break;
//
//                case 2: //zoek student op
//                    zoekDocent();
//                    System.out.println("");
//                    mainMenu();
//                    break;
//
//                case 3: //voeg student toe
//                    newDocent();
//                    break;
//
//                case 4: //terug
//                    start.runApp();
//                    break;
//
//                case 0: //exit
//                    System.exit(0);
//
//                default: {
//
//                }
//            }
//        } while (option != 0);
//
//    }

    private void mainMenu(){
        scanner = new Scanner(System.in);
        System.out.println("1. Zie alle docenten");
        System.out.println("2. Zoek docent op");
        System.out.println("3. Voeg nieuw docent toe");
        System.out.println("4. Terug");
        System.out.println("0. Exit");
    }



}
