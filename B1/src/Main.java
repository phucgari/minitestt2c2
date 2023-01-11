public class Main {
    public static void main(String[] args) {
        Trapezium trape1=new Trapezium(10,30,20,40,20);
        Trapezium trape2=new Trapezium(15,20,30,20,10);
        System.out.println(compareSize(trape1.getArea(), trape2.getArea()));
        System.out.println(comparePerimeter(trape1.getPerimeter(), trape2.getPerimeter()));
    }
    public static String compareSize(double size1,double size2){
        if(size1>size2){
            return "size 1 is larger than size 2";
        }else{
            return "size 2 is larger than size 1";
        }
    }
    public static String comparePerimeter(double peri1,double peri2){
        if(peri1>peri2){
            return "peri 1 is longer than peri 2";
        }else{
            return "peri 2 is longer than peri 1";
        }
    };
}