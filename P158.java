//Accept number from user and if 27 bit is oFF then ON otherwise OFF
//HEADECIMAL(Official COde)

// 0000 0100 0000 0000 0000 0000 0000 1000
//  0     4    0    0    0   0    0    0

import java.util.*;

class P158
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
        int iMask = 0X04000000;
        int iResult = 0;
 
        iResult = iNo | iMask;
        return iResult;              
   }
}
