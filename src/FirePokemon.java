import java.util.Random;

public abstract class FirePokemon extends Pokemon{
    public FirePokemon(int lifePoints, int attackPoints, AttackMove attackMove){
        super(lifePoints, attackPoints, attackMove);
    }
    public void fireAdditionalEffect(){
        Random random = new Random();
        int randomPercent = random.nextInt(Constants.PERCENTAGE_MIN_RANDOM, Constants.PERCENTAGE_MAX_RANDOM);
        int randomLoseOfLifePoints = random.nextInt(Constants.FIRE_EFFECT_MIN_DAMAGE, Constants.FIRE_EFFECT_MAX_DAMAGE);
        if (randomPercent <= Constants.FIRE_EFFECT_CHANCE){
           this.takeDamage(randomLoseOfLifePoints);
        }
    }
    public int specialFireAttack(){
        AttackMove[] attackMoves = this.getAttackMoves();
        Random random = new Random();
        int firstAttack = random.nextInt(attackMoves.length);
        int secondAttack = random.nextInt(attackMoves.length);
        int damage = attackMoves[firstAttack].preformAttack(this.getAttackModifier());
        damage += attackMoves[secondAttack].preformAttack(this.getAttackModifier());
        return damage;
    }


}
