class Solution {
    public int numberOfSteps (int num) { // runtime is O(n)
        int countsteps = 0; // variable to count the number of steps taken
        while(num > 0){ // while the parameter num is greater than 0 keep looping
            
            if(num % 2 == 0){// check if even
                num = num / 2; // divide the current num by 2 if even
                countsteps++; // increase counter
                
            }else{// because not even it must be odd and the current num is subtracted by 1 and the counter is increased
                num = num - 1;
                countsteps++;
            }
        }
        return countsteps;// returns the total number of steps taken to get to 0
    }
}