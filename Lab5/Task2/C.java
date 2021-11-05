public class C extends B{
    protected String c = "C";

    public C( String str  , X xObj)
    {
        super(str,xObj);
        c =str;
        System.out.println(c);
    }
}