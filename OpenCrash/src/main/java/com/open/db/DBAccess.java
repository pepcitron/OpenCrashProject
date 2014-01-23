package com.open.db;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Classe utilitaire pour les relations à la base de données
 * Singleton
 * Created by Lbremand on 22/01/14.
 */
public class DBAccess {

    /**
     * DB object
     */
    private DB _db;

    /**
     * Constructor privé
     */
    private DBAccess(){
        createDB();
    }

    /**
     * Init.
     */
    private static DBAccess DBACCESS = new DBAccess();

    /**
     * Accès
     */
    public static DBAccess getDBACESS(){
        return DBACCESS;
    }

    /**
     * Init. la base de données
     * @return le DB object
     */

    public void createDB(){
        try {
            MongoClient mongoClient = new MongoClient( "10.0.2.2" , 27017 );//Adresse par défaut pour Android
            setDb(mongoClient.getDB("opencrash"));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    /**
     * Getter DB
     * @return DB
     */
    public DB getDb() {
        return _db;
    }

    /**
     * Setter DB
     * @param pDb DB
     */
    public void setDb(DB pDb) {
        this._db = pDb;
    }

    private void callDB(){
        //Accès base MongoDB
        (new Thread(new Runnable() {
            public void run(){
                List<DBObject> listeLigne = new ArrayList<DBObject>();
                listeLigne.add(new BasicDBObject("description", "Defect #0001"));
                listeLigne.add(new BasicDBObject("description", "Defect #0002"));
                listeLigne.add(new BasicDBObject("description", "Defect #0003"));

                BasicDBObject q = new BasicDBObject();
                q.put("description",  Pattern.compile("Defect.*"));
                System.out.println("MATCH : " + getDb().getCollection("activites").find(q).count());

                getDb().getCollection("activites").insert(listeLigne.toArray(new DBObject[listeLigne.size()]));

                System.out.println(getDb().getCollection("activites").find(q));
                System.out.println(getDb().getCollection("activites").find());
            }
        })).start();
    }
}
