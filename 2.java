import static java.lang.Math.PI;
import static java.lang.Math.acos;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
		Scanner i = new Scanner(System.in);
	
		System.out.println("Enter 3 sides of triangle: ");
		float a = i.nextFloat();
		float b = i.nextFloat();
		float c = i.nextFloat();
	
		if ((a+b)>c && (b+c)>a && (c+a)>b)
			calculateAngle(a, b, c);
		else
			System.out.println("Sides entered can't form a triangle!!");
    }
	
    static void calculateAngle(float a, float b, float c){
        
        float a2 = (float) Math.pow(a, 2);
        float b2 = (float) Math.pow(b, 2);
        float c2 = (float) Math.pow(c, 2);
	    
        //Calculating angles
		float alpha = (float) acos((b2 + c2 - a2)/(2*b*c));
		float betta = (float) acos((a2 + c2 - b2)/(2*a*c));
		float gamma = (float) acos((a2 + b2 - c2)/(2*a*b));
	
		//Converting to degree
        alpha = (float) (alpha * 180 / PI);
		betta = (float) (betta * 180 / PI);
		gamma = (float) (gamma * 180 / PI);
	
		System.out.printf("alpha: %.3f\nbetta: %.3f\ngamma: %.3f\n", alpha, betta, gamma);
    }
}
