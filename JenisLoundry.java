public class JenisLoundry{
    public String[] jenisLaundry = {"Baju : ","Celana : ","Selimut : ","Jaket : "};
    public double[] harga = new double[4];

    public JenisLoundry() {
        System.out.println();
        System.out.println("Jenis Laundry");
    }

    public void TotalHarga(double harga1, double harga2, double harga3, double harga4){
        jenisLaundry[0] += harga1;
        jenisLaundry[1] += harga2;
        jenisLaundry[2] += harga3;
        jenisLaundry[3] += harga4;
    }
    
}