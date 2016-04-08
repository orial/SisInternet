/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplooracle;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lupi
 */
@Entity
@Table(name = "TAREAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tareas.findAll", query = "SELECT t FROM Tareas t"),
    @NamedQuery(name = "Tareas.findById", query = "SELECT t FROM Tareas t WHERE t.id = :id"),
    @NamedQuery(name = "Tareas.findByNombre", query = "SELECT t FROM Tareas t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tareas.findByDescripcion", query = "SELECT t FROM Tareas t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Tareas.findByFechaInicioPropuesta", query = "SELECT t FROM Tareas t WHERE t.fechaInicioPropuesta = :fechaInicioPropuesta"),
    @NamedQuery(name = "Tareas.findByFechaInicioReal", query = "SELECT t FROM Tareas t WHERE t.fechaInicioReal = :fechaInicioReal"),
    @NamedQuery(name = "Tareas.findByFechaFinPropuesta", query = "SELECT t FROM Tareas t WHERE t.fechaFinPropuesta = :fechaFinPropuesta"),
    @NamedQuery(name = "Tareas.findByFechaFinReal", query = "SELECT t FROM Tareas t WHERE t.fechaFinReal = :fechaFinReal"),
    @NamedQuery(name = "Tareas.findByHoras", query = "SELECT t FROM Tareas t WHERE t.horas = :horas"),
    @NamedQuery(name = "Tareas.findByPrioridad", query = "SELECT t FROM Tareas t WHERE t.prioridad = :prioridad"),
    @NamedQuery(name = "Tareas.findByEstado", query = "SELECT t FROM Tareas t WHERE t.estado = :estado"),
    @NamedQuery(name = "Tareas.findByTipoTareaTipoTareaId", query = "SELECT t FROM Tareas t WHERE t.tipoTareaTipoTareaId = :tipoTareaTipoTareaId"),
    @NamedQuery(name = "Tareas.findById2", query = "SELECT t FROM Tareas t WHERE t.id2 = :id2")})
public class Tareas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA_INICIO_PROPUESTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioPropuesta;
    @Column(name = "FECHA_INICIO_REAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioReal;
    @Column(name = "FECHA_FIN_PROPUESTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinPropuesta;
    @Column(name = "FECHA_FIN_REAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinReal;
    @Column(name = "HORAS")
    private BigInteger horas;
    @Column(name = "PRIORIDAD")
    private String prioridad;
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "TIPO_TAREA_TIPO_TAREA_ID")
    private BigInteger tipoTareaTipoTareaId;
    @Basic(optional = false)
    @Column(name = "ID2")
    private String id2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tareasId")
    private Collection<Tareas> tareasCollection;
    @JoinColumn(name = "TAREAS_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Tareas tareasId;

    public Tareas() {
    }

    public Tareas(String id) {
        this.id = id;
    }

    public Tareas(String id, String nombre, BigInteger tipoTareaTipoTareaId, String id2) {
        this.id = id;
        this.nombre = nombre;
        this.tipoTareaTipoTareaId = tipoTareaTipoTareaId;
        this.id2 = id2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicioPropuesta() {
        return fechaInicioPropuesta;
    }

    public void setFechaInicioPropuesta(Date fechaInicioPropuesta) {
        this.fechaInicioPropuesta = fechaInicioPropuesta;
    }

    public Date getFechaInicioReal() {
        return fechaInicioReal;
    }

    public void setFechaInicioReal(Date fechaInicioReal) {
        this.fechaInicioReal = fechaInicioReal;
    }

    public Date getFechaFinPropuesta() {
        return fechaFinPropuesta;
    }

    public void setFechaFinPropuesta(Date fechaFinPropuesta) {
        this.fechaFinPropuesta = fechaFinPropuesta;
    }

    public Date getFechaFinReal() {
        return fechaFinReal;
    }

    public void setFechaFinReal(Date fechaFinReal) {
        this.fechaFinReal = fechaFinReal;
    }

    public BigInteger getHoras() {
        return horas;
    }

    public void setHoras(BigInteger horas) {
        this.horas = horas;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigInteger getTipoTareaTipoTareaId() {
        return tipoTareaTipoTareaId;
    }

    public void setTipoTareaTipoTareaId(BigInteger tipoTareaTipoTareaId) {
        this.tipoTareaTipoTareaId = tipoTareaTipoTareaId;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    @XmlTransient
    public Collection<Tareas> getTareasCollection() {
        return tareasCollection;
    }

    public void setTareasCollection(Collection<Tareas> tareasCollection) {
        this.tareasCollection = tareasCollection;
    }

    public Tareas getTareasId() {
        return tareasId;
    }

    public void setTareasId(Tareas tareasId) {
        this.tareasId = tareasId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tareas)) {
            return false;
        }
        Tareas other = (Tareas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejemplooracle.Tareas[ id=" + id + " ]";
    }
    
}
