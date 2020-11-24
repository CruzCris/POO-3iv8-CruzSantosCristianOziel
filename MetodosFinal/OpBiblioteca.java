public class OpBiblioteca{
    private String h1, h2, h3, au;
    public OpBiblioteca(){

    }
    public OpBiblioteca(String h1, String h2, String h3, String au){
        this.h1=h1;
        this.h2=h2;
        this.h3=h3;
        this.au=au;
    }
    public String getH1(){
        return h1;
    }
    public void setH1(String h1){
        this.h1=h1;
    }
    public String getH2(){
        return h2;
    }
    public void setH2(String h2){
        this.h2=h2;
    }
    public String getH3(){
        return h3;
    }
    public void setH3(String h3){
        this.h3=h3;
    }
    public String getAutor(){
        return au;
    }
    public void setAutor(String au){
        this.au=au;
    }

}