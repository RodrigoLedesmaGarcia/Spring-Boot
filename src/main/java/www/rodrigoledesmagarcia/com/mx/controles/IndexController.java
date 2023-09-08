package www.rodrigoledesmagarcia.com.mx.controles;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import www.rodrigoledesmagarcia.com.mx.modelos.*;


@Controller
@RequestMapping("/app")
public class IndexController {
	
	
//======================================================================================================	
	
	@GetMapping({"/index", "/", "/indice"})
	public String index(Model model) {
		model.addAttribute("titulo", "hola desde la primavera con model");
		return "index";
	}
	
//======================================================================================================		
		
	@GetMapping({"/perfil", "/perfil.html"})
	public String petfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Andres");
		usuario.setApellido("Guzman");
		usuario.setCorreo("andresguz@hotmaiol.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}
	
//======================================================================================================		
	
	@GetMapping({"/listar", "/listado"})
	public String listar(Model model) {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Andres", "Guzman", "andresguz@hotmail.com"));
		usuarios.add(new Usuario("Maria", "Renteria", "Marianar@hotmail.com"));
		usuarios.add(new Usuario("Manuel", "Solero", "watasito@outlook.com"));
		usuarios.add(new Usuario("Diana", "Lechuga", "Diakocannon@hotmail.com"));
		usuarios.add(new Usuario("Jamiz", "Hernadez", "Panalitos@hotmail.com"));
		usuarios.add(new Usuario("Lorena", "Chumaseros", "arequlkzz@hotmail.com"));
		usuarios.add(new Usuario("Andres", "Guzman", "andresguz@hotmail.com"));
		usuarios.add(new Usuario("Maria", "Renteria", "Marianar@hotmail.com"));
		usuarios.add(new Usuario("Manuel", "Solero", "watasito@outlook.com"));
		usuarios.add(new Usuario("Diana", "Lechuga", "Diakocannon@hotmail.com"));
		usuarios.add(new Usuario("Jamiz", "Hernadez", "Panalitos@hotmail.com"));
		usuarios.add(new Usuario("Lorena", "Chumaseros", "arequlkzz@hotmail.com"));
		usuarios.add(new Usuario("Andres", "Guzman", "andresguz@hotmail.com"));
		usuarios.add(new Usuario("Maria", "Renteria", "Marianar@hotmail.com"));
		usuarios.add(new Usuario("Manuel", "Solero", "watasito@outlook.com"));
		usuarios.add(new Usuario("Diana", "Lechuga", "Diakocannon@hotmail.com"));
		usuarios.add(new Usuario("Jamiz", "Hernadez", "Panalitos@hotmail.com"));
		usuarios.add(new Usuario("Lorena", "Chumaseros", "arequlkzz@hotmail.com"));
		
		model.addAttribute("titulo", "Listado de los usuarios");
		model.addAttribute("usuarios", usuarios);
	    return "listar";
	}
}// Fin del codigo.