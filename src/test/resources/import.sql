-- Toutes les requetes doivent être sur une ligne
-- Ne pas forcer les Ids

INSERT INTO tdd.sexe (libelle) VALUES ('HOMME');
INSERT INTO tdd.sexe (libelle) VALUES ('FEMME');

INSERT INTO tdd.client (dateNaissance, email, isActive, nom, numeroTelephone, prenom, sexe_id) VALUES ('1981-02-07', 'karim@gmail.com', 1, 'karim', '0660540094', 'karim', 1);
INSERT INTO tdd.client (dateNaissance, email, isActive, nom, numeroTelephone, prenom, sexe_id) VALUES ('1987-02-07', 'ilias@gmail.com', 1, 'ilias','0210232145', 'ilias', 2);