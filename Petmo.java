public class Petmo
{
	private String type="";
	private String pangalan="";
	private String ingay="";
	private String kasarian="";
	private int edad=0;


	public Petmo(String t){
		setType(t);
	}


//setters here

	public void setType(String t)
	{
		this.type=t;
		if (t=="dog"){
			this.ingay="arf!";
			this.pangalan="Boy Askal";
			this.kasarian="Male";
			
		}
		else if(t=="cat"){
			this.ingay="myow!";
			this.pangalan="Girl Pusakal";
			this.kasarian="Female";
			
		}
		else{
			this.ingay="not in the house";
			this.pangalan="none here.";
			this.kasarian="none here.";
			
		}
	}
	public void setPangalan(String p){
		this.pangalan=p;
	}
	public void setIngay(String i){
		this.ingay=i;
	}
	public void setKasarian(String k){
		this.kasarian=k;
	}
	public void setEdad(int e){
		this.edad=e;
	}


//getters here

	public String getType(){

		return this.type;
	}
	public String getIngay(){
		return this.ingay;
	}
	public String getPangalan(){
		return this.pangalan;
	}
	public String getKasarian(){
		return this.kasarian;
	}
	public int getEdad(){

		return this.edad;
	}
	

//-------methoods

	public void makeNoise(){
		System.out.print('\n' + this.ingay + '\n');
	}
	public void tellName(){
		System.out.print('\n' + this.pangalan + '\n');
	}
	public void tellGender(){
		System.out.print('\n' +  "It's " + this.kasarian + '\n');
	}
	public void tellAge(){
		for (int i=0;i<this.edad ; i++) {
			makeNoise();
		}
	}
} 
