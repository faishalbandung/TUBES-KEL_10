import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{
	public static void main(String[] args){
		Date tanggal = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Anggota[] a=new Anggota[100];
		Petugas[] b=new Petugas[10];
		
		
		b[0]=new Petugas("Fauzan","P0001");
		System.out.println();
		System.out.println("Petugas yang bertanggung jawab");
		System.out.println(b[0]);
		System.out.println();
		
		Barang[] p=new Barang[100];
		p[0]=new Barang("B0001","Kamasutra","Zulfan Firdaus");
		System.out.println(p[0]);
		p[1]=new Barang("B0002","COA","Maman Abdurahman");
		System.out.println(p[1]);
		p[2]=new Barang("B0003","Kalkulus","Tono Martono");
		System.out.println(p[2]);
		p[3]=new Barang("B0004","RPL","M. Kusumbang","Lama",3);
		System.out.println(p[3]);
		System.out.println();
		
		a[0]=new Anggota("Odo","A0001");
		System.out.println();
		a[0].createPeminjaman("J0001",tanggal);
		a[0].createPeminjaman("J0002",tanggal);
		a[0].getPeminjaman(0).addBarang(p[0]);
		a[0].getPeminjaman(0).addBarang(p[1]);
		a[0].getPeminjaman(1).addBarang(p[2]);
		a[0].getPeminjaman(1).addBarang(p[3]);
		a[0].getPeminjaman(1).statusP();
		a[0].getPeminjaman(1).getBarang(0).statusB();
		a[0].getPeminjaman(1).getBarang(1).statusB();
		System.out.println(a[0]);
		System.out.println("Barang yang dipinjam: "+a[0].getPeminjaman(0).getNBarang());
		for(int i=0;i<a[0].getJumlahPinjaman();i++){
			System.out.println("Peminjaman "+a[0].getPeminjaman(i).getId());
			for(int j=0;j<a[0].getPeminjaman(i).getNBarang();j++){
				System.out.println("ID Book: "+a[0].getPeminjaman(i).getBarang(j).getIdBook()+'\t'+"Nama: "+a[0].getPeminjaman(i).getBarang(j).getNama()+'\t'+"Tanggal Pengembalian: "+(sdf.format(a[0].getPeminjaman(i).getTanggalPengembalian(j))));
			}
			System.out.println(a[0].getPeminjaman(i).toString());
		}
		System.out.println();
		a[0].kembalikanPeminjaman(1);
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		System.out.println();
	}
}