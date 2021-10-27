package stack.and.queue;

public class GetMax{
    public Stack<Integer> actualStack=new Stack<>();
    public Stack<Integer> maxStack=new Stack<>();

    public void push(int[] arr){

        for (int value : arr) {
            if (actualStack.isEmpty()&&maxStack.isEmpty()) {
                maxStack.push(value);
                actualStack.push(value);
            }else if (value > maxStack.peek()) {
                maxStack.push(value);
                actualStack.push(value);
            } else {
                actualStack.push(value);
                maxStack.push(maxStack.peek());
            }
        }

    }
public int getMaxValue(){
      return maxStack.peek();
}

   public void pop(){
        actualStack.pop();
        maxStack.pop();
    }



}
