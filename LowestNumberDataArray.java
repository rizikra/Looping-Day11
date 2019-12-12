public class LowestNumberDataArray {//Array dimulai dari args[0]
	public static void println (Object obj){
		System.out.println (obj);
	}
	
	public static void main (String[] args){//Latihan cari angka ganjil
		int[] data = {10, 34, 5, 23, 6, 7, 55, 20, 260, 273, 333};
		
		int LowestData = data[0]; //diasumsikan bahwa data ke 0 adalah data terkecil
		int LowestIndex = 1;
		
		for(int i = 0; i < data.length; i++){
			if(data[LowestIndex] > data[i]){
				LowestData = data[i];
				LowestIndex = i;
			}
		}
		println("Jadi, data yang paling kecil adalah "+LowestData+" yang berada pada index ke- "+LowestIndex);
	}
}	