package mx.uam.ayd.proyecto.presentacion.RegistroEmpleado;
//import java.util.List;
import mx.uam.ayd.proyecto.negocio.ServicioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import mx.uam.ayd.proyecto.presentacion.RegistroEmpleado.VentanaRegistraEmpleado;


@Component
public class ControlRegistraEmpleado {

	@Autowired
	private ServicioEmpleado servicioEmpleado;
	
	@Autowired
	private VentanaRegistraEmpleado ventana;
	int verifica;

	public void inicia() {
		
		//List <Grupo> grupos = servicioGrupo.recuperaGrupos();
		
		ventana.muestra(this);//, grupos);
		
	}

	//METODO QUE AGREGA USUARIO 
	/*public void RegistraEmpleado(String idempleado, String nombre, String apellido, String templeado, String correo, String contrasenia) {

		try {//PASA LOS PARAMETROS Y MANDA MENSAJE QUE SE AGREGO CORRECTAMENTE
			servicioUsuario.RegistraEmpleado(idempleado, nombre, apellido, templeado, correo, contrasenia);
			ventana.muestraDialogoConMensaje("¡El empleado fue registrado correctamente!");
		} catch(Exception ex) {//MANDA MENSAJE DE ERROR
			ventana.muestraDialogoConMensaje("Error al agregar usuario: "+ex.getMessage());
		}
		
		termina();//TERMINA EL PROCESO DE REGISTRO DESPUES DE SER AGREGADO O MOSTRAR QUE NO SE PUDO AGREGAR
		
	}//FIN DEL METODO AGREGAR USUARIO
	 */
	
	//METODO QUE VERIFICA SI EL USUARIO EXISTE
	//METODO QUE VERIFICA SI EL USUARIO EXISTE
	/*public void recuperaCorreo(String correo) {
		try {
			servicioUsuario.recuperaCorreo(correo);//SE LE PASA LOS PARAMETROS QUE VA A REVISAR
			verifica=0;
			//ventana.muestraDialogoConMensaje("Bien");
		} catch(Exception ex) {//SI ENCUENTRA EL CORREO MANDA MENSAJE DE ERROR 
			ventana.muestraDialogoConMensaje("Error al agregar correo: "+ex.getMessage());
			verifica=1;
			//termina();//TERMINA EL PROCESO
		}
	}//FIN DEL METODO VERIFICA

	 */

	/*
	 int existe; 
	//METODO QUE VERIFICA SI EL USUARIO EXISTE
	public void Recuperaid(String idempleado) {
		
		try {
			servicioUsuario.Recuperaid(idempleado);//SE LE PASA LOS PARAMETROS QUE VA A REVISAR
			existe=0;
			//ventana.muestraDialogoConMensaje("Bien");
		} catch(Exception ex) {//SI ENCUENTRA AL USUARIO MANDA MENSAJE DE ERROR 
			ventana.muestraDialogoConMensaje("Error al agregar usuario: "+ex.getMessage());
			existe=1;
			//termina();//TERMINA EL PROCESO
		}
	}//FIN DEL METODO VERIFICA

	 */
	
	/**
	 * Termina la historia de usuario
	 * 
	 */
	//METODO TERMINA
	public void termina() {
		ventana.setVisible(false);	//DEJA DE MOSTRAR LA VENTANA	
	}//FIN DEL METODO TERMINA
	
}
