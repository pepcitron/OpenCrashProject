# Fonctions template rendering keendo

## formatDate(final Object calendar)
### Fonction
Affiche une date.
### Compatibilité
>MS Word, MS Excel

### Paramètres
* **calendar** : la date contenu dans une métadonnée de type <date>

## formatDateEn(final Object calendar)
### Fonction
Affiche une date au format MM/dd/yyyy.
### Compatibilité
>MS Word, MS Excel

### Paramètres
* **calendar** : la date contenu dans une métadonnée de type <date>

## formatDateFr(final Object calendar)
### Fonction
Affiche une date au format dd/MM/yyyy.
### Compatibilité
>MS Word, MS Excel

### Paramètres
* **calendar** : la date contenu dans une métadonnée de type <date>

## formatDateTime(final Object calendar)
### Fonction
Affiche une date/heure.
### Compatibilité
>MS Word, MS Excel

### Paramètres
* **calendar** : la date contenu dans une métadonnée de type <date>

## formatDateTimeEn(final Object calendar)
### Fonction
Affiche une date/heure au format MM/dd/yyyy HH:mm:ss.
### Compatibilité
>MS Word, MS Excel

### Paramètres
* **calendar** : la date contenu dans une métadonnée de type <date>

## formatDateTimeFr(final Object calendar)
### Fonction
Affiche une date/heure au format dd/MM/yyyy HH:mm:ss.
### Compatibilité
>MS Word, MS Excel

### Paramètres
* **calendar** : la date contenu dans une métadonnée de type <date>

## formatTime(final Object calendar)
### Fonction
Affiche une heure au format hh:mm:ss.
### Compatibilité
>MS Word, MS Excel

### Paramètres
* **calendar** : la date contenu dans une métadonnée de type <date>

## getChildren(final String codeArticle)
### Fonction
Récupère la liste des enfants d'un document à partir de son uid.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **codeArticle** : l'uid de l'article - String

## getCompleteReceipe()
### Fonction
Récupère la liste complète des éléments de vrp:components du document courant de manière recursive.

## getCompleteReceipe(final boolean isPassiveUnit)
### Fonction
Récupère la liste complète des éléments de vrp:components du document courant de manière recursive en filtrant sur le fait qu'une unité soit passive ou non pour chaque élément.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **isPassiveUnit** : booléen
	* Si `isPassiveUNit` = false : ne renvoit que les éléments dont l'unité n'est pas passive
	* Si `isPassiveUnit` = true : renvoit tous les élements de la recette sans filtre sur l'unité passive 

## getCompleteReceipe(final boolean isPassiveUnit, final boolean onlyEnabled)
### Fonction
Récupère la liste complète des éléments de vrp:components du document courant de manière recursive en filtrant sur le fait qu'une unité soit passive ou non et que l'élément soit actif ou non.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **isPassiveUnit** : booléen
	* Si `isPassiveUnit` = false : ne renvoit que les éléments dont l'unité n'est pas passive
	* Si `isPassiveUnit` = true : renvoit tous les élements de la recette sans filtre sur l'unité passive
* **onlyEnabled** : booléen
	* Si `onlyEnabled` = true : ne renvoit que les éléments actif de la recette
	* Si `onlyEnabled` = false : renvoit tous les élements de la recette, y compris les éléments inactifs

## getCompleteReceipe(final String uidRef)
### Fonction
Récupère la liste complète des éléments de vrp:components d'un document courant de manière recursive.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **uidRef** : String - l'uid du document dont on souhaite récupérer la composition / la grappe logistique

## getCompleteReceipe(final String uidRef, final boolean isPassiveUnit)
### Fonction
Récupère la liste complète des éléments de vrp:components d'un document de manière recursive en filtrant sur le fait qu'une unité soit passive ou non pour chaque élément.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **uidRef** : String - l'uid du document dont on souhaite récupérer la composition / la grappe logistique
* **isPassiveUnit** : booléen
	* Si `isPassiveUNit` = false : ne renvoit que les éléments dont l'unité n'est pas passive
	* Si `isPassiveUnit` = true : renvoit tous les élements de la recette sans filtre sur l'unité passive 
	
