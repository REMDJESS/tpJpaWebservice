## JPA & Web Service

### objectifs
* Comprendre les mécanismes des servlets
* Réaliser une application web en combinant JPA et les Servlets
* Comprendre les principes d'une architecture Rest
* Comprendre les bénéfices d'un framework come Jersey

### Demarrage de la base de donnees
A la racine de ce depôt, se trouve ce script de démarrage de la base de données
[run-hsqldb-server.sh](https://github.com/adjagossan/tpJpaWebservice/blob/master/run-hsqldb-server.sh)
Tapez **sh run-hsqldb-server.sh** pour l'executer
et le script de démarrage du manager de la base de données [show-hsqldb.sh](https://github.com/adjagossan/tpJpaWebservice/blob/master/show-hsqldb.sh)
Tapez **sh shwo-hsqldb.sh** pour l'executer
Les parametres de connexion à la base de données:
login: **sa** et **pas de mot de passe**
Url de connexion:**jdbc:hsqldb:hsql://localhost/**
Supprimez le contenu du répertoire **data**, si vous souhaitez réinitialiser la base de données.

### Demarrage l'application
Tapez **mvn tomcat7:run**
