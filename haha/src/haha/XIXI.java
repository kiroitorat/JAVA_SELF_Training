package haha;
public class XIXI {

	public static void main(String[] args) {
		int [] arr = new int[10];
		for(int i = 0 ;i<10;i++) {
			arr[i]=(int) (Math.random()*100);
			System.out.println(arr[i]);
		}
		System.out.println();
		bublpList(arr,arr.length);
		for(int i = 0 ;i<10;i++) {
			
			System.out.print(arr[i]+" ");
		}


	}
	
	public static void bublpList(int[] arr,int len) {
		for(int i = 0 ; i<len-1 ; i++) {
			for(int j = 0 ; j<len-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
