import javax.swing.JOptionPane;
public class Prestamo extends OpBiblioteca{
    private int e1, e2, e3, p1, p2, p3;
    public Prestamo(){

    }
    public Prestamo(String h1, String h2, String h3, String au, int e1, int e2, int e3, int p1, int p2, int p3){
        super(h1, h2, h3, au);
        this.e1=e1;
        this.e2=e2;
        this.e3=e3;
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    public void MostrarP(){
        int libro;
        JOptionPane.showMessageDialog(null, "Escoja el libro que quiera llevarse");
        libro=Integer.parseInt(JOptionPane.showInputDialog("1. "+getH1()+" 2. "+getH2()+" 3. "+getH3()));
        switch(libro){
            case 1:
                JOptionPane.showMessageDialog(null, "Para el libro "+getH1()+" de la autora "+getAutor()+" contamos con "+e1+" ejemplares y con "+p1+" ejemplar(es) prestados");
                e1=e1-1;
                p1=p1+1;
                JOptionPane.showMessageDialog(null, "Gracias por el interes ahora solo tenemos "+e1+" ejemplares y "+p1+" ejemplar(es) prestados");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Para el libro "+getH2()+" de la autora "+getAutor()+" contamos con "+e2+" ejemplares y "+p2+" ejemplar(es) prestados");
                e2=e2-1;
                p2=p2+1;
                JOptionPane.showMessageDialog(null, "Gracias por el interes ahora solo tenemos "+e2+" ejmplares y con "+p2+" ejmplares prestados");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Para el libro "+getH3()+" de la autora "+getAutor()+" contamos con "+e3+" ejemplares y "+p3+" ejemplar(es) prestados");
                if(e3==0){
                    JOptionPane.showMessageDialog(null, "Lo lamentamos, el libro "+getH3()+" tiene todos sus ejemplares prestados, tendra que esperar a que sean devolvidos o llevese otro");
                }
                break;
                default:
                JOptionPane.showMessageDialog(null, "----");
        }
    }
}