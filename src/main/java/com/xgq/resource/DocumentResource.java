package com.xgq.resource;

import com.xgq.dto.*;
import com.xgq.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by xieguoqiang on 14-5-28.
 */
@Path("/document")
@Component("documentResource")
public class DocumentResource {
    @Autowired
    private DocumentRepository documentRepository;
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/query")
    public Response query() {
        QueryDto<QueryDucumentDto> queryDto = new QueryDto<QueryDucumentDto>();
        QueryDucumentDto queryDucumentDto = new QueryDucumentDto();
        queryDucumentDto.setName("YZ集团VMware虚拟化解决方案");
        queryDto.setCondition(queryDucumentDto);
        Pagination pagination = new Pagination();
        pagination.setPage(3);
        pagination.setRows(1);
        queryDto.setPagination(pagination);
        ResultDto<DocumentDto> resultDto = documentRepository.query(queryDto);
        return Response.ok().entity(resultDto).build();
    }
}
