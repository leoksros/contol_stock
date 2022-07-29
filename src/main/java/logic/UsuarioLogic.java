package logic;
import entities.Usuario;
import data.DataUsuario;

public class UsuarioLogic {
	
	private DataUsuario dataUsuario;

	public UsuarioLogic() {
		dataUsuario = new DataUsuario();
	}
	
	public void create(Usuario user) {
		dataUsuario.create(user);
	}
	
	public void edit() {
		
	}
	
	public void view() {
		
	}
	
	public void delete() {
		
	}

}
