
public class Fraction {
	
	float numerateur;
	float denominateur;
	
	Fraction(float a, float b){
		numerateur = a;
		denominateur = b;
	}
	
	
	public String toString() {
		
		return this.numerateur + "/" + this.denominateur;
	}
}
