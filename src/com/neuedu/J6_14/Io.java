package com.neuedu.J6_14;

import java.io.*;

public class Io {
    public static void main(String[] args) {
        File file = new File("E:\\zuoye");
        File file1 = new File("E:\\zuoye\\作业.txt");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("创建完成");
        File[] files = file.listFiles();
        File file2 = new File("E:\\zuoye1");
        File file3 = new File("E:\\zuoye1\\" + file1.getName());
        for (File f : files
        ) {
            if (f.equals(file1)) {
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file3.exists()) {
                    try {
                        file3.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        InputStreamReader reader = null;
        String str = null;
        try {
            reader = new InputStreamReader(new FileInputStream(file1), "gbk");
            char[] chars = new char[(int) file1.length()];
            reader.read(chars);
            str = new String(chars);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        OutputStreamWriter writer = null;
        try {
            writer = new OutputStreamWriter(new FileOutputStream(file3), "gbk");
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("复制完成");
    }
}

