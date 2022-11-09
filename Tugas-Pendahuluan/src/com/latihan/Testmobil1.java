package com.latihan;

class mobil {
  private String merk;
  private String warna;
  private String jenis;
  private int CC;
  private int jumlah;

  public String getmerk() {
    return merk;
  }

  public void setmerk(String merk) {
    this.merk = merk;
  }

  public String getwarna() {
    return warna;
  }

  public void setwarna(String warna) {
    this.warna = warna;
  }

  public String getjenis() {
    return jenis;
  }

  public void setjenis(String jenis) {
    this.jenis = jenis;
  }

  public int getCC() {
    return CC;
  }

  public void setCC(int CC) {
    this.CC = CC;
  }

  public int getjumlah() {
    return jumlah;
  }

  public void setjumlah(int jumlah) {
    this.jumlah = jumlah;
  }
}

public class Testmobil1 {
  public static void main(String[] args) {
    mobil[] mobils = new mobil[4];

    mobils[0] = new mobil();
    mobils[0].setmerk("Toyota");
    mobils[0].setwarna("Biru");
    mobils[0].setjenis("minibus");
    mobils[0].setCC(2000);
    mobils[0].setjumlah(7);

    mobils[1] = new mobil();
    mobils[1].setmerk("Nissan");
    mobils[1].setwarna("Hitam");
    mobils[1].setjenis("pick up");
    mobils[1].setCC(1500);
    mobils[1].setjumlah(2);

    mobils[2] = new mobil();
    mobils[2].setmerk("Suzuki");
    mobils[2].setwarna("silver");
    mobils[2].setjenis("suv");
    mobils[2].setCC(1800);
    mobils[2].setjumlah(5);

    mobils[3] = new mobil();
    mobils[3].setmerk("Honda");
    mobils[3].setwarna("merah");
    mobils[3].setjenis("sedan");
    mobils[3].setCC(1300);
    mobils[3].setjumlah(5);

    System.out.println("OBJEK\tMERK\t\tWARNA\t\tJENIS\t\t CC\t\tJUMLAH");
    for (int i = 0; i < 4; i++) {
      String merk = mobils[i].getmerk();
      String warna = mobils[i].getwarna();
      String jenis = mobils[i].getjenis();
      int CC = mobils[i].getCC();
      int jumlah = mobils[i].getjumlah();

      System.out.println("mobil" + i + " \t" + merk +"\t\t"+ warna + "\t"+"\t" + jenis + "\t"+"\t" + CC + " \t "+"\t" + "  " +jumlah);
    }
  }
}
