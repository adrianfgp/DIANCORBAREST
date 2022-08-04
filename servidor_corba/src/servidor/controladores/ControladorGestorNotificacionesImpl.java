
package servidor.controladores;

import java.rmi.RemoteException;
import servidor.Repositorios.CancionRepositoryInt;
import sop_corba.ControladorCancionIntPOA;
import sop_corba.ControladorCancionIntPackage.CancionDTO;
import sop_corba.ControladorNotificacionesIntPOA;
import sop_corba.ControladorNotificacionesIntPackage.NotificacionDTO;


public class ControladorGestorNotificacionesImpl extends ControladorNotificacionesIntPOA {
    
      @Override
    public void registrarNotificacion(NotificacionDTO objNotificacion) {
          System.out.println();
          System.out.println("------Llego una nueva notificacion-----");
          System.out.println("Id: "+objNotificacion();
          System.out.println("Tipo de identifiacion: "+objNotificacion);
    }
}
