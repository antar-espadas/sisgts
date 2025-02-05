package mx.uam.ayd.proyecto.presentacion.editaragremiado;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.stereotype.Component;

import mx.uam.ayd.proyecto.negocio.modelo.Agremiado;

import javax.swing.JButton;



@SuppressWarnings("serial")
@Component
public class VentanaEditaragremiado extends JFrame {
	
	private JPanel contentSig;
	private transient ControlEditaragremiado control;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldClave;
	private JTextField textFieldFiliacion;
	private JTextField textFieldAds;
	private JTextField textFieldpue;
	private JTextField textFieldDom;
	private JTextField textFieldTur;
	private JTextField textFieldCel;
	private JTextField textFieldTel;
	private JTextField textFieldCor;
	private JTextField textFieldCon;
	private JTextField textFieldTrab;
	
	public VentanaEditaragremiado() {
		
		//CREA LA VENTANA
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,600);
		setTitle("Editar Agremiado");
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		//CREACION DEL PANEL 2 
		contentSig = new JPanel();
		contentSig.setBounds(5, 80, 450, 500);
		contentSig.setLayout(null);
		getContentPane().add(contentSig);
		contentSig.setVisible(true);
		
		
		//CREACION DEL TITULO
		JLabel lblTite = new JLabel("Sistema de Gestión de Trámites ");
		lblTite.setBounds(180, 28, 180, 16);
		getContentPane().add(lblTite);
		
		JLabel lblMeseg = new JLabel("TLÁHUAC");
		lblMeseg.setBounds(31, 55, 80, 16);
		getContentPane().add(lblMeseg);
		
		JLabel lblMese = new JLabel("SECCIÓN 11");
		lblMese.setBounds(20, 42, 103, 16);
		getContentPane().add(lblMese);
		
		JLabel lblSub = new JLabel("SNTE");
		lblSub.setBounds(31, 11, 67, 23);
		getContentPane().add(lblSub);
		
		//ETIQUETAS 
		JLabel lblNombre = new JLabel("Nombre(s)");
		lblNombre.setBounds(28, 42, 80, 16);
		contentSig.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellidos");
		lblApellido.setBounds(232, 42, 80, 16);
		contentSig.add(lblApellido);
		
		JLabel lblClave= new JLabel("Clave");
		lblClave.setBounds(28, 79, 110, 16);
		contentSig.add(lblClave);
		
		JLabel lblFiliacion = new JLabel("Filiacion");
		lblFiliacion.setBounds(232, 79, 80, 16);
		contentSig.add(lblFiliacion);
		
		//CUADRO DE TEXTO 
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(92, 37, 130, 26);
		contentSig.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(292, 37, 130, 26);
		contentSig.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		textFieldClave = new JTextField();
		textFieldClave.setBounds(92, 74, 130, 26);
		textFieldClave.setEditable(false);
		contentSig.add(textFieldClave);
		textFieldClave.setColumns(10);
		
		textFieldFiliacion = new JTextField();
		textFieldFiliacion.setBounds(292, 74, 130, 26);
		contentSig.add(textFieldFiliacion);
		textFieldFiliacion.setColumns(10);
		
		JLabel lblAdscripcion = new JLabel("Adscripcion");
		lblAdscripcion.setBounds(28, 113, 110, 16);
		contentSig.add(lblAdscripcion);
		
		JLabel lblPuesto = new JLabel("Puesto");
		lblPuesto.setBounds(231, 113, 110, 16);
		contentSig.add(lblPuesto);
		
		JLabel lblDomicilio = new JLabel("Domicilio");
		lblDomicilio.setBounds(28, 150, 110, 16);
		contentSig.add(lblDomicilio);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setBounds(232, 150, 110, 16);
		contentSig.add(lblTurno);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(28, 188, 110, 16);
		contentSig.add(lblCelular);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(231, 189, 110, 16);
		contentSig.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(28, 225, 110, 16);
		contentSig.add(lblCorreo);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(232, 226, 110, 16);
		contentSig.add(lblContrasea);
		
		JLabel lblCentroDeTrabajo = new JLabel("Centro de trabajo");
		lblCentroDeTrabajo.setBounds(28, 267, 110, 16);
		contentSig.add(lblCentroDeTrabajo);
		
		textFieldAds = new JTextField();
		textFieldAds.setColumns(10);
		textFieldAds.setBounds(92, 106, 130, 26);
		contentSig.add(textFieldAds);
		
		textFieldpue = new JTextField();
		textFieldpue.setColumns(10);
		textFieldpue.setBounds(292, 111, 130, 26);
		contentSig.add(textFieldpue);
		
		textFieldDom = new JTextField();
		textFieldDom.setColumns(10);
		textFieldDom.setBounds(92, 148, 130, 26);
		contentSig.add(textFieldDom);
		
		textFieldTur = new JTextField();
		textFieldTur.setColumns(10);
		textFieldTur.setBounds(292, 148, 130, 26);
		contentSig.add(textFieldTur);
		
		textFieldCel = new JTextField();
		textFieldCel.setColumns(10);
		textFieldCel.setBounds(92, 186, 130, 26);
		contentSig.add(textFieldCel);
		
		textFieldTel = new JTextField();
		textFieldTel.setColumns(10);
		textFieldTel.setBounds(292, 186, 130, 26);
		contentSig.add(textFieldTel);
		
