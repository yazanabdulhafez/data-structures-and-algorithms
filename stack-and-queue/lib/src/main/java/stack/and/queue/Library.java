/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(7);
        System.out.println(stack);
        System.out.println("removed value: "+stack.pop());
        System.out.println("top: "+stack.peek());
        System.out.println("stack is Empty: "+stack.isEmpty());
        Queue<Integer> queue=new Queue<>();
        queue.enqueue(5);
        queue.enqueue(2);
        queue.enqueue(7);
        System.out.println(queue);
        System.out.println("removed value: "+queue.dequeue());
        System.out.println("front: "+queue.peek());
        System.out.println("queue is Empty: "+queue.isEmpty());

        PseudoQueue<Integer> pseudoQueue=new PseudoQueue<>();
        pseudoQueue.enqueue(20);
        pseudoQueue.enqueue(15);
        pseudoQueue.enqueue(10);
        pseudoQueue.enqueue(5);
        System.out.println(pseudoQueue.toString());
        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.toString());


        AnimalShelter animalShelter=new AnimalShelter();
        System.out.println(animalShelter.toString());
        Dog dog=new Dog("max");
        System.out.println(dog);
        animalShelter.enqueue(dog);
        System.out.println(animalShelter);
        Cat cat=new Cat("franki");
        System.out.println(cat);
        animalShelter.enqueue(cat);
        System.out.println(animalShelter);
        Cat cat2=new Cat("loosy");
        System.out.println(cat2);
        animalShelter.enqueue(cat2);
        System.out.println(animalShelter);
        animalShelter.dequeue("cat");
        System.out.println(animalShelter);


        Validator validator =new Validator();
        System.out.println(validator.validateBrackets("[[y{a()za}n]]"));
        int[]arr={1,2,15,6};
        GetMax getMax=new GetMax();
        getMax.push(arr);
        System.out.println(getMax.getMaxValue());
        System.out.println(getMax.actualStack);
        System.out.println(getMax.maxStack);
        System.out.println("---------------------------");
        getMax.pop();
        System.out.println(getMax.actualStack);
        System.out.println(getMax.maxStack);
        System.out.println(getMax.getMaxValue());
        System.out.println("---------------------------");
        getMax.pop();

        System.out.println(getMax.actualStack);
        System.out.println(getMax.maxStack);
        System.out.println(getMax.getMaxValue());
        System.out.println("---------------------------");
        getMax.pop();
        System.out.println(getMax.actualStack);
        System.out.println(getMax.maxStack);
        System.out.println(getMax.getMaxValue());
//
//        String[] arr1={"A","B","C","D","E"};
//        DuckDuckGoose duckDuckGoose=new DuckDuckGoose();
//        duckDuckGoose.duckGoose(arr1,3);
    }




}
