Feature: Crear nuevo Biseness
  Yo como usuario de la pagina
  Quiero crear nuevo business
  Para validar los mi rol de usuario


  Scenario: Crear nuevo Biseness
    Given que David abre la pagina con usuario: admin y la clave: serenity
    When el crea un new business con el nombre de: Davi01
    Then el puede verlo en Business Units
