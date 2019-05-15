package lvl_one;

public class KthInteger {
	// 배열 array
	/*
	 * https://programmers.co.kr/learn/courses/30/lessons/42748 배열 array의 i번째 숫자부터
	 * j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다. 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4],
	 * i = 2, j = 5, k = 3이라면 array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다. 1에서 나온 배열을
	 * 정렬하면 [2, 3, 5, 6]입니다. 2에서 나온 배열의 3번째 숫자는 5입니다. 배열 array, [i, j, k]를 원소로 가진
	 * 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를
	 * 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	 */
	/*
	 * 제한사항 array의 길이는 1 이상 100 이하입니다. array의 각 원소는 1 이상 100 이하입니다. commands의 길이는 1
	 * 이상 50 이하입니다. commands의 각 원소는 길이가 3입니다.
	 */

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int a = 0, b = 0, c = 0, i = 0, j = 0;
		int[] arr;
		for (i = 0; i < commands.length; i++) {
			a = commands[i][0];
			b = commands[i][1];
			c = commands[i][2];
			arr = new int[b - a + 1];
			for (j = 0; j < arr.length; j++) {
				arr[j] = array[(a++) - 1];
			}
//			for(int k:arr)
//				System.out.print(k+" ");
//			System.out.println();
			quickSort(arr, 0, arr.length - 1);
//			for(int k:arr)
//				System.out.print(k+" ");
//			System.out.println();
			answer[i] = arr[c - 1];
		}

		return answer;
	}

	public static int partition(int arr[], int left, int right) {

		int pivot = arr[(left + right) / 2];

		while (left < right) {
			while ((arr[left] < pivot) && (left < right))
				left++;
			while ((arr[right] > pivot) && (left < right))
				right--;

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}

		return left;
	}

	public static void quickSort(int arr[], int left, int right) {

		if (left < right) {
			int pivotNewIndex = partition(arr, left, right);

			quickSort(arr, left, pivotNewIndex - 1);
			quickSort(arr, pivotNewIndex + 1, right);
		}

	}
}
