package GRAPHcoordinates;
import java.util.Scanner;
public class GRAPHcoordinates {
    public static void main(String[] args)
    {






        Scanner kb=new Scanner(System.in);
        int x,y;

        System.out.println("Enter an integer value for x: ");
        x=kb.nextInt();

        System.out.println("Enter an integer value for y: ");
        y=kb.nextInt();

        System.out.println("The point ("+x+","+y+") is in: ");


        if(x>=0)
        {
            if(y>=0)
            {
                System.out.println("Quad I");
            }
            else {System.out.println("Quadrant IV");
            }
        }
        else
        {
            if(y>=0)
            {
                System.out.println("Quadrant II");
            }
            else
            {
                System.out.println("Quadrant III");
            }
        }


    }
}