import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word (the word must contain less than 15 character):");
        String str = scan.nextLine();

        if(str.length()>15)
            System.out.println("Word length exceed the limit ...");
        else{
            for(int i=0; i<str.length(); i++){
                stack.push(str.charAt(i));
            }
            System.out.println(stack.toString());
            String reverse ="";
            while(!stack.isEmpty()){
                reverse = reverse + stack.pop();
            }
            System.out.println("Reverse word of " + str + ": " + reverse);

            if(str.equals(reverse)==true)
                System.out.println("Word " + str + " is a palindrome.");
            else
                System.out.println("Word " + str + " is not a palindrome.");

        }

    }
}
