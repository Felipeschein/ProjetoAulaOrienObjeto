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