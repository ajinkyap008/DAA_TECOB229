import java.io.* ;
import java.util.* ;
import java.math.BigInteger ;


public class Extra_Long {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in) ;
        int ip_num = X.nextInt() ;
        long answer_simple = 1;
        for(int i = 2;i<=ip_num;i++){
            answer_simple = answer_simple * i ;
        }
        //System.out.println(answer_simple);

        BigInteger answer_complex = new BigInteger("1") ;
        for(int j = 2;j<=ip_num;j++){
            BigInteger multiplier = new BigInteger(String.valueOf(j)) ;
            answer_complex = answer_complex.multiply(multiplier) ;
        }
        System.out.println(answer_complex);

        X.close();
    }
}
