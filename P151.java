//Accept no from user and convert into binary

import java.util.*;

class P151
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter Number");
    int value = sobj.nextInt();

    Bitwise bobj = new Bitwise();
    bobj.DisplayBinary(value);
  }
}

class Bitwise
{
  public void DisplayBinary(int iNo)
  {
    int iDigit = 0;

    while(iNo != 0)
    {
      iDigit = iNo % 2;
      System.out.print(iDigit);
      iNo = iNo / 2;
    }
    System.out.println();
  }
}
