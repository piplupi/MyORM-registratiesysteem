package designPattern.ChainOfResponsibility;

import java.util.List;

public class Chain {

    Processor chain;

    public Chain() {
        buildChain();
    }

    private void buildChain() {
        chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
    }


    public String process(Number request) {
        return chain.process(request);
    }

    public List<String> getMessageData(){
        return chain.gatherInfoShowThisNumber();
    }

    public void setChain(Processor chain) {
        this.chain = chain;
    }

    public Processor getChain() {
        return chain;
    }

    @Override
    public String toString() {
        return "Chain{" +
                "chain=" + chain +
                '}';
    }
}
