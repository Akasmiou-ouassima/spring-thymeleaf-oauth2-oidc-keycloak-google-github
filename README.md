## Les dépendances
<p align="center">
  <img src="captures/img.png" width="300">
</p>

## Diagramme de séquence OAuth2
<p align="center">
  <img src="captures/img_1.png" width="500" alt="Diagramme de séquence OAuth2">
</p>

## Création du projet
<p align="center">
  <img src="captures/img_2.png"  width="500">
</p>

## Création d'API
<p align="center">
  <img src="captures/img_4.png"  width="500">
</p>

## Cliquer sur identifiants
<p align="center">
  <img src="captures/img_5.png"  width="500">
</p>

## Cliquer sur ID client OAuth
<p align="center">
  <img src="captures/img_6.png"  width="500">
</p>

## Choisir externe pour autoriser tous les utilisateurs
<p align="center">
  <img src="captures/img_7.png" width="500">
</p>

## Entrer le nom de l'application et l'adresse email
<p align="center">
  <img src="captures/img_8.png" width="500">
</p>

## Créer les identifiants, cliquer sur ID client OAuth
<p align="center">
  <img src="captures/img_9.png" width="500">
</p>
<p align="center">
  <img src="captures/img_10.png" width="500">
</p>

## Client OAuth créé
<p align="center">
  <img src="captures/img_11.png" width="500">
</p>

# Pour l'authentification par Google
## Ajouter les identifiants dans le fichier de configuration
```bash
spring.security.oauth2.client.registration.google.clientId=294778775600-pi63tt3tep6tn58kanh7jeo9ovlk3j2r.apps.googleusercontent.com
spring.security.oauth2.client.registration.google.client-secret=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
spring.security.oauth2.client.provider.google.user-name-attribute=email
```

## Accéder à l'application
<p align="center">
  <img src="captures/img_19.png" width="500">
</p>

## Après l'authentification par Google on obtient Accès bloqué
<p align="center">
  <img src="captures/img_13.png" width="500">
</p>

## Modifier l'URL en mettant l'URL de redirection de l'application
<p align="center">
  <img src="captures/img_12.png" width="500">
</p>


# Pour l'authentification par Github
## Ajouter les identifiants dans le fichier de configuration
```bash
spring.security.oauth2.client.registration.github.clientId=88195d0ca4e12ef9a211 
spring.security.oauth2.client.registration.github.client-secret=2706673800b8811ff728a4a4d4a61de083d22e28
spring.security.oauth2.client.provider.github.user-name-attribute=login
```
##  Accéder à Developer Settings de github
<p align="center">
  <img src="captures/img_15.png" width="500">
</p>

## Aprés github accéder à OAuth Apps
<p align="center">
  <img src="captures/img_16.png" width="500">
</p>

## Cliquer sur New OAuth App
<p align="center">
  <img src="captures/img_17.png" width="500">
</p>

## OAuth Apps créé 
<p align="center">
  <img src="captures/img_18.png" width="500">
</p>


## Accéder à l'application par github
<p align="center">
  <img src="captures/img_20.png" width="500">
</p>

## Autoriser l'accès à l'application
<p align="center">
  <img src="captures/img_21.png" width="500">
</p>

## Ajouter l'URL d'autorisation
<p align="center">
  <img src="captures/img_22.png" width="500">
</p>

## Si on authentifier par google, l'email de l'utilisateur est affiché dans navbar
<p align="center">
  <img src="captures/img_24.png">
</p>

## Si on authentifier par github, le login de l'utilisateur est affiché dans navbar
<p align="center">
  <img src="captures/img_23.png">
</p>

# Pour l'authentification par Keycloak
## Maintenant on va faire la même chose avec keycloak

> On démarrer keycloak 
<p align="center">
  <img src="captures/img_25.png" width="500">
</p>

## 1-On créer un nouveau realm
<p align="center">
  <img src="captures/img_26.png" width="500">
</p>

## 2-On créer un nouveau client
<p align="center">
  <img src="captures/img_27.png" width="500">
</p>

**On active l'option "Client Authentication" pour qu'on puisse authentifier par client ID et client secret**
<p align="center">
  <img src="captures/img_28.png" width="500">
</p>
<p align="center">
  <img src="captures/img_29.png" width="500">
