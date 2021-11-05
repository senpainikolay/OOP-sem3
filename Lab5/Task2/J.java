public class J extends I{
    protected String j = "J";

    public J(String str  , X xObj)  {
        super(str,xObj);
        j = str;
        System.out.println(j);
    }


}