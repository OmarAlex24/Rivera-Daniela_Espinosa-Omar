package service;

import dao.OdontologoDAOH2;
import dao.OdontologoDAOList;
import dao.iDao;
import module.Odontologo;

import java.util.List;

public class OdontologoService {
    private iDao<Odontologo> OdontologoiDaoH2;
    private iDao<Odontologo> OdontologoiDaoList;

    public OdontologoService() {
        OdontologoiDaoH2 = new OdontologoDAOH2();
        OdontologoiDaoList = new OdontologoDAOList();
    }

    public Odontologo guardarOdontologoBD(Odontologo odontologo){
        return OdontologoiDaoH2.guardar(odontologo);
    }

    public List<Odontologo> listarOdontologosBD(){
        return OdontologoiDaoH2.listarTodos();
    }

    public Odontologo guardarOdontologoList(Odontologo odontologo){
        return OdontologoiDaoList.guardar(odontologo);
    }

    public List<Odontologo> listarOdontologosList(){
        return OdontologoiDaoList.listarTodos();
    }
}
