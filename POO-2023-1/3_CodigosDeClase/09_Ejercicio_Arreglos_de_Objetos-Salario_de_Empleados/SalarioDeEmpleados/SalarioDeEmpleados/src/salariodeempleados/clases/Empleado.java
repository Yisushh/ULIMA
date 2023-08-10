/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salariodeempleados.clases;

/**
 *
 * @author otro3
 */
public class Empleado {
    private int codigo;
    private int candidadDeHorasTrabajadas;
    private float sueldoPorHora;
    private int horasExtra;
    
    public Empleado(int codigo, int cantidadDeHorasTrabajadas, float sueldoPorHora) {
        this.codigo = codigo;
        this.candidadDeHorasTrabajadas = cantidadDeHorasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }
    
    public float CalcularSalarioSemanal(){
        //horas trabajadas regulares * costo x hora +
        //horas trabajadas extras * costo x hora * multiplicador horas extra     
        
        int horasRegularesSueldo = candidadDeHorasTrabajadas > 40 ? 40 : candidadDeHorasTrabajadas;
        this.horasExtra = candidadDeHorasTrabajadas > 40 ? candidadDeHorasTrabajadas - 40 : 0;
        float horasExtraSueldo = 0;
        
        if (this.horasExtra > 0 && this.horasExtra <=5) {
            horasExtraSueldo = this.horasExtra * this.sueldoPorHora * 2;                
        } else if (this.horasExtra > 5 ) {
            horasExtraSueldo = this.horasExtra * this.sueldoPorHora * 3;
        }
        
        return horasRegularesSueldo * this.sueldoPorHora + horasExtraSueldo;
    }
    
    public String toString() {
        return "Codigo: " + this.codigo +
                ", Total de HoraS: " + this.candidadDeHorasTrabajadas +
                ", Sueldo por Hora: " + this.sueldoPorHora +
                ", Horas extra: " + this.horasExtra +
                ", Sueldo Semanal: " + this.CalcularSalarioSemanal();      
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCandidadDeHorasTrabajadas() {
        return candidadDeHorasTrabajadas;
    }

    public float getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCandidadDeHorasTrabajadas(int candidadDeHorasTrabajadas) {
        this.candidadDeHorasTrabajadas = candidadDeHorasTrabajadas;
    }

    public void setSueldoPorHora(float sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    
}
