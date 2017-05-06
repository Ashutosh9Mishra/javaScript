public class StringDemo {

	public static void main(String[] args) {
		String car="my name is ashutosh";
		byte arr[]=car.getBytes();
//		for(int i=0;i<arr.length;i++){
//			System.out.println(arr[i]);
//		}
//		System.out.println(car.charAt(1));
		boolean f  = car.contains("mg");
        String a[] = car.split(" ");
        for(int i=0;i<a.length;i++){      
        System.out.print(a[i].toUpperCase().charAt(0)+a[i].substring(1)+" ");    
        }
//		System.out.println(car.indexOf("is"));
//		System.out.println(f);
//		System.out.println(arr.length);
//		System.out.println((byte)'m');

//		car.concat("56");
//		car=car.concat("58");
//System.out.println("car"+ car);
	}

}
