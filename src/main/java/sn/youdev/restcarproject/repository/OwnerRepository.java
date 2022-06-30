package sn.youdev.restcarproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.youdev.restcarproject.domain.Owner;

public interface OwnerRepository extends JpaRepository<Owner,Long> {
}
