package designPattern.ChainOfResponsibility;

public class ZeroProcessor extends Processor {
    public ZeroProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    public String process(Number request) {
        if (request.getChainNumber() == 0) {
            return showTHisNumber.setChainMessageInfo(
                    "The principle has the right to suspend you for a couple of days. But not completely");
        } else {
            return super.process(request);
        }
    }
}
