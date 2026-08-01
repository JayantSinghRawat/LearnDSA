

public class FindSubset {

    public static void printallsubset(String s, StringBuilder ans, int i){
        //basecse
        if(i == s.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans );
                ans.deleteCharAt(ans.length()-1);
            }
            return;
        }
        //recursiopn
        printallsubset(s,ans.append(s.charAt(i)),i+1);
        printallsubset(s, ans, i+1);

    }
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder ans = new StringBuilder();
        printallsubset(s,ans,0);
    }
}
