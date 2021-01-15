package Model07162;
import Entity07162.Anindya07162_DataAdmin;
import java.util.ArrayList;
public class Anindya07162_DataAdminModel implements Anindya07162_Interface{
    private ArrayList<Anindya07162_DataAdmin>DataAdminArrayList;
    public Anindya07162_DataAdminModel(){
        DataAdminArrayList = new ArrayList<Anindya07162_DataAdmin>();
    }
    public void insertAdmin(Anindya07162_DataAdmin admin){
        DataAdminArrayList.add(admin);
    }

    @Override
    public int cekData(String nama, String password) {
        int loop = 0;
        for (Anindya07162_DataAdmin admin : DataAdminArrayList){
            if(admin.getNama().equals(nama)&&admin.getPassword().equals(password)){
                break;
            }
            else{
                loop++;
            }
        }
        return 0;
    }

    @Override
    public void view() {
        for (Anindya07162_DataAdmin admin : DataAdminArrayList){
            System.out.print(admin.getNama());
            System.out.print(admin.getPassword());
            System.out.print(admin.getAlamat());
            System.out.print(admin.getNama_makanan());
            System.out.print(admin.getHarga());
        }
    }
}
