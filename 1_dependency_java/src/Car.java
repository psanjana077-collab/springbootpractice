
class Car {
    iengine e;
    public Car(iengine eng)
    {
    	this.e=eng;
    }
	public void drive()
	{
		e.start();
		System.out.println("Car is started");
	}
}
