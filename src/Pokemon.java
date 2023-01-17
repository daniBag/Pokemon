public abstract class Pokemon {
    private int lifePoints;
    private int attackPoints;
    private int level;
    private int maxHp;
    private int maxAp;
    private String pokemonType;
    private AttackMove[] attackMoves;
    private double attackModifier;
//TODO
    public Pokemon(int lifePoints, int maxHp, int maxAp, String pokemonType, AttackMove attackMove){
        this.lifePoints = lifePoints;
        this.maxHp = maxHp;
        this.maxAp = maxAp;
        this.attackPoints = ((3 * this.maxAp)/ 4);
        this.pokemonType = pokemonType;
        this.level = Constants.INITIALIZING_LEVEL;
        this.attackModifier = 1.0;
        this.attackMoves = new AttackMove[] {Constants.KICK, attackMove};
    }
    protected int getLifePoints() {
        return this.lifePoints;
    }
    protected int getAttackPoints(){
        return this.attackPoints;
    }
    protected int getMaxHP(){
        return this.maxHp;
    }
    protected int getMaxAP(){
        return this.maxAp;
    }

    protected void addHp(int hp) {
        int max = this.getMaxHP();
        int current = this.getLifePoints();
        if (current < max) {
            if (this.getLifePoints() + hp > max) {
                hp = max - current;
            }
            this.lifePoints += hp;
        }
    }
    protected void takeDamage(int damage){
        this.lifePoints -= damage;
    }
    protected boolean isAlive(){
        return this.lifePoints <= 0;
    }
    protected void addAp(int attackPoints) {
        int max = this.getMaxAP();
        int current = this.getAttackPoints();
        if (current < max) {
            if (this.getAttackPoints() + attackPoints > max) {
                attackPoints = max - current;
            }
            this.lifePoints += attackPoints;
        }
    }
    protected void changeAttackModifier(double attackModifier){
        this.attackModifier = attackModifier;
    }
    protected int getLevel(){
        return this.level;
    }
    protected abstract void typeEffect();
    protected abstract boolean typeSpecialty();
}

