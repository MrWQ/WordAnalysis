package com.computer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mr.Wang
 * @description: 初始化传入单词，分析单词，返回单词种别码
 **/
public class WordAnalysis {
    private String word;
    //public static String[] CONSTANT ={"0","1","2","3","4","5","6","7","8","9"};//常数 返回2
    public static String[] KEY_WORD = {"if", "then", "else", "private", "public", "protected", "new", "class"};//关键字 返回3
    public static String[] OPERATOR = {"=", "==","<=" ,">=", ">", "<", "++","--","+", "-", "*", "/", "%"};//运算符 返回4
    public static String[] DELIMITER = {";", "{", "}", "(", ")", " "};//边界符 返回5
    public List IDENTIFIER = new ArrayList();  //标识符空列表

    /*
        构造方法 初始化
     */
    public WordAnalysis(String word) {
        this.word = word;
    }

    public WordAnalysis(char word) {
        this.word = String.valueOf(word);
    }


    //分析 并 返回 单词所属码
    public int wordAnalysis() {

//        for(int i=0;i<CONSTANT.length;i++){
//            if (word.equals(CONSTANT[i]))
//                return 2;
//        }
        char ch = word.charAt(0);
        if (ch >= 48 && ch <= 57) {  //识别数字
            if (new CheackNumber(word).IsNumber()) {
                return 2;
            }else {
                return 6; //错误码 6
            }
        }
        for (int i = 0; i < KEY_WORD.length; i++) { //识别关键字
            if (word.equals(KEY_WORD[i]))
                return 3;
        }
        for (int i = 0; i < OPERATOR.length; i++) { //识别运算符
            if (word.equals(OPERATOR[i]))
                return 4;
        }
        for (int i = 0; i < DELIMITER.length; i++) { //识别边界符
            if (word.equals(DELIMITER[i]))
                return 5;
        }

        return 1;
    }

    /**
     * @Description: 判断是否为边界符
     * @Param: [word]
     * @return: boolean
     * @Author: Mr.Wang
     */
    public boolean isDelimiter() {
        // char[] DELIMITER = {';', '{', '}', '(', ')', ' '};//边界符 返回5
        for (int j = 0; j < DELIMITER.length; j++) {//遍历边界符
            if (word.equals(DELIMITER[j])) {//如果属于边界符
                return true;
            }
//            else {
//                return  false;
//            }
        }
        return false;
    }


    public boolean isOperator(){
        for (int j = 0; j < OPERATOR.length; j++) {//遍历边界符
            if (word.equals(OPERATOR[j])) {//如果属于边界符
                return true;
            }
//            else {
//                return  false;
//            }
        }
        return false;
    }

}
