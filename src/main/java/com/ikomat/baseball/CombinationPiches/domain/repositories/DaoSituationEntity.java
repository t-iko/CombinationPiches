package com.ikomat.baseball.CombinationPiches.domain.repositories;

import com.ikomat.baseball.CombinationPiches.domain.model.SituationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoSituationEntity extends JpaRepository<SituationEntity,Integer> {
}
