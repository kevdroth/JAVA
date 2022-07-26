package ar.com.onwave.holamundostruts2.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HolaMundoAction {

    Logger log = LogManager.getLogger(HolaMundoAction.class);

    private String saludosAtr;

    public String execute(){
        log.info("Ejecutando metodo Execute desde Struts 2");
        this.saludosAtr = "Saludos desde Struts 2";
        return "exito";
    }

    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
}
