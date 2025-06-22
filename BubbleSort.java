public class BubbleSort {

public static void main(String[] args) {
    int[] numList = {23,21,43,22,91,45,90,432,123,423,90,1,2};
    int n = numList.length;
    
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if(numList[j] > numList[j+1]){
                int temp = numList[j];
                numList[j] = numList[j+1];
                numList[j+1] = temp;
            }
        }
    }

    for (int i = 0; i < numList.length; i++) {
        System.out.println(numList[i]);
    }
    
}
}