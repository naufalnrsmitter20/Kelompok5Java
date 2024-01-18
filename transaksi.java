import java.util.Scanner;
public class transaksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        user objUser = new user();
        objUser.nama = "Naufal";
        objUser.nama = "Rakha";
        objUser.nama = "Agil";
        objUser.nama = "Atha";
        
        objUser.jabatan = "Kasir";

        customer objCustomer = new customer("");
        objCustomer.setNama("Atha");
        objCustomer.setTelp(911);
        objCustomer.setAlamat("Jl. SawiJajar, No 52, Malang");
        
        System.out.println("Customer" + "\n" + "Nama : " + objCustomer.getNama() + "\n" + "Telp : " + objCustomer.getTelp() + "\n" + "Alamat : " + objCustomer.getAlamat());

        JenisLoundry i = new JenisLoundry();
        i.TotalHarga(1000, 2000, 3000, 4000);
        System.out.println(i.jenisLaundry[0]);
        System.out.println(i.jenisLaundry[1]);
        System.out.println(i.jenisLaundry[2]);
        System.out.println(i.jenisLaundry[3]);

        System.out.println("Masukkan Jenis Laundry");
        String laundry = input.next();
        
        if(laundry.equalsIgnoreCase("Baju")) {
            laundry = "Baju";
            System.out.println(i.jenisLaundry[0]);
        } else if (laundry.equalsIgnoreCase("Celana")) {
            laundry = "Celana";
            System.out.println(i.jenisLaundry[1]);
        } else if (laundry.equalsIgnoreCase("Selimut")){
            laundry ="Selimut";
            System.out.println(i.jenisLaundry[2]);
        }else if (laundry.equalsIgnoreCase("Jaket")) {
            laundry = "Jaket";
            System.out.println(i.jenisLaundry[3]);
        }
    }
}