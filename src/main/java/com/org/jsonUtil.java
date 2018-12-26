package com.org;

import com.alibaba.fastjson.JSON;

/**
 * Created by weixin on 17-8-28.
 */
public class jsonUtil {


    public static String json(){
        String str="{" +
                "uid='" + "123" + '\'' +
                ", uname='" + "weixin" + '\'' +
                '}';

        User user= JSON.parseObject(str,User.class);

        return null;
    }
}
