import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionListener;
import java.util.ArrayList;
import java.util.List;

@WebListener()
public class InicializaListaUsuario implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {

    public InicializaListaUsuario() {
    }


    public void contextInitialized(ServletContextEvent sce) {

        var u1 = new Usuario(1, "Richard", "Richard9@gmail.com", "13579");
        var u2 = new Usuario(2, "Pamella", "pamella9@gmail.com", "24680");
        var u3 = new Usuario(3, "Jéssica", "jessica@gmail.com", "35791");
        var u4 = new Usuario(4, "Luciana", "luciana@gmail.com", "46802");

        List<Usuario> UsuarioList = new ArrayList<>();
        UsuarioList.add(u1);
        UsuarioList.add(u2);
        UsuarioList.add(u3);
        UsuarioList.add(u4);

        List<String> tokensList = new ArrayList<>();

        ServletContext servletContext = sce.getServletContext();
        ServletContext.setAttribute("usuarios", UsuarioList)
        ServletContext.setAttribute("tokens", tokensList, UsuarioList)
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}