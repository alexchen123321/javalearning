package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String token = login("admin", "pass");
		System.out.println("Token: " + token);
	}

	static String login(String username, String password) {
		if (username.equals("admin")) {
			if (password.equals("password")) {
				return "loginin sucess";
			} else {
				// 抛出LoginFailedException:
				throw new LoginFailedException("Bad username or password.");
			}
		} else {
			// 抛出UserNotFoundException:
			throw new UserNotFoundException("User not found.");
		}
	}



}

class UserNotFoundException extends BaseException {
	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String message) {
		super(message);
	}

}
class LoginFailedException extends BaseException {
	public LoginFailedException() {
		super();
	}
	public LoginFailedException(String message) {
		super(message);
	}
}
