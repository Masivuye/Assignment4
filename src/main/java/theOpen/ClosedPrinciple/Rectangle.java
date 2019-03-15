package theOpen.ClosedPrinciple;

import javafx.scene.shape.Circle;

public class Rectangle
{
   private double Width;
   private double Height;

    public double getWidth() {
        return Width;
    }

    public double getHeight() {
        return Height;
    }
}
 class AreaCalculator
{
    public double Area(Rectangle[] shapes)
    {
        double area = 0;
        for (Rectangle shape: shapes)
        {
            if(shape.equals(shapes)){
                Rectangle rectangle = new Rectangle();
                area += rectangle.getWidth()*rectangle.getHeight();
            }
            else{
                Circle circle = new Circle();
                area += circle.getRadius()*circle.getRadius()*Math.PI;
            }

        }

        return area;
    }
}