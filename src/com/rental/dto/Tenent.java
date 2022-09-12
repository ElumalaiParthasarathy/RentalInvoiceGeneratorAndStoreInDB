package com.rental.dto;

public class Tenent {
		
	private String tenetName;
	private String tenetPhone;
	private String tenetRoomNo;
	private int roomRent;
	private int roomMaintiance;
	private int waterBill;
	private int electricityCharges;
	
	
	public Tenent(String tenetName, String tenetPhone, String tenetRoomNo, int roomRent, int roomMaintiance, int waterBill,
			int electricityCharges) {
		super();
		this.tenetName = tenetName;
		this.tenetPhone = tenetPhone;
		this.tenetRoomNo = tenetRoomNo;
		this.roomRent = roomRent;
		this.roomMaintiance = roomMaintiance;
		this.waterBill = waterBill;
		this.electricityCharges = electricityCharges;
	}
	
	/**
	 * @return the tenetName
	 */
	public String getTenetName() {
		return tenetName;
	}
	/**
	 * @param tenetName the tenetName to set
	 */
	public void setTenetName(String tenetName) {
		this.tenetName = tenetName;
	}
	/**
	 * @return the tenetPhone
	 */
	public String getTenetPhone() {
		return tenetPhone;
	}
	/**
	 * @param tenetPhone the tenetPhone to set
	 */
	public void setTenetPhone(String tenetPhone) {
		this.tenetPhone = tenetPhone;
	}
	/**
	 * @return the tenetRoomNo
	 */
	public String getTenetRoomNo() {
		return tenetRoomNo;
	}
	/**
	 * @param tenetRoomNo the tenetRoomNo to set
	 */
	public void setTenetRoomNo(String tenetRoomNo) {
		this.tenetRoomNo = tenetRoomNo;
	}
	/**
	 * @return the roomRent
	 */
	public int getRoomRent() {
		return roomRent;
	}
	@Override
	public String toString() {
		return "Tenent [tenetName=" + tenetName + ", tenetPhone=" + tenetPhone + ", tenetRoomNo=" + tenetRoomNo
				+ ", roomRent=" + roomRent + ", roomMaintiance=" + roomMaintiance + ", waterBill=" + waterBill
				+ ", electricityCharges=" + electricityCharges + "]";
	}

	/**
	 * @param roomRent the roomRent to set
	 */
	public void setRoomRent(int roomRent) {
		this.roomRent = roomRent;
	}
	/**
	 * @return the roomMaintiance
	 */
	public int getRoomMaintiance() {
		return roomMaintiance;
	}
	/**
	 * @param roomMaintiance the roomMaintiance to set
	 */
	public void setRoomMaintiance(int roomMaintiance) {
		this.roomMaintiance = roomMaintiance;
	}
	/**
	 * @return the electricityCharges
	 */
	public int getElectricityCharges() {
		return electricityCharges;
	}
	/**
	 * @param electricityCharges the electricityCharges to set
	 */
	public void setElectricityCharges(int electricityCharges) {
		this.electricityCharges = electricityCharges;
	}
	/**
	 * @return the waterBill
	 */
	public int getWaterBill() {
		return waterBill;
	}
	/**
	 * @param waterBill the waterBill to set
	 */
	public void setWaterBill(int waterBill) {
		this.waterBill = waterBill;
	}
	
}
