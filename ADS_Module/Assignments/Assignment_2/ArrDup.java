class ArrDup {
    public static void main(String[] args) {
        int[] nums = {};//1, 1, 2, 3, 4, 4, 5
        
        if (nums.length == 0) {
            System.out.println("New length: 0");
            return;
        }
        
        int newLength = 1; 
  
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[newLength - 1]) {
                nums[newLength] = nums[i];
                newLength++;
            }
        }
   
        System.out.println("New length: " + newLength);
  
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}