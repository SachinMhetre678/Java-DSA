package ArrayList;
import java.util.*;


public class Classroom {

    public static void swap(ArrayList<Integer> list , int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String args[]){
        //Java Collection Framework
        ArrayList<Integer> list = new ArrayList<>();  //Syntax for defining ArrayList which dynamic array
        ArrayList<String>  list2 = new ArrayList<>();

        list.add(2); //O(1)
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println(list);

//        //Get operation  - O(1)
//        System.out.println(list.get(2));
//
//        //remove operation - O(n)
////        System.out.println(list.remove(2));
//
//        //Set operation(to add a value in array) -O(N)
//        System.out.println(list.set(2,10));
//
//        System.out.println(list);
//
//        //contains
//        System.out.println(list.contains(1));
//        System.out.println(list.contains(11));
//
//        System.out.println(list.size());  //function | method
//
//        //print arraylist
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();
//
//        // print reverse -O(n)
//        for(int i=list.size()-1;i>=0; i--){
//            System.out.print(list.get(i) + " ");
//        }
//
//        System.out.println();
//
//        //find maximum
//        int max = Integer.MIN_VALUE;
//        for (int i =0;i< list.size();i++){
////            if(max<list.get(i)){
////                max = list.get(i);
////            }
//            max = Math.max(max,list.get(i));
//        }
//        System.out.println("Max element is : " + max);


//        //swap element
//        int idx1 = 1 , idx2 =3;
//        swap(list,idx1,idx2);
//        System.out.println(list);

        //sorting
        Collections.sort(list);  //ascending
        System.out.println(list);

        //descending
        Collections.sort(list,Collections.reverseOrder());
        //comparator - fnx logic
        System.out.println(list);
    }
}
