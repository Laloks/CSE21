
public class Preference {
	private int quietTime;
	private int music;
	private int reading;
	private int chatting;
	Preference(int quietTime,int music,int reading,int chatting){
		this.quietTime=quietTime;
		this.music=music;
		this.reading=reading;
		this.chatting=chatting;
	}

	public int getQuietTime() {
		return quietTime;
	}
	
	public int getMusic() {
		return music;
	}
	
	public int getReading() {
		return reading;
	}
	
	public int getChatting() {
		return chatting;
	}

	public int compare(Preference pref) {
		int difference=0;
				difference+=Math.abs(pref.getQuietTime()-this.getQuietTime());
				difference+=Math.abs(pref.getMusic()-this.getMusic());
				difference+=Math.abs(pref.getReading()-this.getReading());
				difference+=Math.abs(pref.getChatting()-this.getChatting());
		return difference;
	}
}
