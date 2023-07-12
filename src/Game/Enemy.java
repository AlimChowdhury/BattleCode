package Game;

abstract class Enemy
{
    int health;
    int attackPower;

    Enemy(int health, int attackPower)
    {
        this.health= health;
        this.attackPower= attackPower;
    }

    abstract void show();

}

