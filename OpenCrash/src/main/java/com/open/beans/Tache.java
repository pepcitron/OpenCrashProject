package com.open.beans;

/**
 * Objet Tâche
 * Created by Lbremand on 22/01/14.
 */
public class Tache {

    /**
     * Description de la tâche
     */
    private String _description;

    /**
     * Gettter de description
     * @return the description
     */
    public String getDescription() {
        return _description;
    }

    /**
     * Setter de description
     * @param pDescription la description
     */
    public void setDescription(String pDescription) {
        this._description = pDescription;
    }
}
