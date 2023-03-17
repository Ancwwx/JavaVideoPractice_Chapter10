package com.hspedu.homework_;

public class Homework08 {
	public static void main(String[] args) {
		Color green = Color.GREEN;
		green.show();

		switch (green) {
		case YELLOW:
			System.out.println("yellow");
			break;
		case BLACK:
			System.out.println("black");
			break;
		case BLUE:
			System.out.println("blue");
			break;
		case RED:
			System.out.println("red");
			break;
		case GREEN:
			System.out.println("green");
			break;
		default:
			System.out.println("no");
		}
	}

}

interface U {
	public void show();
}

enum Color implements U {

	RED(255, 0, 0), BLUE(0, 0, 255), BLACK(0, 0, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0);

	private int redValue;
	private int greenValue;
	private int blueValue;

	private Color(int redValue, int greenValue, int blueValue) {

		this.redValue = redValue;
		this.greenValue = greenValue;
		this.blueValue = blueValue;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(
				"Color [redValue=" + redValue + ", greenValue=" + greenValue + ", blueValue=" + blueValue + "]");
	}

}
