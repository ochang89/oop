public class Car {
    private int year;
    private String make;
    private String model;
    private int x;
    private int y;
    public static int carCount = 0;

    public Car(int year, String make, String model){
        this.year = year;
        this.make = make;
        this.model = model;
        carCount++;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setPoint(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }
    public boolean equalTo(Car c){
        boolean isEqual = false;

        if (this.year == c.year && this.make.equals(c.make) && this.model.equals(c.model)) {
            isEqual = true;
        }
        return isEqual;
    }
    public String getMake(){
        return this.make;
    }
    public void setMake(String m){
        this.make = m;
    }
    public String toString(){
        return String.format("(%d, %s)", this.x, this.y);
    }
}
