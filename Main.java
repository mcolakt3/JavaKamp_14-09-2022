package intro;

public class Main {
		//Main Javada başlangıç noktasıdır
	public static void main(String[] args) 
	{
		
		
		System.out.println("Hello World!");
		
		//değişken isimlendirmeleri Javada camelCase yazılır
		
		String ortaMetin ="İlginizi çekbilir";
		String altMetin ="Vade Süresi";
		System.out.println(ortaMetin);
		
		//Integer
		int vade=12;
		
		double dolarDun=18.14;
		double dolarBugun=18.20;
		
		boolean dolarDustuMu = false;
		
		String okYonu="";
		
		if (dolarBugun<dolarDun) 
		{
			okYonu="down.svg";	
			System.out.println(okYonu);
		} 
		else if (dolarBugun>dolarDun)
		{
			okYonu="up.svg";	
			System.out.println(okYonu);
		}
		
		
		else 
		{
			okYonu="equal.svg";	
			System.out.println(okYonu);

		}
		
		//dizi tanımlama uzun yöntem
	    String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli"};

        // diziyi ekrana yazdırmanın en basit yöntemi bu şekildedir.
        System.out.println(krediler[0]);
        System.out.println(krediler[0]);
        System.out.println(krediler[0]);


        // diziyi döngü kullanarak ekrana yazdırma
        for(int i =0; i<krediler.length; i++){
            System.out.println(krediler[i]);
        }
		
		
		
	}

}
