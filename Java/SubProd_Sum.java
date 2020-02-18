class Solution {
    public int subtractProductAndSum(int n) {
        int result = 0;
        
        
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (n > 0) {
            stack.push( n % 10 );
            n = n / 10;
        }
        int[] arr = new int[stack.size()];
        for(int i = 0; !stack.isEmpty(); i++){
           // print(stack.pop());
            arr[i] = stack.pop();
            int prod = 1;
            int sum = 0;
            for(int j = 0; j<arr.length; j++){
                
                prod = prod * arr[j];
                
                sum = sum + arr[j];
                result = prod - sum;
               
            }
            
        }
       
        
        
        return result;
    }
}