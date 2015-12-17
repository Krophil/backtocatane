package model;
public class ModelRoute extends ModelStructure{

	private ModelSommet A;
	private ModelSommet B;

	public ModelRoute(){
		this.A = null;
		this.B = null;
	}

	public ModelRoute(ModelSommet newA, ModelSommet newB){
		this.A = newA;
		this.B = newB;
	}

}
