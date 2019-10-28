package models;

public class Letter {

		private int heigt;
		private int width;
		private char letter;
		
		public Letter(int heigt, int width, char letter) {
			this.heigt = heigt;
			this.width = width;
			this.letter = letter;
		}
		
		public int[][] getLetter(){
			switch (letter) {
			case 'A': return getLetterA();
			case 'B': return getLetterB();
			case 'C': return getLetterC();
			case 'D': return getLetterD();
			case 'E': return getLetterE();
			case 'F': return getLetterF();
			case 'G': return getLetterG();
			case 'H': return getLetterH();
			case 'I': return getLetterI();
			case 'J': return getLetterJ();
			case 'K': return getLetterK();
			case 'L': return getLetterL();
			case 'M': return getLetterM();
			case 'N': return getLetterN();
			case 'O': return getLetterO();
			case 'P': return getLetterP();
			case 'Q': return getLetterQ();
			case 'R': return getLetterR();
			case 'S': return getLetterS();
			case 'T': return getLetterT();
			case 'U': return getLetterU();
			case 'V': return getLetterV();
			case 'W': return getLetterW();
			case 'X': return getLetterX();
			case 'Y': return getLetterY();
			case 'Z': return getLetterZ();
			default:
				System.out.println("La letra no existe");
				return null;
			}
		}
		
		private void setHorizontal(int[][] matriz,int position,int divided) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[position][j/divided] = 1;
				}
			}
		}
		
		private void setVertical(int[][] matriz,int position,int divided) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[i/divided][position] = 1;
				}
			}
		}
		
		private void setDiagonal(int[][] matriz,int position) {
			int count = 0;
			for (int i = 0; i < matriz.length-count-position; i++) {
				for (int j = 0; j < matriz[i].length-position; j++) {
					matriz[(i+count)+position][j] = 1;
					count++;
				}
			}
		}
		
		//Esta en prueba la diagonal inversa
		private void setDiagonalInverse(int[][] matriz,int position) {
			int count = matriz.length;
			for (int i = 0; i < matriz.length-count-position; i++) {
				for (int j = 0; j < matriz[i].length-position; j++) {
					matriz[(i+count)+position][j] = 1;
					count++;
				}
			}
		}
		
		private int[][] getLetterA(){
			int[][] a = new int[width][heigt];
			setHorizontal(a,0,1);
			setVertical(a,0,1);
			setVertical(a,heigt-1,1);
			setHorizontal(a,width/2,1);
			return a;
		}
		
		private int[][] getLetterB(){
			int[][] b = new int[width][heigt];
			setVertical(b,0,1);
			setDiagonal(b,5);
			return b;
		}
		
		private int[][] getLetterC(){
			int[][] c = new int[width][heigt];
			setVertical(c,0,1);
			setHorizontal(c,0,1);
			setHorizontal(c,width-1,1);
			return c;
		}
		
		private int[][] getLetterD(){
			int[][] d = new int[width][heigt];
			setHorizontal(d,0,1);
			return d;
		}
		
		private int[][] getLetterE(){
			int[][] e = new int[width][heigt];
			setHorizontal(e,0,1);
			setVertical(e,0,1);
			setHorizontal(e,width/2,1);
			setHorizontal(e,width-1,1);
			return e;
		}
		
		private int[][] getLetterF(){
			int[][] f = new int[width][heigt];
			setHorizontal(f,0,1);
			setVertical(f,0,1);
			setHorizontal(f,width/2,2);	
			return f;
		}
		
		private int[][] getLetterG(){
			int[][] g = new int[width][heigt];
			return g;
		}
		
		private int[][] getLetterH(){
			int[][] h = new int[width][heigt];
			setVertical(h,0,1);
			setHorizontal(h,width/2,1);
			setVertical(h,heigt-1,1);
			return h;
		}
		
		private int[][] getLetterI(){
			int[][] i = new int[width][heigt];
			setHorizontal(i,0,1);
			setVertical(i,heigt/2,1);
			setHorizontal(i,width-1,1);
			return i;
		}
		
		private int[][] getLetterJ(){
			int[][] j = new int[width][heigt];
			return j;
		}
		
		private int[][] getLetterK(){
			int[][] k = new int[width][heigt];
			setVertical(k,0,1);
			setDiagonal(k,width/2-1);
			return k;
		}
		
		private int[][] getLetterL(){
			int[][] l = new int[width][heigt];
			setVertical(l,0,1);
			setHorizontal(l,width-1,1);
			return l;
		}
		
		private int[][] getLetterM(){
			int[][] m = new int[width][heigt];
			return m;
		}
		
		private int[][] getLetterN(){
			int[][] n = new int[width][heigt];
			setVertical(n,0,1);
			setDiagonal(n,0);
			setVertical(n, heigt-1,1);
			return n;
		}
		
		private int[][] getLetterO(){
			int[][] o = new int[width][heigt];
			return o;
		}
		
		private int[][] getLetterP(){
			int[][] p = new int[width][heigt];
			setVertical(p,0,1);
			setHorizontal(p,0,1);
			setHorizontal(p,width/2,1);
			setVertical(p,heigt-1,2);
			return p;
		}
		
		private int[][] getLetterQ(){
			int[][] q = new int[width][heigt];
			return q;
		}
		
		private int[][] getLetterR(){
			int[][] r = new int[width][heigt];
			return r;
		}
		
		private int[][] getLetterS(){
			int[][] s = new int[width][heigt];
			setHorizontal(s,0,1);
			setVertical(s,0,2);
			setHorizontal(s,width/2,1);
			//To do...
			setHorizontal(s,width-1,1);
			return s;
		}
		
		private int[][] getLetterT(){
			int[][] t = new int[width][heigt];
			setHorizontal(t,0,1);
			setVertical(t,heigt/2,1);
			return t;
		}
		
		private int[][] getLetterU(){
			int[][] u = new int[width][heigt];
			return u;
		}
		
		private int[][] getLetterV(){
			int[][] v = new int[width][heigt];
			return v;
		}
		
		private int[][] getLetterW(){
			int[][] w = new int[width][heigt];
			return w;
		}
		
		private int[][] getLetterX(){
			int[][] x = new int[width][heigt];
			return x;
		}
		
		private int[][] getLetterY(){
			int[][] y = new int[width][heigt];
			return y;
		}
		
		private int[][] getLetterZ(){
			int[][] z = new int[width][heigt];
			return z;
		}
}
