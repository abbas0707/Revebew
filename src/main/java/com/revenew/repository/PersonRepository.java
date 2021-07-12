package com.revenew.repository;

import com.revenew.dao.person.PersonEntity;
import com.revenew.dao.person.jpa.PersonEntityImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Person repository.
 */
@Service
public interface PersonRepository extends JpaRepository<PersonEntityImpl, String> {
}
