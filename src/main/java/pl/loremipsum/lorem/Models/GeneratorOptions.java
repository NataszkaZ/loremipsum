package pl.loremipsum.lorem.Models;

public class GeneratorOptions {

    private int amount = 1;
    private int constantValue;
    private int typ = 1;
    private int from;
    private int to;

    public int getTyp() {
        return typ;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }

    public int getAmount() {

        return amount;
    }

    public int getContantValue() {

        return constantValue;
    }

    public void setContantValue(int contantValue) {

        this.constantValue = contantValue;
    }

    public void setAmount(int amount) {

        this.amount = amount;
    }


    public int getFrom() {

        return from;
    }

    public void setFrom(int from) {

        this.from = from;
    }

    public int getTo() {

        return to;
    }

    public void setTo(int to) {

        this.to = to;
    }
}
