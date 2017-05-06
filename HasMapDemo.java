import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class HasMapDemo {
public static void main(String[]args){
	TreeMap<String,ArrayList<Integer>> phoneMap = new TreeMap<>();
    ArrayList<Integer> phoneNo = new ArrayList<>();
           phoneNo.add(9972);
           phoneNo.add(8734);
           phoneNo.add(7564);
           phoneNo.add(745785);
           phoneNo.add(9972);
            phoneMap.put("Ashutosh ",phoneNo);
          
           ArrayList<Integer> johnNo = new ArrayList<>();
           johnNo.add(556);
           johnNo.add(34);
           johnNo.add(567);
           johnNo.add(0);
           phoneMap.put("john", johnNo);
           System.out.println(phoneMap.get("john"));
           System.out.println(phoneMap);
}
}
