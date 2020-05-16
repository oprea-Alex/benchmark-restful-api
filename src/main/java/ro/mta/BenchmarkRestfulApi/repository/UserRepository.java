package ro.mta.BenchmarkRestfulApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.mta.BenchmarkRestfulApi.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,String> {
}
