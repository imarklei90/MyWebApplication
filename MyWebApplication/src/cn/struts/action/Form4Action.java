package cn.struts.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 属性封装表单数据
 * @author iustc
 *
 */
public class Form4Action extends ActionSupport {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(username + ":" + password);
		return NONE;
	}
	
}
