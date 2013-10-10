import java.util.*;
import java.lang.*;
import java.io.*;

interface areacalc
{
   public void areaOfRectangle();
   public void areaOfCircle();
   public void areaOfTriangle();
}

public class shapes
{
public void areaOfRectangle(double width, double length) {
  System.out.println(width * length);
}
public void areaOfCircle(double radius) {
  System.out.println(Math.PI * radius * radius);
}
public void areaOfTriangle(double a, double b, double c) {
  double s = (a+b+c)/2;
  System.out.println(Math.sqrt(s * (s-a) * (s-b) * (s-c)));
}
 public static void main(String args[]){
      shapes m = new shapes();
      m.areaOfRectangle(5,10);
      m.areaOfCircle(5);
      m.areaOfTriangle(2,2,3);
   }
} 