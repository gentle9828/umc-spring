package umc.spring.converter;

import java.time.LocalDateTime;
import umc.spring.domain.Region;
import umc.spring.web.dto.RegionRequestDTO;
import umc.spring.web.dto.RegionResponseDTO;

public class RegionConverter {

    public static RegionResponseDTO.RegionResultDTO toRegionResultDTO(Region region) {
        return RegionResponseDTO.RegionResultDTO.builder()
                .regionId(region.getId())
                .createAt(LocalDateTime.now())
                .build();
    }

    public static Region toRegion(RegionRequestDTO.RegionDTO request) {
        return Region.builder()
                .name(request.getName())
                .build();
    }
}
