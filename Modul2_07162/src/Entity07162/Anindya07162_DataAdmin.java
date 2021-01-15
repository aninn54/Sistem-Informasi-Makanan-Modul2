package Entity07162;

public class Anindya07162_DataAdmin extends Anindya07162_Data{
    private String nama_makanan;
    private String harga;
    public Anindya07162_DataAdmin(String nama,String password,String alamat,String nama_makanan,String harga){
    super (nama,password,alamat);
    this.nama_makanan=nama_makanan;
    this.harga=harga;
    }
    @Override
    public String getNama(){
        return nama;
    }
    public String getNama_makanan() {
        return nama_makanan;
    }
    public String getHarga() {
        return harga;
    }
}
