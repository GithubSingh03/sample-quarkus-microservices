package com.example.ms.services.organization.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import com.example.ms.services.organization.model.Employee;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@ApplicationScoped
@Path("/employees")
@RegisterRestClient(configKey = "department")
public interface EmployeeClient {

    @GET
    @Path("/organization/{organizationId}")
    @Produces(MediaType.APPLICATION_JSON)
    List<Employee> findByOrganization(@PathParam("organizationId") Long organizationId);

}
