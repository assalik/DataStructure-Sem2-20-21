public class Q3 {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(12);
        stack.push(45);
        stack.push(98);
        stack.push(76);
        stack.push(64);

        System.out.println(stack);

        int sum= 0;
        int[] arr= new int[stack.getSize()];
        for(int i=0; i< stack.getSize(); i++){
            arr[i] = stack.pop();
            sum+=arr[i];
        }
        System.out.println("Sum of all elements: " + sum);


    }
}
