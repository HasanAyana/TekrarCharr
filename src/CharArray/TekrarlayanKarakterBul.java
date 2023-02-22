package CharArray;

public class TekrarlayanKarakterBul {
    public static void main(String[] args) {


        // CharArray oluşturuldu
        char[] chars = {'a', 'z', 'f', 'b', 'b', 'c', 'a', 'd', 'g', 'e', 'y', 'c'};

        //Tekrar eden karakter sayısı için count oluşturuldu
        int count = 0;

        //İç içe for dongusu ile Array kontrol edilerek if komutu ile tekrarlayan karakterler ekrana yazdırıldı.
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {

                    //Tekrar eden her karakter için count artırıldı
                    count++;

                    System.out.println("Tekrar eden karakterler: " + chars[i]);
                    break;
                }
            }
        }

        //Tekrar eden karakter sayısı ekrana yazdırıldı.
        System.out.println("Tekrar eden karakter sayısı: " + count);

    }
}
