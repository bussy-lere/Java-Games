package Games;

public class Enemies {
	int life;
	boolean onstage;
	String name;
	boolean haveBody;
	boolean haveHead;
	
	public Enemies(String n, int l){
		this.name = n;
		this.life = l;
		this.onstage = true;
		this.haveBody = false;
		this.haveHead = true;
		
	}
	public int checklife(){
			System.out.println(this.life);	
			return this.life;
	}
	
	public boolean isAlive(){
		if( this.life > 0){
		return true;
		}
		else{
			return false;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public void setOnstage(boolean op){
		onstage = op;
	}
	
	public void getOnstage(){
		
	}
	
	public void attack(){
		this.life -= 1;
		System.out.println("Yehhh, ouch");
		System.out.println(this.life);		
	}
	
	
	
	
}
