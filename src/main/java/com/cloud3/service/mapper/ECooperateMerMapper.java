package com.cloud3.service.mapper;

import com.cloud3.commons.dto.ECooperateMer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ECooperateMerMapper {

    /**
     * @date: 2019/5/24
     * @param: [eCooperateMer]
     * @return: com.boot.com.alibabacloud.commons.serviceSub.ECooperateMer
     * @description: 详情
     */
    ECooperateMer selectECooperateMerInfo(ECooperateMer eCooperateMer);

    /**
     * @date: 2019/5/24
     * @param: [eCooperateMer]
     * @return: com.boot.com.alibabacloud.commons.serviceSub.ECooperateMer
     * @description: 列表
     */
    List<ECooperateMer> queryECooperateMerListPage();
}