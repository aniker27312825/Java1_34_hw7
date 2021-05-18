package Interface;

public class Warrior extends Hero{

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Warrior use to " + superAbilityType;
    }
}

