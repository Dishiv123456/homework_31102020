package homeworkweekeight.poolarea;
//Write a class with the name Cuboid that extends Rectangle class.
public class Cuboid extends Rectangle{
  //The class needs one field  (instance variable) with name height of type double.
  double height;

  /*The class needs to have one constructor with three parameters width, length, and height all of type  double. It needs to call the parent constructor and initialize a height field.
    In case the height parameter is less than 0 it needs to set the height field value to 0.*/
  public double getHeight(){
      return this.height;
  }
    public double getVolume(){
        return getArea()*height;
    }
    public Cuboid(double width, double length,double height) {
        super(width, length);
        this.height=height;
        if (width<0){
            this.width =0;
        }if (length <0){
            this.length =0;
        }
    }
    // Method named getHeight without any parameters, it needs to return the value of height field.


//● Method named getVolume without any parameters, it needs to return the calculated volume.
    // To calculate volume multiply the area with height.

}
