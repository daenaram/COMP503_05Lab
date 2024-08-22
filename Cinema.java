public class Cinema {
    final public boolean reserved = true;
    public Boolean seats[][];

    public Boolean isReserved(int row,int col)
    { 
        if (row >= 0 && row < seats.length ) {
            if (col >= 0 && col < seats[row].length) {
                return seats[row][col];
            }
            else {
                return null;
            }
        }else {
            return null;
        }
        
    }

    public Cinema(Boolean[][] seats)
    {
    this.seats = seats;
    }

    public static void main(String[] args) {
    	Boolean[][] seats =
    		{{false, false, false},
    		{false, false, false},
    		{false, false, false}};
    	
    	Cinema cinema = new Cinema(seats);
    	Boolean value = cinema.isReserved(1,1);
    	System.out.println(value);
    }

}
