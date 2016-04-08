/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplooracle;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lupi
 */
@Entity
@Table(name = "EMPLEADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByDni", query = "SELECT e FROM Empleado e WHERE e.dni = :dni"),
    @NamedQuery(name = "Empleado.findByNombre", query = "SELECT e FROM Empleado e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empleado.findByApellidos", query = "SELECT e FROM Empleado e WHERE e.apellidos = :apellidos"),
    @NamedQuery(name = "Empleado.findBySexo", query = "SELECT e FROM Empleado e WHERE e.sexo = :sexo"),
    @NamedQuery(name = "Empleado.findByEmail", query = "SELECT e FROM Empleado e WHERE e.email = :email"),
    @NamedQuery(name = "Empleado.findByFechaDeNacimiento", query = "SELECT e FROM Empleado e WHERE e.fechaDeNacimiento = :fechaDeNacimiento"),
    @NamedQuery(name = "Empleado.findByUsuario", query = "SELECT e FROM Empleado e WHERE e.usuario = :usuario"),
    @NamedQuery(name = "Empleado.findByFechaDePrimerContrato", query = "SELECT e FROM Empleado e WHERE e.fechaDePrimerContrato = :fechaDePrimerContrato"),
    @NamedQuery(name = "Empleado.findByCategor\u00eda", query = "SELECT e FROM Empleado e WHERE e.categor\u00eda = :categor\u00eda")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DNI")
    private String dni;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "SEXO")
    private String sexo;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "FECHA_DE_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeNacimiento;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FECHA_DE_PRIMER_CONTRATO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDePrimerContrato;
    @Column(name = "CATEGOR\u00cdA")
    private String categoría;

    public Empleado() {
    }

    public Empleado(String dni) {
        this.dni = dni;
    }

    public Empleado(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaDePrimerContrato() {
        return fechaDePrimerContrato;
    }

    public void setFechaDePrimerContrato(Date fechaDePrimerContrato) {
        this.fechaDePrimerContrato = fechaDePrimerContrato;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dni != null ? dni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.dni == null && other.dni != null) || (this.dni != null && !this.dni.equals(other.dni))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejemplooracle.Empleado[ dni=" + dni + " ]";
    }
    
}
