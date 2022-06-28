public class Point {
    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int xVal, int yVal){
        this.x = xVal;
        this.y = yVal;
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
    public String toString(){
        String result = String.format("(%d, %d)", this.x, this.y);
        return result;
    }
    public double distance(Point p){
        double math = Math.sqrt(Math.pow((this.x-p.getX()), 2) + Math.pow((this.y-p.getY()),2));
        return math;
    }

}
