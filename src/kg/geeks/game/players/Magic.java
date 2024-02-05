package kg.geeks.game.players;

public class Magic extends Hero {

    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int healthIncrease = 5;
        for (Hero hero:heroes){
            hero.setDamage(hero.getDamage() + healthIncrease);
        }
        System.out.println("Magic increased damages");
    }
}
