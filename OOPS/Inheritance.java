public class Inheritance {
    public static void main(String args[]){
       Fish shark = new Fish();
       shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

class Animal{  //base class
    String color;
    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

class Mammal extends Animal{  //multilevel & Herarical
    int legs;
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{  //Hierarical
    int legs;
    void swim(){
        System.out.println("Swim");
    }
}

class Bird extends Animal{  //Hierarical
    int legs;
    void fly(){
        System.out.println("Fly");
    }
}
class Dog extends Mammal{
    String breed;
}

//Dervived Class / Subclass
class Fish extends Animal{
   int fins;
   void swim(){
       System.out.println("Fish Swims");
   }
}
