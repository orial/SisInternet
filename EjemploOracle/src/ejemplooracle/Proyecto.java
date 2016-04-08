/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplooracle;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "PROYECTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyecto.findAll", query = "SELECT p FROM Proyecto p"),
    @NamedQuery(name = "Proyecto.findByC\u00f3digo", query = "SELECT p FROM Proyecto p WHERE p.c\u00f3digo = :c\u00f3digo"),
    @NamedQuery(name = "Proyecto.findByNombre", query = "SELECT p FROM Proyecto p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Proyecto.findByDescripcion", query = "SELECT p FROM Proyecto p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Proyecto.findByC\u00f3digoPedido", query = "SELECT p FROM Proyecto p WHERE p.c\u00f3digoPedido = :c\u00f3digoPedido"),
    @NamedQuery(name = "Proyecto.findByPresupuestoIngreso", query = "SELECT p FROM Proyecto p WHERE p.presupuestoIngreso = :presupuestoIngreso"),
    @NamedQuery(name = "Proyecto.findByPresupuestoGastos", query = "SELECT p FROM Proyecto p WHERE p.presupuestoGastos = :presupuestoGastos"),
    @NamedQuery(name = "Proyecto.findByFechaInicioPrevista", query = "SELECT p FROM Proyecto p WHERE p.fechaInicioPrevista = :fechaInicioPrevista"),
    @NamedQuery(name = "Proyecto.findByFechaFinPrevista", query = "SELECT p FROM Proyecto p WHERE p.fechaFinPrevista = :fechaFinPrevista"),
    @NamedQuery(name = "Proyecto.findByFechaInicioReal", query = "SELECT p FROM Proyecto p WHERE p.fechaInicioReal = :fechaInicioReal"),
    @NamedQuery(name = "Proyecto.findByFechaFinalReal", query = "SELECT p FROM Proyecto p WHERE p.fechaFinalReal = :fechaFinalReal"),
    @NamedQuery(name = "Proyecto.findByResponsableProyecto", query = "SELECT p FROM Proyecto p WHERE p.responsableProyecto = :responsableProyecto"),
    @NamedQuery(name = "Proyecto.findByResponsableCliente", query = "SELECT p FROM Proyecto p WHERE p.responsableCliente = :responsableCliente"),
    @NamedQuery(name = "Proyecto.findByEstadoDelProyecto", query = "SELECT p FROM Proyecto p WHERE p.estadoDelProyecto = :estadoDelProyecto"),
    @NamedQuery(name = "Proyecto.findByEsquema", query = "SELECT p FROM Proyecto p WHERE p.esquema = :esquema")})
public class Proyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "C\u00d3DIGO")
    private String código;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "C\u00d3DIGO_PEDIDO")
    private String códigoPedido;
    @Column(name = "PRESUPUESTO_INGRESO")
    private BigInteger presupuestoIngreso;
    @Column(name = "PRESUPUESTO_GASTOS")
    private BigInteger presupuestoGastos;
    @Column(name = "FECHA_INICIO_PREVISTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioPrevista;
    @Column(name = "FECHA_FIN_PREVISTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinPrevista;
    @Column(name = "FECHA_INICIO_REAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioReal;
    @Column(name = "FECHA_FINAL_REAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinalReal;
    @Basic(optional = false)
    @Column(name = "RESPONSABLE_PROYECTO")
    private String responsableProyecto;
    @Basic(optional = false)
    @Column(name = "RESPONSABLE_CLIENTE")
    private String responsableCliente;
    @Column(name = "ESTADO_DEL_PROYECTO")
    private String estadoDelProyecto;
    @Column(name = "ESQUEMA")
    private String esquema;
    @JoinColumn(name = "CLIENTES_CIF", referencedColumnName = "CIF")
    @ManyToOne(optional = false)
    private Clientes clientesCif;

    public Proyecto() {
    }

    public Proyecto(String código) {
        this.código = código;
    }

    public Proyecto(String código, String nombre, String responsableProyecto, String responsableCliente) {
        this.código = código;
        this.nombre = nombre;
        this.responsableProyecto = responsableProyecto;
        this.responsableCliente = responsableCliente;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
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

    public String getCódigoPedido() {
        return códigoPedido;
    }

    public void setCódigoPedido(String códigoPedido) {
        this.códigoPedido = códigoPedido;
    }

    public BigInteger getPresupuestoIngreso() {
        return presupuestoIngreso;
    }

    public void setPresupuestoIngreso(BigInteger presupuestoIngreso) {
        this.presupuestoIngreso = presupuestoIngreso;
    }

    public BigInteger getPresupuestoGastos() {
        return presupuestoGastos;
    }

    public void setPresupuestoGastos(BigInteger presupuestoGastos) {
        this.presupuestoGastos = presupuestoGastos;
    }

    public Date getFechaInicioPrevista() {
        return fechaInicioPrevista;
    }

    public void setFechaInicioPrevista(Date fechaInicioPrevista) {
        this.fechaInicioPrevista = fechaInicioPrevista;
    }

    public Date getFechaFinPrevista() {
        return fechaFinPrevista;
    }

    public void setFechaFinPrevista(Date fechaFinPrevista) {
        this.fechaFinPrevista = fechaFinPrevista;
    }

    public Date getFechaInicioReal() {
        return fechaInicioReal;
    }

    public void setFechaInicioReal(Date fechaInicioReal) {
        this.fechaInicioReal = fechaInicioReal;
    }

    public Date getFechaFinalReal() {
        return fechaFinalReal;
    }

    public void setFechaFinalReal(Date fechaFinalReal) {
        this.fechaFinalReal = fechaFinalReal;
    }

    public String getResponsableProyecto() {
        return responsableProyecto;
    }

    public void setResponsableProyecto(String responsableProyecto) {
        this.responsableProyecto = responsableProyecto;
    }

    public String getResponsableCliente() {
        return responsableCliente;
    }

    public void setResponsableCliente(String responsableCliente) {
        this.responsableCliente = responsableCliente;
    }

    public String getEstadoDelProyecto() {
        return estadoDelProyecto;
    }

    public void setEstadoDelProyecto(String estadoDelProyecto) {
        this.estadoDelProyecto = estadoDelProyecto;
    }

    public String getEsquema() {
        return esquema;
    }

    public void setEsquema(String esquema) {
        this.esquema = esquema;
    }

    public Clientes getClientesCif() {
        return clientesCif;
    }

    public void setClientesCif(Clientes clientesCif) {
        this.clientesCif = clientesCif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (código != null ? código.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyecto)) {
            return false;
        }
        Proyecto other = (Proyecto) object;
        if ((this.código == null && other.código != null) || (this.código != null && !this.código.equals(other.código))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejemplooracle.Proyecto[ c\u00f3digo=" + código + " ]";
    }
    
}
