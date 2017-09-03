import java.util.Scanner;
class AreaOfCircle {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Float r;
		System.out.println("Enter the radius of the circle");
		r = in.nextFloat();
		System.out.println("Area of the circle:" + (float)(3.14f * r * r));
		
	}
}
