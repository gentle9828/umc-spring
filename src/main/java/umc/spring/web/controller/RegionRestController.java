package umc.spring.web.controller;

import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.apiPayload.ApiResponse;
import umc.spring.converter.RegionConverter;
import umc.spring.domain.Region;
import umc.spring.service.RegionService.RegionServiceImpl;
import umc.spring.web.dto.RegionRequestDTO;
import umc.spring.web.dto.RegionResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/region")
public class RegionRestController {

    private final RegionServiceImpl regionService;

    @PostMapping("/")
    public ApiResponse<RegionResponseDTO.RegionResultDTO> create(@RequestBody @Valid RegionRequestDTO.RegionDTO request) {
        Region region = regionService.createRegion(request);
        return ApiResponse.onSuccess(RegionConverter.toRegionResultDTO(region));
    }

}
