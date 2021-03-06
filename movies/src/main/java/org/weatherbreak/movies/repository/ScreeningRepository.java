package org.weatherbreak.movies.repository;

import org.weatherbreak.movies.entity.Screening;

import java.util.List;

public interface ScreeningRepository {

    long addScreening(Screening screening);

    Screening getScreening(long screeningId);

    List<Screening> getScreenings();

    List<Screening> getScreeningsByMovieId(long movieId);

    List<Screening> getScreeningsByTheaterId(long theaterId);

    List<Screening> getScreeningsByMovieIdAndTheaterId(long movieId, long theaterId);
}
