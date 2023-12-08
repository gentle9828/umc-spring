package umc.spring.web.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;

public class RegionRequestDTO {

    @Getter
    public static class RegionDTO {

        @NotBlank
        String name;
    }
}
