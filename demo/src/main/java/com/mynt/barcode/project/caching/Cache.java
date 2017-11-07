//package com.mynt.barcode.project.caching;
//
//import java.util.concurrent.TimeUnit;
//
//import org.springframework.cglib.core.internal.LoadingCache;
//
//import com.google.common.base.Optional;
//import com.google.common.cache.CacheBuilder;
//import com.google.common.cache.CacheLoader;
//
//public class Cache {
//
//	public Cache() {
//		 LoadingCache<String, Optional<String>> cache = 
//		         CacheBuilder.newBuilder()
//		         .maximumSize(100)                             // maximum 100 records can be cached
//		         .expireAfterAccess(30, TimeUnit.MINUTES)      // cache will expire after 30 minutes of access
//		         .build(new CacheLoader<String, String>() {  // build the cacheloader
//		            
//		            @Override
//		            public Employee load(String empId) throws Exception {
//		               //make the expensive call
//		               return getFromDatabase(empId);
//		            } 
//		         });
//	}
//}
