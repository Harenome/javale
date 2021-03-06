import java.lang.Comparable;
import java.lang.Exception;
import java.lang.Object;
import java.util.Date;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Vector;

/**
 * @class Recette
 * @brief Classe de gestion des recettes.
 */
public class Recette implements Comparable<Recette>
{
    /**
     * Nom de la recette.
     *
     * @see Recette#getNom()
     */
    private String nom;

    /**
     * Nom du livre.
     *
     * @see Recette#getLivre()
     */
    private String livre;

    /**
     * Numéro de la page dans le livre.
     *
     * @see Recette#getPage()
     */
    private int page = -1;

    /**
     * Lien de la recette.
     *
     * @see Recette#getLien()
     */
    private URL lien;

    /**
     * Catégorie de la recette.
     *
     * @see Recette#getCategorie()
     */
    private String categorie;

    /**
     * Catégorie de la recette.
     *
     * @see Recette#getCategorie()
     */
    private String sousCategorie;

    /**
     * Commentaire de la recette.
     * 
     * @see Recette#getCommentaire()
     */
    private String commentaire;

    /**
     * Note donnée à la recette.
     * 
     * @see Recette#getNote()
     */
    private int note;

    /**
     * Date de préparation de la recette.
     * 
     * @see Recette#getDate()
     */
    private Date date;

    /**
     * Préparation de la recette.
     * 
     * @see Recette#getTexte()
     */
    private String texte;

    public Recette()
    {
    }

    public Recette(String nom)
    {
        this();
        this.nom = new String(nom);
    }
    /**
     * Constructeur d'une recette.
     * 
     * @param nom
     *      Nom de la recette.
     * @param categorie
     *      Catégorie de la recette.
     * @param sousCategorie
     *      Sous-catégorie de la recette.
     */
    public Recette(String nom, String categorie, String sousCategorie)
    {
        this(nom);
        this.categorie = new String(categorie);
        this.sousCategorie = new String(sousCategorie);
    }

    /**
     * Constructeur d'une recette.
     * 
     * @param nom
     *      Nom de la recette.
     * @param categorie
     *      Catégorie de la recette.
     * @param sousCategorie
     *      Sous-catégorie de la recette.
     * @param lien
     *      Lien de la recette.
     */
    public Recette(String nom, String categorie, String sousCategorie, String lien)
    {
        this(nom, categorie, sousCategorie);
        try
        {
            this.lien = new URL(lien);
        }
        catch (MalformedURLException mue)
        {
            System.err.println(mue.getMessage());
        }
    }

    /**
     * Constructeur d'une recette.
     * 
     * @param nom
     *      Nom de la recette.
     * @param categorie
     *      Catégorie de la recette.
     * @param sousCategorie
     *      Sous-catégorie de la recette.
     * @param livre
     *      Livre de la recette.
     * @param page
     *      Page dans le livre de la recette.
     */
    public Recette(String nom, String categorie, String sousCategorie, String livre, int page)
    {
        this(nom, categorie, sousCategorie);
        this.livre = new String(livre);
        this.page = page;
    }

    /**
     * Constructeur d'une recette.
     * 
     * @param nom
     *      Nom de la recette.
     * @param categorie
     *      Catégorie de la recette.
     * @param sousCategorie
     *      Sous-catégorie de la recette.
     * @param livre
     *      Livre de la recette.
     * @param page
     *      Page dans le livre de la recette.
     * @param lien
     *      Lien de la recette.
     */
    public Recette(String nom, String categorie, String sousCategorie, String livre, int page, String lien)
    {
        this(nom, categorie, sousCategorie, lien);
        this.livre = new String(livre);
        this.page = page;
    }

    /**
     * Sélecteur d'un nom.
     * 
     * @return nom
     */
    public String getNom()
    {
        return this.nom;
    }

    /**
     * Sélecteur d'un livre.
     * 
     * @return livre
     */
    public String getLivre()
    {
        return this.livre;
    }

    /**
     * Sélecteur d'une page.
     * 
     * @return page
     */
    public int getPage()
    {
        return this.page;
    }

    /**
     * Sélecteur d'un lien.
     * 
     * @return lien
     */
    public URL getLien()
    {
        return this.lien;
    }

    /**
     * Sélecteur d'une catégorie.
     * 
     * @return categorie
     */
    public String getCategorie()
    {
        return this.categorie;
    }

    /**
     * Sélecteur d'un sous-catégorie.
     * 
     * @return sousCategorie
     */
    public String getSousCategorie()
    {
        return this.sousCategorie;
    }

    /**
     * Sélecteur d'un commentaire.
     * 
     * @return commentaire
     */
    public String getCommentaire()
    {
        return this.commentaire;
    }

    /**
     * Sélecteur d'une date.
     * 
     * @return date
     */
    public Date getDate()
    {
        return this.date;
    }

    /**
     * Sélecteur d'une note.
     * 
     * @return note
     */
    public int getNote()
    {
        return this.note;
    }

    /**
     * Sélecteur d'un texte de préparation.
     * 
     * @return texte
     */
    public String getTexte()
    {
        return this.texte;
    }

    public void setCategorie(String categorie)
    {
        this.categorie = new String(categorie);
    }

    public void setSousCategorie(String sousCategorie)
    {
        this.sousCategorie = new String(sousCategorie);
    }
    /**
     * Modificateur du livre.
     * 
     * @param livre
     *      Nouveau livre de la recette.
     */
    public void setLivre(String livre)
    {
        this.livre = new String(livre);
    }

    /**
     * Modificateur de la page.
     * 
     * @param page
     *      Nouvelle page du livre de la recette.
     */
    public void setPage(int page)
    {
        this.page = page;
    }

    /**
     * Modificateur de la note.
     * 
     * @param note
     *      Nouvelle de la recette.
     * @throws Exception
     *      Note comprise entre 0 et 10
     */
    public void setNote(int note) throws Exception
    {
        if (note < 0 || note > 10)
            throw new Exception("Note non valide (0 <= n <= 10).");
        this.note = note;
    }

    /**
     * Modificateur de l'Url.
     * 
     * @param lien
     *      Nouvel url de la recette.
     */
    public void setLien(String lien)
    {
        try
        {
            this.lien = new URL(lien);
        }
        catch (MalformedURLException mue)
        {
            System.err.println(mue.getMessage());
        }
    }

    /**
     * Modificateur du commentaire.
     * 
     * @param commentaire
     *      Nouveau commentaire de la recette.
     */
    public void setCommentaire(String commentaire)
    {
        this.commentaire = new String(commentaire);
    }

    /**
     * Modificateur de la date.
     * 
     * @param date
     *      Nouvelle date de préparation de la recette.
     */
    public void setDate(Date date)
    {
        this.date = new Date(date.getTime());
    }

    /**
     * Modificateur du texte de préparation de la recette.
     * 
     * @param page
     *      Nouvelle page du livre de la recette.
     */
    public void setTexte(String texte)
    {
        this.texte = new String(texte);
    }

    /**
     * Chaîne de caractère de la recette.
     * 
     * @return le nom, le livre, la page, et le lien
     */
    public String toString()
    {
        StringBuffer sb = new StringBuffer(nom);

        if (this.livre != null)
            sb.append(", " + this.livre + ", " + this.page);
        if (this.lien != null)
            sb.append(", " + this.lien.toString());

        return sb.toString();
    }

	/**
	 * Compare deux recettes.
	 * 
	 * @param r
	 * 		Recette à comparer.
	 * @return si égale 0 sinon si inférieur <0 sinon >0.
	 */
    public int compareTo(Recette r)
    {
        return this.nom.compareTo(r.nom);
    }

}
