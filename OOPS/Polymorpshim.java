public class Method_Overloading {
    public static void main(String args[]){
       Calculator calc= new Calculator();
       System.out.println(calc.sum(1,2));
       System.out.println(calc.sum((float)1.5,(float)2.5));
       System.out.println(calc.sum(1,2,3));
        Dear d = new Dear();
        d.eat();  // it print only child class function although parent class have same function
        Animals a = new Animals();
        a.eat();
    }
}

class Animals {   // method overriding
    void eat(){
        System.out.println("eats anythings");
    }
}

class Dear extends Animal{ // method overriding
    void eat(){
        System.out.println("eats grass");
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a , float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}
