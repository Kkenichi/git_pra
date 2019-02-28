package rpg;

public class Hero {
	private String name;
	private int hp;
	private int level;

	private static final int FIRST_HP = 100;
	private static final int SLEP_HP = 1;
	private static final int FIRST_LEVEL = 1;

	Hero() {
		this.name = "アルス";
		this.hp = FIRST_HP;
		this.level = FIRST_LEVEL;
	}
	void sleep(){
		this.hp = FIRST_HP;
		System.out.println(this.name + "は眠って回復した");
	}
	void slep() {
		this.hp = SLEP_HP;
		System.out.println(this.name + "は転んでHPが" + this.hp + "となった");
	}
	void show() {
		System.out.println("勇者" + this.name + "現在のレベル" + this.level + "現在のHP" + this.hp);
	}
	void attack() {
		this.hp = 50;
	}
	public String nameGet() {
		return this.name;
	}
	public int hpGet() {
		return this.hp;
	}
}
