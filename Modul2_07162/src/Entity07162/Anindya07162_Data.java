package Entity07162;

public abstract class Anindya07162_Data {
     protected String nama, password, alamat;
    
    public Anindya07162_Data (String nama,String password,String alamat)
    {
        this.nama=nama;
        this.password=password;
        this.alamat=alamat;
    }
    public Anindya07162_Data(){  
    }
    public abstract String getNama();
    
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
}
