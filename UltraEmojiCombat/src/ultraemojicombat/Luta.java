

package ultraemojicombat;

import java.util.Random;


public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() .equals (l2.getCategoria())
                && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    public void lutar(){
        
       // Preechendo Atributos de Batalha
       
          
       // Desafiado
       int pvDesafiado = (this.getDesafiado().getIdade() * 5);
       int forcaDesafiado = (int)(this.getDesafiado().getPeso()/1);
       int defDesafiado =  (int) (this.getDesafiado().getAltura()/0.1);
       
       //Desafiante 
       int pvDesafiante = (this.getDesafiante().getIdade() * 5);
       int forcaDesafiante = (int)(this.getDesafiante().getPeso()/1);
       int defDesafiante = (int)(this.getDesafiante().getAltura()/0.1);
       
       // Outras variaveis.
        boolean turno = true;

       Random d6 = new Random();
       int golpe, proteger,dano,rolagem;
       
        if (this.isAprovada()) {
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            System.out.println("\n~========== "+getDesafiado().getNome() +
                    " X "+getDesafiante().getNome()+" ==========~");
            System.out.println(getDesafiado().getNome()+"  pv = "+pvDesafiado);
            System.out.println(getDesafiante().getNome()+"  pv = "+pvDesafiante+"\n");
           
            do{
               
                
                // Contando o turno de cada lutador.
                if(turno == true){
                    // Rolagem de ataque.
                    rolagem = d6.nextInt(7);
                    switch(rolagem){
                        case 6:
                            golpe = (rolagem + forcaDesafiado) * 2;
                            System.out.println("Um acerto Crítico ! ");
                            break;
                            
                        default :
                            golpe = rolagem + forcaDesafiado;
                            break;
                    }
                    
                    //Rolagem de defesa
                    rolagem = d6.nextInt(7);
                    switch(rolagem){
                        case 6:
                            proteger = (rolagem + defDesafiante) * 2;
                            System.out.println(" Uma defesa  Crítica ! ");
                            break;
                            
                        default :
                           proteger = rolagem + defDesafiante;
                            break;
                    }
                    // Interface de acerto ou não.
                    dano = golpe - proteger;
                    if (dano > 0) {
                        pvDesafiante -= dano;
                        System.out.println(getDesafiado().getNome()+" acertou um golpe! ("+dano+")");
                        System.out.println(getDesafiante().getNome()+" esta com "+pvDesafiante+" pontos de vida!\n");
                    } else {
                        System.out.println(getDesafiado().getNome()+" lançou um golpe!");
                        System.out.println(getDesafiante().getNome()+" esquivou !\n");
                    }
                    
                    turno = false;
                } else {
                    // Turno de ataque do desafiante
                    rolagem = d6.nextInt(7);
                    switch(rolagem){
                        case 6:
                            golpe = (rolagem + forcaDesafiante) * 2;
                            System.out.println("Um acerto Crítico ! ");
                            break;
                            
                        default :
                            golpe = rolagem + forcaDesafiante;
                            break;
                    }
                    
                    //Rolagem de defesa
                    rolagem = d6.nextInt(7);
                    switch(rolagem){
                        case 6:
                            proteger = (rolagem + defDesafiado) * 2;
                            System.out.println(" Uma defesa  Crítica ! ");
                            break;
                            
                        default :
                           proteger = rolagem + defDesafiado;
                            break;
                    }
                    // Interface de acerto ou não.
                    dano = golpe - proteger;
                    if (dano > 0) {
                        pvDesafiado -= dano;
                        System.out.println(getDesafiante().getNome()+" acertou um golpe! ("+dano+")");
                        System.out.println(getDesafiado().getNome()+" esta com "+pvDesafiado+" pontos de vida!\n");
                    } else {
                        System.out.println(getDesafiante().getNome()+" lançou um golpe!");
                        System.out.println(getDesafiado().getNome()+" esquivou !\n");
                    }
                    
                    turno = true;
                }
            }while(pvDesafiado > 0 && pvDesafiante > 0);
            
            //atualizando dados dos lutadores.
            if (pvDesafiado < 0 ) {
                System.out.println("Vitória de "+getDesafiante().getNome()+" !");
                this.getDesafiado().perderLuta();
                this.getDesafiante().ganharLuta();
                System.out.println("Atualizando status: ");
                this.getDesafiante().status();
            } else {
                System.out.println("Vitória de "+getDesafiado().getNome()+" !");
                this.getDesafiante().perderLuta();
                this.getDesafiado().ganharLuta();
                System.out.println("Atualizando status: ");
                this.getDesafiado().status();
               
            }
            
        } else {
            System.out.println("Luta não pode acontecer. ");
        }
    
    }
    
    
    

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}
