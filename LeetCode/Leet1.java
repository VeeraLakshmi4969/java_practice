import java.util.Arrays;

class Leet1 {
    public static void main(String args[])
    {
        // 1. Define the input variables first
        int[] nums={2,7,11,15};
         int target=9;
         Leet1 obj=new Leet1();
          // 2. Create an object of the class to call the non-static method
        //   we did not use static key word to the next method so it is mandatory to create obj
         int[] res=obj.twoSum(nums, target);

        // 3. Call the method through the object and store the result
         
        // 4. Print the result using Java's built-in array printer
        // Note: Place this at the very top of your file
        System.out.println(Arrays.toString(res)); 
    }
    public int[] twoSum(int[] nums, int target) {
    
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};// Locked at size 2! Yo
                }
                
            }
        }
        return new int[]{};// Locked at size 2! Yo
    }
    
}

//different methods to print

// import java.util.Arrays; // Note: Place this at the very top of your file
//         System.out.println(Arrays.toString(res)); 

// // Assuming 'res' contains [0, 1]
// for (int i = 0; i < res.length; i++) {
//     System.out.println(res[i]); 
// }
// // Read this as: "For every integer 'num' inside 'res'"
// for (int num : res) {
//     System.out.println(num);
// }



