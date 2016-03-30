### JPA & Web Service

##### objectifs
* Comprendre les mécanismes des servlets
* Réaliser une application web en combinant JPA et les Servlets
* Comprendre les principes d'une architecture Rest
* Comprendre les bénéfices d'un framework come Jersey

##### Demarrage de la base de données
**_sh run-hsqldb-server.sh_**
##### Démarrage du manager de la base de données
**_sh shwo-hsqldb.sh_**
##### parametres de connexion à la base de données:
login: **_sa_** et **_pas de mot de passe_**

Url de connexion: **_jdbc:hsqldb:hsql://localhost/_**

:information_source: Supprimez le contenu du répertoire **_data_**, si vous souhaitez réinitialiser la base de données.

##### Demarrage de l'application
**_mvn tomcat7:run_**
