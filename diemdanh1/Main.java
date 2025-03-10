
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(int i = 0; i < n; i++){
            String id = sc.next(), atdList = sc.next();
            int attGrade = 10;
            for(Student x : list){
                if(x.getStudentID().equals(id)){
                    for(char y : atdList.toCharArray()){
                        if(y == 'v')attGrade -= 2;
                        else if(y == 'm')attGrade -= 1;
                    }
                    x.setAttendanceGrade(attGrade);
                }
            }
        }
        for(Student x : list){
            System.out.println(x);
        }
    }
}