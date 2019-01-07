package leet_code;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int[] twoSum(int[] nums, int target) {
    		int[] result=new int[2];
    		
        for(int i=0;i<nums.length;i++)
        {
        		int a=nums[i];        		
        		for(int j=i+1;j<nums.length;j++)
        		{
        			int b=nums[j];
        			if(a+b==target) {
        				result[0]=i;
        				result[1]=j;
        				return result;
        			}
        		}
        }
        return result;
        
    }

}
