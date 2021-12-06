package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String apellidopaterno;
    private String apellidomaterno;
    private String RFC;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getapellidopaterno() {
        return apellidopaterno;
    }

    public void setapellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    @ColumnName("apellido_materno")
    public String getapellidomaterno() {
        return this.apellidomaterno;
    }

    public void setapellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    @ColumnName("RFC")
    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

   

}
