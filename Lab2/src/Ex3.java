class Time{
	int hour;
	int minute;
	int second;
	public String checkTime(int time) {
		if (time<10) {
			return "0"+Integer.toString(time);
		}
		else {
			return Integer.toString(time);
		}
	}
	public Boolean isInvalid()
	{
		if (hour>23 || hour<0 || minute>59 || minute<0 || second>59 || second<0) {
			return true;
		}
		else
			return false;
	}
	public Time(int hour, int minute, int second) {
		
		this.hour=hour;
		this.minute=minute;
		this.second=second;
		
	}
	public void add(Time time) {
		this.hour=this.hour+time.hour;
		this.minute=this.minute+time.minute;
		this.second=this.second+time.second;
		if (this.hour>23) {
			this.hour=this.hour-23;
		}
		if(this.minute>59) {
			this.minute=this.minute-60;
			this.hour=this.hour+1;
			if (this.hour>23) {
				this.hour=this.hour-23;
			}
		}
		if(this.second>60) {
			this.second=this.second-60;
			this.minute=this.minute+1;
			if(this.minute>59) {
				this.minute=this.minute-60;
				this.hour=this.hour+1;
			}
		}
	}
	public String toUniversal() {
		if (isInvalid())
		{
			return "Input values are incorrect";
		}
		else {
			return checkTime(hour)+":"+checkTime(minute)+":"+checkTime(second);
	
		}
	}
	public String toStandart() {
		if (isInvalid())
		{
			return "Input values are incorrect";
		}
		else {
			if (hour==0)
			{
				hour=12;
				return checkTime(hour)+":"+checkTime(minute)+":"+checkTime(second)+"AM";
			}
			else if (hour>0 && hour<12)
			{
				return checkTime(hour)+":"+checkTime(minute)+":"+checkTime(second)+"AM";
			}
			else if (hour==12) {
				return checkTime(hour)+":"+checkTime(minute)+":"+checkTime(second)+"PM";
			}
			else {
				hour=hour-12;
				return checkTime(hour)+":"+checkTime(minute)+":"+checkTime(second)+"PM";
			}
		}
	}
}
public class Ex3 {
	public static void main(String[] args) {
		Time t1= new Time(23,0,6);
		System.out.println(t1.toUniversal());
		System.out.println(t1.toStandart());
		Time t2 = new Time(4,60,60);
		t1.add(t2);
		System.out.println(t1.toStandart());
	}
}
