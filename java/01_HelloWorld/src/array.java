public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr;
//		arr = new int[2];
//		System.out.println(arr.length);
//		arr[0] = 4;
//		arr[1] = arr[0] + 5;
//		System.out.println(arr[1]);
//		int[] arr = {1, 2, 3, 4, 5};
		
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]);
        int length = numbers[3];
        System.out.println(length);
        char[] chars = new char[length];
        System.out.println(chars.length);
        chars[numbers.length + 4] = 'y';
        System.out.println("Done!");
		
	}

}
