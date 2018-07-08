package com.enoch.studio.model;

/**
 * 
 * @className Command
 * @description 终端命令实体类
 * @author <a href="http://weibo.com/wangjwenoch">Enoch王建文</a>
 * @date   2017-8-31
 * <p>-----------------------</p>
 * <p>Please contact me if you have any questions</p>
 * <p>如有疑问，请联系我</p>
 * <p>新浪微博:@我想要两颗茜柚</p>
 * <p>电子邮箱:wangjwenoch@163.com</p>
 * <p>-----------------------</p>
 */
public class Command {
	private Integer terminalID;
	private String terminalName;
	private Integer time;
	private String timeSave;
	private Integer deviceNum;
	private Integer deviceID;
	private String command;
	private Integer newFlag;
	
	public Integer getTerminalID() {
		return terminalID;
	}
	public void setTerminalID(Integer terminalID) {
		this.terminalID = terminalID;
	}
	
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public String getTimeSave() {
		return timeSave;
	}
	public void setTimeSave(String timeSave) {
		this.timeSave = timeSave;
	}
	public Integer getDeviceNum() {
		return deviceNum;
	}
	public void setDeviceNum(Integer deviceNum) {
		this.deviceNum = deviceNum;
	}
	public Integer getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(Integer deviceID) {
		this.deviceID = deviceID;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public Integer getNewFlag() {
		return newFlag;
	}
	public void setNewFlag(Integer newFlag) {
		this.newFlag = newFlag;
	}

	public static void main(String[] args) {
		System.out.println("666");
	}

}
