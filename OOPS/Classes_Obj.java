public class Classes_Obj {
    public static void main(String args[]){
        Pen p1 = new Pen(); //Pen() is a constructor // created pen obj called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        p1.setColor("Yellow"); ;
        System.out.println(p1.getColor());


    }
}

class Pen{
    //prop + func
    private String color;
    private int tip;
  
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
