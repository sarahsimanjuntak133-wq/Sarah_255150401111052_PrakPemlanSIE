public class Mobil {

private String nopol;
private String warna;
private String merk;
private int kecepatan;
private double jarakTempuh;

public void setNopol(String n) {
nopol = n;
}

public void setWarna(String s) {
warna = s;
}

public void setMerk(String m) {
merk = m;
}

public void setKecepatan(int k) {
kecepatan = k;
}

public void display() {
System.out.println("Mobil bermerk " + merk);
System.out.println("bernomor polisi " + nopol);
System.out.println("serta memililki warna " + warna);
System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj");
}

public double hitungJarak(double waktu) {
    double jarak = kecepatan * waktu;
    return jarak;
}

public void tampilKecepatanMps() {
    double kecepatanMps = kecepatan * 1000.0 / 3600.0;
    System.out.println("Kecepatan mobil dalam m/s: " + kecepatanMps);
}
}



