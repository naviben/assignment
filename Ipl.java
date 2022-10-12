class Ipl
{ 
int number; 
String player; 
static String name = "Vivo Ipl";
// Constructor: 
Ipl(String player, int number)
{                 
this.player = player;
this.number = number; 
}
public static void main(String[] args)
{
Ipl opener = new Ipl("dhoni", 07); 
Ipl onedown = new Ipl("rohit", 45);
opener.call(); 
onedown.call();
}
void call()
{
System.out.println(" In Csk Bid Captain taken  "+ player + " Jersey no "+ number); 
}
}
