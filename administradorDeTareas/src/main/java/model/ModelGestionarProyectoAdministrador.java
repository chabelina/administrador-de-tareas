package model;

public class ModelGestionarProyectoAdministrador {
  private String NombreProyecto;
  private String descProyecto;
  private String codProyecto;

  public ModelGestionarProyectoAdministrador(String NombreProyecto, String descProyecto, String codProyecto) {
    this.NombreProyecto = NombreProyecto;
    this.descProyecto = descProyecto;
    this.codProyecto = codProyecto;
  }

  public ModelGestionarProyectoAdministrador() {
    this("","","");
  }

  public String getNombreProyecto() {
    return NombreProyecto;
  }

  public void setNombreProyecto(String NombreProyecto) {
    this.NombreProyecto = NombreProyecto;
  }

  public String getDescProyecto() {
    return descProyecto;
  }

  public void setDescProyecto(String descProyecto) {
    this.descProyecto = descProyecto;
  }

  public String getCodProyecto() {
    return codProyecto;
  }

  public void setCodProyecto(String codProyecto) {
    this.codProyecto = codProyecto;
  }
}
