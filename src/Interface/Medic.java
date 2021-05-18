package Interface;

public class Medic extends Hero{

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Medic use to " + superAbilityType;
    }
}
