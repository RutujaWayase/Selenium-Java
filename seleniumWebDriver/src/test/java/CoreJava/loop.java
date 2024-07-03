package CoreJava;

public class loop {
	public static void main(String[] args) {
		int[] arr2 = {1,2, 3, 4, 5, 6, 7, 8};
		//2,4,6,8 //Check array is multiple of 2
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i]%2==0) {
				System.out.println(arr2[i]);
			}
			else {
				System.out.println(arr2[i] + ": is not multiple of 2");
			}
		}
	}

}

