package be.kazaag.swagger;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * HelloWorld JaxRS resource.
 */
@Path("/")
@Api
public class HelloWorldResource {

    @GET
    @Path("hello/{name}")
    @Produces("text/plain")
    @ApiOperation("Hello World")
    public String hello(@PathParam("name") String name){
        return "Hello " + name;
    }

    @GET
    @Path("me/{name}")
    @Produces("application/json")
    @ApiOperation("Json hello world")
    public HelloWorld helloWorld(@PathParam("name") String name){
        return new HelloWorld(name);
    }
}
