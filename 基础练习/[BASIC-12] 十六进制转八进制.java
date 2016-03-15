import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
public class Main {  
  
    public static void main(String[] args) throws NumberFormatException, IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        int n = Integer.parseInt(br.readLine());  
  
        while (n-- != 0) {  
            String s = br.readLine();  
            transform(s);  
        }  
    }  
  
    private static void transform(String s) {  
        StringBuffer sb = hexToBin(s);  
        binToOct(sb);  
    }  
  
    private static void binToOct(StringBuffer sb) {  
        int len = sb.length();  
  
        if (len % 3 == 0) {  
            if (sb.substring(0, 3).equals("000")) {  
                sb.delete(0, 3);  
            }  
        } else if (len % 3 == 1) {  
            if (sb.substring(0, 1).equals("0")) {  
                sb.delete(0, 1);  
            } else {  
                sb.insert(0, "00");  
            }  
        } else if (len % 3 == 2) {  
            if (sb.substring(0, 2).equals("00")) {  
                sb.delete(0, 2);  
            } else {  
                sb.insert(0, "0");  
            }  
        }  
  
        StringBuffer result = new StringBuffer();  
        int n = sb.length() / 3;  
          
        for (int i = 0; i < n; i++) {  
            String temp = sb.substring(i * 3, i * 3 + 3);  
            if (temp.equals("000")) {  
                result.append("0");  
            } else if (temp.equals("001")) {  
                result.append("1");  
            } else if (temp.equals("010")) {  
                result.append("2");  
            } else if (temp.equals("011")) {  
                result.append("3");  
            } else if (temp.equals("100")) {  
                result.append("4");  
            } else if (temp.equals("101")) {  
                result.append("5");  
            } else if (temp.equals("110")) {  
                result.append("6");  
            } else if (temp.equals("111")) {  
                result.append("7");  
            }  
        }  
  
        System.out.println(result);  
    }  
  
    private static StringBuffer hexToBin(String s) {  
        StringBuffer sb = new StringBuffer();  
          
        for (int i = 0; i < s.length(); i++) {  
            switch (s.charAt(i)) {  
            case '0':  
                sb.append("0000");  
                break;  
            case '1':  
                sb.append("0001");  
                break;  
            case '2':  
                sb.append("0010");  
                break;  
            case '3':  
                sb.append("0011");  
                break;  
            case '4':  
                sb.append("0100");  
                break;  
            case '5':  
                sb.append("0101");  
                break;  
            case '6':  
                sb.append("0110");  
                break;  
            case '7':  
                sb.append("0111");  
                break;  
            case '8':  
                sb.append("1000");  
                break;  
            case '9':  
                sb.append("1001");  
                break;  
            case 'A':  
                sb.append("1010");  
                break;  
            case 'B':  
                sb.append("1011");  
                break;  
            case 'C':  
                sb.append("1100");  
                break;  
            case 'D':  
                sb.append("1101");  
                break;  
            case 'E':  
                sb.append("1110");  
                break;  
            case 'F':  
                sb.append("1111");  
                break;  
            }  
        }  
        return sb;  
    }  
}  