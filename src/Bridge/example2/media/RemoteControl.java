package Bridge.example2.media;

public abstract class RemoteControl {

	TV tvImplementor;
	
	public RemoteControl(TV tvImplementor) {
	   this.tvImplementor = tvImplementor;
	}
	
	public void on()
	{
	tvImplementor.on();

	}
	
	public void off()
	{
	tvImplementor.off();
	}
	
	public void setVolume(int volume)
	{
	tvImplementor.volume(volume);
	}
	
	
}
