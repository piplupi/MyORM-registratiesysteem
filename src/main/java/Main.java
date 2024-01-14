import Scanner.StartApp;
import service.RegisterService;

public class Main {
    public static void main(String[] args) {
        RegisterService invoer = new RegisterService();
//        invoer.regStudentenAndDetails();
//        invoer.regDocenten();
//        invoer.regOnderdelen();
//        invoer.regLokalen();

        StartApp begin = new StartApp();
        begin.runApp();

    }
}