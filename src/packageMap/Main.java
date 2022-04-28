package packageMap;

import java.util.*;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static Map<String, int[]> urunFiyatMap = new TreeMap<>();
    public static void main(String[] args) {

       /* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */



        System.out.println("Lutfen almak isteginiz urunun kodunu giriniz...");
        System.out.println();
        System.out.println(
                "Ürün\t\t\tFiyat\t\t\tÜrün Kodu\n" +
                        "==================================================\n" +
                        "Elma\t\t\t8 TL\t\t\t\t1\n" +
                        "Armut\t\t\t8 TL\t\t\t\t2\n" +
                        "Portakal\t\t10 TL\t\t\t\t3\n" +
                        "Mandalina\t\t10 TL\t\t\t\t4\n" +
                        "Muz\t\t\t\t15 TL\t\t\t\t5\n");

        urunFiyatMap.put("Elma", new int[]{8, 0, 0});
        urunFiyatMap.put("Armut", new int[]{8, 0, 0});
        urunFiyatMap.put("Portakal", new int[]{10, 0, 0});
        urunFiyatMap.put("Mandalina", new int[]{10, 0, 0});
        urunFiyatMap.put("Muz", new int[]{15, 0, 0});


        int secim = -1;
        int tutar = 0;
        int miktar = 0;

        do {
            System.out.println("Alisverisi bitirmek için lütfen 0' a basiniz...");

            while (true) {
                try {
                    System.out.print("Urun kodu : ");
                    secim = scan.nextInt();
                    if (secim < 0 || secim > 5) {
                        throw new ArithmeticException();
                    } else
                        break;
                } catch (ArithmeticException e) {
                    System.out.println("Seçim 0 ile 5 arasında girilmelidir.");
                } catch (InputMismatchException e) {
                    String str = scan.nextLine();
                    System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz. ");
                }
            }

            switch (secim) {
                case 1: {
                    miktar = tryCatchMethod();
                    for (String each : urunFiyatMap.keySet()) {
                        if (each.equals("Elma")) {
                            int[] valueArray = urunFiyatMap.get(each);
                            valueArray[1] += miktar;
                            valueArray[2] += valueArray[0] * miktar;
                            urunFiyatMap.put(each, valueArray);
                        }
                    }
                    break;
                }
                case 2: {
                    miktar = tryCatchMethod();
                    for (String each : urunFiyatMap.keySet()) {
                        if (each.equals("Armut")) {
                            int[] valueArray = urunFiyatMap.get(each);
                            valueArray[1] += miktar;
                            valueArray[2] += valueArray[0] * miktar;
                            urunFiyatMap.put(each, valueArray);
                        }
                    }
                    break;
                }
                case 3: {
                    miktar = tryCatchMethod();
                    for (String each : urunFiyatMap.keySet()) {
                        if (each.equals("Portakal")) {
                            int[] valueArray = urunFiyatMap.get(each);
                            valueArray[1] += miktar;
                            valueArray[2] += valueArray[0] * miktar;
                            urunFiyatMap.put(each, valueArray);
                        }
                    }
                    break;
                }
                case 4: {
                    miktar = tryCatchMethod();
                    for (String each : urunFiyatMap.keySet()) {
                        if (each.equals("Mandalina")) {
                            int[] valueArray = urunFiyatMap.get(each);
                            valueArray[1] += miktar;
                            valueArray[2] += valueArray[0] * miktar;
                            urunFiyatMap.put(each, valueArray);
                        }
                    }
                    break;
                }
                case 5: {
                    miktar = tryCatchMethod();
                    for (String each: urunFiyatMap.keySet()) {
                        if (each.equals("Muz")) {
                            int[] valueArray = urunFiyatMap.get(each);
                            valueArray[1] += miktar;
                            valueArray[2] += valueArray[0]*miktar;
                            urunFiyatMap.put(each,valueArray);
                        }
                    }
                    break;
                }
                case 0:
                    break;
                default:
                    System.out.println("Hatali secim yaptiniz. Tekrar deneyin.");
            }
        } while (secim != 0);

        int toplamtutar = 0;
        System.out.printf("%-9s %-10s %-10s %-10s\n", "Ürün", " TL", " Miktar", "Toplam");
        System.out.println("============================================================");
        for (Map.Entry<String, int[]> EntrySet : urunFiyatMap.entrySet()) {
            int[] sepetArray = EntrySet.getValue();
            if (sepetArray[1] != 0) {
                System.out.printf("%-10s %-10d %-10d %-10d\n", EntrySet.getKey(), sepetArray[0], sepetArray[1], sepetArray[2]);
                System.out.println();
                toplamtutar += sepetArray[2];
            }
        }

        System.out.println("Alisveris tutari = " + toplamtutar + " TL. İyi günler dileriz...");
    }

    private static int tryCatchMethod() {
        int miktar = 0;
        while (true) {
            try {
                System.out.print("Kaç kg : ");
                miktar = scan.nextInt();
                if (miktar < 0 || miktar > 10) {
                    throw new ArithmeticException();
                } else
                break;
            } catch (ArithmeticException e) {
                System.out.println("Miktar 0 ile 10 arasında girilmelidir.");
            } catch (InputMismatchException e) {
                String str = scan.nextLine();
                System.out.println("Miktar nümerik ifade olmalıdır.");
            }
        }
        return miktar;
    }
}
