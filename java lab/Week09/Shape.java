public abstract class Shape implements Comparable{
    
//Impliment the variable
final static double PI = 3.14;
String color;
String description;

public Shape(String _color, String _description) {
    this.color = _color;
    this.description = _description;
}

public void setColor(String _color) {
    this.color = _color;
}

public String getColor() {
return this.color;
}

@Override
public String toString() {
return description+" (color= "+this.getColor()+", area= "+this.getArea()+")";
}

@Override
public int compareTo(Object x) {
    if(this.getArea() > ((Shape) x).getArea()) {
        return 1;
    }
    else if(this.getArea() == ((Shape) x).getArea()) {
        return 0;
    }
    else {
    return -1;
    }
}

public abstract double getArea();

}
