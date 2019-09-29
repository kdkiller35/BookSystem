package com.woniuxy.service;

import java.util.List;


import com.woniuxy.domain.Client;
import com.woniuxy.domain.Clientlevl;

public interface IClientlevlService {
	void save(Clientlevl Clientlevl);
	void delete(Integer clientlevlid);
	void update(Clientlevl Clientlevl);
	List<Clientlevl> findAll();
	Clientlevl findOne(Integer clientlevlid);
}
