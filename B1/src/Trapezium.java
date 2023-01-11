public class Trapezium {
    private double smallParallel;
    private double bigParallel;
    private double side1;
    private double side2;
    private double height;
    Trapezium(double smallParallel,double bigParallel,double side1,double side2,double height){
        this.smallParallel=smallParallel;
        this.bigParallel=bigParallel;
        this.side1=side1;
        this.side2=side2;
        this.height=height;
    }
    public double getArea(){
        return (smallParallel+bigParallel)/2*height;
    }
    public double getPerimeter(){
        return smallParallel+bigParallel+side1+side2;
    }


}
