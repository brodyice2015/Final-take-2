
public class Pokemon 
{
	private String name; 
	private int health;
	private String attack1Name;
	private int attack1Damage;
	private String attack2Name;
	private int attack2Damage;
	private String attack3Name;
	private int attack3Damage;
	private String attack4Name;
	private int attack4Damage;
	
	public Pokemon(int h, String n, String a, int b, String c, int d, String e, int f, String g, int i )
	{
	health = h;
	name = n;
	attack1Name = a;
	attack1Damage = b;
	attack2Name = c;
	attack2Damage = d;
	attack3Name = e;
	attack3Damage = f;
	attack4Name = g;
	attack4Damage = i;
	}

	public  String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getAttack1Name() {
		return attack1Name;
	}

	public void setAttack1Name(String attack1Name) {
		this.attack1Name = attack1Name;
	}

	public int getAttack1Damage() {
		return attack1Damage;
	}

	public void setAttack1Damage(int attack1Damage) {
		this.attack1Damage = attack1Damage;
	}

	public String getAttack2Name() {
		return attack2Name;
	}

	public void setAttack2Name(String attack2Name) {
		this.attack2Name = attack2Name;
	}

	public int getAttack2Damage() {
		return attack2Damage;
	}

	public void setAttack2Damage(int attack2Damage) {
		this.attack2Damage = attack2Damage;
	}

	public String getAttack3Name() {
		return attack3Name;
	}

	public void setAttack3Name(String attack3Name) {
		this.attack3Name = attack3Name;
	}

	public int getAttack3Damage() {
		return attack3Damage;
	}

	public void setAttack3Damage(int attack3Damage) {
		this.attack3Damage = attack3Damage;
	}

	public String getAttack4Name() {
		return attack4Name;
	}

	public void setAttack4Name(String attack4Name) {
		this.attack4Name = attack4Name;
	}

	public int getAttack4Damage() {
		return attack4Damage;
	}

	public void setAttack4Damage(int attack4Damage) {
		this.attack4Damage = attack4Damage;
	}

}
