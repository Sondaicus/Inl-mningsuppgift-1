/*Detta är den klass som används i huvudprogrammet för att beräkna hur mycket djuren skall matas. Det är den klassen
som använder programets implement, och funkar just nu enbart för DeFem som klassen "HämtaDeFem".*/
public class MataDjuren implements Handlingar
{
	/*private static double djuretsVikt;
	private static GästerGrundläggandeArter.Arter art;
	private static double mängdMat;    //gram*/
	


	public static double getFoderMängd(HotelGäster x)
	{
		double djuretsVikt = x.getVikt();
		GästerGrundläggandeArter.Arter art = x.getArt();
		double mängdMat;

		switch(art)
		{
			case Hund:
			{
				mängdMat = djuretsVikt / 0.10;
				break;
			}

			case Katt:
			{
				mängdMat = djuretsVikt / 0.15;
				break;
			}

			case Orm:
			{
				mängdMat = 20;
				break;
			}

			default:
				mängdMat = 0;
		}

		return mängdMat;

	}
	
}