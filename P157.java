//Accept number from user and if 4 bit is oFF then ON otherwise OFF
//HEADECIMAL(Official COde)

// 0000 0000 0000 0000 0000 0000 0000 1000
//  0     0    0    0    2   0    0    8

import java.util.*;

class P157
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
        int iMask = 0X00000008;
        int iResult = 0;
 
        iResult = iNo | iMask;
        return iResult;              
   }
}
