package assignment6;

public class Containers implements Comparable<Containers> {
	private String startEncoding;
	private String start;
	private String shortName;
	private String longName;
	private String Id;
	private String End;

	
	
	public Containers (String shortName , String longName , String Id , String start ,  String startEncoding , String End ) {
		this.setStartEncoding(startEncoding);
		this.start = start;
		this.shortName = shortName;
		this.longName = longName;
		this.Id = Id;
		this.End = End;
		
		
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public int compareTo (Containers c) {
		return this.shortName.compareTo(c.shortName);
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return End;
	}
	public void setEnd(String end) {
		End = end;
	}
	
	
	public String getStartEncoding() {
		return startEncoding;
	}
	public void setStartEncoding(String startEncoding) {
		this.startEncoding = startEncoding;
	}

}
