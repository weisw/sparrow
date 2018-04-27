package com.sparrow.registry;

import java.util.List;

/**
 * @author harry
 * @date 2018/4/13
 */
public interface RegistryCenter {

    /**
     * get data by key
     *
     * @param key key
     * @return value
     */
    String get(String key);

    /**
     * existed
     *
     * @param key key
     * @return is exist
     */
    boolean exist(String key);

    /**
     * persist .
     *
     * @param key   key
     * @param value value
     */
    void persist(String key, String value);

    /**
     * modify.
     *
     * @param key   键
     * @param value 值
     */
    void modify(String key, String value);

    /**
     * remove.
     *
     * @param key 键
     */
    void remove(String key);

    /**
     * get registry center time.
     *
     * @param key key
     * @return current time
     */
    long getRegistryCenterTime(String key);

    /**
     * get data from remote
     *
     * @param key key
     * @return value
     */
    String getFromRemote(String key);

    /**
     * get children key
     *
     * @param key key
     * @return children key list
     */
    List<String> getChildrenKeys(String key);

    /**
     * get children count
     *
     * @param key key
     * @return count
     */
    int getChildrenCount(String key);

    /**
     * persist ephemeral.
     *
     * @param key   key
     * @param value value
     */
    void persistEphemeral(String key, String value);

    /**
     * persist sequential.
     *
     * @param key   key
     * @param value value
     * @return znode name
     */
    String persistSequential(String key, String value);

    /**
     * persist ephemeral sequential.
     *
     * @param key key
     */
    void persistEphemeralSequential(String key);

    /**
     * add local cache.
     *
     * @param cachePath cache path
     */
    void addLocalCache(String cachePath);

    /**
     * evict local cache
     *
     * @param cachePath cache path
     */
    void evictCacheData(String cachePath);

    /**
     * get register cache object
     *
     * @param cachePath cache path
     * @return object
     */
    Object getRawCache(String cachePath);
}
