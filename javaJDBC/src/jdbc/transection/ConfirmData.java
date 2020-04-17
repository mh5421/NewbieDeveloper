package jdbc.transection;

public class  ConfirmData
{
	String sendCust;
	String recvCust;
	int gainMoney;

	public ConfirmData() {

	}

	public void setSendCust( String sendCust ){
		this.sendCust = sendCust;
	}

	public String getSendCust() {
		return sendCust;
	}

	public void setRecvCust( String recvCust ){
		this.recvCust = recvCust;
	}

	public String getRecvCust() {
		return recvCust;
	}

	public void setGainMoney( int gainMoney ){
		this.gainMoney = gainMoney;
	}

	public int getGainMoney() {
		return gainMoney;
	}
}
