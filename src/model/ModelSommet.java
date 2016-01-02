package src.model;
import java.util.ArrayList;
import java.util.Arrays;


public class ModelSommet {

	//Attributs
	private int[] id;	//tableau identification du sommet (ex: X,Y,Z)

	private int[][] voisin;	//Tableau
	private boolean type; //true=type1 ; false=type2
	private boolean busy; //true=occupé; false=pas de construction

	private boolean[] routes; //true=occupé; false=pas de route vers ce sommet
	private ArrayList<ModelStructure> mystructure;
    private ModelTown town;


	//Corps de la classe
	public ModelSommet(){
		this.setType(false);
		routes = new boolean[3];
		id = new int[]{0,0,0};
		voisin = new int[3][3];
		mystructure = new ArrayList<ModelStructure>();
        town = new ModelTown(-1);
	}

	public ModelSommet(boolean type, int[] tab){
		//Generation des sommets voisins d'un sommet donné
		this.setType(type);
		routes = new boolean[3];
		id = tab;
		voisin = new int[3][3];
		generVois();
		mystructure = new ArrayList<ModelStructure>();
        town = new ModelTown(-1);
	}

    public ModelTown getTown() {
        return town;
    }

    public void setTown(ModelTown town) {
        this.town = town;
    }

    public void generVois(){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				voisin[i][j] = 0;
			}
		}

		int b;

		if(this.type==true){
			if((this.id[0]/8)%2 == 0){
				b = 8;
			}else{
				b = 7;
			}
			voisin[0][0]=this.id[1] + b;
			voisin[0][1]=this.id[2];
			voisin[0][2]=this.id[1];

			voisin[1][0]=this.id[2];
			voisin[1][1]=this.id[0]-1;
			voisin[1][2]=this.id[0];

			voisin[2][0]=this.id[1];
			voisin[2][1]=this.id[0];
			voisin[2][2]=this.id[0]+1;

		}else{
			if((this.id[0]/8)%2==0) {
				b = 7;
			} else {
				b = 8;
			}
			voisin[0][0]=this.id[1] - b;
			voisin[0][1]=this.id[2];
			voisin[0][2]=this.id[1];

			voisin[1][0]=this.id[2];
			voisin[1][1]=this.id[0]+1;
			voisin[1][2]=this.id[0];

			voisin[2][0]=this.id[1];
			voisin[2][1]=this.id[0];
			voisin[2][2]=this.id[0]-1;

		}
	}

	public void construire(ModelStructure struct) {

	}

	@Override
	public String toString(){
		String str = "Sommet : ";
        for(int i:id) {
            str+=i+",";
        }
		return str;
	}

	public int numVoisin(int[] In){
		int index = -1;
        //System.out.println(In);
		for(int i=0; i<3; i++){
            //System.out.println(voisin[i]);
            Boolean eq = new Boolean(false);
            for(int a:In){
                for(int b:voisin[i]){
                    if(a==b){
                        eq = true;
                    }else{
                        eq = false;
                    }
                }
                if(eq)
                    index = i;
            }
            /*if(Arrays.deepEquals(In,voisin[i])){
				index = i;

            }*/
		}
		return index;
	}


	//accesseur
	public int[] getId() {
		return id;
	}

	public void setId(int[] id) {
		this.id = id;
	}

	public boolean getType(){
		return type;
	}

	public void setType(boolean type){
		this.type = type;
	}

	public int getVoisin(int id, int idTuiles){
		return voisin[id][idTuiles];
	}

	public int[][] getVoisin(){
		return voisin;
	}

	public int[] getVoisin(int id){
		return voisin[id];
	}

    public void displayVoisin(){
        System.out.println("Sommet"+id[0]+" "+id[1]+" "+id[2]);
        for(int i=0;i<3;i++){
            System.out.print("Voisin"+i+": ");
            for(int j=0;j<3;j++){
                System.out.print(voisin[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void displayRoute(){
        for(Boolean route:routes)
            System.out.println("Route "+ route);
    }
	public boolean getBusy(){
		return busy;
	}

	public void setBusy(boolean b){
		this.busy=b;
	}

	public boolean getRoute(int i){
		return routes[i];
	}
	public boolean[] getRoutes(){
		return routes;
	}

	public void setRoute(int i, boolean b){
		routes[i] = b;
	}


	public ArrayList<ModelStructure> getMystructure(){
		return mystructure;
	}

	public void addMystructure(ModelStructure Str){mystructure.add(Str);}




}