package day18.abstractFactory;

public class FantasyFactory implements GameAssetFactory {
    @Override
    public Character createCharacter() {
        return new FantasyCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new FantasyWeapon();
    }
}

