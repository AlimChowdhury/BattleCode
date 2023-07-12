package Game;

class FlyingEnemy extends Enemy
{
    FlyingEnemy(int health, int attackPower)
    {
        super(health,attackPower);
    }
    @Override
    void show()
    {
        System.out.println("is a FlyingEnemy which health  is : "+health+"  and attack power is : "+ attackPower);
    }

}
