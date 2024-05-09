package equipamentos.equipamentoMultifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora,
Impressora{

    public void copiar() {
        System.out.println("coiando com a MULTIFUNCIONAL");

    }
    public void digitalizar(){
        System.out.println("DIGITALIZANDO COM A MULTIFUNCIONAL");
    }
    public void imprimir(){
        System.out.println("IMPRIMINDO COM A MULTIFUNCIONAL");
    }
}
