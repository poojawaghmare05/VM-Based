/*
    Accept number from user and toggle 4th bit of that number
    HEADECIMAL(Official Code)
 */

/*
    0000 0000 0000 0000 0000 0000 0100 1000
    0     0    0    0    0   0    0    8


    0  0  1  0  1  0  1  1         iNo
    0  0  0  0  1  0  0  0         iMask
------------------------------
    0  0  1  0  0  0  1  1         iResult
    
    
    0  0  1  0  0  0  1  1         iNo
    0  0  0  0  1  0  0  0         iMask
------------------------------ 
    0  0  1  0  1  0  1  1         iResult

*/

import java.util.*;

class P159
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();                          //Dynamic Memory
        int iret = bobj.OnBit(value);                          //Function Call

        System.out.println("Updated number is: " + iret);

        sobj.close();
    }
}

class Bitwise
{
   public int OnBit(int iNo)           //4
   {
        int iMask = 0X00000008;
        int iResult = 0;
 
        iResult = iNo ^ iMask;
        return iResult;              
   }
}
