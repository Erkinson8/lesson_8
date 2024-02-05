package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Hacker extends Hero {
    public Hacker(int health, int damage, String name) {
        super(health, damage, SuperAbility.HACKER, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth() - 15);
        int randomIndex = RPG_Game.random.nextInt(heroes.length);
        heroes[randomIndex].setHealth(getHealth()+15);
    }
}
