import java.util.Comparator;
import java.util.PriorityQueue;

class Pair {
    int x;
    int y;
    Pair(int x , int y){
        this.x=x;
        this.y=y;
    }
}

class maxByXandY implements Comparator<Pair>{

    @Override
    public int compare(Pair a, Pair b){
        if(a.x!=b.x){
            return b.x-a.x;
        }

        return a.y-b.y;
    }
}

// Custom comparator class that implements Comparator interface
class DescendingStringComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        // For descending order, compare s2 to s1 instead of s1 to s2
        return s2.compareTo(s1);
    }
}

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(new maxByXandY());

        priorityQueue.add(new Pair(10,1));
        priorityQueue.add(new Pair(11,2));

        while(!priorityQueue.isEmpty()){
            var num = priorityQueue.poll();
            System.out.println(num.x+ " "+ num.y);
        }



        System.out.println("Hello world!");
    }
}