import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String str = sc.nextLine();
    int i=0, j = str.length()-1;
    sc.close();
    while(i<=j){
        if(str.charAt(i)!=str.charAt(j)){
            System.out.println(" Not a Palindrome");
            i++;
            j--;
            break;
        }
        else{
          System.out.println(" Palindrome");
          break;
        }
    }   
    }
}
