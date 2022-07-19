public class WesterosPersonagemFactory extends PersonagemFactory {
    
    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) throws Exception{
        switch (tipo) {
            case GUERREIRO:
                return new Guerreiro(nome, 0, 9, 7, 10, 7);

            case MAGO:
                return new Mago(nome, 8, 3, 3, 3, 4);

            case LADRAO:
                return new Ladrao(nome, 1, 8, 7, 7, 10);
        }
        return null;
    }

}
