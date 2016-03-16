# tpJpaWebservice

## objectifs

<<<<<<< HEAD
* Comprendre les m�canismes des servlets
* R�aliser une application web en combinant JPA et les Servlets
* Comprendre les principes d'une architecture Rest
* Comprendre les b�n�fices d'un framework come Jersey
=======
* Comprendre les mécanismes des servlets
* Réaliser une application web en combinant JPA et les Servlets
* Comprendre les principes d'une architecture Rest
* Comprendre les bénéfices d'un framework come Jersey
>>>>>>> 115df4682009b1de9415fc17b101e33c36f921e5

## Sujet
l'objectif est de continuer le développement d'une application type réseau social
permettant de comparer sa consommation électrique avec ses amis, ses voisins,...
dans la lignée de Opower.
OPower est une société américaine qui est fondée sur un principe de base déjà 
porteur : grâce à son logiciel, il permet aux consommateurs de maîtriser leur 
consommation d’énergie. En effet, il travaille conjointement avec des fournisseurs 
de services publics (électricité, gaz, téléphone, etc.) pour promouvoir 
l'efficacité énergétique. Mais lorsqu’il se met à surfer sur la vague Facebook, 
Opower fait de l’économie d’énergie un jeu… qui pourrait séduire ses clients !
Opower a créé une application (liée à Facebook) qui permet de suivre sa 
consommation électrique dans le cadre d’un réseau social. 
Ainsi les consommateurs peuvent comparer leur consommation d’électricité 
poweravec celle de ses voisins sur le réseau social… De l’économie d’énergie ludique !

## Démarrage de la base de données
A la racine de ce depôt, se trouve ce script de démarrage de la base de données
[run-hsqldb-server.sh](https://github.com/adjagossan/tpJpaWebservice/blob/master/run-hsqldb-server.sh)
<<<<<<< HEAD
et ce script de d�marrage du manager [show-hsqldb.sh](https://github.com/adjagossan/tpJpaWebservice/blob/master/show-hsqldb.sh)
Lancez le syst�me de base de donn�es, puis le Manager et connectez vous � la base
de donn�es (login: **sa** et **pas de mot de passe**, Url de connexion:**jdbc:hsqldb:hsql://localhost/**
Le fichier de donn�es se trouve dans le r�pertoire **data**, il est possible de 
supprimer son contenu si l'on souhaite r�initialiser compl�tement la base de donn�es.
Le diagramme de classe � ce jour se pr�sente comme suit:
:
=======
et ce script de démarrage du manager
[show-hsqldb.sh](https://github.com/adjagossan/tpJpaWebservice/blob/master/show-hsqldb.sh)
Lancez le système de base de données, puis le Manager et connectez vous à la base
de données (login: **sa** et **pas de mot de passe**, Url de connexion:**jdbc:hsqldb:hsql://localhost/**
Le fichier de données se trouve dans le répertoire **data**, il est possible de 
supprimer son contenu si l'on souhaite réinitialiser complètement la base de données.
Le diagramme de classe à ce jour se présente comme suit:
>>>>>>> 115df4682009b1de9415fc17b101e33c36f921e5
![alt text](https://github.com/adjagossan/tpJpaWebservice/blob/master/img/diagram-class.PNG "")
