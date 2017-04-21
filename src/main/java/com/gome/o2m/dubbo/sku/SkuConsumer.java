/*
 * Copyright 1999-2012 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gome.o2m.dubbo.sku;

import com.gome.o2m.Response;
import com.gome.o2m.nic.outer.dto.SkuSpider;
import com.gome.o2m.nic.outer.service.SkuForOuterReadService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SkuConsumer {

    public static void main(String[] args) throws Exception {
        String config = SkuConsumer.class.getPackage().getName().replace('.', '/') + "/sku-consumer.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        context.start();
//        SkuService skuService = (SkuService) context.getBean("skuService");
//        Sku sku = skuService.get(1);
//        System.out.println(sku);

        SkuForOuterReadService skuForOuterReadService = (SkuForOuterReadService) context.getBean("skuForOuterReadService");
        Response<SkuSpider> reponse = skuForOuterReadService.getSkuSpiderByPlusSkuId(null);
        System.out.println(reponse.getResult());
        System.in.read();
    }
}
