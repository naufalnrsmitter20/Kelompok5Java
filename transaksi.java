import java.util.Scanner;
public class transaksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        user objUser = new user("Naufal", "Kasir");
        System.out.println("Nama : " + objUser.nama);
        System.out.println("Jabatan : " + objUser.jabatan);

        customer objCustomer = new customer("");
        objCustomer.setNama("Atha");
        objCustomer.setTelp(911);
        objCustomer.setAlamat("Jl. Sawojajar, No 52, Malang");
        
        System.out.println("Customer" + "\n" + "Nama : " + objCustomer.getNama() + "\n" + "Telp : " + objCustomer.getTelp() + "\n" + "Alamat : " + objCustomer.getAlamat());

        JenisLoundry i = new JenisLoundry();
        i.TotalHarga(100000, 200000, 300000, 400000);
        System.out.println(i.jenisLaundry[0]);
        System.out.println(i.jenisLaundry[1]);
        System.out.println(i.jenisLaundry[2]);
        System.out.println(i.jenisLaundry[3]);

        System.out.print("Masukkan Jenis Laundry : ");
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
        input.close();
    }
}