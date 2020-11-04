package homeworkweekeight.poolarea;
// Write a class with the name Rectangle.
public class Rectangle {
   //The class needs two fields (instance variable) with name  width and length both of type double.
    double width;
    double length;
    /*The class needs to have one constructor with parameters width and length both of type double and it  needs to initialize the fields.
In case the width parameter is less than 0 it needs to set the width field value to 0.  In case the length parameter is less than 0 it
needs to set the length field value to 0. */

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        if (width<0){
            this.width =0;
        }if (length <0){
            this.length =0;
        } }

    //Method named getWidth without any parameters, it needs to return the value of the width field.


    public double getWidth() {
        return width;
    }
// Method named getLength without any parameters, it needs to return the value of the length field

    public double getLength() {
        return length;
    }
    //Method named getArea without any parameters, it needs to return the calculated area (width * length).
    public double getArea(){
        return this.width*this.length;
    }
}
