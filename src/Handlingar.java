/*Detta är ett interface(gränssnitt). Det används till att definera metoder i klasser. Ett interface kan själv inte
ha en definition av en metodkropp om den är abstract (vilket den är av default), utan kan enbart deklarera en metod och
dess returtyp. Klasser som sedan implementerar gränsssnittet har som krav att de innehåller gränssnittets definerade
metoder, med deras namn, parametrar, och returtyp. Hur själva metodkroppen skall vara utformad bestäms i klassen som
implementerar gränssnittet.*/
public interface Handlingar
{
	static double getFoderMängd(HotelGäster x) //gram
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
