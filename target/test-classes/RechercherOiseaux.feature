Feature: US_001 Rechercher Oiseaux

  En tant que Dresseur de rapaces
  Je souhaite effectuer une recherche sur le nid
  Afin de savoir quels sont les oiseaux qui habitent le nid​

  Scenario : avoir la liste des oiseaux habitants le nid
    Given le nid
    When le dresseur valide la recherche
    Then la liste des oiseaux habitants le nid est retournee
