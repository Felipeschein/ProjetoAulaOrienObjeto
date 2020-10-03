class Main {
    public static void main(String[] args) {
        System.out.println ("\nCódigo escrito por Felipe Schein, aluno da turma de POO 2020/2 do Unilasalle\n");

        System.out.println ("Desenhando a Figura 1:");
        Figura t = new Triangulo(3,2);
        t.desenha();
        t.showSpacePosition();
        System.out.println ("\nDesenhando a Figura 2:");
        Figura q = new Quadrado(4,5);
        q.desenha();
        q.showSpacePosition();
        System.out.println ("\nDesenhando a Figura 3:");
        Figura r = new Retangulo(2,2);
        r.desenha();
        r.showSpacePosition();
        System.out.println ("\nDesenhando a Figura 4:");
        Figura t1 = new Trapesio(6,9);
        t1.desenha();
        t1.showSpacePosition();
    }
}
//superclasse
class Figura
{
    String cor;
    String tipoFigura;
    private int _x;
    private int _y;
    //acessador get privado, só podendo ser alterado no método set
    private int getX(){return _x;}
    private int getY(){return _y;}
    void setX(int x){_x = x;}
    void setY(int y){_y = y;}
    //método para visualização da posição espacial
    void showSpacePosition(){
        System.out.println("Posicionamento espacial = ("+_x+","+_y+")");
    }
    //método para impressão das informações das figuras
    public void desenha()
    {
        System.out.println("Tipo de Figura: "+this.tipoFigura+"\nCor da figura: "+this.cor);
    }
    //construtor
    public Figura(){}
}
//subclasses
class Triangulo extends Figura
{
    int altura1;
    int altura2;
    int comprimento;
    public Triangulo(int x, int y){
        setX(x);
        setY(y);
        this.tipoFigura = "Triângulo";
        this.cor = "Azul";
        this.altura1 = 3;
        this.altura2 = 3;
        this.comprimento = 2;
    }
}
class Quadrado extends Figura {
    int lado;
    public Quadrado(int x, int y) {
        setX(x);
        setY(y);
        this.cor = "Amarelo";
        this.tipoFigura = "Quadrado";
        this.lado = 5;
    }
}
class Retangulo extends Figura {
    int altura;
    int comprimento;
    public Retangulo(int x, int y) {
        setX(x);
        setY(y);
        this.cor = "Vermelho";
        this.tipoFigura = "Retângulo";
        this.altura = 5;
        this.comprimento = 7;
    }
}
class Trapesio extends Figura {
    int altura;
    int comprimentoSuperior;
    int comprimentoInferior;
    public Trapesio(int x, int y) {
        setX(x);
        setY(y);
        this.cor = "Verde";
        this.tipoFigura = "Trapésio";
        this.altura = 4;
        this.comprimentoSuperior = 3;
        this.comprimentoInferior = 5;
    }
}