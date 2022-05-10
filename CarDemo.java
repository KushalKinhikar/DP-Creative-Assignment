/*----------Car class----------*/
abstract class Car
{
FuelRequirement fr;

Speed s;

public void wheels()
{
System.out.println("Its a Four Wheeler Car");
}

void qtyfuel()
{
fr.fuel();
}

void speedshow()
{
s.speed();
}

abstract void display();
}



/*----------Fuel Requirement----------*/
interface FuelRequirement
{
void fuel();
}
/*HighFuel*/
class HighFuel implements FuelRequirement
{
 public void fuel()
{
System.out.println("KMPL is very Low -> Below 8  !!!");
}
}



/*----------AverageFuelrequirement----------*/
class AverageFuel implements FuelRequirement
{
 public void fuel()
{
System.out.println("Decent Avereage -> 20-15 KMPL !!!");
}
}



/*----------Low Fuel Requirement----------*/
class LowFuel implements FuelRequirement
{
 public void fuel()
{
System.out.println("Best Fuel Driven -> above 20 KMPL !!!");
}
}



/*----------Speed----------*/
interface Speed
{
void speed();
}



/*----------High Speed----------*/
class HighSpeed implements Speed
{
 public void speed()
{
System.out.println("Very High Speed -> 200-280 KMPH!!!");
}
}



/*----------Average Speed----------*/
class AverageSpeed implements Speed
{
 public void speed()
{
System.out.println("Average Top Speed -> 120-150 KMPH!!!");
}
}



/*----------Slow Speed----------*/
class SlowSpeed implements Speed
{
 public void speed()
{
System.out.println("Start Shaking after 90KMPH !!!");
}
}



/*----------car Type 1----------*/
class Ferarri extends Car
{
public void display()
{
System.out.println("Its a Ferarri LaFerarri");
}

Ferarri()
{
fr=new HighFuel();
s=new HighSpeed();
}

}



/*----------car Type 2----------*/
class Suzuki extends Car
{
public void display()
{
System.out.println("Its a Suzuki Creta");
}

Suzuki()
{
fr=new AverageFuel();
s=new AverageSpeed();
}

}



/*----------car Type 3----------*/
class Maruti extends Car
{
public void display()
{
System.out.println("Its a Maruti Alto800");
}

Maruti()
{
fr=new LowFuel();
s=new SlowSpeed();
}

}



/*----------Demo Class----------*/
class CarDemo
{
public static void main(String args[])
{
Car c1,c2,c3;
c1=new Ferarri();
c1.display();
c1.wheels();
c1.qtyfuel();
c1.speedshow(); 
System.out.println("*-*-*-*-*-*");

c2=new Suzuki();
c2.display();
c2.wheels();
c2.qtyfuel();
c2.speedshow(); 
System.out.println("*-*-*-*-*-*");
c3=new Maruti();
c3.display();
c3.wheels();
c3.qtyfuel();
c3.speedshow(); 
System.out.println("*-*-*-*-*-*");

}
}