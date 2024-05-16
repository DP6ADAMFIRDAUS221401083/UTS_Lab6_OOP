import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String input = scanner.nextLine();

        int result = isPalindrome(input) ? 1 : 0;
        System.out.println(result);
    }

    public static boolean isPalindrome(String str) {
        // Menghapus spasi dan mengubah menjadi huruf kecil
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Menginisialisasi pointer untuk memeriksa palindrom
        int i = 0;
        int j = str.length() - 1;

        // Melakukan iterasi sampai kedua pointer bertemu
        while (i < j) {
            // Memeriksa karakter yang sesuai pada kedua ujung string
            if (str.charAt(i) != str.charAt(j)) {
                return false; // Jika tidak sama, bukan palindrom
            }
            // Pindah pointer ke depan dan belakang
            i++;
            j--;
        }
        // Jika berhasil melewati semua iterasi, itu adalah palindrom
        return true;
    }
}
