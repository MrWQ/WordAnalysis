package com.computer;

import java.util.List;

/**
 * @author: Mr.Wang
 * @description: 公共方法
 **/
public class Common {

    /**
     * @Description: 列表 转 字符串
     * @Param: [list]
     * @return: java.lang.String
     * @Author: Mr.Wang
     *
     */
    public String listToSpring(List list){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<list.size();i++){
            stringBuilder.append(list.get(i));
        }
        return stringBuilder.toString();
    }



}
