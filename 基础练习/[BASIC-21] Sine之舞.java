import java.util.Scanner;  
  
public class Main {  
  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        while (scanner.hasNext()) {  
  
            int n = scanner.nextInt();  
            scanner.nextLine();  
  
            StringBuffer sn = new StringBuffer();  
            for (int i = 1; i <= n; i++) {  
                StringBuffer ai = new StringBuffer();  
                getAi(ai, i);  
  
                ai.append("+" + (n - i + 1));  
  
                sn.append(ai);  
  
                if ((n - i + 1) != 1) {  
                    sn.insert(0, "(");  
                    sn.append(")");  
                }  
            }  
  
            System.out.println(sn.toString());  
        }  
    }  
  
    private static void getAi(StringBuffer ai, int i) {  
        ai.append("sin(1)");  
        for (int j = 2; j <= i; j++) {  
            int len = ai.length();  
            for (int j2 = len - 1; j2 > 0; j2--) {  
                if (ai.charAt(j2) != ')') {  
                    if (j % 2 == 0) {  
                        String temp = (j - 1) + "-sin(" + j + ")";  
                        ai.replace(j2, j2 + 1, temp);  
                    } else {  
                        String temp = (j - 1) + "+sin(" + j + ")";  
                        ai.replace(j2, j2 + 1, temp);  
                    }  
                    break;  
                }  
            }  
        }  
    }  
}  



import java.util.Scanner;
 
 
public class Main{
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
        Scanner scanner=new Scanner(System.in);
         
        System.out.println(s(Integer.parseInt(scanner.nextLine()), 1));     
        //System.out.print(sin(3, 1));
    }
     
    static String s(int n,int i)
    {
        if(i==n)
        {
            return ""+An(n)+"+"+(n-i+1);
        }
        else {
            return "("+An(i)+"+"+(n-i+1)+")"+""+s(n, i+1)+"";
        }
    }
     
    static String An(int n)
    {
        return sin(n, 1);
    }
     
    static String sin(int n,int i)
    {
        if(i==n)
        {
            return "sin("+n+")";            
        }
        else {
            if(i%2==0)
                return "sin("+i+"+"+sin(n, i+1)+")";//(int)Math.pow(-1,i)
            else {
                return "sin("+i+"-"+sin(n, i+1)+")";
            }
        }
    }
 
}