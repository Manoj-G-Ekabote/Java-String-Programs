public class SubStringOfString {
    public static void main(String[] args) {
       String str = "Jaishankar";
       System.out.println(str.substring(3));
       System.out.println(str.substring(1,5));// basically 1 to 4
       System.out.println(str.substring(1,str.length()));
       System.out.println(str.substring(1,str.length()-1));
    }
    
}
