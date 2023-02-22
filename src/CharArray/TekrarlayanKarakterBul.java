package CharArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TekrarlayanKarakterBul {
    public static void main(String[] args) {


        /*
        Scanner scanner=new Scanner(System.in);
        String chars= scanner.nextLine();


        //Tekrar eden karakter sayısı için count oluşturuldu
        int count = 0;

        //İç içe for dongusu ile Array kontrol edilerek if komutu ile tekrarlayan karakterler ekrana yazdırıldı.
        for (int i = 0; i < chars.length(); i++) {
            for (int j = i + 1; j < chars.length(); j++) {
                if (chars[i] == chars[j]) {

                    //Tekrar eden her karakter için count artırıldı
                    count++;

                    System.out.println("Tekrar eden karakterler: " + chars[i]);
                    break;
                }
            }
        }
        */

        // Tekrar eden karakterlerin kaç kez tekrar ettiğini yazdırmak için Map kullandım.
        // Memory verimli kullanmak için sadece tekrar eden karakterleri ve countu , key,value olarak Map'a attım.
        // Yazdıgım kod yazılan karakteri ve kaç kez tekrar ettiğini console a yazdırır.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        HashMap<Character, Integer> karakterSayisi = new HashMap<Character, Integer>();
        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            if (karakterSayisi.containsKey(karakter)) {
                karakterSayisi.put(karakter, karakterSayisi.get(karakter) + 1);
            } else {
                karakterSayisi.put(karakter, 1);
            }
        }

        System.out.println("Tekrar eden karakterler:");
        for (Map.Entry<Character, Integer> entry : karakterSayisi.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " tekrar ediyor " + entry.getValue() + " kez.");
            }
        }
            }
}
