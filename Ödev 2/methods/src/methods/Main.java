package methods;

public class Main {

	public static void main(String[] args) {
		 sayiBulmaca();
		 sayiBulmaca();
		 sayiBulmaca();
		 sayiBulmaca();

	}
    public static void sayiBulmaca() {
    	int[] sayilar = new int[] {1,2,5,7,9,10};
		int aranacak = 5;
		boolean varMi = false;
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;	
			}
		}
		
		String mesaj= "";
        if(varMi) {
        	mesaj = ("Sayi mevcuttur:"+aranacak);
        	mesajVer(mesaj);
        }else {
        	mesajVer("Sayi mevcut değilldir:"+aranacak); 
        	
        	}
    }
    public static void mesajVer(String mesaj) {
    	
    	System.out.println(mesaj);
    }
}
