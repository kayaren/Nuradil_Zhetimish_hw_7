public class Main {
    public static void main(String[] args) {

        HavingSuperAbility[] superPower = {new Magic(), new Warrior(), new Medic()};
        for (int i = 0; i < superPower.length; i++) {
            superPower[i].applySuperAbility();

        }


    }
}