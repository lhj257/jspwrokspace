package ch04.com.dao;

public class GuGuDan {
	public String process(int n) {
		int total = 0;
		String str="";
		for (int i = 1; i < 10; i++) {
			total = n * i;
			str+=n+"*"+i+"="+total+"<br>";
		}
		return str;
	}
}
