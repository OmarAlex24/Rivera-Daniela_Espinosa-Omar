import dao.BD;
import module.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.OdontologoService;
import service.PacienteService;

import java.util.List;

public class OdontologoServiceTest {

    @Test
    public void ingresarOdontologo(){
        BD.crearTabla();
        OdontologoService odontologoService = new OdontologoService();

        Odontologo odontologo = new Odontologo(11111, "Daniela", "Rivera");
        Odontologo odontologo2 = new Odontologo(22222, "Omar", "Espinosa");
        Odontologo odontologo3 = new Odontologo(33333, "Jorge", "Pepe");


        odontologoService.guardarOdontologoBD(odontologo);
        odontologoService.guardarOdontologoBD(odontologo2);
        odontologoService.guardarOdontologoBD(odontologo3);

        odontologoService.guardarOdontologoList(odontologo);
        odontologoService.guardarOdontologoList(odontologo2);

        List<Odontologo> resOdontologosBd = odontologoService.listarOdontologosBD();
        List<Odontologo> resOdontologosList = odontologoService.listarOdontologosList();

        Assertions.assertTrue(resOdontologosBd.size() == 3);
        Assertions.assertTrue(resOdontologosList.size() == 2);
    }
}
