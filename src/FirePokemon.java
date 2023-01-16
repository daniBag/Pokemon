import java.util.Random;

public abstract class FirePokemon extends Pokemon{
    public FirePokemon(int lifePoints, int attackPoints){
        super(lifePoints,attackPoints);
    }
    public void fireAdditionalEffect(){
        Random random = new Random();
        int randomPercent = random.nextInt(Constants.PERCENTAGE_MIN_RANDOM, Constants.PERCENTAGE_MAX_RANDOM);
        int randomLoseOfLifePoints = random.nextInt(Constants.FIRE_EFFECT_MIN_DAMAGE, Constants.FIRE_EFFECT_MAX_DAMAGE);
        if (randomPercent <= Constants.FIRE_EFFECT_CHANCE){
           this.takeDamage(randomLoseOfLifePoints);
        }
    }

}
