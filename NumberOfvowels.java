public class NumberOfvowels {
    public static void main(String[] args) {
       String str = "aregodbcvirbzzauenomchei";
       int count = 0;
       for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.print("The number of vowels in the above context is:");
        System.out.print(count);
    }
}
