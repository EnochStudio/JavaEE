package com.enoch.studio.dao;

import com.enoch.studio.model.Deploy;
import com.enoch.studio.model.DeployKey;

public interface DeployMapper {
    int deleteByPrimaryKey(DeployKey key);

    int insert(Deploy record);

    int insertSelective(Deploy record);

    Deploy selectByPrimaryKey(DeployKey key);

    int updateByPrimaryKeySelective(Deploy record);

    int updateByPrimaryKey(Deploy record);
}