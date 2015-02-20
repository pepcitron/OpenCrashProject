# OpenCrashProject
Projet CRH

# Liste des scripts utilisé dans une automation.
[Lien vers ancre1](#ancre1)
[Lien vers ancre2](#ancre2)
[Lien vers ancre3](#ancre3)
[Lien vers ancre4](#ancre4)

| Automation    			| Script        					| Spécifique  |
|---------------------------|-----------------------------------|:-----------:|
| cComputeDataFromReceipe	| mvel-compute-script-sample.mvel	| Non	      |

### Lancement :
* Je ne sais pas. Peut-être plus utilisé ?

### Utilité :
* Calcul la composition chimique d'une recette.

**********************

| Automation    	            | Script | Spécifique |
|-------------------------------|--------|:----------:|
| pimGDSNControl	            | 	     | Non	      |
| pimGDSNControlAll	            | 	     | Non	      |
| pimGDSNPublish	            | 	     | Non	      |
| pimGDSNPublishAll	            | 	     | Non	      |
| pimGDSNSync   	            | 	     | Non	      |
| pimGDSNSyncAll   	            | 	     | Non	      |
| vCheckProjectBeforeLaunch   	| 	     | Non	      |

### Lancement :
<a id="ancre1"></a>* **pimGDSNControl** est déclenché par la user action 'pimGDSNControlSingle'
* **pimGDSNControlAll** est déclenché par la user action 'pimGDSNControlCluster'
* **pimGDSNPublish** est déclenché par la user action 'pimGDSNPublishSingle'
* **pimGDSNPublishAll** est déclenché par la user action 'pimGDSNPublishCluster'
* **pimGDSNSync** est déclenché par la user action 'pimGDSNSync'
* **pimGDSNSyncAll** est déclenché par la user action 'pimGDSNSyncAll'
* **vCheckProjectBeforeLaunch** est déclenché par la user action 'vCheckProjectBeforeLaunch'

### Utilité :
* Déclenche le rechargement des données du serveur du document courant.

**********************

| Automation    	            | Script | Spécifique |
|-------------------------------|--------|:----------:|
| vInitIngredientsList	        | 	     | Non	      |


### Lancement :
* Déclenché par l'event handler **vInitIngredientsList** qui est levé sur les documents de type 'RDReceipe', sur l'event 'Empty document created'.


### Utilité :
* Initialise la liste des ingrédients avec une valeur par défaut à la création d'un document RDReceipe.

**********************

| Automation    	            | Script                        | Spécifique  |
|-------------------------------|-------------------------------|:-----------:|
| AuCalculateTotalProducts      | calculate_total_produtct.mvel | AUCHAN INTL |


### Lancement :
* Déclenché par l'event handler **AuCalculateTotalProducts** qui est levé sur les documents de type 'project', sur l'event 'Before document modification'.


### Utilité :
* Comptabilise le nombre de produit d'un projet dont le status est coché et renseigne la propriété 'AuRDP:totalProducts' correspondante avant de sauvegarder le document.

**********************

| Automation    	            | Script | Spécifique  |
|-------------------------------|--------|:-----------:|
| AuProductManageHierarchy      |        | AUCHAN INTL |


### Lancement :
* Déclenché par l'event handler **AuProductManageHierarchyOnModif** qui est levé sur les documents de type 'AuProduct', sur l'event 'Before document modification'.
* Déclenché par l'event handler **AuProductManageHierarchyOnMove** qui est levé sur les documents de type 'AuProduct', sur les events 'document created' et 'document moved'.


### Utilité :
* Renseigne les propriétés 'AuPIG:nomCountry', 'AuPIG:nomSubCat' et 'AuPIG:nomItemClass' du document 'AuProduct' à partir de sa hiérarchie.

**********************

| Automation    	            | Script | Spécifique  |
|-------------------------------|--------|:-----------:|
| AuProjectTaskInit             |        | AUCHAN INTL |


### Lancement :
* Je ne sais pas. Peut-être plus utilisé ?


### Utilité :
* Renseigne les variables de workflow 'projectLabelCode' et 'projectUrl' avec les propriétés du projet dans laquelle se trouve la tâche courante.

**********************

| Automation    	            | Script                        | Spécifique  |
|-------------------------------|-------------------------------|:-----------:|
| AuSynchronizeDeliverables     | synchronize_deliverables.mvel | AUCHAN INTL |


### Lancement :
<a id="ancre2"></a>* Déclenché par l'event handler **AuSynchronizeDeliverables** qui est levé sur les documents de type 'File' et 'Picture' dont le parent est de type 'projectTask', sur les events 'document created', 'document imported', 'document modified', 'about to copy', 'document created by copy', 'document duplicated', 'about to move', 'document restored', 'lifecycle_transition_event'.


### Utilité :
* Synchronise les livrables d'une tâche.

**********************

| Automation   | Script                        | Spécifique  |
|--------------|-------------------------------|:-----------:|
| vEndTask     | calculate_real_duration.mvel  | AUCHAN INTL |


### Lancement :
* Déclenché lors de la résolution d'une tâche (transition de workflow).


### Utilité :
* Sauvegarde la réelle date de fin de la tâche et calcul la durée réelle (et non estimée) de la tâche.

**********************

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| cInitLinkPublished     |        | LESIEUR     |


### Lancement :
* Déclenché par l'automation **cPublishItemScript**.


### Utilité :
* Renseigne la variable de workflow 'published_link' avec le path du document courant.

**********************

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| cPublishItem           |        | LESIEUR     |


### Lancement :
* Déclenché par les user actions :
    * **cPublishAllDoc** (sert a publier tous les documents)
    * **cPublishAllMP** (sert à publier toutes les MP)
    * **cPublishAllPI** (sert à publier tous les composants)
    * **cPublishAllPK** (sert à publier tous les PK)
    * **cPublishAllRD** (sert à publier toutes les recettes)
    * **cPublishAllUC** (sert à publier toutes les UC)
    * **cPublishAllUL** (sert à publier toutes les UL)
    * **cPublishSingle** (sert à publier unitairement)


### Utilité :
* Publie un document dans le référentiel.

**********************

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| cPublishItemScript     |        | LESIEUR     |
| cPublishItemWF         |        | LESIEUR     |


### Lancement :
* Je ne sais pas. Peut-être plus utilisé ?


### Utilité :
* Publie un document dans le référentiel.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| cUCWeightCalculation   |        | LESIEUR     |
| cULWeightCalculation   |        | LESIEUR     |

### Lancement :
* Déclenché par la user action **cUCWeightCalculation** qui sert au calcul des poids d'une recette (cEPUC).
* Déclenché par la user action **cULWeightCalculation** qui sert au calcul des poids d'une recette (cEPUL).


### Utilité :
* Calcul le poids brut de la recette (cEPUC) en fonction de sa composition.
* Calcul le poids brut et net de la recette (cEPUL) en fonction de sa composition.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| cWFMP_Assignee         |        | LESIEUR     |

### Lancement :
* Je ne sais pas. Peut-être plus utilisé ?


### Utilité :
* Met à jour des variables de workflows.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| cWF_Reset_Button       |        | LESIEUR     |

### Lancement :
* Je ne sais pas. Peut-être plus utilisé ?


### Utilité :
* Initialise la NodeVariable 'button'.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| cWF_Reset_Comment      |        | LESIEUR     |

### Lancement :
* Je ne sais pas. Peut-être plus utilisé ?


### Utilité :
* Initialise la variable de workflow 'comment'.

********************** 

| Automation             | Script                 | Spécifique  |
|------------------------|------------------------|:-----------:|
| fCSVExport             | exportCSVFindus.groovy | FINDUS      |

### Lancement :
* Déclenché par la user action **fExportToCSV** (bouton d'export CSV).


### Utilité :
* Exporte un document au format CSV.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| fCreatePFbud           |        | FINDUS      |

### Lancement :
* Déclenché par l'event handler **fPFbudCreation** qui est levé sur les documents de type 'fEndProduct', sur l'event 'document created'.


### Utilité :
* Met à jour la propriété 'gs1id:gtin' (gtin14) du document courant.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| fCreateVPbud           |        | FINDUS      |

### Lancement :
* Déclenché par l'event handler **fPFbudCreation** qui est levé sur les documents de type 'fEndProduct', sur l'event 'document created'.


### Utilité :
<a id="ancre3"></a>* Met à jour la propriété 'flv:variant' du document courant.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| fGenerateCode4         |        | FINDUS      |
| fGenerateCode6         |        | FINDUS      |
| fGenerateCodeX2        |        | FINDUS      |

### Lancement :
* Déclenché par l'event handler **fPFbudCreation** qui est levé sur les documents de type 'fEndProduct', sur l'event 'document created'.


### Utilité :
* Met à jour la propriété 'vig:code' (code4) du document courant.
* Met à jour la propriété 'vig:code' (code6) du document courant.
* Met à jour la propriété 'vig:code' (codeX2) du document courant.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| fManageHierarchy       |        | FINDUS      |

### Lancement :
* Déclenché par l'event handler **fOnPFModif** qui est levé sur les documents de type 'fEndProduct', sur l'event 'before document modification'.


### Utilité :
* Renseigne les propriétés 'fep:brand', 'fep:range', 'fep:subRange', 'fep:family', 'fep:subFamily' et 'fep:productGroup' du document courant à partir de sa hiérarchie.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| fManageHierarchyMP     |        | FINDUS      |

### Lancement :
* Déclenché par l'event handler **fOnRMModif** qui est levé sur les documents de type 'fRawMaterial', sur l'event 'before document modification'.


### Utilité :
* Renseigne les propriétés 'frm:alimentarity' et 'frm:group' du document courant à partir de sa hiérarchie.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| fManageHierarchyOnMove |        | FINDUS      |

### Lancement :
* Déclenché par l'event handler **fOnPfMoved** qui est levé sur les documents de type 'fEndProduct', sur l'event 'document moved'.


### Utilité :
* Renseigne les propriétés 'fep:brand', 'fep:range', 'fep:subRange', 'fep:family', 'fep:subFamily' et 'fep:productGroup' du document courant à partir de sa hiérarchie.
* Dépublie le document courant.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| fOnPackModif           |        | FINDUS      |

### Lancement :
* Déclenché par l'event handler **fOnPackModif** qui est levé sur les documents de type 'fPackaging', sur l'event 'before document modification'.


### Utilité :
* Calcul le poids total du package.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| fOnVLModif             |        | FINDUS      |

### Lancement :
* Déclenché par l'event handler **fVariantModif** qui est levé sur les documents de type 'f*LogisticVariant', sur l'event 'before document modification'.


### Utilité :
* Renseigne le 'flv:code' du document courant.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| fOnVLPFModif           |        | FINDUS      |

### Lancement :
* Déclenché par l'event handler **fOnVLPFModif** qui est levé sur les documents de type 'fEPLogisticVariant', sur l'event 'before document modification'.


### Utilité :
* Renseigne le 'flv:variant' du document courant.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| fPublish               |        | FINDUS      |

### Lancement :
* Déclenché par la user action **fPublishItem** qui publie (version mineur) un certain nombre de document.


### Utilité :
* Publie le document courant dans le référentiel.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| fPublishItem           |        | FINDUS      |

### Lancement :
* Je ne sais pas. Peut-être plus utilisé ?

### Utilité :
* Publie le document courant dans le référentiel.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| fPublishMajor          |        | FINDUS      |

### Lancement :
* Déclenché par l'automation **fPublishMajorPublishAndEmail** qui créer une version majeur du document, le publie dans le référentiel et notifie la publication par mail.

### Utilité :
* Publie le document courant dans le référentiel.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| pimSIFindusUpdate      |        | FINDUS      |

### Lancement :
* Déclenché par la user action **pimSIFindusUpdate** qui lance la mise à jour dans le SI Findus.

### Utilité :
<a id="ancre4"></a>* Déclenche le rechargement des données du serveur du document courant.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| LFF_AUTO               |        | LFF         |

### Lancement :
* Déclenché par l' event handler **LFF_AUTO_OnEpModify** qui est levé sur les EP, sur l'event 'before document modification'.

### Utilité :
* Renseigne les propriétés 'gs1id:invoiceLabel', 'gs1id:longLabel' et 'gs1id:functionalLabel' du document courant.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| LFF_WF_CREA_UC         |        | LFF         |

### Lancement :
* Etape du workflow **LFF_PIM_CREA_UC** qui permet la création d'UC.

### Utilité :
* Créer un UC et renseigne sa composition par défaut

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| LFF_WF_CREA_ULCAR      |        | LFF         |

### Lancement :
* Etape du workflow **LFF_PIM_CREA_ULCAR** qui permet la création d'UL-CAR.

### Utilité :
* Créer un UC-CAR et renseigne sa composition par défaut

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| cCalcScript            |        | LFF         |

### Lancement :
* Déclenché par la user action **cCalcButton** qui lance le calculs des mesures.

### Utilité :
* Calcule les poids brut et net de la palette ou du carton.

********************** 

| Automation             | Script | Spécifique  |
|------------------------|--------|:-----------:|
| pimLaunchSILabeyrie    |        | LFF         |

### Lancement :
* Déclenché par la user action **pimLaunchSILabeyrie** qui lance le SI Labeyrie JDE.

### Utilité :
* Déclenche le rechargement des données du serveur du document courant.

********************** 

| Automation                 | Script | Spécifique  |
|----------------------------|--------|:-----------:|
| coOnReceipeModification    |        | CRETE D'OR  |

### Lancement :
* Déclenché par l'event handler **coOnReceipeModification** sur les RDReceipe, sur l'event 'before document modification'.

### Utilité :
* Contrôle la structure de la recette et applique les ratios sur la composition.
* Déclenche le rechargement des données du serveur du document courant.

********************** 
