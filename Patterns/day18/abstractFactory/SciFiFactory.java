package day18.abstractFactory;

public class SciFiFactory implements GameAssetFactory {
    @Override
    public Character createCharacter() {
        return new SciFiCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new SciFiWeapon();
    }
}
