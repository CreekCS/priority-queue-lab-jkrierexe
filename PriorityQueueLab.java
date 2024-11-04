// import statements
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class PriorityQueueLab {
    public static void main(String[] args){
        File myObj = new File("RandIntegers.txt");
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        Scanner scanner = new Scanner(myObj);
        while (scanner.hasNext()) {
            arr.add(scanner.nextLine());
        }
        scanner.close();
    }
