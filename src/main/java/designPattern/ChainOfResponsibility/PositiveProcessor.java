package designPattern.ChainOfResponsibility;

public class PositiveProcessor extends Processor {

    public PositiveProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    public String process(Number request) {
        if (request.getChainNumber() > 0) {
            showTHisNumber.setChainNumber(request.getChainNumber());

            return showTHisNumber.setChainMessageInfo("" +
                    "Head of the Sports School may Ban students from the school forever.");
        } else {
            return super.process(request);
        }
    }
}
