package hayssh;

import javax.cache.annotation.CacheDefaults;
import javax.cache.annotation.CacheKey;
import javax.cache.annotation.CacheResult;
import javax.inject.Named;

@CacheDefaults(cacheName="domainCache")
@Named
public class DomainRepository {

	@CacheResult
	public Domain findById(@CacheKey int id){
		System.out.println("args is " + id);
		return new Domain(id);
	}
}
