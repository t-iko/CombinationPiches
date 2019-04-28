package com.ikomat.baseball.CombinationPiches.domain.repositories;

import com.ikomat.baseball.CombinationPiches.domain.model.MatchInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao extends JpaRepository<MatchInfo,Long> {
}
