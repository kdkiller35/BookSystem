package com.woniuxy.service;

import java.util.List;


import com.woniuxy.domain.Provider;

public interface IProviderService {
	void save(Provider Provider);
	void delete(Integer pid);
	void update(Provider Provider);
	List<Provider> findAll();
	Provider findOne(Integer pid);
	
}
