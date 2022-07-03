//Accept number from user and check whether 14 bit is ON or oFF 
//HEADECIMAL(Official COde)

// 0000 0000 0000 0000 0010 0000 0000 0000
//  0     0    0    0    2   0    0    0

import java.util.*;

class P156
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();         //Dynamic Memory
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
        int iMask = 0X00002000;      //8192;

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
