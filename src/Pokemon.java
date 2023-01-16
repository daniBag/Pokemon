public abstract class Pokemon {
    private int lifePoints;
    private int attackPoints;
    private int level;
    private double attackModifier;

    public Pokemon(int lifePoints, int attackPoints){
        this.lifePoints = lifePoints;
        this.attackPoints = ((3 * attackPoints)/ 4);
        this.level = Constants.INITIALIZING_LEVEL;
        this.attackModifier = 1.0;
    }
    public void kickAttack(Pokemon other){
        other.takeDamage(Constants.KICK_ATTACK_DAMAGE);
    }
    protected int getLifePoints() {
        return lifePoints;
    }
    protected void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
    protected void takeDamage(int damage){
        this.lifePoints -= damage;
    }
    protected boolean isAlive(){
        return this.lifePoints <= 0;
    }
    protected abstract void addHp (int hp);
    protected abstract void addAp (int ap);
    protected void changeAttackModifier(double attackModifier){
        this.attackModifier = attackModifier;
    }
}