		textFieldCor = new JTextField();
		textFieldCor.setColumns(10);
		textFieldCor.setBounds(92, 223, 130, 26);
		contentSig.add(textFieldCor);
		
		textFieldCon = new JTextField();
		textFieldCon.setColumns(10);
		textFieldCon.setBounds(292, 223, 130, 26);
		contentSig.add(textFieldCon);
		
		textFieldTrab = new JTextField();
		textFieldTrab.setColumns(10);
		textFieldTrab.setBounds(118, 262, 130, 26);
		contentSig.add(textFieldTrab);
		
		//Boton cancelar cierra la ventana de editar agremiado
		JButton btnCancelar2 = new JButton("Cancelar ");
		btnCancelar2.setBounds(28, 315, 89, 23);
		contentSig.add(btnCancelar2);
		btnCancelar2.addActionListener(e -> cierra());
		//Fin del metodo cancelar
		
		//Boton aceptar permite editar los datos del agremiado
		JButton btnAceptar2 = new JButton("Aceptar");
		btnAceptar2.setBounds(293, 315, 89, 23);
		contentSig.add(btnAceptar2);
		btnAceptar2.addActionListener(e -> {
			
			if(e.getSource()==btnAceptar2) {
				//VERIFICA QUE LOS CAMPOS NO ESTEN VACIOS Y SI ES ASI NO DEJA AVANZAR
				if(textFieldNombre.getText().equals("") || textFieldApellido.getText().equals("")|| textFieldClave.getText().equals("") || textFieldFiliacion.getText().equals("") || textFieldAds.getText().equals("") || textFieldpue.getText().equals("") || textFieldDom.getText().equals("") || textFieldTur.getText().equals("") || textFieldTel.getText().equals("") || textFieldCel.getText().equals("")|| textFieldCor.getText().equals("") || textFieldCon.getText().equals("") || textFieldTrab.getText().equals("")) {
					muestraDialogoConMensaje("Ningun campo debe estar vacio");
				}else {
					//Si los campos no son vacios debe de pasarle cada uno de los parametros al metodo editaAgremiado que esta en el control
					control.editaAgremiado(textFieldNombre.getText(), textFieldApellido.getText(), textFieldClave.getText(), textFieldFiliacion.getText(), textFieldAds.getText(), textFieldpue.getText(), textFieldDom.getText(), textFieldTur.getText(), textFieldTel.getText(), textFieldCel.getText(), textFieldCor.getText(), textFieldCon.getText(), textFieldTrab.getText());
					contentSig.setVisible(true);
					limpia();

				}//FIN DEL ESE DE NINGUN CAMPO VACIO
			}//FIN DEL IF BOTON SIGUIENTE
		});//FIN DEL ACTION LISTENER
		
		
	}
	
	//METODO QUE LIMPIA LAS CASILLAS
	public void limpia() {	
		textFieldNombre.setText("");
		textFieldApellido.setText("");
		textFieldClave.setText("");
		textFieldFiliacion.setText("");
		textFieldAds.setText("");
		textFieldpue.setText("");
		textFieldDom.setText("");
		textFieldTur.setText("");
		textFieldCel.setText("");
		textFieldTel.setText("");
		textFieldCor.setText("");
		textFieldCon.setText("");
		textFieldTrab.setText("");
		
	}//FIN DEL METODO QUE LIMPIA LAS CASILLAS
		
	 public void muestra(ControlEditaragremiado control, Agremiado agremiado){
			
		this.control = control;
		
		String clave;
		clave=String.valueOf(agremiado.getClave());
		textFieldClave.setText(clave);
		
		String nombree;
		nombree=String.valueOf(agremiado.getNombre());
		textFieldNombre.setText(nombree);
		
		String apellido;
		apellido=String.valueOf(agremiado.getApellidos());
		textFieldApellido.setText(apellido);
		
		String correo;
		correo=String.valueOf(agremiado.getCorreo());
		textFieldCor.setText(correo);
		
		String contrasenia;
		contrasenia=String.valueOf(agremiado.getContrasenia());
		textFieldCon.setText(contrasenia);
		
		String filiacion;
		filiacion=String.valueOf(agremiado.getFiliacion());
		textFieldFiliacion.setText(filiacion);
		
		String adscripcion;
		adscripcion=String.valueOf(agremiado.getAdscripcion());
		textFieldAds.setText(adscripcion);
		
		String puesto;
		puesto=String.valueOf(agremiado.getPuesto());
		textFieldpue.setText(puesto);
		
		String turno;
		turno=String.valueOf(agremiado.getTurno());
		textFieldTur.setText(turno);
		
		String domicilio;
		domicilio=String.valueOf(agremiado.getDomicilio());
		textFieldDom.setText(domicilio);
		
		String celular;
		celular=String.valueOf(agremiado.getCelular());
		textFieldCel.setText(celular);
		
		String telefono;
		telefono=String.valueOf(agremiado.getTelefono());
		textFieldTel.setText(telefono);
		
		String cTrabajo;
		cTrabajo=String.valueOf(agremiado.getCentrotrabajo());
		textFieldTrab.setText(cTrabajo);
			
		setVisible(true);

	}
		 
	public void muestraDialogoConMensaje(String mensaje ) {
		JOptionPane.showMessageDialog(this , mensaje);
	}
	//DEJA DE MOSTRAR LA VENTANA
	public void cierra() {
		setVisible(false);	
	}//FIN DEL METODO TERMINA
}
