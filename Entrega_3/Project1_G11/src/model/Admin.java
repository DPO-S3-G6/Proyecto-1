package model;

import java.io.File;

public class Admin implements User {

    private String tipo;

	public String getTipo() {
        return tipo;
    }

    //constructor de la clase Admin
    public Admin(String Tipo) {
		this.tipo = Tipo;
	}

	public String RegistroVeh() { 
		return "";
	}

    public String ModVeh() { 
		return "";
	}
    
	public String GestionSede() { 
		return ""; 
	}
	public String GestionEmple() { 
		return ""; 

	}
	public String RegistroEmple() { 
		return ""; 
	}
	public String IngresoApp() { 
		return "";
	}

	@Override
	public String getNombreCompleto() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getNombreCompleto'");
	}

	@Override
	public String getLogin() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getLogin'");
	}

	@Override
	public String getContraseña() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getContraseña'");
	}
}

