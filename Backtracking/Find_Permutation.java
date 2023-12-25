public class Find_Permutation {

    public static void findPermutation(String str , String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            // to remove char we can do eg : "abcde" => "ab" + "de" c is removed
            String Newstr = str.substring(0,i) + str.substring(i+1); // i is exclusive
            findPermutation(Newstr,ans+curr);
        }
    }

    public static void main(String args[]){
        String str = "abc";
        findPermutation(str,"");
    }
}
