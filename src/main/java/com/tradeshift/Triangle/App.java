package com.tradeshift.Triangle;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Triangle t = null;
		try {
			t = new Triangle(20, 4, 5);
		} catch (MyException e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			//System.out.println(e.toString());
		}
		int ret = t.getShape();
		switch (ret) {
		case 1:
			System.out.println("equilateral");
			break;
		case 2:
			System.out.println("isosceles");
			break;
		case 3:
			System.out.println("scalene");
			break;
		default:
			System.out.println("no a triangle");

		}
	}

}


