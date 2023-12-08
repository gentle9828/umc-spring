package umc.spring.converter;

import java.time.LocalDateTime;
import umc.spring.domain.FoodCategory;
import umc.spring.domain.Region;
import umc.spring.domain.Store;
import umc.spring.web.dto.StoreResponseDTO;

public class StoreConverter {

    public static StoreResponseDTO.StoreResultDTO toStoreResultDTO(Store store) {
        return StoreResponseDTO.StoreResultDTO.builder()
                .storeId(store.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Store toStore(Region region, FoodCategory foodCategory, String name, String address) {
        return Store.builder()
                .address(address)
                .name(name)
                .region(region)
                .foodCategory(foodCategory)
                .build();
    }


}