## getCompleteReceipe(final String uidRef, final boolean isPassiveUnit, final boolean onlyEnabled)
### Fonction
Récupère la liste complète des éléments de vrp:components d'un document de manière recursive en filtrant sur le fait qu'une unité soit passive ou non et que l'élément soit actif ou non.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **uidRef** : String - l'uid du document dont on souhaite récupérer la composition / la grappe logistique
* **isPassiveUnit** : booléen
	* Si `isPassiveUnit` = false : ne renvoit que les éléments dont l'unité n'est pas passive
	* Si `isPassiveUnit` = true : renvoit tous les élements de la recette sans filtre sur l'unité passive
* **onlyEnabled** : booléen
	* Si `onlyEnabled` = true : ne renvoit que les éléments actif de la recette
	* Si `onlyEnabled` = false : renvoit tous les élements de la recette, y compris les éléments inactifs
	
## getCompleteReceipeByRegroupement(final String regroupement, final boolean isShort)
### Fonction
Récupère la liste complète des éléments de vrp:components du document courant de manière recursive en filtrant sur un regroupement.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **regroupement** : String - L'identifiant du regroupement sur lequel les composants doivent être filtrés
* **isShort** : Booléen
	* Si `isShort` = false : version longue des additifs
	* Si `isShort` = true : version courte des additifs

## getCompleteReceipeSLevel(final Integer level, final DocumentModel pDocument)
### Fonction
Récupère la liste des éléments dont le level est passé en paramètre de vrp:components du document passé en paramètre.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **level** : Integer - Le niveau dans l'arborescence
* **pDocument** : DocumentModel - Le document

## getCompleteReceipeSLevel(final Integer level, final DocumentModel pDocument, final boolean isPassiveUnit)
### Fonction
Récupère la liste des éléments dont le level est passé en paramètre de vrp:components du document passé en paramètre.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **level** : Integer - Le niveau dans l'arborescence
* **pDocument** : DocumentModel - Le document
* **isPassiveUnit** : booléen
	* Si `isPassiveUnit` = false : ne renvoit que les éléments dont l'unité n'est pas passive
	* Si `isPassiveUnit` = true : renvoit tous les élements de la recette sans filtre sur l'unité passive

## getCompleteReceipeSLevel(final Integer level, final DocumentModel pDocument, final boolean isPassiveUnit, final boolean onlyEnabled)
### Fonction
Récupère la liste des éléments dont le level est passé en paramètre de vrp:components du document passé en paramètre.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **level** : Integer - Le niveau dans l'arborescence
* **pDocument** : DocumentModel - Le document
* **isPassiveUnit** : booléen
	* Si `isPassiveUnit` = false : ne renvoit que les éléments dont l'unité n'est pas passive
	* Si `isPassiveUnit` = true : renvoit tous les élements de la recette sans filtre sur l'unité passive
* **onlyEnabled** : booléen
	* Si `onlyEnabled` = true : ne renvoit que les éléments actif de la recette
	* Si `onlyEnabled` = false : renvoit tous les élements de la recette, y compris les éléments inactifs

## getCompleteReceipeSLevel(final Integer level)
### Fonction
Récupère la liste des éléments du document courant dont le level est passé en paramètre de vrp:components.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **level** : Integer - Le niveau dans l'arbores

## getCompleteReceipeSLevel(final Integer level, final boolean isPassiveUnit)
### Fonction
Récupère la liste des éléments du document courant dont le level est passé en paramètre de vrp:components.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **level** : Integer - Le niveau dans l'arborescence
* **isPassiveUnit** : booléen
	* Si `isPassiveUnit` = false : ne renvoit que les éléments dont l'unité n'est pas passive
	* Si `isPassiveUnit` = true : renvoit tous les élements de la recette sans filtre sur l'unité passive
	
## getCompleteReceipeSLevel(final Integer level, final boolean isPassiveUnit, final boolean onlyEnabled)
### Fonction
Récupère la liste des éléments du document courant dont le level est passé en paramètre de vrp:components.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **level** : Integer - Le niveau dans l'arborescence
* **isPassiveUnit** : booléen
	* Si `isPassiveUnit` = false : ne renvoit que les éléments dont l'unité n'est pas passive
	* Si `isPassiveUnit` = true : renvoit tous les élements de la recette sans filtre sur l'unité passive
* **onlyEnabled** : booléen
	* Si `onlyEnabled` = true : ne renvoit que les éléments actif de la recette
	* Si `onlyEnabled` = false : renvoit tous les élements de la recette, y compris les éléments inactifs
	
## getCompleteReceipeSLevel(final Integer level, final String uid)
### Fonction
Récupère la liste des éléments dont le level est passé en paramètre de vrp:components du document passé en paramètre.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **level** : Integer - Le niveau dans l'arborescence
* **uid** : String - L'uid du document

