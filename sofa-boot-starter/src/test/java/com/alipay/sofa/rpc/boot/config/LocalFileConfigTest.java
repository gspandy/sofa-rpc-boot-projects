/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.rpc.boot.config;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author liangen
 * @version $Id: LocalFileConfigTest.java, v 0.1 2018年04月17日 下午2:51 liangen Exp $
 */
public class LocalFileConfigTest {

    @Test
    public void test() {
        String configA = "local";

        LocalFileConfigurator.parseConfig(configA);
        Assert.assertEquals(null, LocalFileConfigurator.getFile());

        String config = "local:/home/admin/registry";

        LocalFileConfigurator.parseConfig(config);
        Assert.assertEquals("/home/admin/registry", LocalFileConfigurator.getFile());
    }

    @Before
    public void before() {
        LocalFileConfigurator.setFile(null);
    }

    @After
    public void after() {
        LocalFileConfigurator.setFile(null);
    }

}