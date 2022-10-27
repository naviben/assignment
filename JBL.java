class JBL extends SoundBar
{
public static void main(String[] args)
{

SoundBar qualitycontrol = new JBL(); 
qualitycontrol.bass(); 
qualitycontrol.treble();
qualitycontrol.vocals();
}

void bass(){
System.out.println("rich bass"); 
}
void treble(){
System.out.println("treble based on music"); 
}
void vocals(){
System.out.println("clear vocals"); 
}

}
