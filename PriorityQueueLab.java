// import statements
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;

public class PriorityQueueLab {
    public static void main(String[] args){
        try{
            File myObj = new File("RandIntegers.txt");
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
            Scanner scanner = new Scanner(myObj);
            while (scanner.hasNext()) {
                pq.add(scanner.nextInt());
          }
            scanner.close();
            while(!pq.isEmpty()){
                System.out.println(pq.remove());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found!");
        }
    }
}
