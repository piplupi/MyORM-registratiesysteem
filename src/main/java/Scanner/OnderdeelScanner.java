package Scanner;

import designPatterns.Builder.Onderdeel;
import designPatterns.Builder.OnderdeelService;
import service.DocentService;

import java.util.List;
import java.util.Scanner;

public class OnderdeelScanner {
    private static Scanner scanner;
    private static OnderdeelService onderdeelService;
    private static StartApp start = new StartApp();


    public void OnderdeelPage() {
        mainMenu();

        int option;
        scanner = new Scanner(System.in);
        do {
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    displayAllSubjects();
                    mainMenu();
                    break;

                case 2:
                    zoekOnderdeel();
                    System.out.println("");
                    mainMenu();
                    break;

                case 3:
                    newOnderdeel();
                    break;

                case 4: //terug
                    start.runApp();
                    break;

                case 0: //exit
                    System.exit(0);

                default: {

                }
            }
        } while (option != 0);

    }

    private void mainMenu() {
        scanner = new Scanner(System.in);
        System.out.println("1. Wijs onderdelen");
        System.out.println("2. Zoek onderdeel op");
        System.out.println("3. Voeg nieuw onderdeel toe");
        System.out.println("4. Terug");
        System.out.println("0. Exit");

    }

    public void displayAllSubjects() {
        onderdeelService = new OnderdeelService();

        List<Onderdeel> onderdeelList = onderdeelService.findAllSubjects();

        for (Onderdeel onderdeel : onderdeelList) {
            System.out.println("\n|| Naam: " + onderdeel.getNaam() + " ||" +
                    "Prijs: " + onderdeel.getOnderdeel_prijs() + " ||");
            System.out.println("-------------------------------------------------------------------------");

        }

////        List<Onderdeel> onderdeelList = onderdeelService.findAllSubjects();
////        onderdeelList.forEach( student -> {
////            System.out.println("|Onderdeel : "+ onderdeelService.getOnderdeelByName()
////                    + "| |" + "Geboortedatum: " + student.getStudentDetail().getGeboorteDatum() + "| |"
////                    + "Adres: " + student.getStudentDetail().getAdress() +
////                    "| |" +"Telefoonnummer: " + student.getStudentDetail().getTelefoonnummer());
////
////        });
////    }
//
//        List<Onderdeel> onderdeelList = onderdeelService.findAllSubjects();
//        onderdeelList.forEach( onderdeel -> {
//            System.out.println("|Onderdeel : "+ onderdeel.getId() + " "
//                    + onderdeel.getOnderdeel() + "| |" + "StudentID: " + onderdeel.getOnderdeel_prijs());
////                            + "| |" + "Geboortedatum: " + student.getStudentDetail().getGeboorteDatum()
////                    + "| |" + "Adres: " + student.getStudentDetail().getAdress() +
////                            "| |" +"Telefoonnummer: " + student.getStudentDetail().getTelefoon_nummer());});
    }

    public void newOnderdeel() {
        scanner = new Scanner(System.in);
        onderdeelService = new OnderdeelService();

        DocentService docentService = new DocentService();
        Onderdeel onderdeel = new Onderdeel();

        System.out.println("Enter onderdeel naam:");
        onderdeel.setNaam(scanner.nextLine());

        System.out.println("Enter Prijs:");
        onderdeel.setOnderdeel_prijs(scanner.nextLine());


        onderdeelService.insertOnderdeel(onderdeel);

        OnderdeelPage();
    }

    public void zoekOnderdeel() {
        onderdeelService = new OnderdeelService();

        scanner = new Scanner(System.in);
        System.out.println("1. Bekijken");
        System.out.println("2. Deleten");
        System.out.println("0. Terug");
        System.out.println("");


        int opt;
        do {
            opt = scanner.nextInt();
            scanner.nextLine();
            switch (opt) {
                case 1:
                    System.out.println("Onderdeel:");
                    String naam = scanner.nextLine();
//                    OnderdeelService  = new OnderdeelService();
                    Onderdeel selectOnderdeel = onderdeelService.selectSpecificOnderdeel(naam);

                    System.out.println("\n|| Naam: " + selectOnderdeel.getNaam() + " ||" +
                            "Prijs: " + selectOnderdeel.getOnderdeel_prijs() + " ||");
                    System.out.println("-------------------------------------------------------------------------");

                    System.out.println(" ");
                    System.out.println("1. Bekijken");
                    System.out.println("2. Wijzigen");
                    System.out.println("3. Deleten");
                    System.out.println("0. Terug");
                    break;

                case 2:
                    System.out.println("Delete onderdeel:");
                    String delOnderdeel = scanner.nextLine();


                    onderdeelService.deleteOnderdeelByNaam(delOnderdeel);
                    System.out.println("");
                    System.out.println("1. Bekijken");
                    System.out.println("2. Deleten");
                    System.out.println("0. Terug");
                    break;

                case 0:
                    OnderdeelPage();

                default: {

                }
            }


        } while (opt != 0);
    }
}





