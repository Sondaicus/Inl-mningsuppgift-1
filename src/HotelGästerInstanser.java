/*Detta är den underklassen till HotelGäster som har möjligheten att innehålla instansvariabler. Än så länge i
programets stadium så invänds inga sådana, men detta är grunden för att de senare skall kunna skapas.*/
class HotelGästerInstanser extends HotelGäster
{
	
	HotelGästerInstanser()
	{}
	
	HotelGästerInstanser(GästerGrundläggandeArter.Arter art, double vikt, String individ)
	{
		super(art, vikt, individ);
	}
	
	
	HotelGästerInstanser(GästerGrundläggandeArter.Arter art, double vikt)
	{
		super(art, vikt);
	}
	
	HotelGästerInstanser(GästerGrundläggandeArter.Arter art, String individ)
	{
		super(art, individ);
	}
	
	HotelGästerInstanser(double vikt, String individ)
	{
		super(vikt, individ);
	}
	
	
	HotelGästerInstanser(GästerGrundläggandeArter.Arter art)
	{
		super(art);
	}
	
	HotelGästerInstanser(double vikt)
	{
		super(vikt);
	}
	
	HotelGästerInstanser(String individ)
	{
		super(individ);
	}
}
