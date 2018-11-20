package metier.enties;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reservation
 *
 */
@Entity

public class Reservation implements Serializable {

	@Id
	private int id;
	
	private static final long serialVersionUID = 1L;

	public Reservation() {
		super();
	}
   
}
