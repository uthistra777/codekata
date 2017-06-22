import java.util.Scanner;
import java.util.Arrays;
public class evenoddcha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String even_odd = sc.next();
        char[] t = even_odd.toCharArray();
        System.out.println(Arrays.toString(t));

        //I can't get this next part to work.
        for(int i = t[0]; i < t.length; i = i + 2){
            System.out.println(Arrays.toString(t[i]));
        }
