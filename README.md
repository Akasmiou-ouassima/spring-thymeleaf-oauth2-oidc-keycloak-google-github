## Les dépendances
![img.png](captures/img.png)

## Diagramme de séquence OAuth2
<img src="captures/img_1.png" width="500" alt="Diagramme de séquence OAuth2">

## Création du projet
![img_2.png](captures/img_2.png)

## Création d'API
![img_4.png](captures/img_4.png)

## Cliquer sur identifiants
![img_5.png](captures/img_5.png)

## Cliquer sur ID client OAuth
![img_6.png](captures/img_6.png)

## Choisir externe pour autoriser tous les utilisateurs
![img_7.png](captures/img_7.png)

## Entrer le nom de l'application et l'adresse email
![img_8.png](captures/img_8.png)

## Créer les identifiants, cliquer sur ID client OAuth
![img_9.png](captures/img_9.png)

![img_10.png](captures/img_10.png)

## Client OAuth créé
![img_11.png](captures/img_11.png)

![img_13.png](captures/img_13.png)

## Modifier l'url en mettant l'url de redirection de l'application
![img_12.png](captures/img_12.png)

## ajouter les identifiants dans le fichier de configuration

```bash
spring.security.oauth2.client.registration.google.clientId=294778775600-pi63tt3tep6tn58kanh7jeo9ovlk3j2r.apps.googleusercontent.com
spring.security.oauth2.client.registration.google.client-secret=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
spring.security.oauth2.client.provider.google.user-name-attribute=email
```
![img_19.png](captures/img_19.png)
## Aprés l'authentification par google, on peut accéder à l'application

![img_15.png](captures/img_15.png)
![img_16.png](captures/img_16.png)
![img_17.png](captures/img_17.png)
![img_18.png](captures/img_18.png)

```bash
spring.security.oauth2.client.registration.github.clientId=88195d0ca4e12ef9a211 
spring.security.oauth2.client.registration.github.client-secret=2706673800b8811ff728a4a4d4a61de083d22e28
spring.security.oauth2.client.provider.github.user-name-attribute=login
```
![img_20.png](captures/img_20.png)
![img_21.png](captures/img_21.png)

## Aprés l'authentification par github, on peut accéder à l'application
![img_22.png](captures/img_22.png)

## Si on authentifier par google, l'email de l'utilisateur est affiché dans navbar
![img_24.png](captures/img_24.png)

## Si on authentifier par github, le login de l'utilisateur est affiché dans navbar
![img_23.png](captures/img_23.png)

## Maintenant on va faire la même chose avec keycloak

> On démarrer keycloak 

![img_25.png](captures/img_25.png)

## 1-On créer un nouveau realm
![img_26.png](captures/img_26.png)

## 2-On créer un nouveau client
![img_27.png](captures/img_27.png)

## On active l'option "Client Authentication" pour qu'on puisse authentifier par client ID et client secret
![img_28.png](captures/img_28.png)

![img_29.png](captures/img_29.png)

## 3-On créer un nouveau utilisateur
![img_32.png](captures/img_32.png)
![img_34.png](captures/img_34.png)

## Attribuer un mot de passe à l'utilisateur
![img_33.png](captures/img_33.png)
![img_35.png](captures/img_35.png)

## 4-On créer un nouveaux rôles
![img_30.png](captures/img_30.png)
![img_31.png](captures/img_31.png)

## 5-On affecte le rôle à l'utilisateur
![img_36.png](captures/img_36.png)
![img_37.png](captures/img_37.png)

![img_38.png](captures/img_37.png)