## getCompleteReceipeSLevel(final Integer level, final String uid, final boolean isPassiveUnit)
### Fonction
Récupère la liste des éléments dont le level est passé en paramètre de vrp:components du document passé en paramètre.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **level** : Integer - Le niveau dans l'arborescence
* **uid** : String - L'uid du document
* **isPassiveUnit** : booléen
	* Si `isPassiveUnit` = false : ne rnevoit que les éléments dont l'unité n'est pas passive
	* Si `isPassiveUnit` = true : renvoit tous les élements de la recette sans filtre sur l'unité passive

## getCompleteReceipeSLevel(final Integer level, final String uid, final boolean isPassiveUnit, final boolean onlyEnabled)
### Fonction
Récupère la liste des éléments dont le level est passé en paramètre de vrp:components du document passé en paramètre.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **level** : Integer - Le niveau dans l'arborescence
* **uid** : String - L'uid du document
* **isPassiveUnit** : booléen
	* Si `isPassiveUnit` = false : ne rnevoit que les éléments dont l'unité n'est pas passive
	* Si `isPassiveUnit` = true : renvoit tous les élements de la recette sans filtre sur l'unité passive
* **onlyEnabled** : booléen
	* Si `onlyEnabled` = true : ne renvoit que les éléments actif de la recette
	* Si `onlyEnabled` = false : renvoit tous les élements de la recette, y compris les éléments inactifs

## getCompleteReceipeSRawMaterials()
### Fonction
Récupère la liste des matières premières (ayant la facet RawMaterial) de vrp:components du document courant de façon récursive.

### Compatibilité
>MS Word, MS Excel

## getContextualDocument(final String uid)
### Fonction
Renvoie le document dont l'uid est passé en paramètre.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **uid** : String - uid du document

## getDiffFromPreviousVersion()
### Fonction
Retourne le résultat d'un diff entre le document courant et la version précédente de ce même document.

### Compatibilité
>MS Word, MS Excel

## getGeographicalOrigins(final Object vReceipeProperty, final Object uid, final String language)
### Fonction
Retourne la liste des origines géographiques traduites d'un document. Les origines géographiques sont extraites du schéma type "vrp:components" passé en paramètre ou, à défaut, du document dont l'uid est passé en paramètre.

### Compatibilité
>MS Word

### Paramètres
* **vReceipeProperty** : String - Le nom de la propriété contenant la composition ("vrp:components" par défaut)
* **uid** : String - L'uid du document
* **language** : String - la langue dans laquelle sont renvoyées les origines géographiques

## getGeographicalOrigins(final Object vReceipeProperty, final Object uid, final String language, final String geoVoc, final String subGeoVoc)
### Fonction
Retourne la liste des origines géographiques traduites d'un document. Les origines géographiques sont extraites du schéma type "vrp:components" passé en paramètre ou, à défaut, du document dont l'uid est passé en paramètre.

### Compatibilité
>MS Word

### Paramètres
* **vReceipeProperty** : String - Le nom de la propriété contenant la composition ("vrp:components" par défaut)
* **uid** : String - L'uid du document
* **language** : String - la langue dans laquelle sont renvoyées les origines géographiques
* **geoVoc** : String - identifiant du vocabulaire des origines géographiques
* **subGeoVoc** : String - identifiant du vocabulaire des sous-origines géographiques

## getGeographicalOrigins(final String vReceipeProperty, final String uid, final String language)
### Fonction
Retourne la liste des origines géographiques traduites d'un document. Les origines géographiques sont extraites du schéma type "vrp:components" passé en paramètre ou, à défaut, du document dont l'uid est passé en paramètre.

### Compatibilité
>MS Word

### Paramètres
* **vReceipeProperty** : String - Le nom de la propriété contenant la composition ("vrp:components" par défaut)
* **uid** : String - L'uid du document
* **language** : String - la langue dans laquelle sont renvoyées les origines géographiques

## getGeographicalOrigins(final String vReceipeProperty, final String uid, final String language, final String geoVoc, final String subGeoVoc)
### Fonction
Retourne la liste des origines géographiques traduites d'un document. Les origines géographiques sont extraites du schéma type "vrp:components" passé en paramètre ou, à défaut, du document dont l'uid est passé en paramètre.

### Compatibilité
>MS Word

