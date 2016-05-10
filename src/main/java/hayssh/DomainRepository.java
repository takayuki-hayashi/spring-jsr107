package hayssh;

import javax.cache.annotation.CacheDefaults;
import javax.cache.annotation.CacheResult;
import javax.inject.Named;

@CacheDefaults(cacheName="domainCache")
@Named
public class DomainRepository {

	@CacheResult
	public Domain findById(int id, String hoge, String hoge2){
		System.out.println("args is " + id);
		return new Domain(id);
	}
}
