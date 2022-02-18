package corejava;

abstract class Shape{
    abstract public String draw();
}

class Line extends Shape{

    Line(){
        System.out.println("Line Class");
    }
    @Override
    public String draw() {
        return "Drawing a line";
    }
}

class Rectangle extends Shape{
    Rectangle(){
        System.out.println("Rectangle Class");
    }
    @Override
    public String draw() {
        return "Drawing a rectangle";
    }
}

class Cube extends Shape{
    Cube(){
        System.out.println("Cube Class");
    }
    @Override
    public String draw() {
        return "Drawing a cube";
    }
}
public class Assignment2Q5 {
    public static void main(String[] args) {
   
        Line line = new Line();
        Rectangle rectangle = new Rectangle();
        Cube cube = new Cube();

        System.out.println(line.draw());
        System.out.println(rectangle.draw());
        System.out.println(cube.draw());
    }
}
