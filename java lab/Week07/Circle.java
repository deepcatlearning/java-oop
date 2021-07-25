public class Circle extends Shape{
private double r;

public Circle() {

}

public Circle(String colorName, double Radius) {
    this.r = Radius;
    setColor(colorName);
}
    
public double getArea() {
return 3.14*(r*r);
}
    
public double getArea(double r) {
this.r = r;
return 3.14*(r*r);
}
    
public String toString() {
return "Circle[Radius="+r+",Shape[color="+getColor()+"]]";
}







}
