/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplooracle;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lupi
 */
@Entity
@Table(name = "CLIENTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByCif", query = "SELECT c FROM Clientes c WHERE c.cif = :cif"),
    @NamedQuery(name = "Clientes.findByNombre", query = "SELECT c FROM Clientes c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Clientes.findByPersonaDeContacto", query = "SELECT c FROM Clientes c WHERE c.personaDeContacto = :personaDeContacto"),
    @NamedQuery(name = "Clientes.findByEmailDeContacto", query = "SELECT c FROM Clientes c WHERE c.emailDeContacto = :emailDeContacto"),
    @NamedQuery(name = "Clientes.findByDirecci\u00f3nCompleta", query = "SELECT c FROM Clientes c WHERE c.direcci\u00f3nCompleta = :direcci\u00f3nCompleta")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CIF")
    private String cif;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "PERSONA_DE_CONTACTO")
    private String personaDeContacto;
    @Column(name = "EMAIL_DE_CONTACTO")
    private String emailDeContacto;
    @Column(name = "DIRECCI\u00d3N_COMPLETA")
    private String direcciónCompleta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientesCif")
    private Collection<Proyecto> proyectoCollection;

    public Clientes() {
    }

    public Clientes(String cif) {
        this.cif = cif;
    }

    public Clientes(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersonaDeContacto() {
        return personaDeContacto;
    }

    public void setPersonaDeContacto(String personaDeContacto) {
        this.personaDeContacto = personaDeContacto;
    }

    public String getEmailDeContacto() {
        return emailDeContacto;
    }

    public void setEmailDeContacto(String emailDeContacto) {
        this.emailDeContacto = emailDeContacto;
    }

    public String getDirecciónCompleta() {
        return direcciónCompleta;
    }

    public void setDirecciónCompleta(String direcciónCompleta) {
        this.direcciónCompleta = direcciónCompleta;
    }

    @XmlTransient
    public Collection<Proyecto> getProyectoCollection() {
        return proyectoCollection;
    }

    public void setProyectoCollection(Collection<Proyecto> proyectoCollection) {
        this.proyectoCollection = proyectoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cif != null ? cif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.cif == null && other.cif != null) || (this.cif != null && !this.cif.equals(other.cif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejemplooracle.Clientes[ cif=" + cif + " ]";
    }
    
}