</p>

## 3-On créer un nouveaux utilisateurs
**user1**
<p align="center">
  <img src="captures/img_32.png" width="500">
</p>

**user2**
<p align="center">
  <img src="captures/img_34.png" width="500">
</p>

## Attribuer un mot de passe à l'utilisateur

**Si on active l'option "Temporary", l'utilisateur doit changer son mot de passe aprés la première connexion**
<p align="center">
  <img src="captures/img_33.png" width="500">
</p>
<p align="center">
  <img src="captures/img_35.png" width="500">
</p>

## 4-On créer un nouveaux rôles
**user1**
<p align="center">
  <img src="captures/img_30.png" width="500">
</p>

**user2**
<p align="center">
  <img src="captures/img_31.png" width="500">
</p>

## 5-On affecte le rôle à l'utilisateur
**user1**
<p align="center">
  <img src="captures/img_36.png" width="500">
</p>

**user2**
<p align="center">
  <img src="captures/img_37.png" width="500">
</p>
<p align="center">
  <img src="captures/img_38.png" width="500">
</p>

**application front channel c'est une application basée sur les redirections**

## On ajoute ces configurations dans le fichier application.properties

```bash
spring.security.oauth2.client.registration.keycloak.client-name=keycloak
spring.security.oauth2.client.registration.keycloak.client-id=oauth2-customer-client
spring.security.oauth2.client.registration.keycloak.client-secret=trpKl5a1fcOAZg19OUCeCPLBI87yjpDD
spring.security.oauth2.client.registration.keycloak.scope=openid,profile,email,offline_access
spring.security.oauth2.client.registration.keycloak.authorization-grant-type=authorization_code
spring.security.oauth2.client.registration.keycloak.redirect-uri=http://localhost:8083/login/oauth2/code/oauth2-customer-client
spring.security.oauth2.client.provider.keycloak.issuer-uri=http://localhost:8080/realms/oauth2-realm
spring.security.oauth2.client.provider.keycloak.user-name-attribute=preferred_username
```
## Maintenant on va accéder à l'application par keycloak
<p align="center">
  <img src="captures/img_39.png" width="500">
</p>

## On va s'authentifier par keycloak
<p align="center">
  <img src="captures/img_40.png" width="500">
</p>

<p>
  <img src="captures/img_41.png" width="500">
</p>

## On peut activer les options "User Registration" et "Forgot Password" pour que l'utilisateur puisse s'inscrire et récupérer son mot de passe en cas d'oubli et "Remember Me" pour que l'utilisateur puisse rester connecté et "email as username" pour que l'utilisateur puisse s'authentifier par email
<p align="center">
  <img src="captures/img_42.png" width="500">
</p>

<p align="center">
  <img src="captures/img_43.png" width="500">
</p>

## On registre un nouveau utilisateur
<p align="center">
  <img src="captures/img_44.png" width="500">
</p>

<p align="center">
  <img src="captures/img_45.png" width="500">
</p>

## On peut ajouter des informations supplémentaires comme l'adresse, le numéro de téléphone, le nom, le prénom, etc...
<p align="center">
  <img src="captures/img_46.png" width="500">
</p>
<p align="center">
  <img src="captures/img_47.png" width="500">
</p>

## On ajoute le role realm
<p align="center">
  <img src="captures/img_48.png" width="500">
</p>

## On active l'option "Add to ID token" pour que le role soit ajouté au token d'authentification et on ajoute le role realm à l'utilisateur
<p align="center">
  <img src="captures/img_49.png" width="500">
</p>

## Le role ajouté par défaut à l'utilisateur est "USER" 
<p align="center">
  <img src="captures/img_50.png" width="500">
</p>

<p align="center">
  <img src="captures/img_51.png" width="500">
</p>

## On peut ajouter les politiques de sécurité 
<p align="center">
  <img src="captures/img_52.png" width="500">
</p>

## Maintenant il reste à créer un microservice pour les produits et le communiquer avec le microservice customer
<p align="center">
  <img src="captures/img_53.png" width="500">
</p>

<p align="center">
  <img src="captures/img_54.png" width="500">
</p>

<p align="center">
  <img src="captures/img_55.png" width="500">
</p>

<p align="center">
  <img src="captures/img_56.png" width="500">
</p>
