package com.showshy.spat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-04-07.
 */
public class SpatMain {
    private URL url = null;
    private UserInfo userinfo;
    private ClassesInfo classesInfo;
    private HashMap<String,String> hashMap; //存放所有教室信息
    private ArrayList<String> freeNum;

    public SpatMain(){
        try {
            this.url = new URL("http://www.gzjponline.com/Jp/GetSchedule?start=1490457600&end=1494086400");
            classesInfo = new ClassesInfo();
            userinfo = new UserInfo();
            userinfo.setName("易舜");
            userinfo.setIdCard("43062419880814637X");
            userinfo.setPhone("13246415560");
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    public String loadFormUrl(){
        String sResult = "";
        try{
            URLConnection URLconnection = url.openConnection();

            HttpURLConnection httpConnection = (HttpURLConnection) URLconnection;;
            httpConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36");
            int responseCode = httpConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.err.println("成功");
                InputStream in = httpConnection.getInputStream();
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader bufr = new BufferedReader(isr);
                String str;
                StringBuilder stringBuilder = new StringBuilder("");
                while ((str = bufr.readLine()) != null) {
                    stringBuilder.append(str);
                }
                sResult = stringBuilder.toString();
                bufr.close();
            } else {
                System.err.println("失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return sResult;
    }
}
