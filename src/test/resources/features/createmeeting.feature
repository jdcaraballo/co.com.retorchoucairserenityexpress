Feature: Agendar reunion
  Yo como usuario de la pagina
  Quiero agendar reunion
  Para validar los business


  Scenario: Crear nuevo Biseness
    Given que David abre la pagina con usuario: admin y la clave: serenity
    When el agenda una reunion reunión_1, 12345, Customer
    Then el puede verlo en Business Meet
