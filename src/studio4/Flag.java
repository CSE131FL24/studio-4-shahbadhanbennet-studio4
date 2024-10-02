package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		double x = 0.5;
		double y = 0.5;
		double halfWidth = 0.2;
		double halfHeight = 0.12;
		

		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(Color.RED);
		StdDraw.line(x,y,(x-halfWidth),(y+halfHeight));
		StdDraw.line(x,y,(x+halfWidth),(y+halfHeight));
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.01);
		Font font = new Font("Arial", Font.BOLD, 60); 
		StdDraw.setFont(font);
		StdDraw.rectangle(x, y, halfWidth, halfHeight);
		StdDraw.text(x, y, "$");
	}
}