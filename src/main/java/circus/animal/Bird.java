package circus.animal;

public class Bird extends Animal {
    public void fly() {
        System.out.println("Whee ...");
    }

    @Override
    public String speak() {
        return null;
    }

    @Override
    public int getValue() {
        return 0;
    }
}
