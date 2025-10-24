public class Posizione{
    
    private float x;
    private float y;
    private float z;



    public Posizione(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }



    public Posizione (){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }


    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public double distanzaDa(Posizione p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2) + Math.pow(this.z - p.z, 2));
    }





}