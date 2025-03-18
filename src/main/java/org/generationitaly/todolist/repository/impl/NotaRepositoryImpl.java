package org.generationitaly.todolist.repository.impl;

import org.generationitaly.todolist.entity.Nota;
import org.generationitaly.todolist.repository.NotaRepository;

public class NotaRepositoryImpl extends JpaRepositoryImpl<Nota, Long> implements NotaRepository {

	public NotaRepositoryImpl() {
		super(Nota.class);
	}

}
