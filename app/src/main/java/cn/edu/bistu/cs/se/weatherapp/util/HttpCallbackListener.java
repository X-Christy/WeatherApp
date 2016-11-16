package cn.edu.bistu.cs.se.weatherapp.util;

public interface HttpCallbackListener {

	public void onFinish(String response);

	public void onError(Exception e);

}
