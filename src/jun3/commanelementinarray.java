package jun3;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class commanelementinarray {


	    public static void main(String[] args) {
	        Integer[] a1 = {1, 2, 3, 2, 1};
	        Integer[] a2 = {1, 2, 3};
	        Integer[] a3 = {1, 2, 3, 4};

	        Set<Integer> result = findCommonElements(a1, a2, a3);
	        System.out.println(result);
	    }

	    @SafeVarargs
	    public static Set<Integer> findCommonElements(Integer[]... arrays) {
	        // Convert the first array to a set
	        Set<Integer> commonElements = new HashSet<>(Arrays.asList(arrays[0]));

	        // Iterate through the rest of the arrays and retain common elements
	        for (int i = 1; i < arrays.length; i++) {
	            Set<Integer> currentSet = new HashSet<>(Arrays.asList(arrays[i]));
	            commonElements.retainAll(currentSet);
	        }

	        return commonElements;
	    }
	}



