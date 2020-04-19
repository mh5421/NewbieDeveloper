package model.vo;

public class Product {


	String pcode; //상품코드
	String pkind; //상품종류
	String pname; //상품명
	int pprice;   //상품가격
	String psize; //사이즈
	int pstock;	  //재고
	
	
public String getPcode() {
		return pcode;
	}
public void setPcode(String pcode) {
		this.pcode = pcode;
	}
public String getPkind() {
		return pkind;
	}
public void setPkind(String pkind) {
		this.pkind = pkind;
	}
public String getPname() {
		return pname;
	}
public void setPname(String pname) {
		this.pname = pname;
	}
public int getPprice() {
		return pprice;
	}
public void setPprice(int pprice) {
		this.pprice = pprice;
	}
public String getPsize() {
		return psize;
	}
public void setPsize(String psize) {
		this.psize = psize;
	}
public int getPstock() {
		return pstock;
	}
public void setPstock(int pstock) {
		this.pstock = pstock;
	}

}
