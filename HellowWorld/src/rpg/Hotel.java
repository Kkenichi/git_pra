package rpg;

public class Hotel {

	void hotelIn() {
		Hero hero = new Hero();
		System.out.println(hero.nameGet()+"は宿に泊まりHPが"+hero.hpGet()+"に回復した");
	}


}
