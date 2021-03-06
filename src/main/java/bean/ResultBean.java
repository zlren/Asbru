package bean;

import java.sql.Timestamp;

public class ResultBean {
	
	private String name; //名称
	private String type; //类别：计划/动作
	private Timestamp time; //完成时间
	private float score; //得分
	private String state; //完成情况

	public ResultBean(String name, String type, float score, String state, Timestamp time) {
		this.name = name;
		this.type = type;
		this.score = score;
		this.state = state;
		this.time = time;
	}
	
	@Override
	public String toString() {

		String res = "名称=" + name + ", 类型=" + type + ", 完成情况=" + state + ", 得分=" + score + ", 时间=" + time;
		return res;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
