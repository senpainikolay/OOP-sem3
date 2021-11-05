public class D extends C{
    protected String d = "D";

    public D(String str  , X xObj)  {
        super(str,xObj);
        d = str;
        System.out.println(d);

    }
}