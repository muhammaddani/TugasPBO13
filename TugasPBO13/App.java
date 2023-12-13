import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String namaKasir = " Dani ";
        String userName = "daninoar";
        String inputUserName;
        String password = "daniganteng123";
        String inputPassword;
        String captcha = "Q1w2e3";
        String inputCaptcha;

        Scanner scanner = new Scanner(System.in);
        Date tanggal = new Date(); //pembuatan objek dari class date

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd/MM/yyyy"); //implementasi class date
        String tanggalTransaksi = dateFormat.format(tanggal);

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss z"); //implementasi class date
        String waktuTransaksi = timeFormat.format(tanggal);
        
        System.out.println("SELAMAT DATANG DI NOAR MART");
            System.out.println("========================");
            System.out.println("LogIn");
            System.out.print("Username \t: ");
            inputUserName = scanner.nextLine();
            System.out.print("Password \t: ");
            inputPassword = scanner.nextLine();
            System.out.println("Verifikasi anda tidak robot!");
            System.out.println("Kode Captcha \t : " + captcha);
            System.out.print("Entry Captcha : ");
            inputCaptcha = scanner.nextLine();
            System.out.println("------------------------");

       
            boolean eUserName = inputUserName.equals(userName);
            boolean ePassword = inputPassword.equals(password);
            boolean eCaptcha = inputCaptcha.equalsIgnoreCase(captcha);
            if (eCaptcha == false) {
                System.out.println("captcha salah!!");
            }
            else {
                if (eUserName == false && ePassword == false) {
                    System.out.println("username dan password tidak sesuai!!");
                }
                else if (eUserName == true && ePassword == false) {
                    System.out.println("username dan password tidak sesuai!!");
                }
                else if (eUserName == false && ePassword == true) {
                    System.out.println("username dan password tidak sesuai!!");
                }
                else {
                    try {
                        System.out.println("");
                        MemberReguler tes1 = new MemberReguler(){};
                        System.out.print("Masukkan Nama Pelanggan\t: ");
                        tes1.namaPelanggan = scanner.nextLine();

                        System.out.print("Masukkan Nomor HP\t: ");
                        tes1.noHp = scanner.nextLine();

                        System.out.print("Masukkan Alamat\t\t: ");
                        tes1.alamat = scanner.nextLine();

                        System.out.print("Masukkan Kode Barang\t: ");
                        tes1.kodeBarang = scanner.nextLine();

                        System.out.print("Masukkan Nama Barang\t: ");
                        tes1.namaBarang = scanner.nextLine();

                        System.out.print("Masukkan Harga Barang\t: ");
                        tes1.hargaBarang = scanner.nextLong();

                        System.out.print("Masukkan Jumlah Barang\t: ");
                        tes1.jumlahBeli = scanner.nextLong();

                        tes1.totalBayar = tes1.hargaBarang * tes1.jumlahBeli;

                        System.out.println("");
                        System.out.println("\t\033[1m\033[31mNoar Mart\033[0m");
                        System.out.println("Tanggal \t: " + tanggalTransaksi);
                        System.out.println("Waktu \t\t: " + waktuTransaksi);
                        System.out.println("========================");
                        System.out.println("DATA PELANGGAN");
                        System.out.println("------------------------");
                        System.out.println("Nama Pelanggan\t: " + tes1.namaPelanggan);
                        System.out.println("Nomor Hp\t: "+tes1.noHp);
                        System.out.println("Alamat\t\t: "+tes1.alamat);
                        System.out.println("++++++++++++++++++++++++");
                        System.out.println("DATA PEMBELIAN BARANG");
                        System.out.println("------------------------");
                        System.out.println("Kode Barang\t: " + tes1.kodeBarang);
                        System.out.println("Nama Barang\t: " + tes1.namaBarang);
                        System.out.println("Harga Barang\t: " + tes1.hargaBarang);
                        System.out.println("Jumlah Beli\t: " + tes1.jumlahBeli);
                        System.out.println("TOTAL BAYAR\t: " + tes1.totalBayar);
                        System.out.println("++++++++++++++++++++++++");
                        System.out.println("Kasir\t\t: " + namaKasir.trim()); //method string
                        System.out.println("");
                    } 
        
                    catch (java.util.InputMismatchException e) {
                        System.out.println("Maaf, input tidak valid. Pastikan Anda memasukkan nilai numerik untuk harga dan jumlah barang.");
                    } 
        
                    finally {
                        scanner.close();
                    }
                }
            }
    }
         
        
}