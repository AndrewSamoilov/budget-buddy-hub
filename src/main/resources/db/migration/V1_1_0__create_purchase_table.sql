CREATE TABLE budget.purchase
(
    id          BIGSERIAL PRIMARY KEY,
    amount      double precision NOT NULL,
    description VARCHAR(255),
    date        date             NOT NULL
);
