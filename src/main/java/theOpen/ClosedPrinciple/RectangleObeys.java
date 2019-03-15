package theOpen.ClosedPrinciple;

public class RectangleObeys {
    public abstract class Shape
    {
        public abstract double Area();
    }
    public class Rectangle extends Shape
    {
        private double Width;
        private double Height;

        @Override
        public  double Area()
        {
            return Width*Height;
        }
    }

    public class Circle extends Shape
    {
        private double Radius;


        @Override
        public  double Area()
        {
            return Radius*Radius*Math.PI;
        }
    }
    class AreaCalculator{
        public double Area(Shape[] shapes)
        {
            double area = 0;
            for (Shape shape: shapes)
            {
                area += shape.Area();
            }

            return area;
        }
    }

}
