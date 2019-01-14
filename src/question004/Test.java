package question004;

public class Test {
	
	public static void main(String[] args) {
		int[] nums1 = new int[]{1,3};
		
		
		int[] nums2 = new int[]{8,9};
		
		Solution solution = new Solution();
		double result = solution.findMedianSortedArrays(nums1, nums2);
		System.out.println(result);
	}

}
