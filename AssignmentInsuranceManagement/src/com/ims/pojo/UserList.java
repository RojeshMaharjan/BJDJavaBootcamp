package com.ims.pojo;

public class UserList {
	
	private int uid;
	private String uname;
	private String uaddress;
	private long uphone;
	private String uemail;
	private String upassword;
	private int upolicyId;
	private static String ustatus;
	
	public static String adminEmail = "admin";
	public static String adminPass = "admin";
	
	public UserList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserList(int uid, String uname, String uaddress, long uphone, String uemail, String upassword,
			int upolicyId) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uaddress = uaddress;
		this.uphone = uphone;
		this.uemail = uemail;
		this.upassword = upassword;
		this.upolicyId = upolicyId;
	}

	public UserList(int uid, String uname, String uaddress, long uphone, String uemail, String upassword) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uaddress = uaddress;
		this.uphone = uphone;
		this.uemail = uemail;
		this.upassword = upassword;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public long getUphone() {
		return uphone;
	}

	public void setUphone(long uphone) {
		this.uphone = uphone;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public int getUpolicyId() {
		return upolicyId;
	}

	public void setUpolicyId(int upolicyId) {
		this.upolicyId = upolicyId;
	}

	public static String getUstatus() {
		return ustatus;
	}

	public static void setUstatus(String ustatus) {
		UserList.ustatus = ustatus;
	}

	public static String getAdminEmail() {
		return adminEmail;
	}

	public static void setAdminEmail(String adminEmail) {
		UserList.adminEmail = adminEmail;
	}

	public static String getAdminPass() {
		return adminPass;
	}

	public static void setAdminPass(String adminPass) {
		UserList.adminPass = adminPass;
	}

	@Override
	public String toString() {
		return "UserList [uid=" + uid + ", uname=" + uname + ", uaddress=" + uaddress + ", uphone=" + uphone
				+ ", uemail=" + uemail + "]";
	}
	
	
	

	
	//create what will be needed for user. also need status
}
