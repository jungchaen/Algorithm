import java.util.*;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<800000;i++){
            list.add((int)(Math.random()*10000)+1);
        }
        HashSet<Integer> set=new HashSet<>(list); //중복 제거를 위해 set으로 변환 
        List<Integer> duplicateRemoveList=new ArrayList<>(set); //정렬을 위해 다시 list로 변환 
        Collections.sort(duplicateRemoveList);  //list를 정렬
        Integer[] arr=duplicateRemoveList.toArray(new Integer[0]); //list를 다시 Integer 배열로 변환 

        /* 시간 측정 결과 : iteration와 recursion이 거의 동일 */
        System.out.print("이진탐색 순환: ");
        double beforeTime1=System.currentTimeMillis();
        System.out.println(BinarySearch.binarySearchIteration(arr,101, 0, arr.length-1));
        double afterTime1=System.currentTimeMillis();
        System.out.println("iteration 수행시간: "+(afterTime1-beforeTime1)/1000);
        
        System.out.print("이진탐색 재귀: ");
        double beforeTime2=System.currentTimeMillis();
        System.out.println(BinarySearch.binarySearchRecursion(arr,200, 0, arr.length-1));
        double afterTime2=System.currentTimeMillis();
        System.out.println("recursion 수행시간: "+(afterTime2-beforeTime2)/1000);

    }
}
