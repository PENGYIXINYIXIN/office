package com.qfedu.service;

import com.qfedu.pojo.Loginlog;

import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/14.
 */
public interface LoginlogService {
    public Map<String,Object> findAllLoginlog(Integer page, Integer limit);
}
