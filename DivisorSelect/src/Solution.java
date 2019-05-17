class Solution {
  public int[] solution(int[] arr, int divisor) {
	  int arrLen = arr.length;
	  int div = divisor;
	  int cnt = 0;
	  int[] answerTemp = new int[arrLen];

	  for (int i = 0; i < arrLen; i++) {
		  if ((arr[i] % div) == 0) {
			  answerTemp[cnt] = arr[i];
			  cnt++;
		  }
	  }
	  int[] answer = {-1};
	  if(cnt != 0) {
		  answer = new int[cnt];
		  
		  for(int i = 0 ; i < cnt; i++ ) {
			  answer[i] = answerTemp[i];
		  }
		  
		  quickSort(answer, 0, answer.length-1);
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