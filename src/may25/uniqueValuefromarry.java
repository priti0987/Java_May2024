package may25;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class uniqueValuefromarry {

	    public static void main(String[] args) {
	        int[] inputArray = {1, 3, 1, 3, 5, 1, 3, 6, 7, 6};
	        int[] uniqueElements = findUniqueElements(inputArray);

	        // Print the result
	        for (int element : uniqueElements) {
	            System.out.print(element + " ");
	        }
	    }

	    public static int[] findUniqueElements(int[] arr) {
	        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

	        // Count the frequency of each element
	        for (int num : arr) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        // Collect elements that appear exactly once
	        List<Integer> uniqueList = new ArrayList<>();
	        for (int num : frequencyMap.keySet()) {
	            if (frequencyMap.get(num) == 1) {
	                uniqueList.add(num);
	            }
	        }

	        // Convert the list to an array and return
	        int[] result = new int[uniqueList.size()];
	        for (int i = 0; i < uniqueList.size(); i++) {
	            result[i] = uniqueList.get(i);
	        }

	        return result;
	    }
	}


