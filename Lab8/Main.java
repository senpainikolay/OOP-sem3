public class Main {

        public static void main(String[] args) {
            GeometricBody[] figArr = new GeometricBody[3];
            figArr[0] = new Cube(7);
            figArr[1] = new Sphere(4);
            figArr[2] = new Parallelepiped(6, 9);

            GeometricBodyController bodyController = new GeometricBodyController();

            GeometricBody maxSurfaceFig = bodyController.maxSurface(figArr);
            System.out.println("The maximum Surface of all figures is  " + maxSurfaceFig.getSurface() );
            GeometricBody maxVolFig = bodyController.maxVolume(figArr);
            System.out.println("The maximum Volume of all figures is " + maxVolFig.getVolume() );
        }
    }
