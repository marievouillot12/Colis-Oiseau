Feature: US_003 Ajouter Oiseau Au Nid

  En tant que Dresseur de rapaces
  Je souhaite ajouter un oiseau à un nid
  Afin d'affecter cet oiseau à un nid donné

  Scenario : il reste de l'espace au sein du nid
    Given le nid contenant de la place
    When le dresseur ajoute l'oiseau au nid
    Then le nid contient l'oiseau nouvellement ajouté

  Scenario : la capacité du nid a atteint sa limite
    Given le nid plein
    When le dresseur ajoute l'oiseau au nid
    Then le nid reste tel quel et l'oiseau n'est pas ajouté
