package mx.uam.ayd.proyecto.presentacion.administrador;

import mx.uam.ayd.proyecto.presentacion.RegistroEmpleado.ControlRegistraEmpleado;
import mx.uam.ayd.proyecto.presentacion.RegistrarAgremiado.ControlRegistraAgremiado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * controlAdministrador
 */
@Component
public class ControlAdministrador {

    @Autowired
    private ControlRegistraEmpleado controlRegistraEmpleado;
    @Autowired
    private ControlRegistraAgremiado controlRegistraAgremiado;
    @Autowired
	private VentanaAdministrador ventanaAdministrador;

    public void inicia(){
       ventanaAdministrador.muestra(this);
    }

    public void registraEmpleado(){
        controlRegistraEmpleado.inicia();
    }

    public void registraAgremiado(){
        controlRegistraAgremiado.inicia();
    }
}
