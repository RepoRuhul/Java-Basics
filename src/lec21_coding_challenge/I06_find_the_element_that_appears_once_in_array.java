package lec21_coding_challenge;

public class I06_find_the_element_that_appears_once_in_array {
	static int[] array = {2, 3, 5, 4, 5, 3, 4, 1, 3, 2, 0};
	static int size = array.length;
	
	public static void findUniqueData(int[] array, int size) {
		// TODO A nice explanation is necessary for line 11, why inside
		for (int i = 0; i < size; i++) { // 2
			int count = 0;
			for (int j = 0; j < size; j++) { // 2, 3, 5, 4, 5, 3, 4, 1, 3, 2, 0
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(array[i] + " occurs once.");
			}
		}
	}

	public static void main(String[] args) {
		findUniqueData(array, size);
	}

}