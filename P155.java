//Accept number from user and check whether 21 bit is ON or oFF 
//HEADECIMAL(Official COde)

import java.util.*;

class P155
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
        int iMask = 0X00100000;      //1048576;

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
