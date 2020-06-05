  Feature: US_007 Parcourir le contenu du colis
  En tant que "Eleveur d'oiseau"
  Je souhaite pouvoir chercher ou se trouve mon oiseau dans le colis
  Afin de faciliter la livraison

  Scenario: Recherche d'oiseau dans le colis
    Given Un colis contient d'autres colis
    When le vendeur parcourt la composition de son colis <pack1>
    Then trouver facilement les colis lors de la livraison