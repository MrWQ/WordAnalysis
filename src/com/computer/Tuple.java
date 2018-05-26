package com.computer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mr.Wang
 * @description: 输入 int 和 String  返回 二元组  生成标识符表并判定标识符的入口地址，组成新的二元组
 *  判别错误码，并做错误提示
 **/
public class Tuple {
    int intg;
    String string;
   static List IDENTIFIER = new ArrayList();  //标识符空列表

    public Tuple(int intg, String string) {
        this.intg = intg;
        this.string = string;
    }

    public String returnTuple() {
//       System.out.println( "(" + String.valueOf(intg) + "," + string + ")");

        if (intg == 1) {
            //如果为 标识符
            if (!IDENTIFIER.contains(string)) { //如果不存在列表中
                IDENTIFIER.add(string);
                string = String.valueOf(IDENTIFIER.size()-1);
            } else {
                for (int i = 0; i < IDENTIFIER.size(); i++) {
                    if (string.equals(IDENTIFIER.get(i))) {
                        string = String.valueOf(i);
                    }
                }
            }
        }

        // 如果为错误码
        if (intg ==6){
            intg = 2;
            string = "This number is worng!";
        }


        String TUPLE = "(" + String.valueOf(intg) + "," + string + ")" ;
//        System.out.println(TUPLE);
        return TUPLE;

    }
}
