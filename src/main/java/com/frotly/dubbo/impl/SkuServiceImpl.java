package com.frotly.dubbo.impl;

import com.frotly.dubbo.api.SkuService;
import com.frotly.dubbo.api.Sku;

/**
 * Created by songyigui on 2017/4/21.
 */
public class SkuServiceImpl implements SkuService {
    @Override
    public Sku get(Integer id) {
        return new Sku(1,"Tom");
    }
}
