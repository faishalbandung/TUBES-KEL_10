import java.util.Date;
public class Anggota extends Orang{
	private Peminjaman[] riwayatPinjaman = new Peminjaman[100];
	private int jumlahPinjaman=0;
	
	public Anggota(String nama,String id){
		super(nama,id);
	}
	
	public void createPeminjaman(String id, Date tanggal){
		riwayatPinjaman[jumlahPinjaman] = new Peminjaman(id,tanggal);
		jumlahPinjaman++;
	}
	
	public void kembalikanPeminjaman(int i){
		riwayatPinjaman[i].statusP();
		for(int j=0;j<riwayatPinjaman[i].getNBarang();j++){
			riwayatPinjaman[i].getBarang(j).statusBTrue();
		}
	}
	
	public int getJumlahPinjaman(){
		return jumlahPinjaman;
	}
	
	public int getJumlahPengembalian(){
		int jumPengembalian=0;
		for(int i=0;i<jumlahPinjaman;i++){
			if(riwayatPinjaman[i].isStatusP()){
				jumPengembalian++;
			}
		}
		return jumPengembalian;
	}
	
	public Peminjaman getPeminjaman(int i){
		return riwayatPinjaman[i];
	}
	
	public String toString(){
		return "Nama: "+getNama()+'\n'+"ID: "+getId()+'\n'+"Jumlah Pinjaman: "+getJumlahPinjaman()+'\n'+"Jumlah yang sudah dikembalikan: "+getJumlahPengembalian();
	}
}