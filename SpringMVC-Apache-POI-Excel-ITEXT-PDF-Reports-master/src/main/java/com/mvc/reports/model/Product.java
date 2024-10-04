package com.mvc.reports.model;

public class Product {

	private Integer pid;
	private String pname;

	public Product(int pid, String name) {
		this.pid = pid;
		this.pname = name;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}

}
