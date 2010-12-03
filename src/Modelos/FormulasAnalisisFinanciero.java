/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelos;

import java.util.Scanner;

/**
 *
 * @author rbnseven
 */
public class FormulasAnalisisFinanciero {

    private static Scanner lee = new Scanner(System.in);

//-------------------------ANALISIS DE LIQUIDEZ------------------------------

    /*

     * Capital de Trabajo Neto = Activo Circulante – Pasivo Circulante

     */
    public Double calcularCapitalTrabajoNeto(Double op1, Double op2) {

        return op1 - op2;

    }

    /*

     * Razon Circulante = Activo Circulante / Pasivo Circulante

     */
    public Double calcularRazonCirculante(Double op1, Double op2) {

        return op1 / op2;

    }

    /*

     * Razon Rapida(Prueba del Acido) = (Activo Circulante – Inventario) / Pasivo Circulante

     */
    public Double calcularRazonRapidaOrPruebaDelAcido(Double op1, Double op2, Double op3) {

        return (op1 - op2) / op3;

    }

//------------------------ANALISIS DE ACTIVIDAD------------------------------

    /*

     * Rotacion de Inventario = Costo de Ventas / Inventario

     */
    public Double calcularRotacionDeInventario(Double op1, Double op2) {

        return op1 / op2;

    }

    /*

     * Periodo Promedio de Cobro = Cuentas Por Cobrar / Ventas Promedio Por Dia

     */
    public Double calcularPeriodoPromedioDeCobroUnoDia(Double op1, Double op2) {

        return op1 / op2;

    }

    /*

     * Periodo Promedio de Cobro = Cuentas Por Cobrar / (Ventas Anuales / 360)

     */
    public Double calcularPeriodoPromedioDeCobroDosAnual(Double op1, Double op2) {

        return op1 / (op2 / 360);

    }

    /*

     * Periodo Promedio de Pago = Cuentas Por Pagar / Compras Promedio Por Dia

     */
    public Double calcularPeriodoPromedioDePagoUnoDia(Double op1, Double op2) {

        return op1 / op2;

    }

    /*

     * Periodo Promedio de Pago = Cuentas Por Pagar / (Compras Anuales / 360)

     */
    public Double calcularPeriodoPromedioDePagoDosAnual(Double op1, Double op2) {

        return op1 / (op2 / 360);

    }

    /*

     * Rotacion de Activos Totales = Ventas / Activos Totales

     */
    public Double calcularRotacionDeActivosTotales(Double op1, Double op2) {

        return op1 / op2;

    }

//------------------------------ANALISIS DE DEUDA--------------------------

    /*

     * Razon de Deuda = Pasivos Totales / Activos Totales

     */
    public Double calcularRazonDeDeuda(Double op1, Double op2) {

        return op1 / op2;

    }

    /*

     * Razon de la Capacidad de Pago de Intereses = Utilidad Antes de Intereses e Impuestos / Intereses

     */
    public Double calcularRazonDeCapacidadDePagoDeIntereses(Double op1, Double op2) {

        return op1 / op2;

    }

//----------------------------ANALISIS DE RENTABILIDAD--------------------------

    /*

     * Margen de Utilidad Bruta = (Ventas – Costos De Ventas) / Ventas

     */
    public Double calcularMargenDeUtilidadBrutaUno(Double op1, Double op2) {

        return (op1 - op2) / op1;

    }

    /*

     * Margen de Utilidad Bruta = Utilidad Bruta / Ventas

     */
    public Double calcularMargenDeUtilidadBrutaDos(Double op1, Double op2) {

        return op1 / op2;

    }

    /*

     * Margen de Utilidad Operativa = Utilidad Operativa / Ventas

     */
    public Double calcularMargenDeUtilidadOperativa(Double op1, Double op2) {

        return op1 / op2;

    }

    /*

     * Margen de Utilidad Neta = Utilidad Neta Despues de Impuestos / Ventas

     */
    public Double calcularMargenDeUtilidadNeta(Double op1, Double op2) {

        return op1 / op2;

    }

    /*

     * Rendimiento Sobre Los Activos = Utilidad Neta Despues de Impuestos / Activos Totales

     */
    public Double calcularMendimientoSobreLosActivos(Double op1, Double op2) {

        return op1 / op2;

    }

    /*

     * Rendimiento Sobre El Capital Contable = Utilidad Neta Despues de Impuestos / Capital Contable

     */
    public Double calcularMRendimientoSobreElCapitalContable(Double op1, Double op2) {

        return op1 / op2;

    }

    public static void main(String[] args) {

        FormulasAnalisisFinanciero faf = new FormulasAnalisisFinanciero();

        Double op1 = new Double("0.0");

        Double op2 = new Double("0.0");

        System.out.println("ANALISIS DE LIQUIDEZ");

        System.out.println("");

        System.out.println("CAPITAL NETO");

        System.out.println("Activo circulante: ");

        op1 = lee.nextDouble();

        System.out.println("Pasivo Circulante: ");

        op2 = lee.nextDouble();

        System.out.println("Resultado: " + faf.calcularCapitalTrabajoNeto(op1, op2));

    }
}
