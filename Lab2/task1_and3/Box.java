package task1_and3;


public class Box {

    int height;
    int width;
    int  depth;

    public Box () {
        height = 1;
        width =1;
        depth =1;
    }

    public Box ( int _height ) {
      height = _height;
      width =  _height;
      depth = _height;
     }


     public Box ( int _height,  int _width, int _depth ) {
        height = _height;
        width = _width;
        depth  = _depth;
     }

     public int surfaceArea() {
        return 2*(width*depth + height*depth + height*width);
     }

     public int volume(){
        return width*depth*height;
     }



}
