import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

     /**   Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını
        sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
        ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise
        ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
        sorun yoksa "Şifre oluşturuldu" yazan programı yazınız. */


        String sifre="asdfg";
        String yeni_sifre="", yeni_sifre_tekrar="";

        Scanner input=new Scanner(System.in);
        System.out.print("Sifreyi gir:");
        String girilenSifre = input.nextLine();
        if(girilenSifre.equals(sifre)){
            System.out.println("Giriş başarılı.");
        }
        else{
            System.out.println("Şifreyi sıfırlamak istiyor musun?\n1.Evet\n2.Hayır");
            System.out.print("Seçiminiz:");
            int secim=input.nextInt();
            switch (secim){
                case 1:
                    System.out.print("\nYeni şifreyi gir:");
                    yeni_sifre=input.next();

                    System.out.print("\nYeni şifreyi tekrar gir:");
                    yeni_sifre_tekrar=input.next();



                    if(!yeni_sifre.equals(yeni_sifre_tekrar) || yeni_sifre.equals(sifre) ){
                        System.out.println("Şifre oluşturulamadı. Lütfen başka Şifre giriniz.");

                    }
                    else {
                        sifre=yeni_sifre;
                        System.out.println("Şifre oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Sıfırlama iptal edildi.");
                    break;
                default:
                    System.out.println("Yanlış seçim.");

            }

        }
        }



    }
