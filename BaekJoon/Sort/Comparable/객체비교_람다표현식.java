import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class SortExample {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple("사과", 900));
        appleList.add(new Apple("청사과", 1200));
        appleList.add(new Apple("무농약 사과", 1500));

        Collections.sort(appleList, (o1, o2) -> o1.getCost().compareTo(o2.getCost())); // 오름차순
        Collections.sort(appleList, (o1, o2) -> o2.getCost().compareTo(o1.getCost())); // 내림차순

        Iterator iterator = appleList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
