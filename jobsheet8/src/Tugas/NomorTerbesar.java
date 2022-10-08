//created by 21343058_Muhammad Farel Fahlevi

package Tugas;

import javax.swing.JOptionPane;

public class NomorTerbesar {
    public static void main(String[] args) {
        int nomor[] = new int[11];
        int Max;        

        for (int i = 1; i < nomor.length; i++) {
            String Angka = "Masukkan Angka ke-"+ i +": ";
            String nextAngka = JOptionPane.showInputDialog(Angka);
            nomor[i] = Integer.parseInt(nextAngka);
            }

            Max = nomor[0];
            for (int i = 1; i < nomor.length; i++) {
                if (nomor[i] > Max) {
                Max = nomor[i];
                }
            }
            String msg = "Angka Terbesarnya adalah: "+Max;
            JOptionPane.showMessageDialog(null, msg);
    }
}
