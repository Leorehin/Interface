package estabelecimento;

import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.equipamentoMultifuncional.EquipamentoMultiFuncional;
import equipamentos.impressora.Impressora;
import equipamentos.copiadora.Copiadora;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }

}
