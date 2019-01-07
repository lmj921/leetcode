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


