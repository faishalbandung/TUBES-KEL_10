import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Peminjaman{
	private boolean statusPeminjaman=false;
	private int maxBarang=50;
	private int nBarang=0;
	private Date tanggal;
	private String id;
	private Barang[] p;
	
	public Peminjaman(String id){
		this.id = id;
		p=new Barang[maxBarang];
	}
	
	public Peminjaman(String id,Date tanggal){
		this.id = id;
		this.tanggal = tanggal;
		p=new Barang[maxBarang];
	}
	
	public void addBarang(Barang p){		
		if(nBarang<maxBarang){
			this.p[nBarang]=p;
			p.statusB();
			nBarang++;
		}
	}
	
	public void removeBarang(Barang p){
		if(nBarang>maxBarang){
			this.p[nBarang]=p;
			nBarang--;
		}		
	}
	
	public String getId(){
		return id;
	}
	
	public Date getTanggal(){
		return tanggal;
	}
	
	public Date getTanggalPengembalian(int i){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, (getBarang(i).getType()));
        Date pengembalian = cal.getTime();
        return pengembalian;
	}
	
	public int getMaxBarang(){
		return maxBarang;
	}
	
	public int getNBarang(){
		return nBarang;
	}
	
	public boolean isStatusP(){
		return statusPeminjaman;
	}
	
	public void statusP(){
		statusPeminjaman=true;
	}
	
	public String toString(){
		String status;
		if(statusPeminjaman){
			status="sudah dikembalikan";
		} else{
			status="belum dikembalikan";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return "Peminjaman "+(sdf.format(getTanggal()))+" "+status;
	}
	
	public Barang getBarang(int i){
		return p[i];
	}
}
	

	
	
	




