package stack.and.queue;

public class DuckDuckGoose {
    Queue <String> queue1=new Queue<>();
    Queue <String> queue2=new Queue<>();
    public int count=0;


    public void duckGoose(String [] duckgoose,int k){

        for(String item:duckgoose){
            queue1.enqueue(item);
        }
        int n=duckgoose.length;
        int count1 = 0;
        while(count1<=n){
            System.out.println(queue1);
            count=0;
           while (count<k-1){
               queue2.enqueue(queue1.dequeue());
               count++;

            }

           queue1.dequeue();
           System.out.println("q1"+queue1);
           System.out.println("q2"+queue2);

            while (! queue2.isEmpty()){
                queue1.enqueue(queue2.dequeue());
            }
            System.out.println("q1After"+queue1);
            System.out.println("q2After"+queue2);
            count1++;
            System.out.println(count1);
        }



    }
}
