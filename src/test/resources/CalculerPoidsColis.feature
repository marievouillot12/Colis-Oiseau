Feature: US_000 Enregistrer les colis
  En tant que client
  Je veux être sûr que le poids de mon colis est correct en fonction des charges ajoutées
  Afin de m'assurer que le colis a été bien chargé

  Scenario : calcul du poids du colis
    Given le colis <pack1> pèse initialement 0.1 kg
    When le client charge le colis <pack1> avec une charge <charge1>
    Then le nouveau poids du colis <pack1> sera automatiquement calculé



