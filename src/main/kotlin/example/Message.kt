package example

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class MessageResource {
    val messages = mutableListOf(
        Message(id = 1, test = "test1"),
        Message(id = 2, test = "test2"),
        Message(id = 3, test = "test3"),
        Message(id = 4, test = "test4")
    )

    @GET
    fun list() = messages

    @GET
    @Path("/{id}")
    fun get(@PathParam("id") id: Int) = messages.find { it.id == id }

    @POST
    fun add(message: Message): List<Message> {
        messages.add(message)
        return messages
    }

    @DELETE
    @Path("/{id}")
    fun delete(@PathParam("id") id: Int) = messages.removeIf { it.id == id }
}

data class Message(val id: Int, val test: String)