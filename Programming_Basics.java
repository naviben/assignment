class Programming_Basics
{
public static void main(String[] args)
{
Programming_Basics pb = new Programming_Basics();
pb.calculate_amount();
}
public void calculate_amount()
{
int amount = 0;
int day = 1;
while(day<=10)
{
amount = amount + day;
day = day + 1;
}
System.out.println(amount);
}

}
