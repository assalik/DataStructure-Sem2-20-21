import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyStack<Integer> stack = new MyStack<>();
//Q2a
        System.out.println("Enter integer to insert into stack. (Put -1 to stop entering)");
        int enter =0;
        while(enter!= -1){
            enter = scan.nextInt();
            if (enter == -1)
                break;
            stack.push(enter);
        }
        System.out.println(stack +"\n");

//Q2b
        int[] arr = new int[stack.getSize()];
        int size = stack.getSize();
        for(int i =0; i<size; i++){
            arr[i] = stack.pop();
        }
        stack.push(1);
        for(int i = size-1; i>=0 ; i--){
            stack.push(arr[i]);
        }
        System.out.println(stack);
//Q2c
        System.out.println("Size of the stack : " + stack.getSize());
        System.out.println();
//Q2d
        int size2 = stack.getSize();
        System.out.println(stack.toString());
        for(int i=0; i<size2; i++){
            System.out.println(stack.toString());
            System.out.print("pop["+ stack.pop()+ "]" + ">>>>");
        }
    }
}
