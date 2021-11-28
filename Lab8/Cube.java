public class Cube implements  GeometricBody {

        double side;

        Cube (double side)
        {
            this.side = side;
        }

        public double getSurface()
        {
            return Math.pow(side, 2);
        }

        public double getVolume()
        {
            return Math.pow(side, 3);
        }

}
