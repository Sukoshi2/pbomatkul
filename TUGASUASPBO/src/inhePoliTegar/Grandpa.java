/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
class Grandpa{
    String FamilyName = "Harrington";
    String Name = "John";
            
    void Intro(){
        System.out.print("Hello, my name is " + this.Name + this.FamilyName);
    }
}

class Dad extends Grandpa{
    String Name = "Thomas";
    
    @Override
    void Intro(){
        System.out.print("Hello, my name is " + this.Name + super.FamilyName);
        System.out.print("I'm " + super.Name + "'s Son");
    }
}

class Uncle extends Grandpa{
    String Name = "Marco";
    
    @Override
    void Intro(){
        System.out.print("Hello, my name is " + this.Name + super.FamilyName);
        System.out.print("I'm " + super.Name + "'s Son");
    }
}

class Son extends Dad{
    String Name = "Lewis";
    
    @Override
    void Intro(){
        System.out.print("Hello, my name is " + this.Name + super.FamilyName);
        System.out.print("I'm " + super.Name + "'s Son");
    }
}

class OverloadingClass{
    int add(int x, int y){
        return x+y;
    }
    int add(int x, int y, int z){
        return x+y+z;
    }
    double add(double x, double y){
        return x+y;
    }
}
