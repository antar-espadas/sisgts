package mx.uam.ayd.proyecto.presentacion.editarempleado;

import mx.uam.ayd.proyecto.negocio.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.uam.ayd.proyecto.negocio.ServicioEmpleado;


@Component
public class ControlEditarempleado {

	@Autowired
	private VentanaEditarempleado ventana;

	@Autowired
	private VentanaVerificaId ventanaId;
	@Autowired
	private ServicioEmpleado servicioEmpleado;

	//METODO INICIO
	public void inicia() {

		ventanaId.muestra(this);
				 
	}
	
	//Metodo que verifica si existe el id del empleado, en caso de existir muestra una ventana y muestra los datos del empleado
	//si no exite no deja avanzar a la otra ventana 
	public void verificaIdEmpleado(long idEmpleado) {
		boolean exito = servicioEmpleado.verificaIdEmpleado(idEmpleado);
		Empleado empleado1=servicioEmpleado.recuperaEmpleado(idEmpleado);
		if(exito){

			ventanaId.cierra();
			ventana.muestra(this, empleado1);
			
		}else{
			ventana.muestraDialogoConMensaje("El Id del empleado no existe");
		}
	}//Fin del metodo verifica id empleado
	
	
	//Metodo edita empleado permite editar los datos de un usuario existente y regresa true
	//Los parametros que se le pasan al metodo son id el cual es un long, nombre, apellido, correo, contrasenia, tipo empleado
	//Lo que hace el metodo es que si se le pasan los parametros al metodo del servicio debe mostrar un mensaje de exito y cierra la ventana de editar empleado
	public void editaEmpleado(long id, String nombre, String apellidos,  String correo, String contrasenia, String tipoempleado) {
		if(servicioEmpleado.editaEmpleado(id, nombre, apellidos, correo, contrasenia, tipoempleado)) {
			ventana.muestraDialogoConMensaje("Se ha editado correctamente");
			ventana.cierra();
		}//fin del if
		
	}//Fin del metodo edita empleado


	
	//METODO TERMINA
	public void termina() {
		ventana.setVisible(false);	//DEJA DE MOSTRAR LA VENTANA	
	}//FIN DEL METODO TERMINA
	
}
