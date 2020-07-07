# marketplace
Creazione di un e-commerce come esercitazione. Il progetto è in fase di sviluppo.
Sono stati utilizzati: linguaggio Java con JDK versione 12.0.1, SpringBoot e un database MySqlWorkbeanch 8.0.17.

## Guida all'installazione

1 - Scaricare la Java virtual machine all'indirizzo "https://www.oracle.com/it/java/technologies/javase-downloads.html" selezionando JDK Download e seguendo le istruzioni.
2 - Scaricare un IDE per java a scelta, io utilizzerò Spring Tool Suite 4 scaricabile all'indirizzo "https://spring.io/tools". Seguire le istruzioni per l'installazione.
3 - Scaricare Mysql Workbench all'indirizzo "https://www.mysql.com/it/products/workbench/" e seguire le istruzione per l'installazione.
4 - Scaricare il file zip di questo progetto disponibile all'indirizzo "https://github.com/dvlp4u/marketplace" e dezipparlo in una cartella a scelta.
5 - Aprire Spring Tool Suite(STS) e selezionare "File -> import"; selezionare la voce "Maven" e "import like maven project";
6 - Selezionare a cartella del progetto "Marketplace" precedentemente scaricato e dezippato; comparirà il file POM, selezionarlo e cliccare su finish. Attendere qualche minuto che l'operazione sia completata. 
7 - Avviare MysqlWorckbench e creare una nuova istanza.
8 - Andare nel file "application.properties" dentro la cartella "src/main/resources" e modificare i seguenti dati con quelli inseriti nell'istanza di mySql:
     "spring.datasource.url", "spring.datasource.username", "spring.datasource.password"; modificare inoltre la voce "spring.jpa.hibernate.ddl-auto" con il parametro CREATE per evitare di creare le tabelle manualmente. 
7 -  Per avviare il progetto, dentro STS cliccare con il tasto destro sulla cartella dell'applicazione nel "package explorer"; selezionare "run as" -> "Spring boot App".
8 - aprire il Browser all'indirizzo "localhost/8080" per utilizzare l'applicazione.

## Note di progetto

Attualmento il progetto non è concluso ma è stata implementata la parte di gestione Utenti e Prodotto, dove è possibile collegarsi al database per visualizzare, creare e cancellare nuovi Prodotti e Utenti.
E' stato implementata una progedura di login con Spring Security a livello base per le voci del menu "Utenti" e "Aggiungi Utente" e "Aggiungi prodotto". Sono stati creati solo un paio di utenti hardcoded con due livelli di privilegi: Utente e Admin; Nel File "SecurityCongifuration" nel package "Configuration" è presente laconfigurazione. Utilizzare Nome "utente: ste e Password: ste " per utilizzare l'applicazione come amministratore.
