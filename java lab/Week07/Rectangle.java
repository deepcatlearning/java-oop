public class Rectangle extends Shape{
private double length;
private double width;

public Rectangle() {
}

public Rectangle(String colorName, double b, double c) {
    length = b;
    width = c;
    setColor(colorName);
}

public double getArea() {
return length*width;
}

public double getArea(double length, double width) {
this.length = length;
this.width = width;
return length*width;
}

public String toString() {
return "Rectangle[length="+length+",width="+width+",Shape[color="+getColor()+"]]";
}
}
