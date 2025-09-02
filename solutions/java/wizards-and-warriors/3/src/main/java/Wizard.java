class Wizard extends Fighter{

    boolean spellStatus = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell(){
        this.spellStatus = true;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int damage_points = this.spellStatus?12:3;
        return damage_points;
    }

    
    
}
