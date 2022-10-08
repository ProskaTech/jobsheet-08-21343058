//created by 21343058_Muhammad Farel Fahlevi

package Tugas;

import javax.swing.JOptionPane;

public class NomorTerbesar {
    public static void main(String[] args) {
        int no[] = new int[11];
        int max;        

        for (int i = 1; i < no.length; i++) {
            String Kato = "Masukkan Angka ke-"+ i +": ";
            String Angko = JOptionPane.showInputDialog(Kato);
            no[i] = Integer.parseInt(Angko);
            }

            max = no[0];
            
            for (int i = 1; i < no.length; i++) {
                if (no[i] > max) {
                max = no[i];
                }
            }
            String msg = "Angka Terbesarnya adalah: "+max;
            JOptionPane.showMessageDialog(null, msg);
    }
}
