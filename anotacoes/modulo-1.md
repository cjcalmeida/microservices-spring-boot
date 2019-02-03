# Anotações
	- É possivel criar uma aplicação spring com o curl, para saber mais basta executar:
		curl http://start.spring.io
	- Os componentes Starters do Spring automatizam funcionalidades e/ou configurações necessárias, para o uso certas técnologias como o Redis, Seguranças, etc, para saber mais sobre eles, acesse: 
		- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using-boot-starter

# Lembretes
	- Visão geral de como funciona o Auto-Configuration do Spring:
		- A anotação @EnableAutoConfiguration indica ao spring que deve ser carregado os arquivos META-INF/spring.factories
		- No spring.factories, ficam declarações de de classes de configurações (@Configuration).
		- Cada configuração é condicional (@Conditional)

# Observações
	- Aparentemente o Undertow é o servidor embarcado mais rapido, que suporta maior quantidade de requests, com uma menor quantidade de theads e menor consumo de memoria se comparado ao Tomcat (servidor embarcado default do spring). 
		- Conclusões baseadas nos estudos feitos pelos arquigo: 
			- https://www.baeldung.com/spring-boot-servlet-containers
			- https://examples.javacodegeeks.com/enterprise-java/spring/tomcat-vs-jetty-vs-undertow-comparison-of-spring-boot-embedded-servlet-containers/