package jp.co.metateam.library.model;

import java.security.Timestamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * 書籍マスタDTO
 */
@Getter
@Setter
public class BookMstDto {

    private long id;

    @NotEmpty(message = "書籍名は必須です")
    @Size(max = 255, message = "書籍名は255文字以下で入力してください")
    private String title;

    @NotEmpty(message = "isbnは必須です")
    @Pattern(
    regexp = "^$|^[0-9]{13}$",
    message = "ISBNは13桁の半角数字で入力してください"
    )
    private String isbn;
    
    private Integer authorizationType = 1;

}

