package com.ytd.util;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class RandomUtils {


    //随机数
    public int Random(){
        Random random = new Random();
        int min=100000;
        int max=999999;
        int code=random.nextInt(max);
        if (code<min){
            code=code+min;
        }
        int randoms = code;
        return randoms;
    }
    //当前日期
    public String todate(){
        return new SimpleDateFormat("yyyyMMdd").format(new Date());
    }
    //当前时间
    public String totime(){
        return new SimpleDateFormat("hhMMss").format(new Date());
    }
    //当前时间
    public String datetime(){
        return new SimpleDateFormat("yyyy-MM-dd-hh-MM-ss").format(new Date());
    }
}
