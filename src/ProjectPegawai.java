/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ProjectPegawai {
public static void main(String[] args) {
Pegawai Pegawai;
Pegawai=new Pegawai();
System.out.println("");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.print("NIP : ");
Pegawai.setNIP(Integer.parseInt(br.readLine().toString()));
System.out.print("Nama : ");
Pegawai.setNama(br.readLine ());
System.out.print("Alamat : ");
Pegawai.setAlamat(br.readLine ());
System.out.print("Jumlah Lembur : ");
Pegawai.setJmlhLembur(Integer.parseInt(br.readLine()));Pegawai.setGajiPokok(250000000);
Pegawai.setInfo();Pegawai.cetak();
}
catch(Exception ex)
{
System.out.println("ex");
}
}
}
