import java.util.*;
public class If_Else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks : ");
        int marks = sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.print("Grade A");
        }
        else if(marks>=70 && marks<=89){
            System.out.print("Grade B");

        }
        else if(marks>=50 && marks<=69){
            System.out.print("Grade C");
        }
        else if(marks>=35 && marks<=49){
            System.out.print("Grade D");
        }else{
            System.out.print("Fail");
        }

    }
    
}
