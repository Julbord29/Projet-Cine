package projet.cinema;

import java.time.LocalDate;

/**
 *
 * @author julie
 */
public class Seance {
    private LocalDate date;
    private Film film;

    public Seance(LocalDate date, Film film) {
        this.date = date;
        this.film = film;
        
        
    }
    
}
