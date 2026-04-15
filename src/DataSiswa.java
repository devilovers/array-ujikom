public class DataSiswa {
    public static void main(String[] args) {
        
        String[] nama = {"Siswa 1", "Siswa 2", "Siswa 3"};
        String [] kelas = {"Siswa 1", "Siswa 3", "Siswa 3"};
        String [] alamat = {"Siswa 1", "Siswa 2", "Siswa 3"};
        
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Data Siswa ke-" + (i+1));
            System.out.println("Nama    : " + nama[i]);
            System.out.println("Kelas    : " + kelas[i]);
            System.out.println("Alamat    : " + alamat[i]);
            System.out.println("----------------------");
        }
    }
}