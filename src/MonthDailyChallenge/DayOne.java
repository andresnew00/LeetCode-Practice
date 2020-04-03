package MonthDailyChallenge;

public class DayOne {
//    Given a non-empty array of integers, every element appears twice except for one. Find that single one.
//
//    Note:
//
//    Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//    Example 1:
//
//    Input: [2,2,1]
//    Output: 1
//    Example 2:
//
//    Input: [4,1,2,1,2]
//    Output: 4

    public static int singleNumber(int[] nums) {
        //first loop will select the next number
        for ( int i = 0; i < nums.length; i++ ) {
            int currentNumber = nums[i];
            //then second loop will compare it to next number in the array
            for (int  j = 0; j < nums.length; j++ ){
                System.out.println("current number: " + currentNumber + " j number: " + nums[j]);
                //this wil check if the numbers are in the same position in the array and if not then it will check if they are the same number
                if (i != j && currentNumber == nums[j]) {
                    break;
                    // if the numbers are not in the same position and the numbers are not in the end of the array then this must be the number we are looking for
                } else if (i != j && currentNumber != nums[j] && i == nums.length - 1 || j == nums.length - 1 ){
                        return currentNumber;
                } else {
                    continue;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] sample = {2,2,1};
        int[] sample2 = {4,1,2,1,2};
        System.out.println(singleNumber(sample));
        System.out.println(singleNumber(sample2));
    }
}
