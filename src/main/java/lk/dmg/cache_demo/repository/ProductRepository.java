package lk.dmg.cache_demo.repository;

import lk.dmg.cache_demo.model.Product;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    @Override
    @Cacheable(value = "products" ,sync = true)
    Optional<Product> findById(Integer integer);

    @Override
    @Cacheable(value = "products" ,sync = true)
    Iterable<Product> findAll();

    @Override
    @Cacheable(value = "products" ,sync = true)
    Iterable<Product> findAllById(Iterable<Integer> iterable);
}
