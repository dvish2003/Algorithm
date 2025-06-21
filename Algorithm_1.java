class Algorithm_1{

public static void main(String[] args) {
    int target = 9;
    int[] num = {2,7,11,15};
    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num.length; j++) {
            if(num[j]+num[i] == target){
                System.out.println("["+j+" , "+i+"]");
                break;
            }            
        }
    }

}
}


/*give the array and target int target = 9; int[] num = {2,7,11,15};
  
 * we get answer two number = target if return index number in array 
 

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

*/