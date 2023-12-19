public class String_Builder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a';ch<='z';ch++){
            sb.append(ch); //ek ke piche ek judte jana
        }
        //O(26)
        System.out.println(sb);
    }
}
