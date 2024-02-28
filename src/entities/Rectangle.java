package entities;

public class Rectangle {
    public double Width;
    public double Height;

    public double Area() {
        return Width * Height;
    }

    public double Perimeter() {
        return 2 * (Width + Height);
    }

    public double Diagonal() {
        return Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2));
    }

    @Override
    public String toString() {
        return "Triangle "
                +Width
                +" x "
                +Height
                +" has area "
                +String.format("%.1f", Area())
                +", perimeter "
                +String.format("%.1f", Perimeter())
                +" and diagonal "
                +String.format("%.1f", Diagonal())
                +".";
    }
}
