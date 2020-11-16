package sesion1.plane.model;

/**
 * Class SeatManager. 
 * 
 * @author Gema Rico Pozas 
 * @version 6/2/2017
 */
import java.util.ArrayList;
public class SeatManager
{   
    //CONSTANTES
    public final static int MIN_ROWS = 1;
    public final static int MIN_COLUMNS=1;
    public final static int MAX_ROWS=10;    
    public final static int MAX_COLUMNS=4;
  
    // ATRIBUTOS
    private Person [][] seats;    
	/**
     * Constructor of class SeatManager con parametros
     * 
     * @param el numero de filas 
     * @param el numero de columnas
     * 
     */    
    public SeatManager(int rows, int columns)
    {
        if ((rows > MAX_ROWS)|| (rows < MIN_ROWS)|| (columns > MAX_COLUMNS)|| (columns < MIN_COLUMNS))
        	throw new RuntimeException ("Error, parámetros incorrectos");
        seats = new Person [rows][ columns];
    }

    /**
     * Metodo que reserva un asiento para la persona recibida como parametro 
     * en la fila y columna recibida como parametro
     *
     * @param  persona para la reserva de tipo person
     * @param columna de la matriz
     * @param fila de la matriz
     * 
     * @return True si puede sentarse o false si esta ocupado
     */
    public boolean bookSeat(Person person, int row, int column)
    {
        if ((person == null) || (row < 0) || (row >=MAX_ROWS) || 
        		( column <0 ) || (column > MAX_COLUMNS))
            throw new RuntimeException("Error: parametros incorrectos");
        if (seats[row][column]==null || (seats[row][column].getAge()<Person.RETIREMENT_AGE && seats[row][column].getAge()>=Person.ADULTHOOD_AGE))
        {
            seats[row][column]=person; 
            return true;
        }     
        return false;     
     }  
   
    /**
     * Metodo que devuelve un ArrayList con las personas sentadas en ventanilla  
     * cuya edad esté comprendida en el intervalo [edad mínima, edad máxima].
     * 
     * @param min_age edad minima del intervalo
     * @param max_age edad maxima del intervalo
     * 
     * @return arrayList con las personas sentadas en ventanilla  
     * cuya edad esté comprendida en el intervalo 
     */
    public ArrayList<Person> findPassengersByAge(int max_age, int min_age)
    {    	
        if ((max_age > Person.MAX_AGE) || (min_age < Person.MIN_AGE) || (min_age>max_age))
        	
 		   return null;
        
        else 
        {
        ArrayList<Person> passengers =new ArrayList<Person>();
        
        for (int i=0; i< seats.length ; i=i+2){
           for(int j=0;j<seats[i].length;j++){
        	   if((seats[i][j].getAge()>= min_age)&&(seats[i][j].getAge()<= max_age)) 
                   passengers.add(seats[i][j]); 
        	   }
           }
                
        return passengers;
        }
    }    
     
   

	// Metodos para hacer las pruebas
    /**
     * Metodo que devuelve el valor de la matriz
     * @return matriz
     */
    public Person[][] getSeats() {
  		return seats;
  	}
    /**
     * Metodo que devuelve el valor de la persona
     * @return persona
     */
    public Person getPerson(int column, int row)
    {
        if((column < 0) || (column >MAX_COLUMNS) || ( row <0 ) || (row >MAX_ROWS))
            throw new RuntimeException ("Error: parametros incorrectos");
        return seats[row][column];
    }

    /**
     * Metodo que nos dice cuantos pasajeros estan sentados en el avion
     * 
     * @return  el numero de pasajeros sentados en el avion
     */
    public int getSize()
    {
        int contadorPassanger =0;
        for (int i=0; i< seats.length ; i ++)
        { for (int j=0; j < seats[i].length ; j++)  
             if(seats[i][j]!=null)
                    contadorPassanger ++;          
        }
        return contadorPassanger;
    }

}