### Paramètres
* **vReceipeProperty** : String - Le nom de la propriété contenant la composition ("vrp:components" par défaut)
* **uid** : String - L'uid du document
* **language** : String - la langue dans laquelle sont renvoyées les origines géographiques
* **geoVoc** : String - identifiant du vocabulaire des origines géographiques
* **subGeoVoc** : String - identifiant du vocabulaire des sous-origines géographiques

## getListAsCarriageReturnSeparatedString(final Object list)
### Fonction
Retourne une liste dont chaque élement est séparé par un retour chariot.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **list** : Object - La liste à formater

## getListAsCommaSeparatedString(final Object list)
### Fonction
Retourne une liste dont chaque élement est séparé par une virgule.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **list** : Object - La liste à formater

## getListAsSpaceSeparatedString(final Object list)
### Fonction
Retourne une liste dont chaque élement est séparé par un espace.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **list** : Object - La liste à formater

## getListAsString(final Object list, final String separator)
### Fonction
Retourne une liste dont chaque élement est séparé par un séparateur.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **list** : Object - La liste à formater
* **separator** : String - Le séparateur

## getListPropertyAsVocabularyLabelsString(final Object uid, final String propertyXPath, final String separator, final String vocabulary)
### Fonction
Retourne une liste de libellés correspondant aux ids de vocabulaires stockés dans une liste.

### Compatibilité
>MS Word

### Paramètres
* **uid** : String - L'uid du document
* **propertyXPath** : String - La propriété à exploiter (xpath au format `sch:field`)
* **separator** : String - Le séparateur utilisé dans la liste exploitée
* **vocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés

### Important
Cette méthode n'est pas utilisable dans MS Excel en raison des ":" utilisés dans le xpath de la propriété passée en paramètre. La fonction à utiliser dans Excel est : `getListPropertyAsVocabularyLabelsStringXLS(final Object uid, final String schemaPrefix, final String propertyXPath, final String separator, final String vocabulary)`

## getListPropertyAsVocabularyLabelsStringXLS(final Object uid, final String schemaPrefix, final String propertyXPath, final String separator, final String vocabulary)
### Fonction
Retourne une liste de libellés correspondant aux ids de vocabulaires stockés dans une liste.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **uid** : String - L'uid du document
* **schemaPrefix** : String - Le préfixe du schéma de la propriété à exploiter
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **separator** : String - Le séparateur utilisé dans la liste exploitée
* **vocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés

## getListPropertyAsVocabularyLabelsString(final Object uid, final String propertyXPath, final String separator, final String vocabulary, final String subVocabulary)
### Fonction
Retourne une liste de libellés correspondant aux ids d'un vocabulaire/sous-vocabulaire stockés dans une liste.
### Compatibilité
>MS Word

### Paramètres
* **uid** : String - L'uid du document
* **propertyXPath** : String - La propriété à exploiter (xpath au format `sch:field`)
* **separator** : String - Le séparateur utilisé dans la liste exploitée
* **vocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés
* **subVocabulary** : L'identifiant de sous-vocabulaire utilisé pour retouver les libellés

### Important
Cette méthode n'est pas utilisable dans MS Excel en raison des ":" utilisés dans le xpath de la propriété passée en paramètre. La fonction à utiliser dans Excel est : `getListPropertyAsVocabularyLabelsStringXLS(final Object uid, final String schemaPrefix, final String propertyXPath, final String separator, final String vocabulary)`

## getListPropertyAsVocabularyLabelsStringXLS(final Object uid, final String schemaPrefix, final String propertyXPath, final String separator, final String vocabulary, final String subVocabulary)
### Fonction
Retourne une liste de libellés correspondant aux ids d'un vocabulaire/sous-vocabulaire stockés dans une liste.
### Compatibilité
>MS Word, MS Excel

### Paramètres
* **uid** : String - L'uid du document
* **schemaPrefix** : String - Le préfixe du schéma de la propriété à exploiter
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **separator** : String - Le séparateur utilisé dans la liste exploitée
* **vocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés
* **subVocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés

## getListPropertyAsVocabularyLabelsString(final String uid, final String propertyXPath, final String separator, final String vocabulary)

### Fonction
Retourne une liste de libellés correspondant aux ids d'un vocabulaire stockés dans une liste.

### Compatibilité
>MS Word

### Paramètres
* **uid** : String - L'uid du document
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **separator** : String - Le séparateur utilisé dans la liste exploitée
* **vocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés

