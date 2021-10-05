//Returns largest possible product of a given list
import java.util.ArrayList;
import java.math.BigInteger;

public class PowerHungry {
    public static String solution(int[] xs) {
        if(xs.length == 1 && xs[0] < 0){
            return(Integer.toString(xs[0]));
        }
        ArrayList<Integer> xs_negative = new ArrayList<Integer>();
        BigInteger sum = new BigInteger("1");

        for(int i = 0; i < xs.length; i++){
            if(xs[i] > 1){
                sum = sum.multiply(BigInteger.valueOf(xs[i]));
            }else if(xs[i] < -1){
                xs_negative = xsInsert(xs_negative, xs[i]);
            }
        }

        for(int i = xs_negative.size() -1; i >= 0 + (xs_negative.size()%2); i--){
            sum = sum.multiply(BigInteger.valueOf(xs_negative.get(i)));
        }
        
        if(sum.intValue() == 1){
            return(Integer.toString(0));
        }else{
            return(sum.toString());
        }
    }
    public static ArrayList<Integer> xsInsert(ArrayList<Integer> xs_negative, int i){
        if(xs_negative.size() == 0){
            xs_negative.add(i);
            return(xs_negative);
        }else{
            for(int j = 0; j < xs_negative.size(); j++){
                if(xs_negative.get(j) < i){
                    xs_negative.add(j, i);
                    return(xs_negative);
                }
            }
            xs_negative.add(i);
            return(xs_negative);
        }
    }

    public static void main(String[] args){
        int[] testCase = new int[]{-4, 10, 8, -90};
        System.out.println(solution(testCase));
    }
}
