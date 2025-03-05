import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Candidate> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Candidate(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
        for(Candidate x : list){
            System.out.println(x);
        }
    }
}