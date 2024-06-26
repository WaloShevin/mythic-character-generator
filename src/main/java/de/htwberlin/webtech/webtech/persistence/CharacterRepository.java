package de.htwberlin.webtech.webtech.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {

    List<CharacterEntity> findAllByName(String name);
    List<CharacterEntity> findByWeaknessContainingIgnoreCase(String weakness);

    List<CharacterEntity> findAllByOrderByAgeDesc();

    List<CharacterEntity> findAllByOrderByAgeAsc();

}
