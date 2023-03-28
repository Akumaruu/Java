/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BrainNeeded.Employee;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author akmal
 */
public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();

        //gaji tiap jabatan
        int gaji_bos = 30_000_000;
        int gaji_manager = 15_000_000;
        int gaji_cs = 5_000_000;

        //jam kerja minimal tiap jabatan
        int jam_bos = 500;
        int jam_manager = 400;
        int jam_cs = 300;

        //pembuatan objek
        Boss bos = new Boss();
        Manager manager = new Manager();
        CleaningService cs = new CleaningService();
        Internship magang = new Internship();

        String siapa = JOptionPane.showInputDialog("Jabatan-mu ? \n1.Boss \n2.Manager \n3.Internship \n4.CleaningService");

        if (siapa.equalsIgnoreCase("boss") || siapa.equalsIgnoreCase("1")) {
            
            System.out.println("== INI BOS ==");
            
            bos.nip();
            int bos_nip = scan.nextInt();
            
            bos.nama();
            scan.nextLine();
            String bos_nama = scan.next();

            bos.jamKerja();
            int bos_jamKerja = scan.nextInt();

            if (bos_jamKerja <= jam_bos) {
                int gajiBos = gaji_bos - bos_jamKerja * 60_000;
                int potonganBos = bos_jamKerja * 60_000;

                JOptionPane.showMessageDialog(null, "NIP : " + bos_nip + "\nNama : " + bos_nama + "\nPotongan gaji : Rp. " + df.format(potonganBos) + "\n" + "Gaji akhir : Rp. " + df.format(gajiBos));
            }
            else if (bos_jamKerja >= jam_bos) {
                JOptionPane.showMessageDialog(null, "NIP : " + bos_nip + "\nNama : " + bos_nama + "\nPotongan gaji : Rp. - " + "\nGaji akhir : Rp. " + gaji_bos);
                JOptionPane.showMessageDialog(null, "OVERWORK, JAGA KESEHATAN ANDA!");
            }
        } 
        
        else if (siapa.equalsIgnoreCase("manager") || siapa.equalsIgnoreCase("2")) {

            System.out.println("== INI MANAGER ==");

            manager.nip();
            int mana_nip = scan.nextInt();

            bos.nama();
            scan.next();
            String mana_nama = scan.nextLine();

            bos.jamKerja();
            int mana_jamKerja = scan.nextInt();

            if (mana_jamKerja <= jam_manager) {
                int gajiMana = gaji_manager - mana_jamKerja * 37_500;
                int potonganMana = mana_jamKerja * 37_500;

                JOptionPane.showMessageDialog(null, "NIP : " + mana_nip + "\nNama : " + mana_nama + "\nPotongan gaji : Rp. " + df.format(potonganMana) + "\nGaji akhir : Rp. " + df.format(gajiMana));
            }
            else if (mana_jamKerja > jam_manager) {
                JOptionPane.showMessageDialog(null, "NIP : " + mana_nip + "\nNama : " + mana_nama + "\nPotongan gaji : Rp. - " + "\nGaji akhir : Rp. " + gaji_manager);
                JOptionPane.showMessageDialog(null, "OVERWORK, JAGA KESEHATAN ANDA!");
            }

        }
        
        else if (siapa.equalsIgnoreCase("CleaningService") || siapa.equalsIgnoreCase("4")) {

            System.out.println("== INI CE ES ==");

            cs.nip();
            int cs_nip = scan.nextInt();

            cs.nama();
            scan.next();
            String cs_nama = scan.nextLine();

            cs.jamKerja();
            int cs_jamKerja = scan.nextInt();

            if (cs_jamKerja <= jam_cs) {
                int gajiCs = gaji_cs - cs_jamKerja * 37_500;
                int potonganCs = cs_jamKerja * 37_500;

                JOptionPane.showMessageDialog(null, "NIP : " + cs_nip + "\nNama : " + cs_nama + "\nPotongan gaji : Rp. " + df.format(potonganCs) + "\nGaji akhir : Rp. " + df.format(gajiCs));
            }
            else if (cs_jamKerja > jam_cs) {
                JOptionPane.showMessageDialog(null, "NIP : " + cs_nip + "\nNama : " + cs_nama + "\nPotongan gaji : Rp. - " + "\nGaji akhir : Rp. " + gaji_cs);
                JOptionPane.showMessageDialog(null, "OVERWORK, INGAT KESEHATAN ANDA!");
            }
        }
        
        else if (siapa.equalsIgnoreCase("Internsip") || siapa.equalsIgnoreCase("3")) {
            
            System.out.println("== INI CAH MAGANG ==");
            
            magang.nip();
            int magang_nip = scan.nextInt();

            magang.nama();
            String magang_nama = scan.next();
            scan.nextLine();

            magang.jamKerja();
            int magang_jamKerja = scan.nextInt();
            
            int gajiMagang = 1_000_000 + magang_jamKerja * 10_000;

                JOptionPane.showMessageDialog(null, "NIP : " + magang_nip + "\nNama : " + magang_nama + "\nPotongan gaji : Rp. -" + "\nGaji akhir : Rp. " + df.format(gajiMagang) );
                
            if (magang_jamKerja > 200)
            {
                JOptionPane.showMessageDialog(null, "NIP : " + magang_nip + "\nNama : " + magang_nama + "\nPotongan gaji : Rp. - " + "\nGaji akhir : Rp. " + 3_000_000);
                JOptionPane.showMessageDialog(null, "OVERWORK, INGAT KESEHATAN ANDA!");
            }
        }
       
    }
}
