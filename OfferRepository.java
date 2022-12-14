package com.gl.RechargeApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.RechargeApp.bean.Offer;


@Repository
public interface OfferRepository extends JpaRepository<Offer,Long> {
	 @Query("select max(id) from  Offer")
		public Long findMaxOfferId();
}
