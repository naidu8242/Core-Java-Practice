package parties;
public class SqueezeString
{
    static int i;
    
    static void squeeze(String s)
    {
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch != ' ')
            System.out.print(ch);
        }
    }
    
    
    public static void main (String args[])
    {
        
        System.out.println("Original String is : ");
        System.out.println("   manchester united is also known as red devil   ");
        SqueezeString.squeeze("   manchester united is also known as red devil    ");
        
        
        int c=0;
        System.out.println("");
        String s = "Hello World java program";
        System.out.println(s.replaceAll(" ", ""));
        for(i = 0; i<s.length();i++) {
        	char ch =s.charAt(i);
        	//if(ch !=' ')  //character count
        	if((ch == 'a') || (ch== 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') )
        		c++;
        }
        
        
        
        System.out.println("Count of "+c);
    }
}