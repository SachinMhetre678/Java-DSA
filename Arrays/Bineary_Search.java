import java.util.*;

public class bineary_search {
    public static int bs(int num[],int key){
        int start = 0;
        int end = num.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            //comaprison
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){ // right
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[] = {2,4,6,8,10,12,14};
        int key = 19;
        System.out.println("Number is at : "+ bs(num,key)+" place");
    }
}
