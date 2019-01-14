package question004;

public class Solution {
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int[] mergeNums = mergeTwoSortedArray(nums1, nums2);
		if (mergeNums.length % 2 == 1) {
			return mergeNums[(mergeNums.length-1)/2];
		} else {
			return (double)(mergeNums[mergeNums.length/2-1] + mergeNums[mergeNums.length/2]) / (double)2;
		}
    }
	
	private int[] mergeTwoSortedArray(int[] nums1, int[] nums2) {
		int length1 = nums1.length;
		int length2 = nums2.length;
		int[] result = new int[length1 + length2];
		
		int i = 0, j = 0;
		int index = 0;
		
		while (true) {
			if (i == nums1.length && j == nums2.length) {
				break;
			}
			if (i == nums1.length) {
				result[index] = nums2[j];
				j++;
				index++;
			}
			if (j == nums2.length) {
				result[index] = nums1[i];
				i++;
				index++;
			}
			if (i == nums1.length && j == nums2.length) {
				break;
			}
			if (i != nums1.length && j != nums2.length) {
				if (nums1[i] < nums2[j]) {
					result[index] = nums1[i];
					i++;
					index++;
				} else {
					result[index] = nums2[j];
					j++;
					index++;
				}
			}
			
			
		}
		return result;
	}
	

}
