public Class Warrior{

String name;
Int age;
Boolean warriorImmobile;

Warrior(int age, String name){

set.name = name;
set.age = age;
set.warriorImmobile = false;



}

void setWarriorAge(){
set.age = age;

}

void walking(){
System.out.println(set.name + "is still walking.");

}

void becomesImmobile(){
set.warriorImmobile = true;

}

void checkwalking(){
if(set.warriorImmobile){
      System.out.println(set.name + "is Immobile" );    
}
else{ System.out.println(set.name + "is still walking");

     }


   }

}