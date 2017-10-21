
package usuario;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ApiUsuarios", targetNamespace = "http://api/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ApiUsuarios {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<usuario.Usuario>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "usuarioTipo", targetNamespace = "http://api/", className = "usuario.UsuarioTipo")
    @ResponseWrapper(localName = "usuarioTipoResponse", targetNamespace = "http://api/", className = "usuario.UsuarioTipoResponse")
    @Action(input = "http://api/ApiUsuarios/usuarioTipoRequest", output = "http://api/ApiUsuarios/usuarioTipoResponse")
    public List<Usuario> usuarioTipo(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns usuario.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearEditor", targetNamespace = "http://api/", className = "usuario.CrearEditor")
    @ResponseWrapper(localName = "crearEditorResponse", targetNamespace = "http://api/", className = "usuario.CrearEditorResponse")
    @Action(input = "http://api/ApiUsuarios/crearEditorRequest", output = "http://api/ApiUsuarios/crearEditorResponse")
    public Usuario crearEditor(
        @WebParam(name = "arg0", targetNamespace = "")
        Usuario arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns usuario.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearRevisor", targetNamespace = "http://api/", className = "usuario.CrearRevisor")
    @ResponseWrapper(localName = "crearRevisorResponse", targetNamespace = "http://api/", className = "usuario.CrearRevisorResponse")
    @Action(input = "http://api/ApiUsuarios/crearRevisorRequest", output = "http://api/ApiUsuarios/crearRevisorResponse")
    public Usuario crearRevisor(
        @WebParam(name = "arg0", targetNamespace = "")
        Usuario arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns usuario.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearAutor", targetNamespace = "http://api/", className = "usuario.CrearAutor")
    @ResponseWrapper(localName = "crearAutorResponse", targetNamespace = "http://api/", className = "usuario.CrearAutorResponse")
    @Action(input = "http://api/ApiUsuarios/crearAutorRequest", output = "http://api/ApiUsuarios/crearAutorResponse")
    public Usuario crearAutor(
        @WebParam(name = "arg0", targetNamespace = "")
        Usuario arg0);

}
