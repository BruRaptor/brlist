package com.brurpator.brlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brurpator.brlist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
