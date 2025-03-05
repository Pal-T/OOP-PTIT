import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Department> departments = new ArrayList<>();
        while(n-- != 0){
            String temp = sc.nextLine();
            departments.add(new Department(temp.substring(0, 2), temp.substring(3)));
        }
        ArrayList<Salary> list = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        while(m-- != 0){
            String eplID = sc.nextLine();
            for(Department x : departments){
                if(eplID.substring(3).equals(x.getDepartmentID())){
                    list.add(new Salary(x.getDepartmentID(), x.getDepartmentName(), eplID, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
                }
            }
        }
        for(Salary x : list){
            System.out.println(x);
        }
    }
}