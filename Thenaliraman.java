class Thenaliraman
{
public static void main(String[] args)
{
Thenaliraman Thenali = new Thenaliraman();
Thenali.security_count(1024);
}
public void security_count(int beats)
{
int security = 0;
while(beats>1)
{
beats = beats/2;
System.out.println("security gets" + beats );
security = security + 1;
}
System.out.println("No. of Securities is"+ security);
}

}
