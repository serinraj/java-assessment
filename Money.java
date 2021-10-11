


import java.util.Scanner;
public class Money
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your income of this month:");
        int inc=in.nextInt();
        System.out.println(inc);
        double nec=0.55;
        nec=nec*inc;
        System.out.println("NEC: "+(int)nec);
        double ffa=0.1;
        ffa=ffa*inc;
        System.out.println("FFA: "+(int)ffa);
        double edu=0.1;
        edu=edu*inc;
        System.out.println("EDU: "+(int)edu);
        double ltss=0.1;
        ltss=ltss*inc;
        System.out.println("LTSS: "+(int)ltss);
        double play=0.1;
        play=play*inc;
        System.out.println("PLAY: "+(int)play);
        double giv=0.05;
        giv=giv*inc;
        System.out.println("GIVE: "+(int)giv);
        
    }
}

//sample output

//Enter your income of this month:2000
//2000
//NEC: 1100
//FFA: 200
//DU: 200
//PLAY: 200
//GIVE: 100
