

/**
 *
 * @author USRVI-LC2
 */
public class Instagram extends RedSocial{
    
    private int id;
    private String hitoria;
    private boolean estado;

    public Instagram() {
    }

    public Instagram(int id, String hitoria, boolean estado) {
        this.id = id;
        this.hitoria = hitoria;
        this.estado = estado;
    }
    
    public Instagram(int id, String hitoria, boolean estado, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.hitoria = hitoria;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHitoria() {
        return hitoria;
    }

    public void setHitoria(String hitoria) {
        this.hitoria = hitoria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString()+ " Instagram{" + "id=" + id + ", hitoria=" + hitoria + ", estado=" + estado + '}';
    }

    @Override
    public void metodoSobreescritura() {
        System.out.println("Usuario: " + super.getUsuario()); // es lo mismo ---> System.out.println("Usuario: " + this.getUsuario());
        System.out.println("Historia:  " + this.getHitoria());
    }
    
    
    
    
}
