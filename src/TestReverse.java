public class TestReverse
{
    public static void main(String[] args)
    {
      System.out.println(isExactReverse("ba", "a"));
      System.out.println(isExactReverse("desserts", "stressed"));
      System.out.println(isExactReverse("apple", "apple"));
      System.out.println(isExactReverse("regal", "lager"));
      System.out.println(isExactReverse("war", "raw"));
      System.out.println(isExactReverse("pal", "slap"));
    }
    public static boolean isExactReverse(String x, String y)
    {
        String yStr = "";

        // decrement through reversed argument y
        for(int i = y.length()-1; i >= 0; i--){
            // iterate through string y
            yStr += y.charAt(i);
        }
        System.out.println();

        System.out.print(yStr + " : ");
        // compare String x to String yStr. use .equals() to compare String literal to String object
        if(yStr.equals(x))
        {
            return true;
        }
        return false;
    }

}