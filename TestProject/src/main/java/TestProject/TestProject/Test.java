package TestProject.TestProject;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "the sky is blue";
		String s1 = "";

		System.out.println(s);
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);

		}
		System.out.println(s1);

		/*
		 * for(int i1=0;i1>=s1.length()-1;i1++) { if(s[i1]) }
		 */

		// System.out.println(s);

		/*
		 * int low=0, mid = 7; int s2 = mid+1;
		 * 
		 * 
		 * for(int i= s.length();i>=low;i--) { if(s[low]!=s[mid])
		 * 
		 * low = mid; mid = mid+1; mid+1 = low; }
		 */

	}

}
