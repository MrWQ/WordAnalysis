package com.computer;

/**
 * @author: Mr.Wang
 * @description: 检查数字是否合法
 **/
public class CheackNumber {
   /** 
   * @Description:
   * 
   */ 
    public String word;

    public CheackNumber(String word) {
        this.word = word;
    }

    public Boolean IsNumber(){
        try {
            double number;
            number = Double.parseDouble(word);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    
}
