class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int left[] = new int[len];
        int right[] = new int[len];
        int product[] = new int[len];
        int prod = 1;


        // int left,right;
        for(int i=0;i<len;i++)
        {
            prod = prod * nums[i];
            left[i] = prod;
        }

        prod = 1;

        for(int i=len-1;i>=0;i--)
        {
            prod = prod * nums[i];
            right[i] = prod;
        }

        for(int i=0;i<len;i++)
        {
            if(i == 0)
            {
                
                product[i] = 1 * right[i+1]; 
            }
            else if(i+1 >= len)
            {
                
                product[i] = left[i-1] * 1;
            }
            else
            {
             product[i] = left[i-1] * right[i+1];
            }
            
        }

     
    //    for(int i=0;i<len;i++)
    //    {
    //         System.out.println(left[i]);
    //    }
    //       System.out.println();
          
    //    for(int j=0;j<len;j++)
    //    {
    //         System.out.println(right[j]);
    //    }

     return product;  

    }
}