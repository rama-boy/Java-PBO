package com.latihan;

class Tabungan {
  private int saldo;

  public Tabungan(int initsaldo) {
    saldo = initsaldo;
  }

  public void simpanUang(int jumlah) {
    saldo = saldo + jumlah;
  }

  public boolean ambilUang(int jumlah) {
    if (jumlah > saldo)
      return false;
    else
      saldo = saldo - jumlah;
    return true;
  }

  public int getSaldo() {
    return saldo;
  }
}

public class Tugas1 {
  public static void main(String[] args) {
    boolean status;
    Tabungan tabungan = new Tabungan(5000);
    System.out.println("Saldo awal : " + tabungan.getSaldo());
    tabungan.simpanUang(3000);

    System.out.println("Jumlah uang yang disimpan : 3000");
    status = tabungan.ambilUang(6000);

    System.out.println("Jumlah uang yang diambil : 6000");
    if (status)
      System.out.println("Ok");
    else
      System.out.println("Gagal");
    tabungan.simpanUang(3500);

    System.out.println("Jumlah uang yang disimpan : 3500");
    status = tabungan.ambilUang(4000);

    System.out.println("Jumlah uang yang diambil : 4000");
    if (status)
      System.out.println("Ok");
    else
      System.out.println("Gagal");

    status = tabungan.ambilUang(1600);

    System.out.println("Jumlah uang yang diambil : 1600");
    if (status)
      System.out.println("Ok");
    else
      System.out.println("Gagal");
    tabungan.simpanUang(2000);

    System.out.println("Jumlah uang yang disimpan : 2000");

    System.out.println("Saldo sekarang = " + tabungan.getSaldo());

  }
}
