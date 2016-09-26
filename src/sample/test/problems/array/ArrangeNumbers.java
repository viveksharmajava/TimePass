package sample.test.problems.array;

public class ArrangeNumbers {

	/**
	 * ,@param args an array having element like  0,1,0,0,0,1,1,0   arrange all 0 from left and all 1 from right
	 * so the out put should be 0,0,0,0,0 ,1,1,1
	 */
	public static void main(String[] args) {

		Integer []input ={0,1,1,0,1};
		input = reArrangeArray(input,0,4);
		for(int i =0 ;i < input.length ;i++){
			System.out.print(input[i]+"\t ");
		}
	}

	static Integer[] reArrangeArray(Integer []inputArray, int start ,int end){
		
		int temp ;
		if (start==end)
		{
			return inputArray;
		}
		while(inputArray[start]!=1) {
			start++;
		}
		while(inputArray[end] !=0){
			end--;
		}
		
		if(inputArray[start] !=0 && inputArray[end] !=1 && start < end){
			temp = inputArray[start];
			inputArray[start] = inputArray[end];
			inputArray[end] = temp;
			start++;
			end --;
			
		}
		if(start < end)	{
			 reArrangeArray(inputArray,  start , end);
		}
			return inputArray;
	}
}
