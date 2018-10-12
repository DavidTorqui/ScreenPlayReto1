#language:es
#Author: your.email@your.domain.com

Característica: Registro de Usuario
	Como usuario
	Quiero ingresar al Automation Demo Site
	A Mirar una lista.
	
		@tag
		Escenario: Diligenciar los campos del formulario
		Dado que Carlos quiere acceder a la Web Automation Demo Site
		Cuando el realiza el registro en la pagina
		| firstName  | lastName | adress  | email 			 	   | phone 		   | languages | skills | country | selecttCountry | year | mont | day | password | comPassword | 
		| David		   | Torres 	| Cll 15  | adtq15@gmail.com | 3102411094  | Arabic	   | C      | Albania | Australia	  	 | 1997 | April| 3   | Abcd1234 | Abcd1234	   |
		Entonces el verifica que se carga la pantalla con texto - Double Click on Edit Icon to EDIT the Table Row.