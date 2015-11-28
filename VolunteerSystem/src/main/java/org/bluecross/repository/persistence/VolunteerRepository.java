/**
 * 
 */
package org.bluecross.repository.persistence;

import org.bluecross.persistence.data.Volunteer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author x074134
 *
 */
@Repository
public interface VolunteerRepository extends CrudRepository<Volunteer, Long> {

}