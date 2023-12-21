public class Construct {
    public static void main(String args[]){
        Stud s1 = new Stud();
        s1.name = "Sachin";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Stud s2 = new Stud(s1);  // copy constructor
        s2.password = "xyz";
        s1.marks[2] = 100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Stud {
    String name;
    int roll;
    String password;
    int marks[];

//    Stud(Stud s1){  //shallow copy constuctor
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.marks = s1.marks;
//    }

    //deep copy constuctor
    Stud(Stud s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
    Stud(){
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    Stud(String name){
        marks = new int[3];
        this.name = name;
    }
    Stud(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}
