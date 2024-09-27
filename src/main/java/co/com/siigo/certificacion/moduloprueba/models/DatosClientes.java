package co.com.siigo.certificacion.moduloprueba.models;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DatosClientes {
    String fechaInicio;
    String fechaFin;
    String sociedad;
    String centro;
    String tipoDocumento;
    String sistemaDeDistribucion;

    public static List<DatosClientes> setData(DataTable dataTable) {
        List<DatosClientes> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, DatosClientes.class));
        }
        return dates;
    }
}
