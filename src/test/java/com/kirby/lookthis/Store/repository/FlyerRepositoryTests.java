package com.kirby.lookthis.Store.repository;

import com.kirby.lookthis.spot.entity.Spot;
import com.kirby.lookthis.store.dto.FlyerSpotDto;
import com.kirby.lookthis.store.entity.Flyer;
import com.kirby.lookthis.store.entity.FlyerSpot;
import com.kirby.lookthis.store.repository.FlyerRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Log4j2
public class FlyerRepositoryTests {

    @Autowired
    private FlyerRepository flyerRepository;

    @Test
    public void insertFlyerTest() {
        Flyer flyer = Flyer.builder()
                .storeId(1)
                .path("/test/flyer/1")
                .createDate(LocalDateTime.now())
                .endValidDate(LocalDateTime.now())
                .build();

        flyerRepository.save(flyer);
    }

    @Test
    public void getFlyerListTest() {
        List<Integer> spotIdList = new ArrayList<>();
        spotIdList.add(1);
        spotIdList.add(2);
        List<Flyer> flyerList = flyerRepository.findBySpots(spotIdList);
        flyerList.stream().forEach(flyer -> log.info(flyer));

    }
}
