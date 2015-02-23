## plim-tolerances-contrib.xml
Ce point d'extention permet de définir des tolérances à appliquer pour chaque nutriment défini dans le fichier.
Lors du calcul des nutriments (lancé par une automation), le point d'extension est pris en compte afin d'appliquer les tolérances.

### Utilisation
Le tableau des portions et AQR est disponible dans l'onglet *Caractéristiques* d'un produit fini ou d'une recette, dans le sous-onglet *Nutriments*.

Dans la partie basse du sous-onglet, la zone "*PORTION ET AQR*" permet de modifier la valeur de la portion, et d'afficher le tableau des portions et AQR calculés.
Ce calcul est effectué via l'action "*Calcul des nutriments*" disponible dans le menu du document courant.

Les calculs sont effectués en utilisant les informations définies dans la contribution du service de calcul des nutriments.

### Structure
> ```xml
<nutrientTolerance id="vnu:lipids">
  <tolerance>
    <filter max="10" max-included="false" unitId="gBy100g" />
    <value plus="1.5" plus-unitId="gBy100g" minus="1.5"
           minus-unitId="gBy100g" />
  </tolerance>
  <tolerance>
    <filter max="40" max-included="true" unitId="gBy100g" />
    <value plus="20" plus-unitId="percent" minus="20"
           minus-unitId="percent" />
  </tolerance>
  <tolerance>
    <filter min="40" min-included="false" unitId="gBy100g" />
    <value plus="8" plus-unitId="gBy100g" minus="8" 
           minus-unitId="gBy100g" />
  </tolerance>
  <tolerance>
    <filter min="10" min-included="true" unitId="gBy100g" />
    <value plus="20" plus-unitId="percent" minus="20"
           minus-unitId="percent" />
  </tolerance>
</nutrientTolerance>
```

### Dictionnaire
* **nutrientTolerance** permet de définir une ou plusieurs tolérances à respecter pour un nutriment
    * l'attribut **id** est le nom du nutriment dans le schema
* **tolerance** défini la tolérance à respecter
    * **filter** est le filtre dans lequel s'applique la tolérance
        * les attributs **min** et **max** définissent les bornes dans lesquelles s'applique la tolérance
        * les attributs **min-included** et **max-included** déterminent l'inclusion ou non
        * l'attribut **unitId** est le nom de l'unité utilisé
    * **value** est la valeur de la tolérance
        * les attributs **plus** et **plus-unitId** définissent respectivement la valeur haute de la tolérance et son unité
        * les attributes **minus** et **minus-unitId** définissent respectivement la valeur basse de la tolérance et son unité
        
### Valeurs par défaut

| Nutriments                    | V2 - Règles       | V2 - Arrondi      | V1 - Régles   | V1 - Arrondi      |
|-------------------------------|:-----------------:|:-----------------:|:-------------:|:-----------------:|
| **Lipides**                   | < 10 g/100g       | +/- 1,5 g/100g    | < 4 g/100g    | +/- 1 g/100g      |
|                               | <= 40 g/100g      | +/- 20%           | >= 4 g/100g   | +/- 25%           |
|                               | > 40 g/100g       | +/- 8 g/100g      |               |                   |
|                               | >= 10 g/100g      | +/- 20%           |               |                   |
| **Protéines**                 | < 10 g/100g       | +/- 2 g/100g      | < 4 g/100g    | +/- 1 g/100g      |
|                               | <= 40 g/100g      | +/- 20%           | >= 4 g/100g   | +/- 25%           |
|                               | > 40 g/100g       | +/- 8 g/100g      |               |                   |
|                               | >= 10 g/100g      | +/- 20%           |               |                   |
| **Sucre**                     | < 10 g/100g       | +/- 2 g/100g      | < 4 g/100g    | +/- 1 g/100g      |
|                               | <= 40 g/100g      | +/- 20%           | >= 4 g/100g   | +/- 25%           |
|                               | > 40 g/100g       | +/- 8 g/100g      |               |                   |
|                               | >= 10 g/100g      | +/- 20%           |               |                   |
| **Glucides**                  | < 10 g/100g       | +/- 2 g/100g      | < 4 g/100g    | +/- 1 g/100g      |
|                               | <= 40 g/100g      | +/- 20%           | >= 4 g/100g   | +/- 25%           |
|                               | > 40 g/100g       | +/- 8 g/100g      |               |                   |
|                               | >= 10 g/100g      | +/- 20%           |               |                   |
| **Acides gras saturés**       | < 4 g/100g        | +/- 0.8 g/100g    | < 4 g/100g    | +/- 1 g/100g      |
|                               | >= 4 g/100g       | +/- 20%           | >= 4 g/100g   | +/- 25%           |
| **Acides gras monoinsaturés** | < 4 g/100g        | +/- 0.8 g/100g    | < 4 g/100g    | +/- 1 g/100g      |
|                               | >= 4 g/100g       | +/- 20%           | >= 4 g/100g   | +/- 25%           |
| **Acides gras polyinsaturés** | < 4 g/100g        | +/- 0.8 g/100g    | < 4 g/100g    | +/- 1 g/100g      |
|                               | >= 4 g/100g       | +/- 20%           | >= 4 g/100g   | +/- 25%           |
| **Energie kJ**                |                   | +/- 25%           |               | +/- 25%           |
| **Energie kCal**              |                   | +/- 25%           |               | +/- 25%           |
| **Fibres**                    | < 10 g/100g       | +/- 2 g/100g      | < 3 g/100g    | +/- 1.2 g/100g    |
|                               | <= 40 g/100g      | +/- 20%           | >= 3 g/100g   | +/- 40%           |
|                               | > 40 g/100g       | +/- 8 g/100g      |               |                   |
|                               | >= 10 g/100g      | +/- 20%           |               |                   |
| **Sodium**                    | >= 0.5 g/100g     | +/- 20%           | >= 30 g/100g  | +/- 30%           |
|                               | < 0.5 g/100g      | +/- 0.15 g/100g   | < 30 g/100g   | +/- 9 mg/100g     |
| **Equivalent sel**            | >= 1.25 g/100g    | +/- 20%           | >= 30 g/100g  | +/- 30%           |
|                               | < 1.25 g/100g     | +/- 0.375 g/100g  | < 30 g/100g   | +/- 9 mg/100g     |
