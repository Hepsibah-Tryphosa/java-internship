import java.util.HashMap;
import java.util.Map;

public class Countmap {
    public static void main(String[]args){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"abc");
        map.put(2,"def");
        map.put(3,"ghi");
        map.put(4,"jkl");
        map.put(5,"mno");
        map.put(6,"pqr");
        map.put(7,"stu");
        map.put(8,"vwx");
        map.put(9,"yz");
       int count = map.size();
        System.out.println(count);
    }
}
