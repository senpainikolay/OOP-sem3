class Triangle extends Figure{

    double a;
    double b;
    double c;
    String name = "Triangle";

    Triangle(double a1,double b1,double c1){
        a = a1;
        b=  b1;
        c = c1;
    }

    public double getArea(){
        double semiPerimeter = ( a + b + c ) / 2;
        double Area = Math.sqrt(semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));
        return  Area;
    }

    public double getPerimeter(){
       double perimeter =  a+b+c;
       return perimeter;
    }

}
