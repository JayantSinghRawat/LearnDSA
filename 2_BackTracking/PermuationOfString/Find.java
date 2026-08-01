public class Find{

    public static void find(String s, String ans){
        //base
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        //
        for(int i = 0; i<s.length();i++){
            char curr = s.charAt(i);
            String news = s.substring(0,i)+s.substring(i+1);
            find(news, ans+curr);
            
        }


    }
    public static void main(String[] args) {
        String s = "abc";
        String ans = "";
        find(s,ans);
    }
}