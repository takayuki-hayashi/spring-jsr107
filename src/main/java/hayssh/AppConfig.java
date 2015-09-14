package hayssh;

import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.MutableConfiguration;

import org.ehcache.jcache.JCacheConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.jcache.JCacheCacheManager;
import org.springframework.cache.jcache.config.JCacheConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("hayassh")
@EnableCaching
public class AppConfig {
    @Bean
    public JCacheCacheManager jcacheCacheManager() {
        CacheManager cacheManager = Caching.getCachingProvider().getCacheManager();
        MutableConfiguration<Integer, Domain> configuration = new MutableConfiguration<>();
        configuration.setExpiryPolicyFactory(new SampleExpiryFactory());
        configuration.setStoreByValue(false);
        cacheManager.createCache("domainCache", configuration);
		return new JCacheCacheManager(cacheManager);
    }
}
