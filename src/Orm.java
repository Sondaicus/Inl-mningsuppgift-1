public class Orm extends HotelGäster
{
    public static GästerGrundläggandeArter.Arter art = GästerGrundläggandeArter.Arter.Orm;


    Orm(double vikt, String individ)
    {
        super(art , vikt , individ);
    }
}
