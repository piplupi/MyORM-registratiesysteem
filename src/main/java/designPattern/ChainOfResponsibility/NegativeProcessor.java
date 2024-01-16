package designPattern.ChainOfResponsibility;

public class NegativeProcessor extends Processor {
    public NegativeProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    public String process(Number request) {
        if (request.getChainNumber() < 0) {
            return showTHisNumber.setChainMessageInfo(
                    "Teachers are only allowed to expel students from class. Not from the school!");
        } else {
            return super.process(request);
        }
    }
}
