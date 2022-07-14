import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.print(s1);
                for(int j=0;j<15-s1.length();j++)
                {
                    System.out.print(" ");
                }
               
                String sb=Integer.toString(x);
               
                if(sb.length()==3)
                System.out.println(sb);
                if(sb.length()==2)
                System.out.println("0"+sb);
                if(sb.length()==1)
                System.out.println("00"+sb);
                
            }
            
            System.out.println("================================");

    }
}



