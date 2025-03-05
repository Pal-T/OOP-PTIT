import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Course> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        while(n-- != 0){
            Course course = new Course(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            map.put(course.getCourseID(), course.getCourseName());
            list.add(course);
        }
        Collections.sort(list);
        int m = Integer.parseInt(sc.nextLine());
        while(m-- != 0){
            String queryCourse = sc.nextLine();
            System.out.println("Danh sach nhom lop mon " + map.get(queryCourse) + ":");
            for(Course x : list){
                if(x.getCourseID().equals(queryCourse)){
                    System.out.println(x);
                }
            }
        }
    }
}