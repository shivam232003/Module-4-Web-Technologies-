package message;

public class Message {

	private int uid;
	private String from_a;
	private String to_b;
	private String msg;
	
	

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(int uid, String from, String to, String msg) {
		super();
		this.uid = uid;
		this.from_a = from;
		this.to_b = to;
		this.msg = msg;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFrom() {
		return from_a;
	}

	public void setFrom(String from) {
		this.from_a = from;
	}

	public String getTo() {
		return to_b;
	}

	public void setTo(String to) {
		this.to_b = to;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Message [uid=" + uid + ", from=" + from_a + ", to=" + to_b + ", msg=" + msg + "]";
	}
	
	
}
