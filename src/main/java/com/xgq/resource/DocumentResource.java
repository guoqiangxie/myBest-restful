package com.xgq.resource;

import com.xgq.dto.DocumentDto;
import com.xgq.dto.QueryDto;
import com.xgq.dto.QueryDucumentDto;
import com.xgq.dto.ResultDto;
import com.xgq.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
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
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    @Path("/query")
    public Response query(QueryDto<QueryDucumentDto> queryDto) {
        ResultDto<DocumentDto> resultDto = documentRepository.query(queryDto);
        return Response.ok().entity(resultDto).build();
    }
}
