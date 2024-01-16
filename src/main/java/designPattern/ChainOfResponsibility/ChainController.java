package designPattern.ChainOfResponsibility;

import java.util.List;

public class ChainController {

    private Chain chain = new Chain();

    public String printStudentAmount(Number number) {
        return chain.process(number);
    }

    public List<String> chainMessage() {
        return chain.getMessageData();
    }
}
