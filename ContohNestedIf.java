public class ContohNestedIf {
	public static void main (String[] args){
		//username dan password yang diinput User
		String username = "admin@geeksfarm.com"; //email ini tidak terdaftar
		String password = "secret123";
		
		//proses login
		if(username == "admin@geeksfarm.com"){ //email yang terdaftar
			//username ditemukan
			if(password == "secret123"){ //password yang seharusnya benar
				//username ditemukan dan password benar
				System.out.println("Berhasil login");
			}
			else{
				//username ditemukan tetapi password salah
				System.out.println("Password salah");
			}
		}
		else{
			System.out.println("Username tidak ditemukan");
		}
	}	
}	