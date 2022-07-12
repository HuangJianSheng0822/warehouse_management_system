package com.pojo;

public class Commodity {

	  private String comId;
	  private String comName;
	  private String comNum;
	  private String comKind;
	  private String fragile;
	  private String comTime;

	public Commodity() {
	}

	public Commodity( String comId , String comName , String comNum , String comKind , String fragile , String comTime ) {
		this.comId = comId;
		this.comName = comName;
		this.comNum = comNum;
		this.comKind = comKind;
		this.fragile = fragile;
		this.comTime = comTime;
	}

	public String getComId() {
	    return comId;
	  }

	  public void setComId(String comId) {
	    this.comId = comId;
	  }


	  public String getComName() {
	    return comName;
	  }

	  public void setComName(String comName) {
	    this.comName = comName;
	  }


	  public String getComNum() {
	    return comNum;
	  }

	  public void setComNum(String comNum) {
	    this.comNum = comNum;
	  }


	  public String getComKind() {
	    return comKind;
	  }

	  public void setComKind(String comKind) {
	    this.comKind = comKind;
	  }


	  public String getFragile() {
	    return fragile;
	  }

	  public void setFragile(String fragile) {
	    this.fragile = fragile;
	  }


	  public String getComTime() {
	    return comTime;
	  }

	  public void setComTime(String comTime) {
	    this.comTime = comTime;
	  }

	}
