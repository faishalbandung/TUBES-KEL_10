import java.util.Date;
public class Petugas extends Orang{
	private Anggota a;
	
	public Petugas(String nama,String id){
		super(nama,id);
	}
	
	public void createPeminjamanAnggota(Anggota a, String id, Date tanggal){
		a.createPeminjaman(id, tanggal);
	}
	
	public void statusPinjamAnggota(Anggota a, int i){
		a.getPeminjaman(i).statusP();
	}
	
	public void addBarangPeminjaman(Anggota a, Barang p, int i){		
		a.getPeminjaman(i).addBarang(p);
	}
	
	public void removeBarang(Anggota a, Barang p, int i){
		a.getPeminjaman(i).removeBarang(p);		
	}
	
	public String toString(){
		return "Nama Petugas: "+getNama()+'\n'+"ID: "+getId();
	}
}