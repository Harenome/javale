import java.lang.Object;
import java.util.Arrays;
import java.util.Vector;

public class Gestion
{
    public static void main(String[] args)
    {
        Charger c = new Charger("sale");
        Vector<Recette> rr = c.getRecettes();
        rr.add(new Recette("lolilol", "sale", "Viandes", "ah", 3));
        Recette[] r = rr.toArray(new Recette[0]);
        // Recette[] r = c.getRecettes().toArray(new Recette[0]);
        // for (int i = 0; i < r.length; i++)
            // System.out.println(r[i].toString());
        Sauvegarder s = new Sauvegarder("sale");
        s.sauvegarderRecettes(r);
        // String[] livres = Charger.indexLivres().toArray(new String[0]);
        // for (int i = 0; i < livres.length; i++)
        //     System.out.println(livres[i]);
    }
}
