class min_max_low_comparision{
	static class Pair{
		int max;
		int min;
	}

	static Pair min_max(int[] arr){
		int n = arr.length;
		Pair minMax = new Pair();
		int i;

		if(n%2==0){
			if(arr[0]>arr[1]){
			minMax.min=arr[1];
			minMax.max=arr[0];}
			else{
				minMax.min=arr[0];
				minMax.max=arr[1];
			}

			i = 2;
		}

		else{
			minMax.max = arr[0];
			minMax.min = arr[0];
			i=1;
		}

		while(i<(n-1)){
			if(arr[i]<arr[i+1])
			{
				if(minMax.min>arr[i])
				minMax.min = arr[i];
				if(minMax.max<arr[i+1])
				minMax.max = arr[i+1];
			}
			else{
				if(minMax.min>arr[i+1])
				minMax.min = arr[i+1];
				if(minMax.max<arr[i])
				minMax.max = arr[i];
			}
			i+=2;
		}

		return minMax;
	}


	public static void main(String[] args) {
		int[] arr = {-3,-20,89,65,99,555};
		Pair o = min_max(arr);
		System.out.println("Min: "+o.min);
		System.out.println("Max: "+o.max);
	}
}