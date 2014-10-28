package fcs.sort;

import java.util.Arrays;
public class SortTest {
	//冒泡排序
	public static void BubbleSort(int array[]){
		int n = array.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	//选择排序
	public static void SelectSort(int array[]){
		int n = array.length;
		for(int i=0;i<n;i++){
			int min = i;
			for(int j=i+1;j<n;j++){
				if(array[min]>array[j]){
					min = j;
				}
			}
			if(min!=i){
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
				
			}
		}
	}
	//插入排序
	public static void InsertSort(int array[]){
		int n = array.length;
		for(int i = 1;i < n; i++){
			for(int j = 0;j < i;j++){
				if(array[j]<array[i]){
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}
	//快速排序
	public static void QuickSort(int array[],int low,int high){
		int i , j , temp;
		if(low < high){//递归结束条件
			i = low;
			j = high;
			temp = array[i];
		
			while(i < j){
				while(i < j && temp <array[j]){
					j--;
				}
				if(i < j){//右侧扫描，找出第一个比key小的，交换位置  
					array[i] = array[j]; 
					i++; 
				}
				while(i < j && temp > array[i]){
					i++;
				}
				if(i < j){//右侧扫描，找出第一个比key小的，交换位置  
					array[j] = array[i]; 
					j--; 
				}
			}
			array[i] = temp;
			QuickSort(array,low,i-1);
			QuickSort(array,i+1,high);
		
		}
	}
	public static void main(String[] args) {
		int a[] = {23,12,45,39,78,9};

		/*_ 12 45 39 78 9   23
		 *9 12 45 39 78 _   23
		 *9 12 _  39 78 45  23
		 *9 12 _  39 78 45  23
		 *
		 */
		
		//BubbleSort(a);
		//SelectSort(a);
		//QuickSort(a,0,5);
		InsertSort(a);
		System.out.println(Arrays.toString(a));
		

	}

}
