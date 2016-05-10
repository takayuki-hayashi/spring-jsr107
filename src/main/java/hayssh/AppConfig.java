package hayssh;

import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.MutableConfiguration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.jcache.JCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class AppConfig {
    @Bean
    public JCacheCacheManager cacheManager() {
    	System.out.println("hoge");
        CacheManager cacheManager = Caching.getCachingProvider().getCacheManager();
        MutableConfiguration<Object, Domain> configuration = new MutableConfiguration<>();
        configuration.setExpiryPolicyFactory(new SampleExpiryFactory());
        configuration.setStoreByValue(false);
        cacheManager.createCache("domainCache", configuration);
		return new JCacheCacheManager(cacheManager);
    }
}
