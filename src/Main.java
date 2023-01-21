public class Main {
    public static void main(String[] args) {
        System.out.println("Array 2D");

        /*
        * Array 2D o Array dimensionali:
        *
        * - Cosa sono gli array 2D
        *
        * - Creare un array 2D in entrambi i modi
        *
        * - Accedere agli elementi degli array
        *
        * - Ciclare con for
         */

/*----------------------------------------------------------------------------------------------------*/

        // COSA SONO GLI ARRAY 2D:

        // Sono degli array di array= in sostanza, creeremo un array che ne contiene altri

/*----------------------------------------------------------------------------------------------------*/

        // CREARE UN ARRAY DI ARRAY 1 SINTASSI:

        String[][] settimane = new String[4][7];
        /* Abbiamo creato un array che ne contiene un altro (settimana e giorni) e dobbiamo dichiarare la
           lunghezza di entrambi*/

/* Prima settimana struttura:
   mettiamo il nome dato all'array, poi indice di entrambi [0][0], dopo = mettiamo il nome in questo caso
   del giorno della settimana tra le ""; ma potrebbe essere un numero in un altro caso Proseguiamo come
   nella prima settimana anche per le successive*/
        settimane[0][0] = "Lunedì";
        settimane[0][1] = "Martedì";
        settimane[0][2] = "Mercoledì";
        settimane[0][3] = "Giovedì";
        settimane[0][4] = "Venerdì";
        settimane[0][5] = "Sabato";
        settimane[0][6] = "Domenica";

        settimane[1][0] = "Lunedì";
        settimane[1][1] = "Martedì";
        settimane[1][2] = "Mercoledì";
        settimane[1][3] = "Giovedì";
        settimane[1][4] = "Venerdì";
        settimane[1][5] = "Sabato";
        settimane[1][6] = "Domenica";

        settimane[2][0] = "Lunedì";
        settimane[2][1] = "Martedì";
        settimane[2][2] = "Mercoledì";
        settimane[2][3] = "Giovedì";
        settimane[2][4] = "Venerdì";
        settimane[2][5] = "Sabato";
        settimane[2][6] = "Domenica";

        settimane[3][0] = "Lunedì";
        settimane[3][1] = "Martedì";
        settimane[3][2] = "Mercoledì";
        settimane[3][3] = "Giovedì";
        settimane[3][4] = "Venerdì";
        settimane[3][5] = "Sabato";
        settimane[3][6] = "Domenica";

/*--------------------------------------------------------------------------------------------------------*/

        // ACCEDERE AGLI ELEMENTI:

        // Per accedere ai singoli elementi degli array, mandiamo in stampa in questo modo:

        System.out.println("Settimana 3: " + settimane[3][5]);
        /* Mandiamo in stampa ad esempio settimana 3 sabato, se volessimo sapere la settimana corrente
           a video ci basterà aggiungere commento in stampa come nell'esempio */

/*-------------------------------------------------------------------------------------------------------*/

        // CICLARE ARRAY DI ARRAY CON FOR

        /* Esempio di ciclo e di visualizzazione intuitiva:

               colonne= giorni  0         1         2          3         4        5         6
        Riga= settimane 0 --> lunedì   martedì   meroledì   giovedì   venerdì   sabato   domenica
        Riga= settimane 1 --> lunedì   martedì   meroledì   giovedì   venerdì   sabato   domenica
        Riga= settimane 2 --> lunedì   martedì   meroledì   giovedì   venerdì   sabato   domenica
        Riga= settimane 3 --> lunedì   martedì   meroledì   giovedì   venerdì   sabato   domenica
        */
        // Tramite il for possiamo gestire le righe e le colonne:

        for (int riga = 0; riga < settimane.length; riga++){ /* Mettendo il nome riga alla variabile ci sarà
                                                                più chiaro lo svolgimento del programma */
            System.out.println(); // Spazio vuoto, manda a capo ad ogni ciclo

            for (int colonna = 0; colonna < settimane[riga].length; colonna++){
                /* Secondo for gestirà le colonne e gestirà= colonne = 0; colonna dovrà essere minore dell'
                array intero = settimane e della variabile specifica della riga il tutto .lenght;
                colonna++; = incremento */
                System.out.print(settimane[riga][colonna] + " ");
                /* Mandiamo in stampa print per stampare in orizzontale, prima metteremo l'array poi la [riga]
                poi la [colonna] ed'infine il + e le " " per dare uno spazio se no tutto sarebbe attaccato */


            }
        }
/*-----------------------------------------------------------------------------------------------------*/

            // ALTRO MODO DI SVOLGERE IL PROGRAMMA CON UNA SINTASSI DIVERSA:
/*
        colonne= nomi        0        1         2
        Riga= classi 0 -->  Pino     Gino      Carlo
        Riga= classi 1 -->  Guido    Mario     Marika
        Riga= classi 2 -->  Anna     Genny     Fabiola
 */

       String[][] classi = { // Creiamo un array con delle classi di scuola
               {"Pino", "Guido", "Carlo"}, // Definiti item (elementi) e sono sempre separati da una virgola
               {"Gino", "Mario", "Marika"},
               {"Anna", "Genny", "Fabiola"},
       };
       for (int riga = 0; riga < classi.length; riga++ ){
           System.out.println();
           for (int colonna = 0; colonna < classi[riga].length; colonna++){
               System.out.print(classi[riga][colonna] + " ");
           }
       }

/*-----------------------------------------------------------------------------------------------------*/

        // CICLO CON FOREACH:

        // avremo lo stesso risultato con queste poche righe

        System.out.println();// spazio tra i due programmi
/*
        colonne= nomi        0        1         2
        Riga= classi 0 -->  Pino     Gino      Carlo
        Riga= classi 1 -->  Guido    Mario     Marika
        Riga= classi 2 -->  Anna     Genny     Fabiola
  */
        for (String[] riga :classi) { // Array stringhe (le stringhe sono i nomi) deriva da classi
            System.out.println();
            for (String colonna: riga) { // array di stringhe che deriva da riga
                System.out.print(colonna + " ");
            }
        }

/*-------------------------------------------------------------------------------------------------------*/

        // ESERCIZIO DI PROVA CON FOREACH:

        // Creiamo una lista della spesa con array 2D e foreach:

        String[][] spesa = {
                {"Frutta: ", "banane ", "pesche ", "limoni "},
                {"Verdura: ", "carote ", "cardo ", "cetrioli ", "zucchine "},
                {"Abiti: ", "camicia ", "mutande ", "maglietta ", "felpa "},
        };
        
        for (String[] lista : spesa) {
            System.out.println();
            for (String comprato : lista) {
                System.out.print(comprato);
            }
        }
    }
}