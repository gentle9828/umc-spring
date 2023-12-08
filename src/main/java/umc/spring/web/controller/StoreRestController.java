package umc.spring.web.controller;

import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.apiPayload.ApiResponse;
import umc.spring.converter.StoreConverter;
import umc.spring.domain.Store;
import umc.spring.service.StoreService.StoreServiceImpl;
import umc.spring.web.dto.StoreRequestDTO;
import umc.spring.web.dto.StoreResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store")
public class StoreRestController {

    private final StoreServiceImpl storeService;

    @PostMapping("/")
    public ApiResponse<StoreResponseDTO.StoreResultDTO> create(@RequestBody @Valid StoreRequestDTO.StoreDTO request) {
        Store store = storeService.createStore(request);
        return ApiResponse.onSuccess(StoreConverter.toStoreResultDTO(store));
    }
}
