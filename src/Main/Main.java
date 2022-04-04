/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import java.util.Scanner;
import Criteria.Programmer;
import Process.DaftarProgrammer;
import Criteria.Designer;
import Process.DaftarDesigner;
import Criteria.Manager;
import Process.DaftarManager;

/**
 *
 * @author MSI1
 */
public class Main {

    /**
     * @param args the command line arguments
     */

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pilihKerja;
        int pilihMenu;
        boolean kondisi = false;
        
        System.out.println("Lamaran Pekerjaan ");
        System.out.println("==================");
        System.out.println("1. Programmer");
        System.out.println("2. Designer");
        System.out.println("3. Manager");
        System.out.print("Pilih : ");
        pilihKerja = input.nextInt();
        
        switch(pilihKerja) {
            case 1:
                String nama;
                double nilai1;
                double nilai2;
                double nilai3;
                
                System.out.println(" ");
                Scanner data = new Scanner(System.in);
                System.out.println("Formulir Pelamar");
                System.out.println("================");
                System.out.print("Nama Lengkap : ");
                nama = data.nextLine();
                System.out.print("Nilai Programming Knowledge : ");
                nilai1 = data.nextDouble();
                System.out.print("Nilai Clean Coding : ");
                nilai2 = data.nextDouble();
                System.out.print("Nilai Debugging : ");
                nilai3 = data.nextDouble();
                Programmer programmer = new Programmer( nama, nilai1, nilai2, nilai3);
                
                do {
                    System.out.println(" ");
                    System.out.println("Menu");
                    System.out.println("1. Tampil Hasil");
                    System.out.println("2. Ubah Nilai");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    pilihMenu = input.nextInt();
                  
                    switch(pilihMenu) {
                        case 1:
                            double nilaiAkhir;
                            String namaCalonPegawai;
                            System.out.println(" ");
                            
                            nilaiAkhir = programmer.seleksiProgrammingKnowledge() + programmer.seleksiCleanCoding() + programmer.seleksiDebugging();
                            namaCalonPegawai = programmer.getNama();
                          
                            System.out.println("Nilai Akhir : " + nilaiAkhir);
                            if (nilaiAkhir < 85) {
                                System.out.println("KETERANGAN : GAGAL!");
                                System.out.println("Mohon Maaf " + namaCalonPegawai + ", Anda Ditolak Sebagai Programmer");
                            } else {
                                System.out.println("KETERANGAN : LOLOS!");
                                System.out.println("Selamat Kepada " + namaCalonPegawai + ", Anda Diterima Sebagai Programmer");
                            }
                            break;
                        case 2:
                            Scanner inputBaru = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("Edit Nilai");
                            System.out.println("==========");
                            System.out.print("Programming Knowledge : "); programmer.nilaiProgrammingKnowledge = inputBaru.nextDouble();
                            System.out.print("Clean Coding : "); programmer.nilaiCleanCoding = inputBaru.nextDouble();
                            System.out.print("Debugging : "); programmer.nilaiDebugging = inputBaru.nextInt();
                            break;
                        case 3:
                            kondisi = true;
                            break;
                    }
                } while(!kondisi);
                break;
                
            case 2:
                String namaA;
                double nilai1A;
                double nilai2A;
                double nilai3A;
                
                System.out.println(" ");
                Scanner dataA = new Scanner(System.in);
                System.out.println("Formulir Pelamar");
                System.out.println("================");
                System.out.print("Nama Lengkap : ");
                nama = dataA.nextLine();
                System.out.print("Nilai Design Portofolio : ");
                nilai1 = dataA.nextDouble();
                System.out.print("Nilai Prototyping : ");
                nilai2 = dataA.nextDouble();
                System.out.print("Nilai Creativity : ");
                nilai3 = dataA.nextDouble();
                Designer designer = new Designer( nama, nilai1, nilai2, nilai3);
                
                do {
                    System.out.println(" ");
                    System.out.println("Menu");
                    System.out.println("1. Tampil Hasil");
                    System.out.println("2. Ubah Nilai");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    pilihMenu = input.nextInt();
                  
                    switch(pilihMenu) {
                        case 1:
                            double nilaiAkhir;
                            String namaCalonPegawai;
                            System.out.println(" ");
                            
                            nilaiAkhir = designer.seleksiDesignPortofolio() + designer.seleksiPrototyping() + designer.seleksiCreativity();
                            namaCalonPegawai = designer.getNama();
                          
                            System.out.println("Nilai Akhir : " + nilaiAkhir);
                            if (nilaiAkhir < 85) {
                                System.out.println("KETERANGAN : GAGAL!");
                                System.out.println("Mohon Maaf " + namaCalonPegawai + ", Anda Ditolak Sebagai Designer");
                            } else {
                                System.out.println("KETERANGAN : LOLOS!");
                                System.out.println("Selamat Kepada " + namaCalonPegawai + ", Anda Diterima Sebagai Designer");
                            }
                            break;
                        case 2:
                            Scanner inputBaru = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("Edit Nilai");
                            System.out.println("==========");
                            System.out.print("Programming Knowledge : "); designer.nilaiDesignPortofolio = inputBaru.nextDouble();
                            System.out.print("Clean Coding : "); designer.nilaiPrototyping = inputBaru.nextDouble();
                            System.out.print("Debugging : "); designer.nilaiCreativity = inputBaru.nextInt();
                            break;
                        case 3:
                            kondisi = true;
                            break;
                    }
                } while(!kondisi);
                break;
                
            case 3:
                String namaB;
                double nilai1B;
                double nilai2B;
                double nilai3B;
                
                System.out.println(" ");
                Scanner dataB = new Scanner(System.in);
                System.out.println("Formulir Pelamar");
                System.out.println("================");
                System.out.print("Nama Lengkap : ");
                nama = dataB.nextLine();
                System.out.print("Nilai Innovation : ");
                nilai1 = dataB.nextDouble();
                System.out.print("Nilai Decision Making : ");
                nilai2 = dataB.nextDouble();
                System.out.print("Nilai Creativity : ");
                nilai3 = dataB.nextDouble();
                Manager manager = new Manager( nama, nilai1, nilai2, nilai3);
                
                do {
                    System.out.println(" ");
                    System.out.println("Menu");
                    System.out.println("1. Tampil Hasil");
                    System.out.println("2. Ubah Nilai");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    pilihMenu = input.nextInt();
                  
                    switch(pilihMenu) {
                        case 1:
                            double nilaiAkhir;
                            String namaCalonPegawai;
                            System.out.println(" ");
                            
                            nilaiAkhir = manager.seleksiInnovation() + manager.seleksiDecisionMaking() + manager.seleksiCommunication();
                            namaCalonPegawai = manager.getNama();
                          
                            System.out.println("Nilai Akhir : " + nilaiAkhir);
                            if (nilaiAkhir < 85) {
                                System.out.println("KETERANGAN : GAGAL!");
                                System.out.println("Mohon Maaf " + namaCalonPegawai + ", Anda Ditolak Sebagai Manager");
                            } else {
                                System.out.println("KETERANGAN : LOLOS!");
                                System.out.println("Selamat Kepada " + namaCalonPegawai + ", Anda Diterima Sebagai Manager");
                            }
                            break;
                        case 2:
                            Scanner inputBaru = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("FORM EDIT");
                            System.out.print("Programming Knowledge : "); manager.nilaiInnovation = inputBaru.nextDouble();
                            System.out.print("Clean Coding : "); manager.nilaiDecisionMaking = inputBaru.nextDouble();
                            System.out.print("Debugging : "); manager.nilaiCommunication = inputBaru.nextInt();
                            break;
                        case 3:
                            kondisi = true;
                            break;
                    }
                } while(!kondisi);
                break;
                    
        }
    }
}