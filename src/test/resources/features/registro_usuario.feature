#Autor: Camilo Nunez
  @stories
  Feature: Registro de usuario en la plataforma Utest
    @scenario1
    Scenario: Registro de Camilo en Utest
      Given Camio quiere registrarse en Utest
      When El usuario ingresa los datos requeridos por el sistema
        |strNombre|strApellido|strEmail                |strMesNacimiento|strDiaNacimiento|strAnoNacimiento|strCiudad|strZip        |strPais  |strDispositivoMovil|strModeloMovil|strSistemaOperativoMovil|strClave  |
        |Camilo   |Nunez      |cnunezt96OO9cnt@gmail.com|January         |11              |1996            |Palmira  |123458898945 |Colombia |Apple              |iphone 5S     |iOS 11.0                |Camilo123.|
      Then El registro se completa al ver el boton de Complete Setup
      |strTextoFinal |
      |Complete Setup|
