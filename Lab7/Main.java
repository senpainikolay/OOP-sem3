public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Square(4);
        figures[1] = new Rectangle(3, 6);
        figures[2] = new Triangle(9, 11, 12);



        Figure Circle = new Figure()
        {
            double radius = 4;

            public double getArea()
            {
                return Math.PI*radius*radius;
            }

            public double getPerimeter()
            {
                return Math.PI*radius*2;
            }

        };

        System.out.println("Circle's are is " + Circle.getArea() + " and the perimeter is " + Circle.getPerimeter());
        figures[3] = Circle;




        FigureController figController = new FigureController();

        Figure maxAreaFig = figController.maxArea(figures);
        System.out.println("The maximum area of all figures is  " + maxAreaFig.getArea() );
        Figure maxPerFig = figController.maxPerimeter(figures);
        System.out.println("The maximum perimeter of all figures is " + maxPerFig.getPerimeter() );
    }


}
