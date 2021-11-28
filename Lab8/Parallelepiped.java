public class Parallelepiped implements  GeometricBody {

    double side;
    double height;

    Parallelepiped (float side, float height)
    {
        this.side = side;
        this.height = height;
    }

    public double getSurface()
    {
        return side * height;
    }

    public double getVolume() {

        return  Math.PI * Math.pow(side * height, 3) * 4/3 ;
    }
}
