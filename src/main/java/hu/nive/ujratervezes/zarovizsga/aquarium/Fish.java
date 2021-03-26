package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

    private String name;

    private int weight;

    private String color;

    private boolean shortTermMemoryLoss;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.shortTermMemoryLoss = false;
    }

    public Fish(String name, int weight, String color, boolean shortTermMemoryLoss) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.shortTermMemoryLoss = shortTermMemoryLoss;
    }

    public abstract void feed();

    public String status() {
        return String.format("%s, weight: %d, color: %s, short term memory loss: %b", name, weight, color, shortTermMemoryLoss);
    }

    public void addWeight(int weight) {
        this.weight += weight;
    }

    public boolean hasMemoryLoss() {
        return shortTermMemoryLoss;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
