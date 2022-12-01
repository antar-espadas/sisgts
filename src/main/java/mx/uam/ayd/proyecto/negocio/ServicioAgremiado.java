package mx.uam.ayd.proyecto.negocio;

import mx.uam.ayd.proyecto.datos.RepositoryAgremiado;
import mx.uam.ayd.proyecto.negocio.modelo.Agremiado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioAgremiado {
    @Autowired
    RepositoryAgremiado agremiadoRepository;


    public boolean RegistraAgremiado(String nombre, String apellido, String clave, String filiacion, String adscripcion, String puesto, String domicilio, String turno, String celular, String telefono, String centrodetrabajo, String correo, String contrasenia) {

        Agremiado agremiado1;


        agremiadoRepository.findByClave(clave);

        if( agremiadoRepository.findByClave(clave)==null){
            Agremiado agremiado = new Agremiado(clave, nombre, apellido, filiacion, adscripcion, puesto, domicilio, turno, celular, telefono, correo);
            agremiadoRepository.save(agremiado);
            return true;

        }else {
            return false;
        }

    }
}
