public abstract class ElectricPokemon extends Pokemon{
    private int electricityCharge;

    protected ElectricPokemon(int lifePoints, int attackPoints, AttackMove attackMove) {
        super(lifePoints, attackPoints, attackMove);
        this.electricityCharge = 0;
    }
}
