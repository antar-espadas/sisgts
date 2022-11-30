package mx.uam.ayd.proyecto.presentacion.administrador;

import mx.uam.ayd.proyecto.presentacion.compartido.Pantalla;
import java.awt.GridBagLayout;
import javax.swing.JButton;

import org.springframework.stereotype.Component;

import java.awt.GridBagConstraints;
import java.awt.Insets;

@Component
public class VentanaAdministrador extends Pantalla {
    private ControlAdministrador controlador;
	public VentanaAdministrador() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JButton btnRegistrarEmpleado = new JButton("Registrar Empleado");
		GridBagConstraints gbc_btnRegistrarEmpleado = new GridBagConstraints();
		gbc_btnRegistrarEmpleado.insets = new Insets(0, 0, 5, 0);
		gbc_btnRegistrarEmpleado.gridx = 1;
		gbc_btnRegistrarEmpleado.gridy = 1;
		add(btnRegistrarEmpleado, gbc_btnRegistrarEmpleado);
		
		JButton btnRegistrarAgremiado = new JButton("Registrar Agremiado");
		GridBagConstraints gbc_btnRegistrarAgremiado = new GridBagConstraints();
		gbc_btnRegistrarAgremiado.gridx = 1;
		gbc_btnRegistrarAgremiado.gridy = 3;
		add(btnRegistrarAgremiado, gbc_btnRegistrarAgremiado);
	}

    public void muestra(ControlAdministrador controlador){
        this.controlador=controlador;
        setVisible(true);
    }
    
}
