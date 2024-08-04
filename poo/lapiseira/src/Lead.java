public class Lead {
    public double thickness;
    public String hardness;
    public int size;

    Lead(double thickness, String hardness, int size){
        this.thickness = thickness;
        this.hardness = hardness;
        this.size = size;
    }

    public int usagePerSheet(){
        switch (this.hardness) {
            case "HB" -> {
                return 1;
            }
            case "2B" -> {
                return 2;
            }
            case "4B" -> {
                return 4;
            }
            case "6B" -> {
                return 6;
            }
        }
        return 0;
    }

    public String getHardness(){
        return this.hardness;
    }

    public int getSize(){
        return this.size;
    }

    public double getThickness(){
        return this.thickness;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "lead{" +
                "thickness=" + thickness +
                ", hardness='" + hardness + '\'' +
                ", size=" + size +
                '}';
    }
}
