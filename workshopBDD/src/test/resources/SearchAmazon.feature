Feature: la fonctionnalit� de recherche dans Amazon.fr
  
  Scenario outline: Rechberche ParfumTypes aboutie
  Given Je connecte au site Amason
  When Je cherche "<type produit>" dans la barre de recherche
  Then La page souhait�e s affiche

  
  Examples:
    |typeProduit|
    |Parfum     |
    |Vetement   |
    |PC         |