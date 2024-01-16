package designPattern.ChainOfResponsibility;

public class Number {

    protected int chainNumber;
    protected String chainMessageInfo;

    public Number() {
    }

    public Number(int chainNumber, String chainMessageInfo) {
        this.chainNumber = chainNumber;
        this.chainMessageInfo = chainMessageInfo;
    }

    public int getChainNumber() {
        return chainNumber;
    }

    public void setChainNumber(int chainNumber) {
        this.chainNumber = chainNumber;
    }

    public String getChainMessageInfo() {
        return chainMessageInfo;
    }

    public String setChainMessageInfo(String chainMessageInfo) {
        return this.chainMessageInfo = chainMessageInfo;
    }

    @Override
    public String toString() {
        return "Number{" +
                "chainNumber=" + chainNumber +
                ", chainMessageInfo='" + chainMessageInfo + '\'' +
                '}';
    }
}