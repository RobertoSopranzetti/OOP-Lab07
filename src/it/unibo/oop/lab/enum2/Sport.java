/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
		BASKET(5, "Basketball", Place.INDOOR),
		VOLLEYBALL(6, "Volleyball", Place.INDOOR),
		TENNIS(1, "Tennis", Place.INDOOR),
		BIKE(1, "Riding Bike", Place.OUTDOOR),
		F1(1, "Formula 1", Place.OUTDOOR),
		MOTOGP(1, "Moto GP", Place.OUTDOOR),
		SOCCER(11, "Football", Place.OUTDOOR);
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
		private final int members;
		private final String name;
		private final Place place;
		

    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
		private Sport(final int members, final String name, final Place place) {
			this.members = members;
			this.name = name;
			this.place = place;
		}
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     */
		public boolean isIndividualSport() {
			return this.members == 1;
		}
     /* 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     */
		public boolean isIndoorSport() {
			return this.place == Place.INDOOR;
		}
     /* 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     */
		public Place getPlace() {
			return this.place;
		}
     /* 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
		public String toString() {
			return "Name: " + this.name + " Members: " + this.members + " is practiced " + this.place;
		}
}
