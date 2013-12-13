import java.io.*;

public class Conditional {
        static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        public static void main(String[] args) {
                try {
                        System.out.println("Bahasa Pemrograman yang tersedia (1-3) " + "\n\t1.) Java" + "\n\t2.) PHP" + "\n\t3.) Phyton");
                        System.out.print("Masukkan Pilihan Anda  : ");
                        String choose = input.readLine();
                        if(choose.equals("1")){
                                System.out.println("Anda Memilih Java");
                        } else if(choose.equals("2")){
                                System.out.println("Anda memilih PHP");
                        } else if(choose.equals("3")){
                                System.out.println("Anda memilih Phyton");
                        } else {
                                throw new Exception("pilihan anda tidak ada !");
                        }
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
        }
}