public class customer {
    public String nama,alamat;
    public int telp;
    

    public customer (String nama){
        this.nama = nama;
    }

    public String getNama () {
        return nama;
    }
    public int getTelp () {
        return telp;
    }
    public String getAlamat () {
        return alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setTelp(int telp) {
        this.telp = telp;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // public String toString() {
    //     return "Nama :" + nama + " \n" + "Telp : " + telp + " \n" + "Alamat : " + alamat;
    // }
}

