package umc.spring.service.StoreService;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.apiPayload.code.status.ErrorStatus;
import umc.spring.apiPayload.exception.handler.FoodCategoryHandler;
import umc.spring.apiPayload.exception.handler.RegionHandler;
import umc.spring.converter.StoreConverter;
import umc.spring.domain.FoodCategory;
import umc.spring.domain.Region;
import umc.spring.domain.Store;
import umc.spring.repository.FoodCategoryRepository;
import umc.spring.repository.RegionRepository;
import umc.spring.repository.StoreRepository;
import umc.spring.web.dto.StoreRequestDTO.StoreDTO;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;
    private final RegionRepository regionRepository;
    private final FoodCategoryRepository foodCategoryRepository;

    @Override
    @Transactional
    public Store createStore(StoreDTO request) {
        Region region = regionRepository.findById(request.getRegionId())
                .orElseThrow(() -> new RegionHandler(ErrorStatus.REGION_NOT_FOUND));

        FoodCategory foodCategory = foodCategoryRepository.findById(request.getFoodCategoryId())
                .orElseThrow(() -> new FoodCategoryHandler(ErrorStatus.FOOD_CATEGORY_NOT_FOUND));

        Store newStore = StoreConverter.toStore(region, foodCategory, request.getName(), request.getAddress());

        return storeRepository.save(newStore);
    }

    @Override
    public boolean existsById(Long id) {
        return storeRepository.existsById(id);
    }
}
