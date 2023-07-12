package Game;

abstract class Player
{
    double health;
    double attackPower;
    int experiencePoint;
    double playerRank;


    Player()
    {
        health = 100;
        attackPower =30;
        experiencePoint = 0;
        playerRank = 0;

    }
    Player(double health,double attackPower,int experiencePoint, double playerRank )
    {
        this.health = health;
        this.attackPower =attackPower;
        this.experiencePoint = experiencePoint;
        this.playerRank = playerRank;

    }

    abstract void defeatingEnemy();
    abstract void show();
}