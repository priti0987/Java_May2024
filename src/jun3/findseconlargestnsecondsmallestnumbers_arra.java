package jun3;

public class findseconlargestnsecondsmallestnumbers_arra {

	    public static void main(String[] args) {
	        int[] arr = {12, 35, 1, 10, 34, 1,55,65};

	        try {
	            int secondLargest = findSecondLargest(arr);
	            int secondSmallest = findSecondSmallest(arr);

	            System.out.println("Second Largest: " + secondLargest);
	            System.out.println("Second Smallest: " + secondSmallest);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public static int findSecondLargest(int[] arr) {
	        if (arr == null || arr.length < 2) {
	            throw new IllegalArgumentException("Array must contain at least two distinct elements");
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            throw new IllegalArgumentException("Array must contain at least two distinct elements");
	        }

	        return secondLargest;
	    }

	    public static int findSecondSmallest(int[] arr) {
	        if (arr == null || arr.length < 2) {
	            throw new IllegalArgumentException("Array must contain at least two distinct elements");
	        }

	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;

	        for (int num : arr) {
	            if (num < smallest) {
	                secondSmallest = smallest;
	                smallest = num;
	            } else if (num < secondSmallest && num != smallest) {
	                secondSmallest = num;
	            }
	        }

	        if (secondSmallest == Integer.MAX_VALUE) {
	            throw new IllegalArgumentException("Array must contain at least two distinct elements");
	        }

	        return secondSmallest;
	    }
	}



