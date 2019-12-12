public class NestedFor {//Array dimulai dari args[0]
	public static void println (Object obj){
		System.out.println (obj);
	}
	public static void main (String[] args){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				println("i ke- "+i+" dan j ke- "+j);
			}
		}
	}
}	