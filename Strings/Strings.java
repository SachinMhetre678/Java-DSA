import java.util.*;

public class Strings {
    public static void main(String args[]){
        char arr[] = {'a','b','c','d'};
        String str = "abcd";  // one type of intialization
        String str2 = new String("xyz");  // another type of initilazation
        // String's in java are immutable
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        //concatentaion
        String firstName = "Sachin";
        String lastName = "Mhetre";
        String FullName = firstName + " " + lastName;
        System.out.println(FullName);
        // we can also print specific char of the string using .charAt(pos)
        System.out.println(FullName.charAt(2));
    }
}
