package cn.edu.bistu.cs.se.weatherapp.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.telephony.SmsManager;

public class SmsUtil {
    private static String msg;
    private static String cityName;
    private static String temp1;
    private static String temp2;
    private static String weatherDesp;
    private static String publishTime;
    private static String currentTime;
    private static SmsManager smsManager=null;
    public static void sendMsg(final Context context){
        if(smsManager==null){
            smsManager=SmsManager.getDefault();
        }
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        cityName=prefs.getString("city_name", "");
        temp1=prefs.getString("temp1", "");
        temp2=prefs.getString("temp2", "");
        weatherDesp=prefs.getString("weather_desp", "");
        publishTime=prefs.getString("publish_time", "");
        currentTime=prefs.getString("current_date", "");
        msg=cityName+"|"+weatherDesp+"|"+publishTime+"|"+currentTime+"|"+temp1+"|"+temp2;
        smsManager.sendTextMessage("18813125909",null,msg,null,null);
    }
}
