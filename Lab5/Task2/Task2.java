public class Task2 {
     public static void main(String[]  args) {

          J jObj = new J(  "string for all classes" ,
                  new X("strxTest"));
          System.out.println(jObj);
          System.out.println("J string:");
          System.out.println(jObj.j);
          System.out.println("x string private var:");
          System.out.println(jObj.strX);


     }
}
