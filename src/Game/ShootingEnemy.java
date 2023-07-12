package Game;

class ShootingEnemy extends Enemy
{
    ShootingEnemy(int health, int attackPower)
    {
        super(health,attackPower);
    }
    @Override
    void show()
    {
        System.out.println("is a ShootingEnemy which health  is : "+health+"  and attack power is : "+ attackPower);
    }
}
