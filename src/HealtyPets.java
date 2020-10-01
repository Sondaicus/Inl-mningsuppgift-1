import static javax.swing.JOptionPane.*;    /*Statisk import*/


/*Den klassen som kör programmet enligt dess ursprungliga instruktioner. Den anropas i main för att utföra dessa
intruktioner, anledningen till att detta inte skrivs i main är för att man skall kunna mixtra i main för att utveckla
 programmet ytterligare och skapa instansvariabler om man vill senare (ifalll jag bygger vidare på programmet).*/
public class HealtyPets
{
	public static void körProgrammet()
	{
		HotelGäster gäst;
		String slutMeddelande, namn, art, vikt, individ;
		double matmängd;
		boolean avbrytare;
		boolean fortsättare = false;
		int val;
		
		
		while(true)
		{
			while(true)
			{
				namn = showInputDialog(
				
				null ,
				
				"Vilket djur ska få mat?" + "\n" + "(Namn att välja mellan just nu: Sixten, Dogge , Venus, Ove, Hypno.)" ,
				
				"Välj djur som skall matas." ,
				
				QUESTION_MESSAGE);
				
				
				try
				{
					avbrytare = namn.equals(null);
				}
				catch(NullPointerException x)
				{
					showMessageDialog(
					
					null ,
					
					"Du har inte valt att fortsätta med programmet, programmet stängs nu ner." ,
					
					"Avbrytning av programmet" ,
					
					ERROR_MESSAGE
					
					);
					
					System.exit(0);
				}
				
				
				if(namn.equals("Sixten"))
				{
					gäst = new Hund(5, namn);
					fortsättare = true;
				}

				else if(namn.equals("Dogge"))
				{
					gäst = new Hund(10, namn);
					fortsättare = true;
				}
				
				else if(namn.equals("Venus"))
				{
					gäst = new Katt(5, namn);
					fortsättare = true;
				}
				
				else if(namn.equals("Ove"))
				{
					gäst = new Katt(3, namn);
					fortsättare = true;
				}
				
				else if(namn.equals("Hypno"))
				{
					gäst = new Orm(1 ,namn);
					fortsättare = true;
				}
				
				else
				{
					gäst = null;
					
					
					val = showConfirmDialog(
					
					null ,
					
					"Du har inte matat in ett godkänt namn för att programmet skall fungera korrekt. Vill du försöka " + "igen?" ,
					
					"Fortsätta?" ,
					
					YES_NO_OPTION ,
					
					WARNING_MESSAGE);
					
					if(val == 1)
					{
						showMessageDialog(
						
						null ,
						
						"Programmet avslutas." ,
						
						"Hej då!" ,
						
						INFORMATION_MESSAGE);
						
						System.exit(0);
					}
					
					else if(val == -1)
					{
						showMessageDialog(
						
						null ,
						
						"Du har inte valt att fortsätta med programmet, programmet stängs nu ner." ,
						
						"Avbrytning av programmet" ,
						
						ERROR_MESSAGE
						
						);
						
						System.exit(0);
					}
					
				}
				
				if(fortsättare)
				{
					break;
				}
				
			}
			
			
			matmängd = MataDjuren.getFoderMängd(gäst);
			
			art = String.valueOf(gäst.getArt());
			vikt = String.valueOf(gäst.getVikt());
			individ = String.valueOf(gäst.getIndivid());
			
			slutMeddelande = art + "en " + individ + " skall äta " + matmängd + " gram " + art.toLowerCase() + "foder."
			                 + "\n" + "Vill du köra programmet igen?";
			
			
			val = showConfirmDialog(
			
			null ,
			
			slutMeddelande ,
			
			"Fortsätta?" ,
			
			YES_NO_OPTION ,
			
			QUESTION_MESSAGE
			
			);
			
			
			if(val == 1)
			{
				showMessageDialog(
				
				null ,
				
				"Programmet avslutas." ,
				
				"Hej då!" ,
				
				INFORMATION_MESSAGE);


				break;
			}
			
			else if(val == -1)
			{
				showMessageDialog(
				
				null ,
				
				"Du har inte valt att fortsätta med programmet, programmet stängs nu ner." ,
				
				"Avbrytning av programmet" ,
				
				ERROR_MESSAGE
				
				);
				
				
				break;
			}
			
		}
		
	}
	
}