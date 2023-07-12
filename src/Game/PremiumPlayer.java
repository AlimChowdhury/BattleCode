package Game;

class PremiumPlayer extends Player
{
    @Override
    void defeatingEnemy() {
        double improvedPlayerRank;

        experiencePoint = experiencePoint + 120;
        improvedPlayerRank = Math.round( experiencePoint/(100*(playerRank+1)));
        if(improvedPlayerRank>playerRank)
        {
            health = health + 0.1 * health * 1.2;
            attackPower = attackPower + 0.05 * attackPower * 1.15;
            playerRank = improvedPlayerRank;
        }


    }

    @Override
    void show() {
        System.out.println("Premium Player");
        System.out.println("After defeating enemy");
        System.out.println("Health : " + String.format("%.2f", health) + " || AttackPower : " + String.format("%.2f", attackPower) + " || Experience : " + experiencePoint + " || PlayerRank :" + playerRank);
    }
}

