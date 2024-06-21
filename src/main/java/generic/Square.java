package generic;

public class Square extends Shape{
    private int with;
    public Square(int with){
        this.with = with;
    }

    @Override
    public double area() {
        return with * with;
    }
}
