#languaje: es
#Autor: Uberney Delgado

  @Stories
     Feature: Registro de usuario

    @scenario1
    Scenario: Registro de usuario en la pagina
      Given Se requiere registarse en la pagina de utest
      When ingresa toda la informacion necesaria
      |Nombre| Apellido| Correo| Mes|Dia|NaAno|Idioma|Ciudad|CodigoPostal|Pais
      |Uberney|Delgado |Uberney2001@gmail.com|08|31|2001|spanish|Medellin|050016|Colombia
      Then se completa el registro
