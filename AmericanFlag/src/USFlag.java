/*
 * Joshua Ferguson
 * 
 * makes an American Flag
 * 'Murica
 * 
 * fairly close, with some minor error due to the limitation of 
 * working with integers. you can change hoist(the height of the flag)
 * in order to scale it up or down. 
 */
import javax.swing.JApplet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Point;

public class USFlag extends JApplet
{
	private double sin(int degree) {
	    return Math.sin(Math.toRadians(degree));
	}

	private double cos(int degree) {
	    return Math.cos(Math.toRadians(degree));
	}//I use these to draw the stars
	private int hoist=500;//every other value is based off this one,
	//changing this changes the scale of the flag
	
	private int round(double ratio) {
		return (int)Math.round(hoist*ratio);//otherwise I would have to type this a lot.
	}
	
	private Polygon drawStar(int radius, int originX, int originY) {
	   /*draws a star, took me forever to figure out how to do this in a method*/
	    Polygon star = new Polygon();

	   
	    int innerRadius = (int) Math.round(radius * sin(18) / sin(126));

	    Point[] points = new Point[11];
	    // top center 
	    points[0] = new Point();
	    points[0].x = 0;
	    points[0].y = -radius;
	    // inner top left
	    points[1] = new Point();
	    points[1].x = -(int) Math.round(innerRadius * cos(54));
	    points[1].y = -(int) Math.round(innerRadius * sin(54));
	    // top left 
	    points[2] = new Point();
	    points[2].x = -(int) Math.round(radius * cos(18));
	    points[2].y = -(int) Math.round(radius * sin(18));
	    // inner bottom left
	    points[3] = new Point();
	    points[3].x = -(int) Math.round(innerRadius * cos(18));
	    points[3].y = (int) Math.round(innerRadius * sin(18));
	    // bottom left
	    points[4] = new Point();
	    points[4].x = -(int) Math.round(radius * cos(54));
	    points[4].y = (int) Math.round(radius * sin(54));
	    // inner bottom center
	    points[5] = new Point();
	    points[5].x = 0;
	    points[5].y = innerRadius;
	    // bottom right
	    points[6] = new Point();
	    points[6].x = (int) Math.round(radius * cos(54));
	    points[6].y = (int) Math.round(radius * sin(54));
	    // inner bottom right
	    points[7] = new Point();
	    points[7].x = (int) Math.round(innerRadius * cos(18));
	    points[7].y = (int) Math.round(innerRadius * sin(18));
	    // top right
	    points[8] = new Point();
	    points[8].x = (int) Math.round(radius * cos(18));
	    points[8].y = -(int) Math.round(radius * sin(18));
	    // inner top right
	    points[9] = new Point();
	    points[9].x = (int) Math.round(innerRadius * cos(54));
	    points[9].y = -(int) Math.round(innerRadius * sin(54));
	    // top center
	    points[10] = new Point();
	    points[10].x = 0;
	    points[10].y = -radius;

	    for (int i = 0; i < points.length; i++) {
	        star.addPoint(originX + points[i].x, originY + points[i].y);
	    }
	    return star;

	}
		
	
	public void paint( Graphics g)
	{
		super.paint( g );
		
		int radius = (int)Math.round((hoist*.0616)/2);	       
	    int fly=round(1.9);
	    int flyUnion=round(.76);
	    int stripeWidth=round(.0769);
	    int rowSpaceWidth=round(.063);
	    int rowSpaceHeight=round(.054);
	    //all the variables are based off the value of 
	    //hoist(the width of the flag).makes it easy to modify
	    
		for(int i=0; i<13; i++) {
			
			Color stripe =((i+1) % 2 == 1) ? Color.RED : Color.WHITE;
			g.setColor(stripe);
			g.fillRect(0,stripeWidth*i,fly,stripeWidth);
		}
		g.setColor(Color.BLUE);
		g.fillRect(0,0,flyUnion,stripeWidth*7);
		g.setColor(Color.WHITE);
		for(int j=1; j<10; j++) //this controls the stars and their respective start/end points
		{
			if(j%2==1) {
				
				for (int k=1; k<13; k+=2) 
				{
					g.fillPolygon(drawStar(radius, rowSpaceWidth*k, j*rowSpaceHeight));
						
				}
				}
			else
			{
				for (int k=2;k<11;k+=2) {
					g.fillPolygon(drawStar(radius, rowSpaceWidth*k, j*rowSpaceHeight));
				}
			}
			}
			
		
		
	}
	public static void main(String [] args)
	{
		USFlag flag = new USFlag();
		flag.setSize(800,700);
		flag.setVisible(true);
	}
}