## getListPropertyAsVocabularyLabelsStringXLS(final String uid, final String schemaPrefix, final String propertyXPath, final String separator, final String vocabulary)

### Fonction
Retourne une liste de libellés correspondant aux ids d'un vocabulaire stockés dans une liste.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **uid** : String - L'uid du document
* **schemaPrefix** : String - Le préfixe du schéma de la propriété à exploiter
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **separator** : String - Le séparateur utilisé dans la liste exploitée
* **vocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés

## getListPropertyAsVocabularyLabelsString(final String uid, final String propertyXPath, final String separator, final String vocabulary, final String subVocabulary)

### Fonction
Retourne une liste de libellés correspondant aux ids d'un vocabulaire/sous-vocabulaire stockés dans une liste.

### Compatibilité
>MS Word

### Paramètres
* **uid** : String - L'uid du document
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **separator** : String - Le séparateur utilisé dans la liste exploitée
* **vocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés
* **subVocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés

## getListPropertyAsVocabularyLabelsStringXLS(final String uid, final String schemaPrefix, final String propertyXPath, final String separator, final String vocabulary, final String subVocabulary)

### Fonction
Retourne une liste de libellés correspondant aux ids d'un vocabulaire/sous-vocabulaire stockés dans une liste.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **uid** : String - L'uid du document
* **schemaPrefix** : String - Le préfixe du schéma de la propriété à exploiter
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **separator** : String - Le séparateur utilisé dans la liste exploitée
* **vocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés
* **subVocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés

## getListPropertyAsVocabularyLabelsStringByCodeXLS(final Object code, final String schemaPrefix, final String propertyXPath, final String separator, final String vocabulary)

### Fonction
Retourne une liste de libellés correspondant aux ids d'un vocabulaire stockés dans une liste.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **code** : Object - Le code (vig:code) du document
* **schemaPrefix** : String - Le préfixe du schéma de la propriété à exploiter
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **separator** : String - Le séparateur utilisé dans la liste exploitée
* **vocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés

## getListPropertyAsVocabularyLabelsStringByCode(final Object code, final String propertyXPath, final String separator, final String vocabulary, final String subVocabulary)

### Fonction
Retourne une liste de libellés correspondant aux ids d'un vocabulaire/sous-vocabulaire stockés dans une liste.

### Compatibilité
>MS Word

### Paramètres
* **code** : Object - Le code (vig:code) du document
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **separator** : String - Le séparateur utilisé dans la liste exploitée
* **vocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés
* **subVocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés

## getListPropertyAsVocabularyLabelsStringByCodeXLS(final Object code, final String schemaPrefix, final String propertyXPath, final String separator, final String vocabulary, final String subVocabulary)

### Fonction
Retourne une liste de libellés correspondant aux ids d'un vocabulaire/sous-vocabulaire stockés dans une liste.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **code** : Object - Le code (vig:code) du document
* **schemaPrefix** : String - Le préfixe du schéma de la propriété à exploiter
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **separator** : String - Le séparateur utilisé dans la liste exploitée
* **vocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés
* **subVocabulary** : L'identifiant de vocabulaire utilisé pour retouver les libellés

## getLocalizedValueFromProperty(final String propertyXPath, final String keyPropertyName, final String valuePropertyName, final String language)

### Fonction
Retourne la traduction d'une valeur stockée dans un champ complexe de type `lang/translation`.

### Compatibilité
>MS Word

### Paramètres
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **keyPropertyName** : String - Le nom du champ contenant la langue
* **valuePropertyName** : String - Le nom du champ contenant contenant la traduction
* **language** : La langue dans laquelle la valeur doit être traduite

## getLocalizedValueFromProperty(final String schemaName, final String propertyXPath, final String keyPropertyName, final String valuePropertyName, final String language)

### Fonction
Retourne la traduction d'une valeur stockée dans un champ complexe de type `lang/translation`.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **schemaPrefix** : String - Le préfixe du schéma de la propriété à exploiter
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **keyPropertyName** : String - Le nom du champ contenant la langue
* **valuePropertyName** : String - Le nom du champ contenant contenant la traduction
* **language** : La langue dans laquelle la valeur doit être traduite

## getLocalizedValueFromPropertyNoHtml(final String schemaName, final String propertyXPath, final String keyPropertyName, final String valuePropertyName, final String language)

