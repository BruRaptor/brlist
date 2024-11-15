package com.brurpator.brlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brurpator.brlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
