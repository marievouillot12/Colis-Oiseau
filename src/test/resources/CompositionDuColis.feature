  Feature: US_006_Composition_du_Colis
  En tant que "Eleveur d'oiseau"
  Je souhaite avoir la possibilité de séparer les oiseaux dans les colis
  Afin qu'ils ne se mangent pas entre eux
  @Test
    Scenario: séparation des oiseaux dans les colis
      Given Un colis <pack1> peut contenir un autre colis <pack2> afin de séparer les oiseaux
      When Le Livreur rempli le colis
      Then Il pourra y mettre un colis <pack2> ou un oiseau <oiseau1>

