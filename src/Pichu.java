public class Pichu extends ElectricPokemon implements Evolution{
    protected Pichu(int lifePoints, int maxHp, int maxAp, AttackMove attackMove) {
        super(lifePoints, maxHp, maxAp, attackMove);
    }

    @Override
    public Pokemon evolve() {
        return null;
    }
}
