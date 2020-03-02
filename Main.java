public class Main {

    public static void main(String[] args) {
    
        Animal animalObject1 = new Animal();
        Cat catObject1 = new Cat();
        Dog dogObject1 = new Dog();
        Beagle beagleObject1 = new Beagle();

        animalObject1.setWeight(34.2f);
        System.out.println(animalObject1.getWeight());

        catObject1.setWeight(12);
        System.out.println(catObject1.getWeight());

        catObject1.setName("Lucy");
        System.out.println("Name of first cat: "+catObject1.getName());

        dogObject1.setSnoutLength(10.5f);
        System.out.println("Snout length of first dog: "+dogObject1.getSnoutLength()+"cm");
        System.out.println("Weight of first dog: "+dogObject1.getWeight());

        beagleObject1.setEarLength(4.89);
        System.out.println("Ear Length of first beagle: "+beagleObject1.getEarLength()+"cm");

    }
}
        