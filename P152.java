//Accept no from user and check whether third bit of number is on or off

import java.util.*;

class P152
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();         //Dynamic Memory Allocation
        boolean bret = bobj.CheckBit(value);  //Function Call

        if(bret == true)
        {
            System.out.println("Bit is ON");
        }
        else
        {
            System.out.println("Bit is OFF");
        }
    }
}

class Bitwise
{
   public boolean CheckBit(int iNo)
   {
    int iResult = 0;
    int iMask = 4;

    iResult = iNo & iMask;

    if(iResult == 0)
    {
        return false;
    }
    else
    {
        return true;
    }
   }
}
