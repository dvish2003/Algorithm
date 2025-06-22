public class Algorithm_Q4 {
public static void main(String[] args) {
    int[] numList = {2,34,54,324,323,452,2323,1212,322,1111,1213,1234,2222};
    int n = numList.length;

     int max = 0;


for (int i = 0; i < n; i++) {
     if(numList[i] > max){
        max = numList[i];
     }
}
System.out.println(max);
}
}