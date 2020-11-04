package homeworkweekeight;
//Write a class with the name Point
public class Point {
   // The class needs two  fields (instance variables) with name x and y of type int.
private int x;
private int y;

   public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

    }


//The class needs to have two constructors
    //The first constructor does not have any parameters (no-arg  constructor).

    public Point() {
    }
    // The second constructor has parameters x and y of type int and it needs to initialize the  fields.
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //* Method named getX without any parameters, it needs to return the value of x field.  *

    public int getX() {
        return x;
    }
    //Method named getY without any parameters, it needs to return the value of y field.  *


    public int getY() {
        return y;
    }
    //Method named setX with one parameter of type int, it needs to set the value of the x field.

    public void setX(int x)  {
        this.x = x;
    }
    // * Method named setY with one parameter of type int, it needs to set the value of the y field.

    public void setY(int y) {
        this.y = y;
    }
    //Method named distance without any parameters, it needs to return the distance between this  Point and Point 0,0
    // as double.

public double distance(){

   return Math.sqrt((0-this.x)*(0-this.x)+(0-this.y)*(0-this.y));
}
//Method named distance with two parameters x, y both of type int, it needs to return the distance  between this Point
// and Point x,y as double.
 public double distance(int x, int y){
     return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
 }
//Method named distance with parameter another of type Point, it needs to return the distance  between this Point
// and another Point as double.
    public double distance(Point point){
        return Math.sqrt((this.x-point.x)*(this.x-point.x)+(this.y-point.y)*(this.y-point.y));
    }
}
