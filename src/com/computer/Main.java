package com.computer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {
//        String[] CONSTANT = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};//常数 返回2
////        String[] KEY_WORD = {"if", "else", "private", "public", "protected", "new", "class"};//关键字 返回3
////        String[] OPERATOR = {"=", "==", ">=", ">", "<", "+", "-", "*", "/", "%"};//运算符 返回4
////        char[] DELIMITER = {';', '{', '}', '(', ')', ' '};//边界符
////        char[] DELIMITER2 = {';', '{', '}', '(', ')'};//边界符 返回5
        String word = "if i = 5 then x = y; if(abc >= 5){ c = 15; }else{ c = 15.555; }";
        List list = new ArrayList();
////////////////读文件
        File file = new File("java.txt");
        FileInputStream fip = new FileInputStream(file);
        // 构建FileInputStream对象

        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        // 构建InputStreamReader对象,编码与写入相同

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // 转成char加到StringBuffer对象中
        }
        word = sb.toString();
//        System.out.println(word); //打印文件内容
        reader.close();
        // 关闭读取流

        fip.close();
//         关闭输入流,释放系统资源
//////////////////////////////

        for (int i = 0; i < word.length(); i++) { //一行代码
            char ch = word.charAt(i);//每个字符

            if (new WordAnalysis(ch).isDelimiter() || new WordAnalysis(ch).isOperator() || ch == 9 || ch == 10 || ch == 13) { //如果为边界符 运算符 空格

                if (!list.isEmpty()) { //如果列表不为空
                    String stringlist = new Common().listToSpring(list);//列表转字符串
                    new Transform(stringlist).stdout();//字符串转二元组输出
                    list.removeAll(list);
                }

                if (ch == ' ' || ch == 9 || ch == 10 || ch == 13) { //忽略空格 换行 回车 tab
                }
//                else if(ch == '/'&& list.get(0) =="/"){ // 忽略注释
//                    continue;
//                }

//                if (new WordAnalysis(ch).isOperator()) { //如果为运算符
//                    char ch2 = word.charAt(i + 1);
//                    if (new WordAnalysis(ch2).isOperator()) {
//                        list.add(ch);
//                        list.add(ch2);
//                        i++;
//                        String stringlist = new Common().listToSpring(list);//列表转字符串
//                        new Transform(stringlist).stdout();//字符串转二元组输出
//                        list.removeAll(list);
//                    } else {
//                        new Transform(ch).stdout();
//                        list.removeAll(list);
//                    }
//                }
                else{
                        new Transform(ch).stdout();
                        list.removeAll(list);
                    }

                } else {  //不是界符就加到缓冲
                    list.add(ch);
                }

            }

        }


    }
