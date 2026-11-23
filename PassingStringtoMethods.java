public class PassingStringtoMethods {
    public static void change(String x){
        x = "Pankaj";
    }
    public static void main(String[] args) {
        String x ="Manoj";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
    
}
