import java.util.*;

class calc
{
  public static void main(String args[])
  {
    Scanner s1=new Scanner(System.in);
    int a=3,b=4;
    System.out.println("Enter +,-,*,/");
    String choice=s1.next();

    switch(choice)
    {
      case"+":
      System.out.println(a+b);
      break;

      case"-":
      System.out.println(a-b);
      break;

      case"/":
      System.out.println(a/b);
      break;

      case"*":
      System.out.println(a*b);
      break;

      default:
      System.out.println("Invalid input");
      break;
    }
  }

}
