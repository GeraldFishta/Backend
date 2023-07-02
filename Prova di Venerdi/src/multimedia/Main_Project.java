package multimedia;

import java.util.Scanner;

public class Main_Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < elementi.length ; i++) {
            System.out.println("Elemento " + (i + 1));
            System.out.println("Seleziona il tipo di elemento:");
            System.out.println("1. Immagine");
            System.out.println("2. Registrazione Audio");
            System.out.println("3. Video");
            int sceltaTipo = Integer.parseInt(scanner.nextLine());

            System.out.print("Inserisci il titolo dell'elemento: ");
            String titolo = scanner.nextLine();

            switch (sceltaTipo) {
                case 1:
                    System.out.print("Inserisci la luminosita dell'immagine: ");
                    int luminosita = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Immagine(titolo, luminosita);
                    break;
                case 2:
                    System.out.print("Inserisci la durata della registrazione audio: ");
                    int durataAudio = Integer.parseInt(scanner.nextLine());
                    System.out.print("Inserisci il volume della registrazione audio: ");
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new RegistrazioneAudio(titolo, durataAudio, volumeAudio);
                    break;
                case 3:
                    System.out.print("Inserisci la durata del video: ");
                    int durataVideo = Integer.parseInt(scanner.nextLine());
                    System.out.print("Inserisci il volume del video: ");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.print("Inserisci la luminosita del video: ");
                    int luminositaVideo = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                default:
                    System.out.println("Scelta non valida. Elemento non creato.");
                    i--;
                    break;
            }
        }

        System.out.println("Elementi creati:");
        for (ElementoMultimediale elemento : elementi) {
            if (elemento != null) {
                String tipo = elemento.getClass().getSimpleName();
                System.out.print(tipo + ": ");
                elemento.play();
            }
        }

        boolean continua = true;
        while (continua) {
            System.out.println("Seleziona l'elemento da eseguire (1-5) o 0 per terminare:");
            int scelta = Integer.parseInt(scanner.nextLine());

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                if (elemento != null) {
                    if (elemento instanceof Immagine) {
                        Immagine immagine = (Immagine) elemento;
                        immagine.show();
                    } else if (elemento instanceof RegistrazioneAudio) {
                        RegistrazioneAudio registrazioneAudio = (RegistrazioneAudio) elemento;
                        registrazioneAudio.play();
                    } else if (elemento instanceof Video) {
                        Video video = (Video) elemento;
                        video.play();
                    } else {
                        System.out.println("Elemento non trovato.");
                    }
                }
            } else if (scelta == 0) {
                continua = false;
                System.out.println("Programma terminato.");
            } else {
                System.out.println("Scelta non valida.");
            }
        }

        scanner.close();
    }

}