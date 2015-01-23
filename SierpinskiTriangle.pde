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