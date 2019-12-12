public class NestedIf {
	public static void main (String[] args){
boolean hujan = true;
		boolean adapayung = true;
		if (hujan == true){
			//di mana hari itu hujan
			if (adapayung == true){
				//hari hujan dan ada payung
				System.out.println("Boleh keluar rumah karena ada payung");
			}
			else{
			//hari hujan dan tidak ada payung
			System.out.println("Tidak ada payung, jadi tidak boleh keluar rumah");
			}	
		}
		else{
			//di mana hari itu tidak hujan
			if(adapayung == true){
				//hari tidak hujan dan ada payung
				System.out.println("Boleh keluar rumah tapi payungnya tidak terpakai karena tidak hujan");
			}
			else{
				//hari tidak hujan dan tidak ada payung
				System.out.println("Boleh keluar rumah dan tidak bawa payung karena tidak hujan");
			}
		}
	}	
}	