package parties;
import java.util.Scanner;
class Name
{
    static String string;
    static String st1[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    static String st2[]={"Hundred","Thousand","Lakh","Crore"};
    static String st3[]={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    static String st4[]={"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        System.out.println(mac(in.nextInt())+" only");
    }
    public static String mac(int n)
    {
        int word;
        int nu=1;
        string="";
        while(n!=0)
        {
            switch(nu)
            {
            case 1:
                word=n%100;
                pass(word);
                if(n>100&&n%100!=0)
                {
                    show("and ");
                }
                n=n/100;
                break;
            case 2:
                word=n%10;
                if(word!=0)
                {
                    show(" ");
                    show(st2[0]);
                    show(" ");
                    pass(word);
                }
                n=n/10;
                break;
            case 3:
                word=n%100;
                if(word!=0)
                {
                    show(" ");
                    show(st2[1]);
                    show(" ");
                    pass(word);
                }
                n=n/100;
                break;
            case 4:
                word=n%100;
                if(word!=0)
                {
                    show(" ");
                    show(st2[2]);
                    show(" ");
                    pass(word);
                }
                n=n/100;
                break;
            case 5:
                word=n%100;
                if(word!=0)
                {
                    show(" ");
                    show(st2[3]);
                    show(" ");
                    pass(word);
                }
                n=n/100;
                break;
            }
            nu++;
        }
        return string;
    }
    public static void pass(int n)
    {
        int word,q;
        if(n<10)
        {
            show(st1[n]);
        }
        if(n>9&&n<20)
        {
            show(st3[n-10]);
        }
        if(n>19)
        {
            word=n%10;
            if(word==0)
            {
                q=n/10;
                show(st4[q-2]);
            }
            else
            {
                q=n/10;
                show(st1[word]);
                show(" ");
                show(st4[q-2]);
            }
        }
    }
    public static void show(String s)
    {
        String st=string;
        string=s+st;
    }
}