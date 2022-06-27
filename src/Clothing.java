public class Clothing {
    public double price;
    public String type;
    public String size;

    public Clothing(){
        this.price = 29.9;
        this.type = "T-Shirt";
        this.size = "Medium";
    }

    public Clothing(double p, String t, String s){
        this.price = p;
        this.type = t;
        this.size = s;
    }

    public void increasePrice(){
        this.price += 5;
    }

    public void increasePrice(double x){
        this.price += x;
    }
    public static void test(){
        System.out.println("test");
    }

    public void details(){
        System.out.println("Item: " + this.type);
        System.out.println("Size: " + this.size);
        System.out.println("Price: $" + this.price);
        System.out.println();
    }
}
