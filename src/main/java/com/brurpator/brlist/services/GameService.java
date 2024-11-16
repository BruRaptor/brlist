package com.brurpator.brlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brurpator.brlist.dto.GameDTO;
import com.brurpator.brlist.dto.GameListDTO;
import com.brurpator.brlist.dto.GameMinDTO;
import com.brurpator.brlist.entities.Game;
import com.brurpator.brlist.entities.GameList;
import com.brurpator.brlist.repositories.GameListRepository;
import com.brurpator.brlist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}

}
