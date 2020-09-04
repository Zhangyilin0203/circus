package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
        Animal a2 = new Animal() {
            @Override
            public int getValue() {
                return 0;
            }

            @Override
            public String speak() {
                return null;
            }
        };
        Bird b2 = new Bird();
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {

        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            if(d instanceof Duck) {
                d.swim();
            }
        }
    }
}
