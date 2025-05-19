package day18.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args){
        GameAssetFactory fantasyFactory = new FantasyFactory();
        Character fantasyCharacter = fantasyFactory.createCharacter();
        Weapon fantasyWeapon = fantasyFactory.createWeapon();

        fantasyCharacter.attack();
        fantasyWeapon.use();

        GameAssetFactory sciFiFactory = new SciFiFactory();
        Character sciFiCharacter = sciFiFactory.createCharacter();
        Weapon sciFiWeapon = sciFiFactory.createWeapon();

        sciFiCharacter.attack();
        sciFiWeapon.use();
    }
}
