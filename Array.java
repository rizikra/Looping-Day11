public class Array {//Array dimulai dari args[0]
	public static void println (Object obj){
		System.out.println (obj);
	}
	
	public static void main (String[] args){//Array cara manual menggunakan args[]
		
		int[] ganjil = {1, 3, 5, 7, 9, 11};
		println (ganjil[0]);
		println (ganjil[1]);
		println (ganjil[2]);
		println (ganjil[3]);
		println (ganjil[4]);
		println (ganjil[5]);
		
		println (" ");
		println (" ");

		for(int i = 0; i < ganjil.length; i++){//Array menggunakan Loop for
			println (ganjil[i]);
		}
	}	
}	