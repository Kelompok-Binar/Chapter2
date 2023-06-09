package org.example;

import java.util.*;


//cara simple nya ya pake cara simple

//di save 1 1 datanya
public class Rumus{
    static int satu = 0, dua = 0, tiga = 0, empat = 0, lima = 0 , enam = 0 , tujuh = 0 ,
            delapan = 0 , sembilan = 0 , sepuluh = 0, dibawah_lima = 0;

    static double jumlah = 0, mean, median, modus;

    // bagian getter setter
    public static void setModus(double modus) {
        Rumus.modus = modus;
    }
    public static double getModus() {
        return modus;
    }
    public static void setMean(double mean) {
        Rumus.mean = mean;
    }
    public static double getMean() {
        return mean;
    }
    public static void setMedian(double median) {
        Rumus.median = median;
    }
    public static double getMedian() {
        return median;
    }

    // bagian rumus

    protected void meanRumus(){
        jumlah = satu * 1 + dua * 2 + tiga * 3 + empat * 4
                + lima * 5 + enam * 6 + tujuh * 7 + delapan * 8 + sembilan * 9 + sepuluh*10;
        mean = jumlah/ReadData.list_nilai.size();
        /*
        * Sebenarnya inisialisasi jumlah ingin menggunakan java collection cuma blm nemu caranya
        * */
        setMean(mean);
    }
    protected void medianRumus(){
        double md;
        // jika ganjil
        if (ReadData.list_nilai.size() % 2 == 1) {
            //note lakukan pasting dari integer ke string lalu ambil data dari list_nilai yaitu sizenya
            md = Integer.parseInt(String.valueOf(ReadData.list_nilai.get((ReadData.list_nilai.size()-1) / 2)));
        }
        // jika genap
        else {
            double angka1 = (Integer.parseInt(String.valueOf(ReadData.list_nilai.get((ReadData.list_nilai.size()-1) / 2))));
            double angka2 =(Integer.parseInt(String.valueOf(ReadData.list_nilai.get((ReadData.list_nilai.size()-1) / 2-1))));
            md=(angka1+angka2)/2;
        }
        setMedian(md);
    }

    protected void modusRumus(){

        //rumus ini aku suruh bikin chat gpt, tinggal ku rubah aja isinya
        int angkaMax=-1, angkaSisa=-1;
        for (int i =1;i< ReadData.list_nilai.size();i++){
//            int number = Integer.parseInt(String.valueOf(ReadData.list_nilai.get(i)));
//            int sum +=number;
            int count =0;
            for(int j=0;j< ReadData.list_nilai.size();j++){
                if(ReadData.list_nilai.get(i) == ReadData.list_nilai.get(j)){
                    count++;
                }
                if(count>angkaSisa){
                    angkaMax= Integer.parseInt(String.valueOf(ReadData.list_nilai.get(i)));
                    angkaSisa=count;
                }
            }
        }
        setModus(angkaMax);
    }

}