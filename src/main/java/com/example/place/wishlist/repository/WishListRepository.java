package com.example.place.wishlist.repository;

import com.example.place.db.MemoryDbRepositoryAbstract;
import com.example.place.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
