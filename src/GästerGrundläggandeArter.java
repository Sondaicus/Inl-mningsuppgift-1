/*Deta är enumer som ingår i en klass. Detta är för att deras namn skall kunna navändas som refrensvaraibler typer,
vilket smatidigt betyder att konstanterna ej kan innehålla några egna ärden.*/
public class GästerGrundläggandeArter extends HotelGäster
{
	public enum Arter
	{
		Hund, Katt, Orm;
	}
}
