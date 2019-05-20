
public class Solution_Backup1 {
	public String solution(String s) {
		String answer = "";
		int sLen = s.length();
		char[] charString = s.toCharArray();

		quickSort(charString, 0, sLen - 1);

		for (int i = 0; i < sLen; i++) {
			answer += Character.toString((char) charString[i]);
		}

		return answer;
	}

	public static int partition(char arr[], int left, int right) {

		int pivot = arr[(left + right) / 2];

		while (left < right) {
			while ((arr[left] > pivot) && (left < right))// 요기 arr[left] > pivot
				left++;
			while ((arr[right] < pivot) && (left < right))// 요기 arr[right] < pivot]
				right--; // 두개 부등호만 바꿔주면 오름차-내림차

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = (char) temp;
			}
		}

		return left;
	}

	public static void quickSort(char[] arr, int left, int right) {

		if (left < right) {
			int pivotNewIndex = partition(arr, left, right);

			quickSort(arr, left, pivotNewIndex - 1);
			quickSort(arr, pivotNewIndex + 1, right);
		}

	}
}