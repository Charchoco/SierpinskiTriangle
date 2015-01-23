import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SierpinskiTriangle extends PApplet {

  int banana = 1;
public void setup()
{
  size(800,800);
  background(0, 0, 0);
}
public void draw()
{
	background(0,0,0);
	fill(255, 255, 255);
  	sierpinski(0,0,800,banana);
}
public void mouseDragged()//optional
{ 

}
public void mousePressed()
{
 	banana++;
}
public void sierpinski(int x, int y, int len, int coco) 
{
  if( coco <= 1 )
  { 
  	triangle(x, y, x + len, y, x + len/2, y + len);
  }
  else
  { 
  	
    sierpinski(x, y ,len/2, coco - 1); 
    sierpinski(x + len/2, y, len/2, coco -1);
    sierpinski(x + len/4, y + len/2, len/2, coco -1);

  }

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiTriangle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
