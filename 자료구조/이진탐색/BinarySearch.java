public class BinarySearch {
    public static int binarySearchRecursion(Integer[] arr,int key, int low, int high){
        int mid; //mid는 계속 변하는 인덱스
        while(low<=high){ //즉, low가 high보다 커지기 전까지
            mid=(low+high)/2; //중간 인덱스를 구하기 위해서

            if(key==arr[mid]){
                return mid; //key값과 같으면 mid 인덱스를 반환
            }else if(key<arr[mid]){ //key값이 더 작으면
                return binarySearchRecursion(arr, key, low, mid-1); //high가 mid-1이 됨
            }else{
                return binarySearchRecursion(arr, key, mid+1, high); //low가 mid+1이 됨
            }
        }
        return -1; //key값을 찾지 못했을 경우
    }
    
    public static int binarySearchIteration(Integer[] arr,int key, int low, int high){
        int mid;
        while(low<=high){ //low가 high보다 커지기 전까지
            mid=(low+high)/2; //mid는 계속 변하는 인덱스

            if(key==arr[mid]){
                return mid;
            }else if(key<arr[mid]){
                high=mid-1; //high가 mid-1이 됨
            }else{
                low=mid+1;
            }
        }
        return -1; //key값을 찾지 못했을 경우
    }
}
