# tpJpaWebservice

## objectifs

* Comprendre les m�canismes des servlets
* R�aliser une application web en combinant JPA et les Servlets
* Comprendre les principes d'une architecture Rest
* Comprendre les b�n�fices d'un framework come Jersey

## Sujet
l'objectif est de continuer le d�veloppement d'une application type r�seau social
permettant de comparer sa consommation �lectrique avec ses amis, ses voisins,...
dans la lign�e de Opower.
OPower est une soci�t� am�ricaine qui est fond�e sur un principe de base d�j� 
porteur : gr�ce � son logiciel, il permet aux consommateurs de ma�triser leur 
consommation d��nergie. En effet, il travaille conjointement avec des fournisseurs 
de services publics (�lectricit�, gaz, t�l�phone, etc.) pour promouvoir 
l'efficacit� �nerg�tique. Mais lorsqu�il se met � surfer sur la vague Facebook, 
Opower fait de l��conomie d��nergie un jeu� qui pourrait s�duire ses clients !
Opower a cr�� une application (li�e � Facebook) qui permet de suivre sa 
consommation �lectrique dans le cadre d�un r�seau social. 
Ainsi les consommateurs peuvent comparer leur consommation d��lectricit� 
poweravec celle de ses voisins sur le r�seau social� De l��conomie d��nergie ludique !

## D�marrage de la base de donn�es
A la racine de ce dep�t, se trouve ce script de d�marrage de la base de donn�es
[run-hsqldb-server.sh](https://github.com/adjagossan/tpJpaWebservice/blob/master/run-hsqldb-server.sh)
et ce script de d�marrage du manager [show-hsqldb.sh](https://github.com/adjagossan/tpJpaWebservice/blob/master/show-hsqldb.sh)
Lancez le syst�me de base de donn�es, puis le Manager et connectez vous � la base
de donn�es (login: **sa** et **pas de mot de passe**, Url de connexion:**jdbc:hsqldb:hsql://localhost/**
Le fichier de donn�es se trouve dans le r�pertoire **data**, il est possible de 
supprimer son contenu si l'on souhaite r�initialiser compl�tement la base de donn�es.
Le diagramme de classe � ce jour se pr�sente comme suit:
:
![alt text](https://github.com/adjagossan/tpJpaWebservice/blob/master/img/diagram-class.PNG "")