### Fonction
Retourne la traduction **sans balise HTML** d'une valeur stockée dans un champ complexe de type `lang/translation`.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **schemaPrefix** : String - Le préfixe du schéma de la propriété à exploiter
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **keyPropertyName** : String - Le nom du champ contenant la langue
* **valuePropertyName** : String - Le nom du champ contenant contenant la traduction
* **language** : La langue dans laquelle la valeur doit être traduite

## getLocalizedValueFromProperty(final Object uid, final String propertyXPath, final String keyPropertyName, final String valuePropertyName, final String language)

### Fonction
Retourne la traduction d'une valeur stockée dans un champ complexe de type `lang/translation`.

### Compatibilité
>MS Word

### Paramètres
* **uid** : Object - L'uid du document
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **keyPropertyName** : String - Le nom du champ contenant la langue
* **valuePropertyName** : String - Le nom du champ contenant contenant la traduction
* **language** : La langue dans laquelle la valeur doit être traduite

## getLocalizedValueFromProperty(final Object uid, final String schemaName, final String propertyXPath, final String keyPropertyName, final String valuePropertyName, final String language)

### Fonction
Retourne la traduction d'une valeur stockée dans un champ complexe de type `lang/translation`.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **uid** : Object - L'uid du document
* **schemaPrefix** : String - Le préfixe du schéma de la propriété à exploiter
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **keyPropertyName** : String - Le nom du champ contenant la langue
* **valuePropertyName** : String - Le nom du champ contenant contenant la traduction
* **language** : La langue dans laquelle la valeur doit être traduite

## getLocalizedValueFromPropertyNoHtml(final Object uid, final String schemaName, final String propertyXPath,final String keyPropertyName, final String valuePropertyName, final String language)

### Fonction
Retourne la traduction **sans balise HTML** d'une valeur stockée dans un champ complexe de type `lang/translation`.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **uid** : Object - L'uid du document
* **schemaPrefix** : String - Le préfixe du schéma de la propriété à exploiter
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **keyPropertyName** : String - Le nom du champ contenant la langue
* **valuePropertyName** : String - Le nom du champ contenant contenant la traduction
* **language** : La langue dans laquelle la valeur doit être traduite

## getOriginsListAsString(final Object origin, final String language, final String vocabulary)

### Fonction
Retourne une liste d'origines traduites à partir d'un vocabulaire.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **origin** : Object - la valeur brute contenu dans le champ origine
* **language** : La langue dans laquelle les origines doivent être traduites
* **vocabulary** : Le vocabulaire contenant les origines

## getOriginsListAsString(final Object origin, final String language, final String vocabulary, final String subVocabulary)

### Fonction
Retourne une liste d'origines traduites à partir d'un vocabulaire/sous-vocabulaire.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **origin** : Object - la valeur brute contenu dans le champ origine
* **language** : La langue dans laquelle les origines doivent être traduites
* **vocabulary** : Le vocabulaire contenant les origines
* **subVocabulary** : Le sous-vocabulaire contenant les origines


## getOriginsListAsString(final String origin, final String language, final String vocabulary)

### Fonction
Retourne une liste d'origines traduites à partir d'un vocabulaire.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **origin** : String - la valeur brute contenu dans le champ origine
* **language** : La langue dans laquelle les origines doivent être traduites
* **vocabulary** : Le vocabulaire contenant les origines

## getOriginsListAsString(final String origin, final String language, final String vocabulary, final String subVocabulary)

### Fonction
Retourne une liste d'origines traduites à partir d'un vocabulaire/sous-vocabulaire.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **origin** : String - la valeur brute contenu dans le champ origine
* **language** : La langue dans laquelle les origines doivent être traduites
* **vocabulary** : Le vocabulaire contenant les origines
* **subVocabulary** : Le sous-vocabulaire contenant les origines

## getProjectContainerId()
### Fonction
Retourne le document parent le plus proche de type `RDProject`.

### Compatibilité
>MS Word, MS Excel

## getProperty(final Object uid, final String propertyXPath)

### Fonction
Retourne le contenu d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word

### Paramètres
* **uid** : Object - l'uid du document
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter

## getProperty(final Object uid, final String schema, final String property)

### Fonction
Retourne le contenu d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **uid** : Object - l'uid du document
* **schema** : String - Le préfixe du schéma de la propriété à exploiter
* **property** : String - Le nom du champ de la propriété à exploiter

## getProperty(final String uid, final String propertyXPath)

### Fonction
Retourne le contenu d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word

### Paramètres
* **uid** : String - l'uid du document
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter

## getProperty(final String uid, final String schema, final String property)

