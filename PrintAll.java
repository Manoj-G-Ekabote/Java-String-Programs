public class PrintAll {
    public static void main(String[] args) {
        String s = "Pankaj";
        int count = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
                count = count + 1;
                
            }
            System.out.println();
        }
        System.out.print("The toatal number of subdtrings are : ");
        System.out.println(count);
    }
    
}
