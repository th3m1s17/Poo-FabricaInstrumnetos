package paquete;

import java.util.ArrayList;

public class Sucursal {
	private ArrayList<Instrumento>instrumentos;
	private String nombre;
	
	
	public Sucursal() {
		
	}
	
	public Sucursal(String nombre) {
		this.nombre=nombre;
		this.instrumentos=new ArrayList();
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarInstrumento(Instrumento ins) {
		this.instrumentos.add(ins);
	}
	
	public void listarInstrumentos() {
		for(Instrumento cadaInstrumento:instrumentos) { //for each
			
			System.out.println(cadaInstrumento);
		}
	}
	
	
	public ArrayList<Instrumento>instrumentoPorTipo(TipoInstrumento tipo){
		ArrayList<Instrumento>instEncontrados=new ArrayList(); //instaciar esta lista 
		for (Instrumento instrumento : instrumentos) {
			if (instrumento.getTipo()==tipo) {
				
				instEncontrados.add(instrumento);
			}
		}
		return instEncontrados;
		
	}
	
	public Instrumento borrarInsrumento(String ID) {
		// buscar instrumento por id 
		//si existe borrarlo
		
		return null;
		
	}
	
	
	public Instrumento borrarIstrumento(String ID) {
		Instrumento insaBorrar=buscarInstrumento(ID);
		this.instrumentos.remove(insaBorrar);
		
		return insaBorrar;
		
	}
	
	private Instrumento buscarInstrumento(String ID) {
		int i=0;
		Instrumento insEncontrado=null;
		
		while(i<instrumentos.size()&& this.instrumentos.get(i).getID().equals(ID)) {
			i++;
			
		}
		if (i<instrumentos.size()) {
			insEncontrado=this.instrumentos.get(i);
		}
		 return insEncontrado;
		
	}
	
	
/*	
		Instrumento borrado=null;
		int i=0;
		while(i<sucursales.size() && borrado==null) {
			borrado=sucursales.get(i).borrarInstrumento(ID);
			i++;
		}
		this.sucursales.remove();
		return borrado;
	}*/
	
	
	
	
}
