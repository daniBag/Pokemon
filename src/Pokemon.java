public abstract class Pokemon {
    private int lifePoints;
    private int attackPoints;
    private int level;
    private AttackMove[] attackMoves;
    private double attackModifier;

    public Pokemon(int lifePoints, int attackPoints, AttackMove attackMove){
        this.lifePoints = lifePoints;
        this.attackPoints = ((3 * attackPoints)/ 4);
        this.level = Constants.INITIALIZING_LEVEL;
        this.attackModifier = 1.0;
        this.attackMoves = new AttackMove[] {Constants.KICK, attackMove};
    }
    protected int getLifePoints() {
        return lifePoints;
    }
    protected void addLifePoints(int lifePoints) {
        this.lifePoints += lifePoints;
    }
    protected abstract int getMaxHP();
    protected void addHp(int hp) {
        int max = this.getMaxHP();
        int current = this.getLifePoints();
        if (current < max) {
            if (this.getLifePoints() + hp <= max) {
                this.addLifePoints(hp);
            }else{
                hp = max - current;
                this.addLifePoints(hp);
            }
        }
    }
    protected void takeDamage(int damage){
        this.lifePoints -= damage;
    }
    protected boolean isAlive(){
        return this.lifePoints <= 0;
    }
    protected abstract void addAp (int ap);
    protected void changeAttackModifier(double attackModifier){
        this.attackModifier = attackModifier;
    }
    protected int getLevel(){
        return this.level;
    }
}

