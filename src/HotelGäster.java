/*Detta är en abstrakt klass som det är tanken att den skall kunna innefatta alla typer av hotelgäster man kan tänka
sig. Själva huvudklassen är abstrakt för att det ej skall bildas objekt av denna, utan den är enbart utformad för att
 olika typer av hotelgäster skall kunna ingå i samma klass med samma grundläggande variabler.*/

public class HotelGäster
{
	public GästerGrundläggandeArter.Arter art;
	public double vikt;     //kg
	public String individ;     //Namn





	protected HotelGäster(double vikt, String individ)
	{
		this.vikt = vikt;
		this.individ = individ;
	}





	public void setVärde(double vikt , String individ)
	{
		this.vikt = vikt;
		this. individ = individ;

	}

	/*Dessaär alla konstruktorar för huvudklassen HotelGäster. Än så länge i programets stadium har de inte någon som
	helst funkltion att uppfylla.*/
		public HotelGäster()
		{}
		
		protected HotelGäster(GästerGrundläggandeArter.Arter art, double vikt, String individ)
		{
			this.art = art;
			this.vikt = vikt;
			this.individ = individ;
		}
		
		protected HotelGäster(GästerGrundläggandeArter.Arter art, double vikt)
		{
			this.art = art;
			this.vikt = vikt;
		}
		
		protected HotelGäster(GästerGrundläggandeArter.Arter art, String individ)
		{
			this.art = art;
			this.individ = individ;
		}
		

		
		protected HotelGäster(GästerGrundläggandeArter.Arter art)
		{
			this.art = art;
		}
		
		protected HotelGäster(double vikt)
		{
			this.vikt = vikt;
		}
		
		public HotelGäster(String individ)
		{
			this.individ = individ;
		}








		public void setVikt(double vikt)
		{
			this.vikt = vikt;
		}

		public void setIndivid(String individ)
		{
			this.individ = individ;
		}

		public void setArt(GästerGrundläggandeArter.Arter art)
		{
			this.art = art;
		}














	public double getVikt()
	{
		return vikt;
	}

	public String getIndivid()
	{
		return individ;
	}

	public GästerGrundläggandeArter.Arter getArt()
	{
		return art;
	}
}
