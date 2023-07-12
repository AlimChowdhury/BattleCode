package Game;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Oops Game Started!");

        FlyingEnemy dragon = new FlyingEnemy(100,400);
        System.out.print("dragon ");
        dragon.show();

        ShootingEnemy wizard = new ShootingEnemy(300,200);
        System.out.print("wizard ");
        wizard.show();

        BasicPlayer alim = new BasicPlayer();
        alim.defeatingEnemy();
        alim.defeatingEnemy();
        //alim.show();
        alim.defeatingEnemy();
        alim.defeatingEnemy();
        alim.show();


        PremiumPlayer shahriar = new PremiumPlayer();
        shahriar.defeatingEnemy();
        shahriar.defeatingEnemy();
        // shahriar.show();
        shahriar.defeatingEnemy();
        shahriar.defeatingEnemy();
        shahriar.show();


    }
}