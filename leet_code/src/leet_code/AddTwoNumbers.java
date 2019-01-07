package leet_code;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	class Solution {
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode result = null;	
			ListNode tempNode1=l1;
			ListNode tempNode2=l2;
			ListNode prior = null;
			int flag=0;//进位？
			do
			{						
				int a=0;
				if(tempNode1!=null)
				{
					a=tempNode1.val;
					tempNode1=tempNode1.next;
				}
				
				int b=0;
				if(tempNode2!=null)
				{
					b=tempNode2.val;
					tempNode2=tempNode2.next;
				}				
				
				int temp=a+b+flag;
				if(temp>=10) {
					flag=1;
					temp=temp%10;
				}else {
					flag=0;
				}
				
				if(result==null)
				{
					result = new ListNode(temp);
					prior=result;
				}else {
					ListNode node = new ListNode(temp);
					prior.next=node;
					prior=node;
				}							
			}while(tempNode1!=null || tempNode2!=null || flag>0);

			
			return result;
		}
		
		
		
		//越界问题
		public ListNode addTwoNumbers_wrong(ListNode l1, ListNode l2) {
			ListNode result;	
			long factor=1;
			long num1=0;
			ListNode tempNode=l1;
			do
			{				
				long temp=tempNode.val;
				num1+=temp*factor;
				factor*=10;
				tempNode=tempNode.next;
			}while(tempNode!=null);
			
			factor=1;
			long num2=0;
			tempNode=l2;
			do
			{				
				long temp=tempNode.val;
				num2+=temp*factor;
				factor*=10;
				tempNode=tempNode.next;
			}while(tempNode!=null);
			
			long numResult=num1+num2;
			System.out.println(numResult);
			
			String numStr=numResult+"";
			char c=numStr.charAt(numStr.length()-1);			
			int digtal= Character.getNumericValue(c);
			result = new ListNode(digtal);
			ListNode prior = result;
			for(int i=numStr.length()-2;i>=0;i--)
			{
				c=numStr.charAt(i);			
				digtal= Character.getNumericValue(c);
				ListNode node = new ListNode(digtal);
				prior.next=node;
				prior=node;
			}
			
			return result;
		}
	}
}


