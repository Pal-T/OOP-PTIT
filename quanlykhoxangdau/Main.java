import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Bill> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Bill(sc.next(), sc.nextLong()));
        }
        for(Bill x : list){
            System.out.println(x);
        }
    }
}
