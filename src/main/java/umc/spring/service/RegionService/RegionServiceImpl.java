package umc.spring.service.RegionService;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.converter.RegionConverter;
import umc.spring.domain.Region;
import umc.spring.repository.RegionRepository;
import umc.spring.web.dto.RegionRequestDTO.RegionDTO;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RegionServiceImpl implements RegionService {

    private final RegionRepository regionRepository;

    @Override
    @Transactional
    public Region createRegion(RegionDTO request) {
        Region newRegion = RegionConverter.toRegion(request);
        return regionRepository.save(newRegion);
    }

    @Override
    public boolean existsById(Long id) {
        return regionRepository.existsById(id);
    }

}
