package Lesson6;

import java.util.Random;
import java.io.*;

public class HW6 {
    private static final String CHARS = "0123456789ABCDEFGHIGKLMNOPQRSTUVWXYZ";
    private static final Random rnd = new Random();
        private static final String SEARCH = " WORD ";
    private static final int FILES_AMOUNT = 5;
    private static final int MIN_LENGTH = 50;
    private static final int MAX_LENGTH = 100;

    private static FileOutputStream fos;
    private static FileInputStream fis;

    public static String createString(int number) {
        StringBuilder sb = new StringBuilder(number);
        for (int i = 0; i < number; i++) {
            sb.append(CHARS.charAt(rnd.nextInt(CHARS.length())));
        }
        return sb.toString();
    }

    public static String createString2(int number) {
        StringBuilder sb = new StringBuilder(number);
        for (int i = 0; i < number; i++) {
            sb.append(CHARS.charAt(rnd.nextInt(CHARS.length())) + SEARCH);
        }
        return sb.toString();
    }

    private static void writeFile(String fileName, int length) {
        try {
            fos = new FileOutputStream(fileName);
            fos.write(createString(length).getBytes());
            fos.flush();
            fos.close();
        } catch (IOException e) {
            System.err.println("Ошибка с файлом  " + fileName + " Причина: " + e.getCause());
        }
    }

    private static void writeFile2(String fileName, int length) {
        try {
            fos = new FileOutputStream(fileName);
            fos.write(createString2(length).getBytes());
            fos.flush();
            fos.close();
        } catch (IOException e) {
            System.err.println("Ошибка с файлом  " + fileName + " Причина: " + e.getCause());
        }
    }

    private static void pasteFiles(String file1, String file2, String resultFile) {
        try {
            fos = new FileOutputStream(resultFile);
            int code;
            fis = new FileInputStream(file1);
            while ((code = fis.read()) != -1)
                fos.write(code);
            fis.close();

            fis = new FileInputStream(file2);
            while ((code = fis.read()) != -1) {
                fos.write(code);
            }
            fis.close();

            fos.flush();
            fos.close();
        } catch (IOException e) {
            System.err.println("Ошибка с файлом  " + resultFile + " Причина: " + e.getCause());
        }
    }

    private static void searchInFile(String fileName, String search) throws IOException {
        fis = new FileInputStream(fileName);
        int symbol = 0;
        int index = 0;
        byte[] searchBytes = search.getBytes();
        do {
            symbol = fis.read();
            if (searchBytes[index] == symbol) {
                index++;
                if (index == searchBytes.length) {
                    System.out.println("Слово нашлось");
                    break;
                }
            } else {
                index = 0;
            }
        } while (symbol != -1);


    }

    private static int randomLength = rnd.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;



    public static void main (String[]args) throws IOException {

        String[] fileNames = new String[FILES_AMOUNT];
        for (int i = 0; i < fileNames.length; i++)
            fileNames[i] = "file_" + i + ".txt";

        //1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
        for (int i = 0; i < FILES_AMOUNT; i++)
            //writeFile(fileNames[i], randomLength);
        if (i < 2)
            writeFile(fileNames[i], randomLength);
        else
            writeFile2(fileNames[i], randomLength);

        System.out.println("Задание 1 - создано 5 файлов");

        //2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла,
        // потом текст из второго.
        pasteFiles(fileNames[0], fileNames[1], "resultFile.txt");
        System.out.println("Результат копирования в resultFile.txt");

        //3. Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
        searchInFile("file_3.txt", SEARCH);

        }
    }

