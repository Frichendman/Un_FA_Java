package com.example.restprt.repositories;

import com.example.restprt.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepo extends JpaRepository<Film, Integer> {
}
