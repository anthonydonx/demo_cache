/*
 *  Copyright (c) 1995-2018,  The Data Management Group Ltd   All Rights Reserved.
 *  *  PROPRIETARY AND COPYRIGHT NOTICE.
 *
 *    This software product contains information which is proprietary to
 *    and considered a trade secret The Data management Group Ltd .
 *    It is expressly agreed that it shall not be reproduced in whole or part,
 *    disclosed, divulged or otherwise made available to any third party directly
 *    or indirectly.  Reproduction of this product for any purpose is prohibited
 *    without written authorisation from the The Data Management Group Ltd
 *    All Rights Reserved.
 *
 *    E-Mail andyj@datam.co.uk
 *    URL : www.datam.co.uk
 *    Created By : Asanka Anthony
 *
 */

package lk.dmg.cache_demo;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableCaching
public class AppConfig {
    @Bean
    public CacheManager cacheManager() {
        return new EhCacheCacheManager(ehCacheCacheManager().getObject());
    }

    @Bean
    public EhCacheManagerFactoryBean ehCacheCacheManager() {
        EhCacheManagerFactoryBean cmfb = new EhCacheManagerFactoryBean();
        cmfb.setConfigLocation(new ClassPathResource("ehcache.xml"));
        cmfb.setShared(true);
        return cmfb;
    }
}