### Fonction
Retourne le contenu d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **uid** : String - l'uid du document
* **schema** : String - Le préfixe du schéma de la propriété à exploiter
* **property** : String - Le nom du champ de la propriété à exploiter

## getPropertyByCode(final Object code, final String propertyXPath)

### Fonction
Retourne le contenu d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word

### Paramètres
* **code** : Object - le code `vig:code` du document
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter

## getPropertyByCode(final Object code, final String schema, final String property)

### Fonction
Retourne le contenu d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **code** : Object - le code `vig:code` du document
* **schema** : String - Le préfixe du schéma de la propriété à exploiter
* **property** : String - Le nom du champ de la propriété à exploiter

## getPropertyByCode(final String code, final String propertyXPath)

### Fonction
Retourne le contenu d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word

### Paramètres
* **code** : String - le code `vig:code` du document
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter

## getPropertyByCode(final String code, final String schema, final String property)

### Fonction
Retourne le contenu d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **code** : String - le code `vig:code` du document
* **schema** : String - Le préfixe du schéma de la propriété à exploiter
* **property** : String - Le nom du champ de la propriété à exploiter

## getReceipe()

### Fonction
Retourne tous les éléments (même les non-actifs) d'une composition `vrp:components` de façon non récursive du document courant.

### Compatibilité
>MS Word, MS Excel

## getReceipeNoDisplay()

### Fonction
Retourne tous les éléments non-actifs d'une composition `vrp:components` de façon non récursive du document courant.

### Compatibilité
>MS Word, MS Excel

## getRegroupement()

### Fonction
Retourne tous les regroupements d'une composition `vrp:components` de façon non récursive du document courant.

### Compatibilité
>MS Word, MS Excel

## getRegroupementPourcentage(final String regroupement)

### Fonction
Retourne le pourcentage d'un regroupement d'une composition `vrp:components` du document courant.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **regroupement** : String - identifiant du regroupement

## getTranslatedProperty(final Object uid, final String propertyXPath, final String languageCode)

### Fonction
Retourne la traduction d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word

### Paramètres
* **uid** : Object - l'uid du document
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **languageCode** : String - La langue dans laquelle la valeur doit être traduite

## getTranslatedProperty(final Object uid, final String schema, final String property, final String languageCode)

### Fonction
Retourne la traduction d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **uid** : Object - l'uid du document
* **schema** : String - Le préfixe du schéma de la propriété à exploiter
* **property** : String - Le nom du champ de la propriété à exploiter
* **languageCode** : String - La langue dans laquelle la valeur doit être traduite

## getTranslatedProperty(final String uid, final String propertyXPath, final String languageCode)

### Fonction
Retourne la traduction d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word

### Paramètres
* **uid** : String - l'uid du document
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **languageCode** : String - La langue dans laquelle la valeur doit être traduite

## getTranslatedProperty(final String uid, final String schema, final String property, final String languageCode)

### Fonction
Retourne la traduction d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **uid** : String - l'uid du document
* **schema** : String - Le préfixe du schéma de la propriété à exploiter
* **property** : String - Le nom du champ de la propriété à exploiter
* **languageCode** : String - La langue dans laquelle la valeur doit être traduite

## getTranslatedPropertyByCode(final Object code, final String propertyXPath, final String languageCode)

### Fonction
Retourne la traduction d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word

### Paramètres
* **code** : Object - le code `vig:code` du document
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **languageCode** : String - La langue dans laquelle la valeur doit être traduite

## getTranslatedPropertyByCode(final Object code, final String schema, final String property, final String languageCode)

### Fonction
Retourne la traduction d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **code** : Object - le code `vig:code` du document
* **schema** : String - Le préfixe du schéma du champ de la propriété à exploiter
* **property** : String - Le nom du champ de la propriété à exploiter
* **languageCode** : String - La langue dans laquelle la valeur doit être traduite

## getTranslatedPropertyByCode(final String code, final String propertyXPath, final String languageCode)

### Fonction
Retourne la traduction d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word

### Paramètres
* **code** : String - le code `vig:code` du document
* **propertyXPath** : String - Le nom du champ de la propriété à exploiter
* **languageCode** : String - La langue dans laquelle la valeur doit être traduite

## getTranslatedPropertyByCode(final String code, final String schema, final String property, final String languageCode)

