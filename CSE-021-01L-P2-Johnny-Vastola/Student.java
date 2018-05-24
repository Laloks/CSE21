
public class Student {
	
	private  String name;
	private  char gender;
	private  Date birthdate;
	private  Preference pref;
	private  Boolean matched=false;
	Student(String name,char gender,Date birthdate,Preference pref){
		this.name=name;
		this.gender=gender;
		this.birthdate=birthdate;
		this.pref=pref;
	}
	public String getName() {
		return this.name;
	}
	public char getGender() {
		return this.gender;
	}
	public Date getDate() {
		return this.birthdate;
	}
	public Preference getPref() {
		return this.pref;
	}
	public Boolean getMatched() {
		return this.matched;
	}
	public void setMatch(Student sd) {
		sd.matched=true;
		matched=true;
		}
	public  int compare(Student st) {
		int score=0;
		if(st.getGender()==this.gender)
			score=(40-Math.abs(pref.compare(st.getPref())))+(60-(Math.abs(birthdate.compare(st.getDate()))));
		return score;
	}
}
