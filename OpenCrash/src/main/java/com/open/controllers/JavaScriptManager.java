package com.open.controllers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.open.db.DBAccess;
import com.open.opencrash.JavascriptInterfaceActivity;
import com.open.opencrash.MainActivity;
import com.open.opencrash.R;

import java.util.Iterator;

/**
 * Contrôleur basique pour gérer les appels Javascript
 * Created by Lbremand on 22/01/14.
 */
public class JavaScriptManager {

    /** Main activity
     */
    MainActivity parentActivity;

    /**
     * Constructeur
     */
    public JavaScriptManager(MainActivity activity) {
        parentActivity = activity;
    }

    /**
     * Simple cas de test
     */
    @JavascriptInterface
    public void testJavascript() {
        parentActivity.callJavascript("document.getElementById('body').innerHTML = '<strong>TEST</strong>';");
    }

    /**
     * Charge les tâches
     */
    @JavascriptInterface
    public void chargerTaches() {
        DBCollection activites = DBAccess.getDBACESS().getDb().getCollection("activites");
        DBCursor curseur = activites.find();
        Iterator<DBObject> itCurseur = curseur.iterator();

        StringBuffer innerHtmlSb = new StringBuffer();

        while(itCurseur.hasNext()){
            DBObject activite = itCurseur.next();
            innerHtmlSb.append(activite.get("description"));// + "<img id=\"tache" + activite.get("_id") + "\" src=\"images/nuage.png\"><br>");
        }

        parentActivity.callJavascript(
            "$(\"#listeTaches\").html(\""+innerHtmlSb.toString()+"\");" +
            "");
    }
}
