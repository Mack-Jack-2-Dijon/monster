class AirMonster extends Monster {
    public AirMonster(String name, int attack) {
        super(name, attack, "air");
    }

    @Override

    public boolean attack(Monster opponent) {
        
        int damage = this.getAttack();
        if (opponent.getType().equals("water")) {
            damage *= 2; 
        }
        opponent.setLife(opponent.getLife() - damage);

        return opponent.isKO();
    }
    
}