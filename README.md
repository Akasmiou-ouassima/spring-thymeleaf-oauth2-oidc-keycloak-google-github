## Les dépendances
<p align="center">
  <img src="captures/img.png" width="200">
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
<p align="center">
  <img src="captures/img_13.png" width="500">
</p>

## Modifier l'URL en mettant l'URL de redirection de l'application
<p align="center">
  <img src="captures/img_12.png" width="500">
</p>

## Ajouter les identifiants dans le fichier de configuration
```bash
spring.security.oauth2.client.registration.github.clientId=88195d0ca4e12ef9a211 
spring.security.oauth2.client.registration.github.client-secret=2706673800b8811ff728a4a4d4a61de083d22e28
spring.security.oauth2.client.provider.github.user-name-attribute=login
```

## Après l'authentification par Google, on peut accéder à l'application
<p align="center">
  <img src="captures/img_19.png" width="500">
</p>

## Pour l'authentification par github accéder à Developer Settings
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


## Aprés l'authentification par github, on peut accéder à l'application
<p align="center">
  <img src="captures/img_20.png" width="500">
</p>

## Autoriser l'accès à l'application
<p align="center">
  <img src="captures/img_21.png" width="500">
</p>

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

## On active l'option "Client Authentication" pour qu'on puisse authentifier par client ID et client secret
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
