package com.xgq.repository;

import com.xgq.dto.DocumentDto;
import com.xgq.dto.QueryDto;
import com.xgq.dto.QueryDucumentDto;
import com.xgq.dto.ResultDto;

/**
 * Created by xieguoqiang on 14-5-28.
 */
public interface DocumentRepository {
    ResultDto<DocumentDto> query(QueryDto<QueryDucumentDto> queryDto);
}
