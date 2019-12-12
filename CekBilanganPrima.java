public class CekBilanganPrima {//Array dimulai dari args[0]
	public static void println (Object obj){
		System.out.println (obj);
	}
	
	public static void main (String[] args){//Latihan cara Cek Bilangan Prima
		try{
			int a = Integer.parseInt (args[0]);
			int i, cek = 0;
			for(i = 1; i <= a; i++){
				if(a % i == 0){
					cek++;
				}
			}
			if(cek == 2){ //Bilangan Prima memiliki 2 Faktor
				println("Bilangan Prima");
			}else{
				println("Bukan Bilangan Prima");
			}	
		
		} catch(Exception e){
			println ("Angka yang anda masukkan salah, silakan cek kembali");
		}
	}
}	