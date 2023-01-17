public class Salandit extends FirePokemon implements Evolution {
    public Salandit(AttackMove attackMove){
        super(Constants.SALANDIT_MAX_HP,Constants.SALANDIT_MAX_AP,attackMove);

    }

    protected int getMaxHP(){
        int max = Constants.INVALID;
        switch (this.getLevel()){
            case Constants.EVOLUTION_SALANDIT_LEVEL-> max = Constants.SALANDIT_MAX_HP;
            case Constants.EVOLUTION_SALAZZLE_LEVEL -> max = Constants.SALAZZLE_MAX_HP;
        }
        return max;
    }
    protected void addAp(int ap) {

    }
    public Pokemon evolve() {
        return null;
    }
}

