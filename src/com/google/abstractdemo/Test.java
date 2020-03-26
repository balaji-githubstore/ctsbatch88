package com.google.abstractdemo;

interface WebDriver123
{
	public abstract void close();
	String get(String url);
}

interface TakeScreenshot
{
	//hello
	void getScreenshot();
}


class ChromeDriver implements WebDriver123,TakeScreenshot
{

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String get(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		
	}
	
}
class FirefoxDriver implements WebDriver123,TakeScreenshot
{


	@Override
	public String get(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		
	}
	
}



class XX implements WebDriver123
{

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String get(String url) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


public class Test {

	public static void main(String[] args) {
		
			WebDriver123 driver=new ChromeDriver();
			driver=new FirefoxDriver();
			driver.close();
	}

}
