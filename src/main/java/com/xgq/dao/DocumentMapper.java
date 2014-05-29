package com.xgq.dao;

import com.xgq.dto.QueryDto;
import com.xgq.dto.QueryDucumentDto;
import com.xgq.model.Document;

import java.util.List;

/**
 * Created by xieguoqiang on 14-5-26.
 */
public interface DocumentMapper {
    List<Document> selectDocumentByName(String name);

    List<Document> query(QueryDto<QueryDucumentDto> queryDto);
}
