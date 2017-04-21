package com.gome.o2m.dubbo.sku.impl;

import com.gome.o2m.dubbo.sku.api.Sku;
import com.gome.o2m.dubbo.sku.api.SkuService;

/**
 * Created by songyigui on 2017/4/21.
 */
public class SkuServiceImpl implements SkuService {
    @Override
    public Sku get(Integer id) {
        return new Sku(1,"Tom");
    }
}
