package Mail;

import java.time.LocalDateTime;

public class Mail implements Comparable<Mail>{
	long mailid;
	String from;
	String subject;
	String body;
	LocalDateTime rec_time;
	
	public Mail(long mailid, String from, String subject, String body, LocalDateTime rec_time) {
		super();
		this.mailid = mailid;
		this.from = from;
		this.subject = subject;
		this.body = body;
		this.rec_time = rec_time;
	}
	public Mail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "mailid=" + mailid + ", from=" + from + ", subject=" + subject + ", body=" + body + ", rec_time="
				+ rec_time + "]";
	}
	@Override
	public int compareTo(Mail o) {
		return this.rec_time.compareTo(o.rec_time);
	}
	
	
	

}
