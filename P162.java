//Accept number from user as well as accept position from user and toggle the bit of that position and return the number.

// 0000 0000 0000 0000 0000 0000 0000 0000
//  0     0    0    0    0   0    0    0

import java.util.*;

class P162
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int value = sobj.nextInt();

        System.out.println("Enter Position");
        int pos = sobj.nextInt();

        Bitwise bobj = new Bitwise(); 
        int iRet = bobj.ToggleBit(value, pos) ;       //Dynamic Memory
        System.out.println("Updated number is: " + iRet);

        sobj.close();
    }
}

class Bitwise
{
   public int ToggleBit(int iNo , int iPos)  //4
   {
        if((iPos <= 0) || (iPos > 32))
        {
            System.out.println("Invalid Position");
            return 0;
        }
        
        int iMAsk = 0X00000001;
        int iResult = 0;

        iMAsk = iMAsk << (iPos -1);  //used to create dynamic mask

        iResult = iNo ^ iMAsk;
        return iResult;
   }
}
