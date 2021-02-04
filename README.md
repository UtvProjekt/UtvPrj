# UtvPrj

#Ladda ner:

1. Clona projektet med: git clone https://github.com/UtvProjekt/UtvPrj.git "namn"
2. Gå in på eclips, välj "file" längst upp till vänster
3. välj: import...
4. välj: Existing Maven Project
5. välj: Browse.. brevid "root directory"
6. hitta vart projektet ligger och välja mappen
7. kryssa i pom.xml rutan och tryck "finish"
8. Nu har du clonat programmet och gör följande: 
9. refresha
10. högerklicka på projekten, sedan "run as", sedan välj 
  1. java Application, för att spela spelet
  2. jUnit Test, för testerna
  3. maven.. sedan: package clean


Programmet bygger på fyra olika klasser (AbilityBook, AbilityDamage, ChooseYourCharacter och TheStory)

Spelet körs från TheFinalBoss.java där man har en metod "startStory()", spelet går ut på att välja namn och karaktär för att sedan möta en boss.

Kontrollerna till spelet visas under storyns gång men här under kan du se några basic kontroller som kommer användas. (Kontollerna kommer inte alltid funka
men man kommer se i terminalen när dem väl kan användas).

Gå vidare från tidigare händelse (Enter)

1 (Använd attack 1 för din karaktär)
2 (Använd attack 2 för din karaktär)
3 (Använd attack 3 för din karaktär)
4 (Öppna en bok som visar alla attacker för din karaktär)
