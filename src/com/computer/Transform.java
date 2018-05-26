package com.computer;

/**
 * @author: Mr.Wang
 * @description: 传入 word 转换为 二元组 并 输出屏幕
 **/
public class Transform {
    private String word;

    public Transform(String word) {
        this.word = word;
    }
    public Transform(char word) {
        this.word = String.valueOf(word);
    }

    public void stdout(){
        WordAnalysis wordAnalysis=new WordAnalysis(word);
        int intg =wordAnalysis.wordAnalysis();
        Tuple tuple = new Tuple(intg,word);
        System.out.println(tuple.returnTuple());
    }


}
