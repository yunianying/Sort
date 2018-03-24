package com.oaec.test;
//排序测试代码
public class Test {
    public static void main(String[] args) {
       int a[] = new int[]{3,5,6,12,2,11};
        //pop(a);
        //selectSort(a);
       //insertSort(a);
          fastSort(a,0,a.length-1);
		for (int i : a) {
			System.out.print(i+"\t");
		}
	}
    /**
     * 冒泡排序主代码
     * @param a
     * @return
     */
    public  static int[] pop(int[] a){
    	for(int i = 0;i<a.length;i++){
    		for(int j = 0;j<a.length-1-i;j++){
    			if(a[j]<a[j+1]){
    				int temp =a[j];
    				a[j]=a[j+1];
    				a[j+1]=temp;
    			}
    		}
    	}
		return a;
    }
    /**
     * 选择排序代码
     * @param a
     * @return
     */
    public static int[] selectSort(int[] a){
    	/*int min=0;
    	int max=0;*/
    	for( int i = 0 ; i < a.length - 1 ; i++ ){
    		for( int j = i+1 ; j < a.length ; j++ ){
    			if(a[i]<a[j]){
    				 int temp = a[i];
    				 a[i]=a[j];
    				 a[j]=temp;
    			}
    		}
    	}
    	return a;
    }
  /**
   * 插入排序主要代码
   * 后面插入组的元素和前面有序组的元素依次进行比较，
   * 满足条件，有序组元素后移，
   * 插入组元素与有序组前一个比较，以此类推直到不满足，
   * 然后将插入组元素temp插入a[j+1]中
   * @param a
   * @return
   */
    public static int[] insertSort(int[] a){
    	int temp = 0;
    	for (int i = 1 ; i < a.length; i++) {//这是插入组
    		temp=a[i]; //插入组中取出第一个元素
    		
    		int j = i - 1; //有序组待排序下标
			while(j>=0&&temp<a[j]){//插入组与有序组元素进行比较
				a[j+1]=a[j];//有序组的元素后移一位
				j--;
			}
			/*for(int j=i-1;j>=0&&temp<a[j];j--){
				a[j+1]=a[j];
			}*/
			a[j+1]=temp;//插入组的元素前移一位
		}
    	return a;
    }
    /**
     * 快速排序主要代码
     * @param a
     * @param low
     * @param high
     * @return
     */
    public static int[] fastSort(int[] a,int low,int high){
    	 //1,找到递归算法的出口  
        if( low > high) {  
            return a;  
        }else{  
        //2, 存  
        int i = low;  
        int j = high;  
        //3,key  
        int key = a[ low ];  
        //4，完成一趟排序  
        while( i < j) {  
            //4.1 ，从右往左找到第一个小于key的数  
            while(i<j && a[j] <= key){  
                j--;  
            }  
            // 4.2 从左往右找到第一个大于key的数  
            while( i<j && a[i] > key) {  
                i++;  
            }  
            //4.3 交换  
            if(i<j) {  
                int p = a[i];  
                a[i] = a[j];  
                a[j] = p;  
            }  
        }  
        // 4.4，调整key的位置  
        int p = a[i];  
        a[i] = a[low];  
        a[low] = p;  
        //5, 对key左边的数快排  
        fastSort(a, low, i-1 );  
        //6, 对key右边的数快排  
        fastSort(a, i+1, high);  
        return a;
        }
    }
}
