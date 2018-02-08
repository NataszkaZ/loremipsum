package pl.loremipsum.lorem.Models;

// 1. klasa modelu opcji - potrzebne gettery i settery
public class GeneratorOptions {
    private int ile = 7;
    private int start;
    private int stop;


    public int getIle() {
        return ile;
    }

    public void setIle(int ile) {
        this.ile = ile;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }
}
