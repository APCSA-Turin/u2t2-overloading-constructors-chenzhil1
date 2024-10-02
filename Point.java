public class Point {

    private int x;
    private int y; 

    public Point(int x, int y){
        this.x = x;
        this.y = y;  
    }

    public Point(int xy) {
        this.x = xy;
        this.y = xy;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newY) {
        this.y = newY;
    }
    
    public String coordinate() {
        return "(" + x + ", " + y + ")"; 
    }

    public String quadrant() {
        if (x > 0 && y > 0) {
            return "I";
        }

        else if (x < 0 && y > 0) {
            return "II";
        }

        else if (x < 0 && y < 0) {
            return "III";
        }

        else if (x > 0 && y < 0) {
            return "IV";
        }

        else if (x == 0 && y == 0) {
            return "origin";
        }
        else { 
            return "on an axis";
        }
    }}
