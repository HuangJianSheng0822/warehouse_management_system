package com.pojo;

public class Ex {

	  private long exId;
	  private String comId;
	  private String exTime;
	  private int exNum;

	public Ex( long exId ) {
		this.exId = exId;
	}

	public Ex( long exId , String comId , String exTime , int exNum ) {
		this.exId = exId;
		this.comId = comId;
		this.exTime = exTime;
		this.exNum = exNum;
	}
	public Ex( long exId ,  String exTime , int exNum ) {
		this.exId = exId;
		this.exTime = exTime;
		this.exNum = exNum;
	}
	public long getExId() {
	    return exId;
	  }

	  public void setExId(long exId) {
	    this.exId = exId;
	  }


	  public String getComId() {
	    return comId;
	  }

	  public void setComId(String comId) {
	    this.comId = comId;
	  }


	  public String getExTime() {
	    return exTime;
	  }

	  public void setExTime(String exTime) {
	    this.exTime = exTime;
	  }


	  public int getExNum() {
	    return exNum;
	  }

	  public void setExNum(int exNum) {
	    this.exNum = exNum;
	  }

	}
