package com.ecommerce.order.repositories;

import com.ecommerce.order.models.CartItem;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface CartItemRepository extends JpaRepository<CartItem,Long> {
    CartItem findByUserIdAndProductId(String user, String product);

    List<CartItem> findByUserId(String user);


    void deleteByUserId(String user);
}
