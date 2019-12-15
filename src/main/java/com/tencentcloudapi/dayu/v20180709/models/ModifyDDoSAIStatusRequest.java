/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDDoSAIStatusRequest  extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * =get表示读取AI防护状态；=set表示修改AI防护状态；
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * AI防护状态，取值[on，off]；当Method=set时必填；
    */
    @SerializedName("DDoSAI")
    @Expose
    private String DDoSAI;

    /**
     * 获取大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * 设置大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * 获取资源ID
     * @return Id 资源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置资源ID
     * @param Id 资源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取=get表示读取AI防护状态；=set表示修改AI防护状态；
     * @return Method =get表示读取AI防护状态；=set表示修改AI防护状态；
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * 设置=get表示读取AI防护状态；=set表示修改AI防护状态；
     * @param Method =get表示读取AI防护状态；=set表示修改AI防护状态；
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * 获取AI防护状态，取值[on，off]；当Method=set时必填；
     * @return DDoSAI AI防护状态，取值[on，off]；当Method=set时必填；
     */
    public String getDDoSAI() {
        return this.DDoSAI;
    }

    /**
     * 设置AI防护状态，取值[on，off]；当Method=set时必填；
     * @param DDoSAI AI防护状态，取值[on，off]；当Method=set时必填；
     */
    public void setDDoSAI(String DDoSAI) {
        this.DDoSAI = DDoSAI;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "DDoSAI", this.DDoSAI);

    }
}
