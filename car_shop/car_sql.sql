CREATE TABLE CAR_INFO (
    MODEL_NO     INT          PRIMARY KEY AUTO_INCREMENT, -- 모델번호
    MODEL_NAME   VARCHAR(100) NOT NULL,                   -- 모델명
    PRICE        INT NOT NULL,                            -- 금액
    MANUFACTURER VARCHAR(100) NOT NULL                    -- 제조사
);


CREATE TABLE SALES_INFO (
    SALES_NO    INT          PRIMARY KEY AUTO_INCREMENT,          -- 판매번호
    BUYER_NAME  VARCHAR(100) NOT NULL,                            -- 구매자명
    BUYER_PHONE VARCHAR(20)  NULL,                                -- 구매자연락처
    COLOR       VARCHAR(50)  NOT NULL,                            -- 색상
    SALES_DATE  DATETIME NOT NULL DEFAULT NOW(),                 -- 판매일
    MODEL_NO    INT          REFERENCES CAR_INFO(MODEL_NO)        -- 모델번호(FK)
);


SELECT * FROM CAR_INFO;
SELECT * FROM SALES_INFO;