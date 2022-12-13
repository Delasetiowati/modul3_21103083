/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author ASUS
 */
public class Pegawai {
        private int nip;
        private String nama;
        private String alamat;
        private int jmlh_lembur;
        private double gaji_pokok;
        private long total_gaji;
        //constructor
        public Pegawai()
        {
        System.out.println("Konstruktor data dijalankan...");
        }
        //mutator
        public void setNIP(int NIP)
        {
        nip=NIP;
        }
        public void setNama(String Nama)
        {
        nama=Nama;
        }
        public void setAlamat(String Alamat)
        {
        alamat=Alamat;
        }
        public void setJmlhLembur(int JmlhLembur)
        {
        jmlh_lembur=JmlhLembur;
        }
        public void setGajiPokok(double GajiPokok)
        {
        gaji_pokok=GajiPokok;
        }
        //accessor
        public int getNIP()
        {
        return nip;
        }
        public String getNama()
        {
        return nama;
        }
        public String getAlamat()
        {
        return alamat;
        }
        public int getJmlhLembur()
        {
        return jmlh_lembur;
        }
        public long getGajiPokok()
        {
        return (long) gaji_pokok;
        }
        //method overloading
        public void setInfo()
        {
        total_gaji=(long) (gaji_pokok+(gaji_pokok*jmlh_lembur*0.01));
        }
        public void cetak()
        {
        System.out.println("NIP : "+getNIP());
        System.out.println("Nama : "+getNama());
        System.out.println("Alamat : "+getAlamat());
        System.out.println("Jumlah Lembur : "+getJmlhLembur()+" hari");
        System.out.println("Gaji Pokok : "+getGajiPokok());
        System.out.println("Total Gaji : "+total_gaji);
        System.out.println("");
        }
        }
