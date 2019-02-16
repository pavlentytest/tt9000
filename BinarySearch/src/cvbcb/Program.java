package cvbcb;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = scan.nextInt(); 
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// (элемент для бин. поиска
		int item = scan.nextInt();
		
		int first = 0;
		int last = num-1; 
		binSearch(arr,item,first,last);
		Arrays.binarySearch(a, key)

	}
	
	public static void binSearch(int[] a, int i, int f, int l) {
		int position;
		int compareCount = 1;
		
		position = (l + f)/2;
		while(a[position] != i && f<=l) {
			compareCount++;
			if(a[position] > i) { 
				l = position - 1;
			} else {
				f = position + 1;
			}
			position = (l+f)/2;
		}
		if(f <= l) {
			System.out.println("Число " + i+ "стоит на "+ ++position);
			System.out.println("Количество сравнений: "+compareCount);
		} else {
			System.out.println("Не найдено!");
		System.out.println("Количество сравнений:"+compareCount);
		}
		
	}

}
