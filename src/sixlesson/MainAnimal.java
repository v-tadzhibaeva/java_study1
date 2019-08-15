package sixlesson;

public class MainAnimal {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Zlata the cat",200, 2, 0),
                new Dog("Sharik the dog",500, 0.5, 0)};
        for (Animal animal : animals) {
            System.out.println(animal.getName()+ " - " + "run: " + animal.run(100));
            System.out.println(animal.getName()+ " - " + "jump: " + animal.jump(50));
            System.out.println(animal.getName()+ " - " + "swim:" + animal.swim(1));
        }
    }
}
