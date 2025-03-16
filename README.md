
---

### **README.md**  

```md
# 🚦 Feu Tricolore & Carrefour - Jetpack Compose 🚗  

## 📌 Description  
Ce projet est une application Android développée avec **Jetpack Compose**, permettant de simuler un **feu tricolore** et un **carrefour** avec plusieurs feux. L'application suit l'architecture **MVVM** (Modèle - Vue - ViewModel) et utilise **mutableStateOf** pour gérer les états dynamiques.  

## 🚀 Fonctionnalités  
✅ Simulation d’un **feu tricolore interactif** (Rouge, Orange, Vert)  
✅ Ajout d’un **bouton** pour passer à l’état suivant  
✅ **Affichage graphique** avec `Canvas` pour dessiner les feux  
✅ Gestion d’un **carrefour avec 4 feux** synchronisés  
✅ **Architecture MVVM** pour séparer modèle, vue et contrôleur  

## 🛠️ Technologies utilisées  
- **Langage** : Kotlin  
- **Framework** : Jetpack Compose  
- **Architecture** : MVVM (Model - View - ViewModel)  
- **State Management** : `mutableStateOf`  
- **Graphisme** : `Canvas` pour dessiner les feux  

## 📂 Structure du projet  
```
/feu-tricolore-carrefour  
│── app/src/main/java/fr/iutlan/tp4/  
│   ├── feu3/  
│   │   ├── state/  
│   │   │   ├── Feu3State.kt         # Modèle du feu  
│   │   ├── controller/  
│   │   │   ├── Feu3ViewModel.kt     # ViewModel du feu  
│   │   ├── ui/  
│   │       ├── Feu3View.kt          # Interface du feu  
│   ├── carrefour/  
│   │   ├── state/  
│   │   │   ├── CarrefourState.kt    # Modèle du carrefour  
│   │   ├── controller/  
│   │   │   ├── CarrefourViewModel.kt# ViewModel du carrefour  
│   │   ├── ui/  
│   │       ├── CarrefourView.kt     # Interface du carrefour  
│── MainActivity.kt                   # Point d’entrée  
│── README.md                          # Documentation  
│── build.gradle.kts                   # Dépendances  
```

## 🔧 Installation et exécution  
1. **Cloner le projet**  
   ```sh
   git clone <URL_DU_REPO>
   cd feu-tricolore-carrefour
   ```

2. **Exécuter l’application**  
   - Ouvrir le projet avec **Android Studio**  
   - Lancer un **émulateur AVD** ou brancher un appareil physique  
   - Exécuter l’application en cliquant sur ▶️  

## 📝 Commandes Git utiles  
```sh
git init               # Initialiser un dépôt Git  
git add .              # Ajouter tous les fichiers modifiés  
git commit -m "Initial commit"  # Sauvegarder les modifications  
git branch -M main     # Nommer la branche principale  
git remote add origin <URL_DU_REPO>  # Associer le projet à un repo distant  
git push -u origin main   # Pousser le projet vers GitHub  
```

## 📖 Explication du projet  
### 🔹 **1. Feu Tricolore**  
- **Modèle** (`Feu3State.kt`) : Définit l’état (Rouge, Orange, Vert)  
- **Vue** (`Feu3View.kt`) : Affichage sous forme de texte et graphique (`Canvas`)  
- **Contrôleur** (`Feu3ViewModel.kt`) : Gère les transitions entre états  

### 🔹 **2. Carrefour avec plusieurs feux**  
- **Modèle** (`CarrefourState.kt`) : Gère l’état de 4 feux simultanément  
- **Vue** (`CarrefourView.kt`) : Affichage du carrefour  
- **Contrôleur** (`CarrefourViewModel.kt`) : Gère les règles de transition  

## 📷 Aperçu de l’interface

## 📌 À améliorer  
- Ajouter des **animations** pour les transitions des feux  
- Implémenter un **mode manuel/automatique** pour les changements d’état  
- Enrichir l’interface avec **Material 3**  

## 👤 Auteur  
👩‍💻 **Rajaa Rabih**  
✉️ Contact : rajaarabihh@gmai.com
