package com.tradeshift.Triangle;
public class Triangle {
	private float a, b, c;

	public Triangle(float a, float b, float c) throws MyException {
		if (a < 0 || b < 0 || c < 0) {
			throw new MyException(
					"the length of the triangle can not be negetive");
		} else {
			this.a = a;
			this.b = b;
			this.c = c;
		}

	}

	public boolean isTriangle() {

		if (a + b < c)
			return false;
		else if (a + c < b)
			return false;
		else if (c + b < a)
			return false;
		else
			return true;
	}

	public int getShape() {
		if (isTriangle()) {
			if (a == c || a == b || b == c) {
				if (a == b && b == c)
					return 1;
				else
					return 2;
			} else
				return 3;

		} else
			return -1;
	}

}