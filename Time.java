import java.util.*;
class time
{
	int hr,min;
	time()
	{
		hr=0; min=0;}
time(int h, int m)
{
hr=h; min=m;}
void setdata()
{
	Scanner s1= new Scanner(System.in);
	System.out.println("Input hr and min:");
	hr=s1.nextInt();
	min=s1.nextInt();
}
void displaydata()
{
	System.out.println(hr+ "  " +min);
}
time add(time t)
{
	time temp=new time();
	temp.hr=hr+t.hr;
	temp.min=min+t.min;
	if(temp.min>=60)
	{
		temp.hr++;
		temp.min=temp.min-60;
	}
	return temp;
}
}
class timmain
{
public static void main(String args[])
{
	time t1= new time(11,12);
	time t2= new time();
	time t3= new time();
	t2.setdata();
	t3=t1.add(t2);
	System.out.println("t1 details:");
	t1.displaydata();
	System.out.println("t2 details:");
	t2.displaydata();
	System.out.println("Sum of t1 and t2:");
	t3.displaydata();
}
}

