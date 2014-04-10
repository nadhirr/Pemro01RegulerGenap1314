package Praktikum03e.bin;

public class DemoVariabel1{
public static void main (String[] MuhammadNaufal){
int x=10;
System.out.println("Nilai X adalah " +x);
char z='a';
System.out.println("Nilai Z adalah " +z);
//isi data ke tipe yang tidak tepat
int y=z;
System.out.println("Nilai Y adalah "+y);

//type casting
char v=(char) x;
System.out.println("Nilai V adalah "+v);
System.out.println("Baris Selanjutnya ");
coba();
}
static char v;
public static void coba () {
System.out.println("Nilai V adalah "+v);
// variabel v tidak boleh dihapus karena masih dipakai dan masih berada di dalam scope 
short d= 15;// variabel d boleh dihapus di baris 22, karena life timenya sudah habis 
System.out.println("D adalah "+d);//variabel d boleh di hapusdi baris 22
}
}