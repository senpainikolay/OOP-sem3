public class Sphere implements  GeometricBody {

    double radius;

    Sphere (double radius)
    {
        this.radius = radius;
    }

    public double getSurface()
    {
        return  Math.PI * Math.pow(radius, 2) * 4;
    }

    public double getVolume()
    {
        return Math.PI * Math.pow(radius, 3) * 4/3 ;
    }

     }
