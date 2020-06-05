Feature: US_002 Rechercher Matiere Nid

  En tant que Dresseur de rapaces
  Je souhaite effectuer une recherche sur l’habitat d’un oiseau
  Afin de savoir quelle est la matière du nid habité

  Scenario : il existe au moins un oiseau habitant le nid
    Given le nid et l’index de l'oiseau habitant ce nid
    When le dresseur valide la recherche
    Then le type de l'oiseau ainsi que la matière du nid sont retournes

  Scenario : il n'existe aucun oiseau habitant le nid
    Given le nid et l’index de l'oiseau habitant ce nid
    When le dresseur valide la recherche et le nid est vide
    Then la matière du nid est retournee