### Fonction
Retourne la traduction d'une métadonnée contenu dans un document.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **code** : String - le code `vig:code` du document
* **schema** : String - Le préfixe du schéma du champ de la propriété à exploiter
* **property** : String - Le nom du champ de la propriété à exploiter
* **languageCode** : String - La langue dans laquelle la valeur doit être traduite

## getUnitLabel(final String key)

### Fonction
Retourne le libellé d'une unité.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **key** : String - l'id de l'unité (schéma `unit`)

## getUnitTranslatedLabel(final String key, final String lang)

### Fonction
Retourne le libellé d'une unité.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **key** : String - l'id de l'unité (schéma `unit`)
* **lang** : String - la langue dans laquelle doit être traduit le libellé

## getI18nVocabularyLabel(final String vocName, final String key, final String lang)

### Fonction
Retourne le libellé d'une entrée de vocabulaire i18n.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **vocName** : String - l'identifiant du vocabulaire
* **key** : String - la clé de l'entrée de vocabulaire
* **lang** : String - la langue dans laquelle doit être traduit le libellé

## getValueAsLevelVocabularyLabelsString(final String codesList, final String inputSeparator, final String outputSeparator, final String vocabulary, final String subVocabularys)

### Fonction
Retourne une liste de libellés à partir d'une liste d'identifiants d'entrées de vocabulaire/sous-vocabulaire (vocabulaire multi-niveaux).

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **codesList** : String - la liste des entrées de vocabulaire
* **inputSeparator** : String - le séparateur de la liste en entrée
* **outputSeparator** : String - le séparateur de la liste en sortie
* **vocabulary** : String - le vocabulaire
* **subVocabularys** : String - les sous-vocabulaires

## getValueAsTwoLevelVocabularyLabelsString(final String codesList, final String inputSeparator, final String outputSeparator, final String vocabulary, final String subVocabularys)

### Fonction
Retourne une liste de libellés à partir d'une liste d'identifiants d'entrées de vocabulaire/sous-vocabulaire (vocabulaire à deux niveaux).

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **codesList** : String - la liste des entrées de vocabulaire
* **inputSeparator** : String - le séparateur de la liste en entrée
* **outputSeparator** : String - le séparateur de la liste en sortie
* **vocabulary** : String - le vocabulaire
* **subVocabularys** : String - les sous-vocabulaires

## getVarietalOrigins(final Object vReceipeProperty, final Object uid, final String language)

### Fonction
Retourne la traduction des origines variétales à partir d'une composition et du vocabulaire des origines variétales standard (RMOrigin/RMSubOrigin).

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **vReceipeProperty** : Object - le nom du champ contenant la composition (ex : `vrp:components`)
* **uid** : String - l'uid de l'article contenant la composition
* **language** : String - la langue dans laquelle seront traduits les origines variétales

## getVarietalOrigins(final Object vReceipeProperty, final Object uid, final String language, final String varietalOriginVoc, final String subVarietalOriginVoc)

### Fonction
Retourne la traduction des origines variétales à partir d'une composition.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **vReceipeProperty** : Object - le nom du champ contenant la composition (ex : `vrp:components`)
* **uid** : String - l'uid de l'article contenant la composition
* **language** : String - la langue dans laquelle seront traduits les origines variétales
* **varietalOriginVoc** : String - le vocabulaire des origines variétales
* **subVarietalOriginVoc** : String - le sous-vocabulaire des origines variétales

## getVarietalOrigins(final String vReceipeProperty, final String uid, final String language)

### Fonction
Retourne la traduction des origines variétales à partir d'une composition et du vocabulaire des origines variétales standard (RMOrigin/RMSubOrigin).

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **vReceipeProperty** : String - le nom du champ contenant la composition (ex : `vrp:components`)
* **uid** : String - l'uid de l'article contenant la composition
* **language** : String - la langue dans laquelle seront traduits les origines variétales

## getVarietalOrigins(final String vReceipeProperty, final String uid, final String language, final String varietalOriginVoc, final String subVarietalOriginVoc)

### Fonction
Retourne la traduction des origines variétales à partir d'une composition.

### Compatibilité
>MS Word, MS Excel

### Paramètres
* **vReceipeProperty** : String - le nom du champ contenant la composition (ex : `vrp:components`)
* **uid** : String - l'uid de l'article contenant la composition
* **language** : String - la langue dans laquelle seront traduits les origines variétales
* **varietalOriginVoc** : String - le vocabulaire des origines variétales
* **subVarietalOriginVoc** : String - le sous-vocabulaire des origines variétales
