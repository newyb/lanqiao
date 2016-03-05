import java.math.BigInteger;
import java.util.Scanner;
 
public class Main
{
    public static void main(String[] args)
    {
        BigInteger n;
        BigInteger result;
        Scanner input = new Scanner(System.in);
        for(
                n = BigInteger.valueOf(input.nextInt()), result = n; 
                n.compareTo(BigInteger.ONE) > 0; n =
                n.subtract(BigInteger.ONE)
            )
        {
            result = result.multiply(n.subtract(BigInteger.ONE));
        }
        input.close();
        System.out.println(result);
    }
}