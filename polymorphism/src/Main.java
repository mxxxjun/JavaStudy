public class Main {
    public static void main(String[] args) {

        //좌우 타입이 맞는 경우
        Animal animal1 = new Animal();
        animal1.move();

        //부모 타입에 자식 객체 대입
        Animal dog1 = new Dog();
        dog1.move();
        //dog.bark();

        //자식 타입에 부모 객체 대입
        //Dove dove = new Animal();
        //dove.fly();

        System.out.println('\n');
        System.out.println("================================================ \n");

        Animal animal2 = new Animal();
        Dog dog2 = new Dog();

        //Up-casting
        Animal up = (Animal)dog2;
        up.move();

        //Down-casting
        /*
        Dog down = (Dog)animal2; //여기서 ClassCastException 예외 발생
        down.move();
        down.bark();
         */

        System.out.println('\n');
        System.out.println("================================================ \n");

        Dog happy1 = new Dog();
        testAnimal1(happy1);

        Dove donald1 = new Dove();
        testAnimal1(donald1);

        System.out.println('\n');
        System.out.println("================================================ \n");

        Dog happy2 = new Dog();
        testAnimal2(happy2);

        Dove donald2 = new Dove();
        testAnimal2(donald2);

        System.out.println('\n');
        System.out.println("================================================ \n");

        Human kim = new Human(29, "김상형");
        Student lee = new Student(42, "이승우", 9312345, "경영");

        introHuman(kim);
        introHuman(lee);
    }

    static void introHuman(Human who){
        who.intro();
    }

    static void testAnimal1(Animal animal){
        animal.move();
        if(animal instanceof Dog){
            Dog myDog = (Dog)animal;
            myDog.bark();
        }
        if(animal instanceof Dove){
            Dove dove = (Dove)animal;
            dove.fly();
        }
    }

    static void testAnimal2(Animal animal){
        animal.move();
        if(animal instanceof Dog myDog){
            myDog.bark();
        }
        if(animal instanceof Dove dove){
            dove.fly();
        }
    }
}