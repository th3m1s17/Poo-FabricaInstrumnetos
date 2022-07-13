package paquete;

import java.util.ArrayList;

public class Fabrica {
	
	private ArrayList<Sucursal>sucursales;
	
	public Fabrica() {
		this.sucursales=new ArrayList();
		
	}
	
	
	public void listarInstrumentos() {
		for (Sucursal lasucursal : sucursales) {//for each
			System.out.println(lasucursal.getNombre());
			lasucursal.listarInstrumentos();
			
		}
	}
	
	
	public void agregarSucursales(Sucursal lasucursal) {
		this.sucursales.add(lasucursal);
	}

	
/*	public void borrarInsrumento(String ID) {
		Instrumento borrado=null;
		int i=0;
		while(i<sucursales.size() && borrado==null) {
			borrado=sucursales.get(i).borrarInstrumento(ID);
			i++;
		}
		this.sucursales.remove();
		return borrado;
	}*/
	
	public ArrayList<Instrumento>instrumentoPorTipo(TipoInstrumento tipo){
		ArrayList<Instrumento>instEncontrados=new ArrayList(); //instaciar esta lista 
		for (Sucursal elelemento : sucursales) {  //recorrer las sucursales
			instEncontrados.addAll(elelemento.instrumentoPorTipo(tipo));
			
			
		}
		return instEncontrados;
		}
		
}
