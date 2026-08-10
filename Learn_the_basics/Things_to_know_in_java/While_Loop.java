import java.util.*;
public class While_Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int count  = 0;
        int i = 1;
        int sum = 0;
        while(count<50)
{
     while (count < 50) {
            if (i % 10 == d) {
                sum += i;
                count++;
            }
            i++;

}
System.out.println(sum);
        sc.close();    
    }
    }
}
