import java.io.*;
import java.util.*;


public class StringMatch {
    static int PrefixSimilCount(String s) {
        int count, sum = 0;
        String sub ;

        for(int i=0; i<s.length(); i++){
            sub = s.substring(i,s.length());
            count = 0;
            for(int j=0; j<sub.length(); j++){
                if(sub.charAt(j) == s.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
            sum += count;
            System.out.println(sub);
        }
        return sum;
    }


    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)) ;
        int t = Integer.parseInt(bufferedReader.readLine()) ;
        for (int i = 1; i <= t; i++) {
            String s = bufferedReader.readLine() ;
            int result = PrefixSimilCount(s);
            System.out.println(String.valueOf(result));
        }

        bufferedReader.close();
    }
}
