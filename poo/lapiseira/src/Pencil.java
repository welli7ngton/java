public class Pencil {
    public double thickness;
    public Lead tip;

    Pencil(double thickness){
        this.thickness = thickness;
    }

    public boolean hasGraphite(){
        return this.tip != null;
    }

    public boolean insert(Lead lead){
        if (this.hasGraphite() || this.thickness != lead.getThickness()){
            System.out.print("Já existe um grafite ou dureza incompatível.");
            return false;
        }
        System.out.print("Grafite adicionado.");
        this.tip = lead;
        return true;
    }

    public boolean remove(){
        if (this.hasGraphite()){
            System.out.print("Removendo grafite.");
            this.tip = null;
            return true;
        }
        System.out.print("Não tem grafite para remover.");
        return false;
    }

    public void writePage() {
        if (this.hasGraphite()) {
            System.out.print("Estou escrevendo.");
            int _size = this.tip.getSize();
            int _usage = this.tip.usagePerSheet();
            if (_size >= _usage) {
                System.out.print("Página escrita.");
                this.tip.setSize(_size - _usage);
                if (this.tip.getSize() == 0) {
                    System.out.print("Grafite esgotado, removendo.");
                    this.remove();
                }
            } else {
                System.out.print("Não tem grafite o suficiente para escrever.");
            }
        } else {
            System.out.print("Não há grafite na lápis.");
        }
    }

    public String toString() {
        return "Pencil{" +
                "thickness=" + thickness + '\'' +
                "tip=" + tip +
                '}';
    }
}

