package eu.jpereira.trainings.jee.persistence.model;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * This is the base class for all Domain Objects in the App
 * 
 * @author jee
 * 
 */
// TODO Persistence: This state of this class should be persisted in every class
// down in the hierarchy. Annotate the class with proper javax.persistence annotation
@MappedSuperclass
public abstract class DomainObject {
	// Add any common state and behavior here

	// TODO Persistence: This class can contain the version field used by
	// persistence provider to check if the domain object state in cache is
	// synchronized with state the DB. Create a new private instance field of
	// type string and annotate it with the proper javax.persistence annotation

	@Version
	private Long version;
}
