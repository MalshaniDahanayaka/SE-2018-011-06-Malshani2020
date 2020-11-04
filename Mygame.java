public Class MyGame {


   public static void main(String[] args){


   Warrior warrior1 = new Warrior("warrior 1", 20);
   Warrior warrior2 = new Warrior("warrior 2", 25);

   Monster monster = new monster("monster", 38);

   warrior1.age = monster.age;

   warrior1.walking();
   warrior2.walking();
   monster.Trying();

   warrior1.checkwalking();
   warrior2.checkwalking();
   

   monster.stealTheStick();

  

   warrior1.checkwalking();
   warrior2.checkwalking();



           }
}