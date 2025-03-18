package org.generationitaly.todolist.repository.impl;

import java.util.List;

import org.generationitaly.todolist.entity.Nota;
import org.generationitaly.todolist.repository.JpaRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class NotaRepositoryImpl extends JpaRepositoryImpl<Nota, Long> implements JpaRepository<Nota, Long> {

	NotaRepositoryImpl() {
		super(Nota.class);
	}

}
