public class Barang{
	private String nama;
	private String pengarang;
	private String kondisi;
	private int type;
	private String idBook;
	private String statusKondisi;
	private boolean statusBarang=true;

	public Barang(String idBook, String nama,String pengarang){
		this.idBook=idBook;
		this.nama=nama;
		this.pengarang=pengarang;
		kondisi="Baru";
		type=1;
	}
	
	public Barang(String idBook, String nama,String pengarang,String kondisi){
		this.idBook=idBook;
		this.nama=nama;
		this.pengarang=pengarang;
		this.kondisi=kondisi;
		type=1;
	}
	
	public Barang(String idBook, String nama,String pengarang,int type){
		this.idBook=idBook;
		this.nama=nama;
		this.pengarang=pengarang;
		kondisi="Baru";
		this.type=type;
	}
	
	public Barang(String idBook, String nama,String pengarang,String kondisi,int type){
		this.idBook=idBook;
		this.nama=nama;
		this.pengarang=pengarang;
		this.kondisi=kondisi;
		this.type=type;
	}
	
	public void setNama(String nama){
		this.nama=nama;
	}
	
	public String getNama(){
		return nama;
	}
	
	public void setPengarang(String pengarang){
		this.pengarang=pengarang;
	}
	
	public String getPengarang(){
		return pengarang;
	}
	
	public void setkondisi(String kondisi){
		this.kondisi=kondisi;
	}
	
	public String getKondisi(){
		return kondisi;
	}
	
	public int getType(){
		if(type==1){
			return 3;
		} else if(type == 2){
			return 6;
		} else if(type == 3){
			return 10;
		} else {
			return 10;
		}
	}
	
	public void setIdBook(String idBook){
		this.idBook=idBook;
	}
	
	public String getIdBook(){
		return idBook;
	}
	
	public boolean isStatusB(){
		return statusBarang;
	}
	
	public void statusB(){
		statusBarang = false;
	}
	
	public void statusBTrue(){
		statusBarang = true;
	}
	
	public String toString(){
		String status;
		if(statusBarang){
			status="availabe";
		} else{
			status="not availabe";
		}
		return "ID buku: "+getIdBook()+'\t'+"Nama Buku: "+getNama()+'\t'+"Kondisi: "+getKondisi()+'\t'+"Status: "+status;
	}
}