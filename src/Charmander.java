public class Charmander extends FirePokemon implements Evolution{

    public Charmander(AttackMove attackMove) {
        super(Constants.CHARMANDER_MAX_HP, Constants.CHARMANDER_MAX_AP, attackMove);
    }


    /*public String kickAttack() {
        return null;
    }*/

    protected int getMaxHP(){
        int max = Constants.INVALID;
        switch (this.getLevel()){
            case Constants.EVOLUTION_CHARMANDER_LEVEL -> max = Constants.CHARMANDER_MAX_HP;
            case Constants.EVOLUTION_CHARMELEON_LEVEL -> max = Constants.CHARMELEON_MAX_HP;
            case Constants.EVOLUTION_CHARIZARD_LEVEL -> max = Constants.CHARIZARD_MAX_HP;
        }
        return max;
    }

    @Override
    protected void addAp(int ap) {

    }

    @Override
    public Pokemon evolve() {
        return null;
    }
}
