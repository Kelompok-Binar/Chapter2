package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFolderAndFile extends Rumus{

    String customDirectory = "C:\\";
    String folderName = "Temp_Chapter2";
    String fileName;

    File folder = new File(customDirectory + "/" + folderName);

    protected void createModus(){
        // membuat directory folder di dalam custom directory
        if (!folder.exists()) {
            folder.mkdirs();
            System.out.println("folder dibuat di: " + folder.getAbsolutePath());
        } else {
            System.out.println("folder sudah ada di" + folder.getAbsolutePath());
        }

        // membuat file baru di dalam directory folder
        fileName = "Data Modus.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File dibuat di : " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File sudah ada di : " + file.getAbsolutePath());
        }

        // menulis data ke file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Modus : " + getModus());
            writer.close();
            System.out.println("Data ditulis kedalam file : " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    protected void createMeanMedian(){
        // membuat directory folder di dalam custom directory
        if (!folder.exists()) {
            folder.mkdirs();
            System.out.println("folder dibuat di : " + folder.getAbsolutePath());
        } else {
            System.out.println("folder sudah ada di :" + folder.getAbsolutePath());
        }

        // membuat file baru di dalam directory folder
        fileName = "Data Mean & Median.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File dibuat di : " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File sudah ada di : " + file.getAbsolutePath());
        }


        // menulis data ke file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Mean : "+getMean() + "\n"+"Median :"+getMedian()); //jika seperti ini tidak perlu parsing
            //writer.write(Double.toString(median)); //perlu parsing ke Double.toString
            writer.close();

            System.out.println("Data ditulis kedalam file : " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void createBoth() {
        // membuat directory folder di dalam custom directory
        if (!folder.exists()) {
            folder.mkdirs();
            System.out.println("folder dibuat di : " + folder.getAbsolutePath());
        } else {
            System.out.println("folder sudah ada di : " + folder.getAbsolutePath());
        }

        // membuat file baru di dalam directory folder
        fileName = "Data Modus, Mean & Median.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File dibuat di : " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File sudah ada di : " + file.getAbsolutePath());
        }

        // menulis data ke file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Modus : "+getModus() +"\n");
            writer.write("Mean : "+getMean() + "\n"+"Median :"+getMedian());
            writer.close();
            System.out.println("Data ditulis kedalam file : " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void createFrekuensi(){
        // membuat directory folder di dalam custom directory
        if (!folder.exists()) {
            folder.mkdirs();
            System.out.println("folder dibuat di : " + folder.getAbsolutePath());
        } else {
            System.out.println("folder sudah ada di : " + folder.getAbsolutePath());
        }

        // membuat file baru di dalam directory folder
        fileName = "Frekuensi.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File dibuat di : " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File sudah ada di : " + file.getAbsolutePath());
        }

        // menulis data ke file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Nilai \t \t \t \t | Frekensi \n");
            writer.write("Jumlah Nilai Dibawah Lima \t |\t" + dibawah_lima +"\n");
            writer.write("5 \t \t \t \t \t |\t" + lima +"\n");
            writer.write("6 \t \t \t \t \t |\t" + enam +"\n");
            writer.write("7 \t \t \t \t \t |\t" + tujuh +"\n");
            writer.write("8 \t \t \t \t \t |\t" + delapan +"\n");
            writer.write("9 \t \t \t \t \t |\t" + sembilan +"\n");
            writer.write("10 \t \t \t \t \t |\t" + sepuluh +"\n \n");
            writer.write("Jumlah Frekuensi \t \t \t |\t" + ReadData.list_nilai.size() +"\n");
            writer.close();
            System.out.println("Data ditulis kedalam file : " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
