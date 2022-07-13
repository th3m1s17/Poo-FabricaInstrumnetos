package paquete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fabrica f= new Fabrica();
		CargarFabrica(f);
		f.listarInstrumentos();
	
		ArrayList<Instrumento>lista=f.instrumentoPorTipo(TipoInstrumento.CUERDA);  // guardamos los elementos de la lista
		System.out.println("buscar instrumentos ********"); //busca los tipos de instrumentos
		for (Instrumento instrumento : lista) {
			
			System.out.println(instrumento);
		
			
		}
	}

	
	
	
	
	public static void  CargarFabrica(Fabrica f) {
		
		Sucursal s1= new Sucursal("Sucursal A");
		Sucursal s2= new Sucursal("Sucursal B");
		
		s1.agregarInstrumento(new Instrumento("ABC123",13214,TipoInstrumento.CUERDA));
		s1.agregarInstrumento(new Instrumento("BCD456",13432,TipoInstrumento.VIENTOS));
		s1.agregarInstrumento(new Instrumento("DEL587",15464,TipoInstrumento.PERUSION));
		
		
		s2.agregarInstrumento(new Instrumento("ABC123",13000,TipoInstrumento.CUERDA));
		s2.agregarInstrumento(new Instrumento("Yamaja",14000,TipoInstrumento.VIENTOS));
	//	s2.agregarInstrumento(new Instrumento("DEL587",15000,TipoInstrumento.PERUSION));
		
		
		
		f.agregarSucursales(s1);
		f.agregarSucursales(s2);
		
	}
}
