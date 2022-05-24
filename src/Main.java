import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // VARIABLES
        String email, password = "exp123";
        String isResetPassword;
        
        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Lütfen EMail Adresinizi Giriniz: ");
        email = sc.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz: ");
        password = sc.nextLine();

        if(email.equals("example@gmail.com")){
            if(password.equals("exp123")){
                System.out.println("Başarılı Bir Şekilde Giriş Yapıldı...");
            }else{
                System.out.println("Şifrenizi Sıfırlamak İster misiniz? (y/n)");
                isResetPassword = sc.nextLine();
                if(isResetPassword.equals("y")){
                    System.out.print("Yeni Şifrenizi Giriniz: ");
                    password = sc.nextLine();
                    if(password.equals("exp123")){
                        System.out.println("Şifre Oluşturulamadı, lütfen farklı bir şifre giriniz...");
                    }else{
                        System.out.println("Şifreniz Başarılı Bir Şekilde Değiştirildi" + password);
                    }
                }
            }
        }else{
            System.out.println("Böyle Bir Hesap Bulunamadı...");
        }

    }
}
