package umc.spring.web.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import umc.spring.validation.annotaion.ExistCategories;
import umc.spring.validation.annotaion.ExistCategory;
import umc.spring.validation.annotaion.ExistRegion;

public class StoreRequestDTO {

    @Getter
    public static class StoreDTO {

        @ExistRegion @NotNull
        Long regionId;

        @ExistCategory
        @NotNull
        Long foodCategoryId;

        @NotBlank
        String name;

        @NotBlank
        String address;
    }
}
