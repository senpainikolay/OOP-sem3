class Square extends Figure{

    double a;
    String name = "Square";

    Square(double a1){
        a=a1;
    }

    public double getArea(){
        return a*a;
    }

    public double getPerimeter(){
        return a*4;
    }


}