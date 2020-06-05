  Feature: US_001 Donner les prix des colis
  En tant que client
  Je veux être sûr de payer le prix correspondant au poids de mon colis
  Afin de m'assurer que le prix  à payer est justifié

  Scenario: calcul du prix du colis
    Given le remplissage d'un bon de livraison <dv1> avec deux colis
    When les colis du bon de livraison ont un poids total <totalWeight1>
    Then le prix du colis <price> sera automatiquement calculé

