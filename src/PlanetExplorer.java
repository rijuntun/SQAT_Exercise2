
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	public enum eDirection
	{
		NORTH,WEST,SOUTH,EAST
	}
	int gridx,gridy =0;
	int posx,posy=0;
	eDirection facing=eDirection.NORTH;
	
			
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
		gridx=x;
		gridy=y;
		
		
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		switch (command){
		
		case "r":
			turn(command);
			return(getStatus());

		case"l":
			turn(command);
			return(getStatus());
			
		case "f":
		{
			setPosition(posx,posy+1,facing.toString());
			return(getStatus());			
		}		
		case "b":
		{
			setPosition(posx-1,posy,facing.toString());
			return(getStatus());			
		}		
		
		default:
			return("0,0,N");
		}
	}
	
	public int getGridx(){
		return this.gridx;
	}

	public int getGridy(){
		return this.gridy;
	}
	
	public void setPosition(int x,int y,String f)
	{
		posx=x;
		posy=y;
		switch (f){
			case "N":
			{
				facing=eDirection.NORTH;
				break;
			}
			case "W":
			{
				facing=eDirection.WEST;
				break;
			}
			
			case "S":
			{
				facing=eDirection.SOUTH;
				break;
			}
			case "E":
			{
				facing=eDirection.EAST;
				break;
			}
			
		}
	}
	
	public String getStatus()
	{
		return (posx +","+posy+","+facing.toString().substring(0,1));
	}
	
	public void turn(String dir)
	{
		
		if(dir == "l")
		{
			switch(facing)
			{
				case NORTH:
				{
					facing=eDirection.WEST;
					break;
				}	
				case WEST:
				{
					facing=eDirection.SOUTH;
					break;
				}	
				case SOUTH:
				{
					facing=eDirection.EAST;
					break;
				}	
				case EAST:
				{
					facing=eDirection.NORTH;
					break;
				}	
			}
		}
		
		if (dir == 'r')
		{			
			switch  (facing)
			{
				case NORTH:
				{
					facing=eDirection.EAST;
					break;
				}	
				case EAST:
				{
					facing=eDirection.SOUTH;
					break;
				}	
				case SOUTH:
				{
					facing=eDirection.WEST;
					break;
				}	
				case WEST:
				{
					facing=eDirection.NORTH;
					break;
				}	
			}
		}
	}
}
