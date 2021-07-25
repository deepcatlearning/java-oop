public class Triangle extends Shape{
private double base;
private double height;
    
public Triangle(String colorName, double b, double c) {
    this.base = b;
    this.height = c;
    setColor(colorName);
}
    
public double getArea() {
return 0.5*base*height;
}
    
public double getArea(double base, double height) {
this.base = base;
this.height = height;
return base*height*0.5;
}
    
public String toString() {
return "Triangle[base="+base+",height="+height+",Shape[color="+getColor()+"]]";
}
}
