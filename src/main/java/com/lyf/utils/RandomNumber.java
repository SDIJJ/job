package com.lyf.utils;


public class RandomNumber {
    /**
     * 获取4位随机验证码
     * @return
     */
    public static String getNumber4(){
        String str = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String code = "";
        for(int i= 0;i<4;i++){
            int index = (int)(Math.random()*str.length());
            code+=str.charAt(index);
        }
        return code;
    }

    /**
     * 获取6位随机验证码(数字)
     * @return
     */
    public static String getRandom6(){
        int randNum = 100000 + (int)(Math.random() * ((999999 - 100000) + 1));
        String code=randNum+"";
        return  code;

    }

}
