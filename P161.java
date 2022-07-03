//Accept number from user and toggle 4th and 7th bit of that number(static mask)
import java.util.*;

// 0000 0000 0000 0000 0000 0000 0100 1000
//  0     0    0    0    0   0    4    8

class P161
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();         //Dynamic Memory
        int iret = bobj.OnBit(value);         //Function Call

        System.out.println("Updated number is: " + iret);
    }
}

class Bitwise
{
   public int OnBit(int iNo)  //4
   {
        int iMask = 0X00000048;
        int iResult = 0;
 
        iResult = iNo ^ iMask ;
        return iResult;              
   }
}
