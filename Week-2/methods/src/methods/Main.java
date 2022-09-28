package methods;

public class Main {

	public static void main(String[] args) {
		sayibulmaca();

	}
	public static void sayibulmaca() {
		
		 int[] sayilar = new int[]{1,2,5,7,9,0};

	        int aranacak = 5;
	        boolean varMi = false;

	        for(int sayi : sayilar) {
	            if(sayi == aranacak) {
	                varMi = true;
	                break;
	            }
	        }

	        if(varMi) {
	            mesajVer("Sayi mevcuttur: " + aranacak);
	        } else {
	            mesajVer("Sayi mevcut degildir: " + aranacak);
	        }
	    }

	    public static void mesajVer(String message) {
	        System.out.println(message);
	    }
		
	}

