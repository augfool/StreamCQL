/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.streaming.application;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * 数据分发相关信息
 * <功能详细描述>
 * 
 */
public class GroupInfo implements Serializable
{
    /**
     * 注释内容
     */
    private static final long serialVersionUID = 4066114313620144701L;
    
    private String streamName;
    
    private DistributeType ditributeType;
    
    private List<String> fields;
    
    //    private CustomStreamGrouping grouping;
    
    public String getStreamName()
    {
        return streamName;
    }
    
    public void setStreamName(String streamName)
    {
        this.streamName = streamName;
    }
    
    public DistributeType getDitributeType()
    {
        return ditributeType;
    }
    
    public void setDitributeType(DistributeType ditributeType)
    {
        this.ditributeType = ditributeType;
    }
    
    public List<String> getFields()
    {
        return fields;
    }
    
    public void setFields(List<String> fields)
    {
        this.fields = fields;
    }
    
    /**
     * 尚不考虑用户自定义分发方式
     */
    /*
    public CustomStreamGrouping getGrouping()
    {
        return grouping;
    }

    public void setGrouping(CustomStreamGrouping grouping)
    {
        this.grouping = grouping;
    }
    */
    
}
