import java.util.Arrays;

/**
 * 
 * Arrays方法
 * @author Leslie
 * 2018年11月28日
 * 下午11:23:35
 */
//比较两个数组是否相等
/*public class Arrays_Method {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {1,2,3,4};
		int arr3[]= {6,7,8};
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));
	}
}
*/







//对数组进行升序排列
/*public class Arrays_Method {
	public static void main(String[] args) {
		int arr1[]= {77,32,-19,0};
		Arrays.sort(arr1);;
		for(int arr:arr1) {
		System.out.print(arr+"\t");
		}
	}
}*/







//把一个数组转化成字符串
/*public class Arrays_Method {
	public static void main(String[] args) {
		int arr1[]= {77,32,-19,0};
		System.out.println(Arrays.toString(arr1));
	}
}*/








//将数组进行赋值
/*public class Arrays_Method {
	public static void main(String[] args) {
		int arr1[]= {77,32,-19,0};
		Arrays.fill(arr1, 100);
		System.out.println(Arrays.toString(arr1));
	}
}*/




//把数组复制成一个新的长度的数组
/*public class Arrays_Method {
	public static void main(String[] args) {
		int arr1[]= {77,32,-19,0};
		int arr2[]=Arrays.copyOf(arr1, 3);
		int arr3[]=Arrays.copyOf(arr2, 7);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}
*/







//查询元素值在数组中的下标，前提已经按升序排列
/*public class Arrays_Method {
	public static void main(String[] args) {
		int arr1[]= {77,32,-19,0,145,-97};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.binarySearch(arr1,32));
		System.out.println(Arrays.binarySearch(arr1,999));//如果查找的数数组中没有，会给出一个随机负数
	}
}
*/






















