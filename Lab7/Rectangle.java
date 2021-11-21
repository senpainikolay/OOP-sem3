class Rectangle  extends  Figure{
        double l;
        double w;
        String name = "Rectangle";


        Rectangle(double width,double length){
            w =width;
            l =length;
        }

        public double getArea(){
            return w*l;
        }

        public double getPerimeter(){
            return ( l + w ) * 2 ;
        }


}
