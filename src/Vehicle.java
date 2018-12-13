import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vehicle {

	private int startX, startY, endX, endY, rows, cols;
	private Color colour;
	private List<String> moves;
	
	/**
	 * Creates new vehicle by assigning it certain attributes provided by input file
	 * @param x coordinate, y coordinate, width, height, list of direcitions, color of car
	 */
	public Vehicle(int x, int y, int width, int height, String directions[], Color colour){
		
		this.startX = x;
		this.startY = y;
		this.colour = colour;
		this.endX = width;
		this.endY =  height;
		this.moves = Arrays.asList(directions);
		
	}
	/*
	 * @returns x coordinate of car
	 */
	public int getX(){
		return startX;
	}
	/*
	 * @returns x coordinate of car
	 */
	public int getY(){
		return startY;
	}
	/*
	 * @returns width of car
	 */
	public int getWidth(){
		return endX;
	}
	/*
	 * @returns height of car
	 */
	public int getHeight(){
		return endY;
	}
	/*
	 * @returns possible moves car can make
	 */
	public List<String> getMoves(){
		return moves;
	}
	/*
	 * @returns color of car
	 */
	public Color getColour() {
		return colour;
	}
	
	public void setColour(Color colour) {
		this.colour = colour;
	}
		
	/**
	 * Updates x and y coordinates after each move
	 * @param direction in which car should be move
	 */
	public void move(String direction) {
		
		switch(direction){
			
			case "up":
				startY ++;
				break;
			
			case "down":
				startY --;
				break;
			
			case "left":
				startX --;
				break;
			
			case "right":
				startX ++;
				break;
		}
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + cols;
		result = prime * result + endX;
		result = prime * result + endY;
		//result = prime * result + ((moves == null) ? 0 : moves.hashCode());
		//result = prime * result + rows;
		result = prime * result + startX;
		result = prime * result + startY;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (cols != other.cols)
			return false;
		if (endX != other.endX)
			return false;
		if (endY != other.endY)
			return false;
		if (moves == null) {
			if (other.moves != null)
				return false;
		} else if (!moves.equals(other.moves))
			return false;
		if (rows != other.rows)
			return false;
		if (startX != other.startX)
			return false;
		if (startY != other.startY)
			return false;
		return true;
	}



	
}