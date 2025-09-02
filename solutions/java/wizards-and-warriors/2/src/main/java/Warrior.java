class Warrior extends Fighter{
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int damage_points = 0;
        switch (fighter.getClass().getSimpleName()) {
            case  "Warrior" -> damage_points = 6;
            case   "Wizard" -> damage_points = fighter.isVulnerable()?10:6;
            default -> throw new AssertionError();
        }
        return damage_points;
    }

    

    
}