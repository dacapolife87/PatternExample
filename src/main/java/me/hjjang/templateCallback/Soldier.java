package me.hjjang.templateCallback;

public class Soldier {
    void runContext(String weaponSound) {
        System.out.println("전투시작");

        executeWeapon(weaponSound).runStrategy();
        System.out.println("전투종료");
    }

    private Strategy executeWeapon(final String weaponSound) {
        return new Strategy() {
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };
    }
}
