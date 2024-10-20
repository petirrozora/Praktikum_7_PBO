package Pertemuan7;

import java.util.Scanner;

public class TokoSerbaAda {
	 static String[][] barang = {
		        {"f022", "Krayon", "4000"},
		        {"f023", "Binder", "7000"},
		        {"f024", "Kertas A4", "2000"},
		        {"f025", "Spidol", "10000"},
		        {"f026", "Sticky Notes", "1000"}
		  };

		    
		  public static String[] cariBarang(String kode) {
		      for (int i = 0; i < barang.length; i++) {
		          if (barang[i][0].equals(kode)) {
		             return new String[] {barang[i][1], barang[i][2]}; // [Nama, Harga]
		          }
		      }
		      return null; // 
		  }

		  public static void main(String[] args) {
		      Scanner input = new Scanner(System.in);
		      
		      System.out.println("TOKO SERBA ADA");
		      System.out.println("****************");

		      System.out.print("Masukkan Item Barang: ");
		      int jumlahItem = input.nextInt();
		      input.nextLine(); 

		        
		      String[][] pembelian = new String[jumlahItem][6]; 
		      int totalBayar = 0;

		        
		      for (int i = 0; i < jumlahItem; i++) {
		          System.out.println("Data ke " + (i + 1));
		          String kode;
		          String[] dataBarang;
		            
		            
		          while (true) {
		              System.out.print("Masukkan Kode: ");
		              kode = input.nextLine();
		              dataBarang = cariBarang(kode);
		                
		              if (dataBarang != null) {
		                  break; 
		              } else {
		                  System.out.println("Kode barang tidak ditemukan! Silakan coba lagi.");
		            }
		        }

		          System.out.print("Masukkan jumlah Beli: ");
		          int jumlahBeli = input.nextInt();
		          input.nextLine(); 

		          String namaBarang = dataBarang[0];
		          int harga = Integer.parseInt(dataBarang[1]);
		          int jumlahBayar = harga * jumlahBeli;

		            
		          pembelian[i][0] = Integer.toString(i + 1); 
		          pembelian[i][1] = kode;                    
		          pembelian[i][2] = namaBarang;              
		          pembelian[i][3] = Integer.toString(harga); 
		          pembelian[i][4] = Integer.toString(jumlahBeli); 
		          pembelian[i][5] = Integer.toString(jumlahBayar); 

		          totalBayar += jumlahBayar;
		          System.out.println();
		      }

		        
		      System.out.println("\nTOKO SERBA ADA");
		      System.out.println("******************************");
		      System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
		      System.out.println("===============================================================");

		      for (int i = 0; i < jumlahItem; i++) {
		          System.out.printf("%-3s %-12s %-12s %-6s %-11s %-12s\n", 
		              pembelian[i][0], pembelian[i][1], pembelian[i][2], pembelian[i][3], pembelian[i][4], pembelian[i][5]);
		      }

		    System.out.println("===============================================================");
		    System.out.println("Total Bayar:                                     " + totalBayar);
		    System.out.println("===============================================================");
	  }

}


