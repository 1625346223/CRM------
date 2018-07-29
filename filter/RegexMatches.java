package com.hwua.filter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**   
 * @ClassName:  RegexMatches   
 * @Description:正则判断   
 * @author: Sinway
 *     
 */  
public class RegexMatches {
	
	public static boolean idNumber(String idNumber) {
		String str = idNumber;
		String pattern = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";

		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(str);
		return m.matches();
	}
	
	public static boolean email(String email) {
		
		String pattern = "(^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$)";

		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(email);
		return m.matches();
	}
	
	public static boolean isMoney(String rent) {
		String str = rent;
		String pattern = "^\\d+(\\.\\d+)?$";

		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(str);
		return m.matches();
		
		
	}
	
	public static boolean userName(String username) {
		String str = username;
		String pattern = "^[a-zA-Z][a-zA-Z0-9_]{4,15}$";

		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(str);
		return m.matches();	
		
	}
	
	public static boolean passWord(String password) {
		String str = password;
		String pattern = "^[a-zA-Z]\\w{5,17}$";

		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(str);
		return m.matches();	
		
	}
	public static boolean tel(String tel) {
		String pattern = "^[1][3,4,5,6,7,8][0-9]{9}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(tel);
		return m.matches();	
		
	}
	
	public static boolean isInt(String isInt) {
		String str = isInt;
		String pattern = "^[1-9]\\d*$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(str);
		return m.matches();	
	}
	
	public static boolean code(String code,String security) {
		
		if (code.equalsIgnoreCase(security)) {
			return true;
		}else if (security.length()==4) {
			System.out.println("验证码输入不正确");
			return false;
		}else  {
			return false;
		}
			
	}

}
