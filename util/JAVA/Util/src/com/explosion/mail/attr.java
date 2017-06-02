package com.explosion.mail;

public class attr {
	private String sfromfilter 		= "";
	private String sSubjectfilter 	= "";
	private String sDownloadpath 	= "";
	
	public attr(String sfromfilter, String sSubjectfilter, String sDownloadpath){
		this.sfromfilter 	= sfromfilter;	
		this.sSubjectfilter = sSubjectfilter;
		this.sDownloadpath 	= sDownloadpath;
	}
	
	public String getsDownloadpath() {
		return sDownloadpath;
	}
	public void setsDownloadpath(String sDownloadpath) {
		this.sDownloadpath = sDownloadpath;
	}

	public String getSfromfilter() {
		return sfromfilter;
	}
	public void setSfromfilter(String sfromfilter) {
		this.sfromfilter = sfromfilter;
	}
	public String getsSubjectfilter() {
		return sSubjectfilter;
	}
	public void setsSubjectfilter(String sSubjectfilter) {
		this.sSubjectfilter = sSubjectfilter;
	}
	
}
