package com.example.Validation.form;

import lombok.Data;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

@Data
public class CalcForm {
    @NotNull(message ="왼쪽 : 숫자를 입력해주세요")
    @Range(min=1, max=10, message="왼쪽 : {min}~{max} 범위의 숫자를 입력해주세요.")
    private Integer leftNum;

    @NotNull(message ="오른쪽 : 숫자를 입력해주세요")
    @Range(min=1, max=10, message="오른쪽 : {min}~{max} 범위의 숫자를 입력해주세요.")
    private Integer rightNum;

    @NotNull
    @NotEmpty
    @NotBlank
    @Max(100)
    @Min(10)
    @Size(min=10, max=100)
    @AssertTrue
    @AssertFalse
    @Pattern(regexp="[a-zA-Z0-9]")
    @Range
    @DecimalMax("100.0")
    @DecimalMin("100.0") // 지정숫자 이상/이하검증 소수점이하를 포함하여 검증
    @Digits(integer=3, fraction=1) // 정수부, 소수부의 자릿수를 검증
    @Future
    @Past
    @Valid //중첩된 form을 검증
    @Length(min=0, max=10) 지정된 범위 검증
    @Email //이메일 형식검증
    @CreditCardNumber //신용카드번호 검증
    @URL
}
