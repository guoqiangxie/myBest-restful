package com.xgq.repository.impl;

import com.xgq.dao.DocumentMapper;
import com.xgq.dto.DocumentDto;
import com.xgq.dto.QueryDto;
import com.xgq.dto.QueryDucumentDto;
import com.xgq.dto.ResultDto;
import com.xgq.model.Document;
import com.xgq.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xieguoqiang on 14-5-28.
 */
@Repository("documentRepository")
public class DocumentRepositoryImpl implements DocumentRepository {
    @Autowired
    private DocumentMapper documentMapper;
    @Override
    public ResultDto<DocumentDto> query(QueryDto<QueryDucumentDto> queryDto) {
        List<Document> list = documentMapper.query(queryDto);
        List<DocumentDto> dtoList = new ArrayList<DocumentDto>();
        for (Document document : list) {
            dtoList.add(document.toDto());
        }
        return new ResultDto<DocumentDto>(queryDto.getPagination(), dtoList);
    }
}
