public class Moltres extends Pokemon implements Evolution{
    public Moltres(AttackMove attackMove){
        super(Constants.MOLTRES_MAX_HP,Constants.MOLTRES_MAX_AP,attackMove);

    }

    protected int getMaxHP(){
        int max = Constants.INVALID;
        max = Constants.MOLTRES_MAX_HP;
        return max;
    }
    protected void addAp(int ap) {

    }
    public Pokemon evolve() {
        return null;
    }
}

