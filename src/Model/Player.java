package Model;

public class Player {
	
	private String name;
	//good, bad, or villain
	private String assignment;
	private String party;
	private String hint;
	private String alreadyClicked = "primary";
	private String peekClicked = "primary";
	private boolean hasBeenClicked=false;
	
	private int numOfViews = 0;
	
	public Player(){};
	
	public Player(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfViews() {
		return numOfViews;
	}

	public void setNumOfViews(int numOfViews) {
		this.numOfViews = numOfViews;
	}

	public String getAssignment() {
		return assignment;
	}

	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}

	public String getAlreadyClicked() {
		return alreadyClicked;
	}

	public void setAlreadyClicked(String alreadyClicked) {
		this.alreadyClicked = alreadyClicked;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public boolean isHasBeenClicked() {
		return hasBeenClicked;
	}

	public void setHasBeenClicked(boolean hasBeenClicked) {
		this.hasBeenClicked = hasBeenClicked;
	}

	public String getPeekClicked() {
		return peekClicked;
	}

	public void setPeekClicked(String peekClicked) {
		this.peekClicked = peekClicked;
	}

}
