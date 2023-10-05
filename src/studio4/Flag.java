package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setXscale(0, 1);
		StdDraw.setYscale(0, 1);
		Color lavendar = new Color(220,220,255);
		StdDraw.setPenColor(lavendar);
		StdDraw.filledRectangle(0, 0, 1, 1);
		Color orange = new Color(255,141,0);
		StdDraw.setPenColor(orange);
		StdDraw.filledCircle(0.5, 0.5, 0.25);
		Color blue = new Color(0,0,240);
		StdDraw.setPenColor(blue);
		StdDraw.filledRectangle(0, 0, 1, 0.5);
		
	}
}