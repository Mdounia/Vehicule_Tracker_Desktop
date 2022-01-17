package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class GPSTracker implements Serializable{

	private int id;
	private String simNumber;
	private String imei;
	private List<VehiculeGPSTracker> vehiculeGPSTracker;
	private List<Position> positions;
	public GPSTracker() {
		super();
	}



	public GPSTracker(int id, String simNumber, String imei) {
		super();
		this.id = id;
		this.simNumber = simNumber;
		this.imei = imei;
	}



	public GPSTracker(String simNumber, String imei) {
		super();
		this.simNumber = simNumber;
		this.imei = imei;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSimNumber() {
		return simNumber;
	}


	public void setSimNumber(String simNumber) {
		this.simNumber = simNumber;
	}


	public String getImei() {
		return imei;
	}


	public void setImei(String imei) {
		this.imei = imei;
	}
	

	public List<VehiculeGPSTracker> getVehiculeGPSTracker() {
		return vehiculeGPSTracker;
	}

	public void setVehiculeGPSTracker(List<VehiculeGPSTracker> vehiculeGPSTracker) {
		this.vehiculeGPSTracker = vehiculeGPSTracker;
	}
	

	public List<Position> getPositions() {
		return positions;
	}



	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}



	@Override
	public String toString() {
		return "GPSTracker [id=" + id + ", simNumber=" + simNumber + ", imei=" + imei + ", vehiculeGPSTracker="
				+ vehiculeGPSTracker + "]";
	}

	
}
