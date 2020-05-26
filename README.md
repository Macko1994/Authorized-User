# Authorized-User
Wymagania:
- Docker
- Java 11
- Spring Boot 2
- Gradle 6.3
 
1. W terminalu dockera przechodzimy do katalogu z projektem, do folderu "my-mysql" (np. C:/Users/user/Desktop/authorization/my-mysql)
2. Wpisujemy następnie komendę: docker build -t my-mysql .
3. Gdy załaduje się już obraz mysql, to następnie wpisujemy: docker run -d -p 3306:3306 --name my-mysql -e MYSQL_ROOT_PASSWORD=root my-mysql
(Mogą wystąpić konflikty nazw, gdy już taki kontener występuje. W tym wypadku trzeba zmienić mu nazwę)
4. Aby sprawdzić czy baza poprawnie się ściągnęła, wpisujemy:  docker exec -it my-mysql bash
5. Następnie:  mysql -uroot -p
6. Podajemy hasło "root"
7. Baza danych razem z tabelą i rekordami powinna się dać znaleźć.
8. Następnie w środowisku programistycznym uruchamiamy gradle build
9. Wyniki testów są dostępne w plikach authorization/my-reports/tests/test/index.html
10. Należy przejść do folderu authorization/build/libs i uruchomić komendę java -jar authorization-0.0.1-SNAPSHOT.jar
11. Przechodzimy na localhost:8080
12. Należy się zalogować danymi trzymanymi w bazie danych  -> nazwa: user   hasło: pass

 
 
