import java.util.*;

public class Main{
    public static int ls(int[] num, int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        System.out.println("Hello World !");
        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println(name);
        int num[] = {8,9,5,1,2,4,6,7};
        int key = 7;
        int index = ls(num,key);
        System.out.println("Number is at : "+index+" place");
    }
}