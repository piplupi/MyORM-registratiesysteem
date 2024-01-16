package designPattern.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Processor {
    public Number showTHisNumber = new Number();
    private Processor nextProcessor;

    public Processor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public String process(Number request) {
        if (nextProcessor != null){
            return nextProcessor.process(request);
        }
        return "Error";
    }

    public List<String> gatherInfoShowThisNumber(){
        List<String> myList = new ArrayList<>();

        return myList;

    };

}
