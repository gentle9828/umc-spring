package umc.spring.service.RegionService;

import umc.spring.domain.Region;
import umc.spring.web.dto.RegionRequestDTO;

public interface RegionService {
    Region createRegion(RegionRequestDTO.RegionDTO request);

    boolean existsById(Long id);
}
