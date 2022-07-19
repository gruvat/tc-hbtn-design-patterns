public class TerraMediaPersonagemFactory extends PersonagemFactory {
    
    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) throws Exception{
        switch (tipo) {
            case GUERREIRO:
                return new Guerreiro(nome, 1, 8, 5, 10, 6);

            case MAGO:
                return new Mago(nome, 10, 2, 5, 3, 4);

            case LADRAO:
                return new Ladrao(nome, 2, 6, 8, 5, 10);
        }
        return null;
    }

}
