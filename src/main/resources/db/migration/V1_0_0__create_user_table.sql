CREATE TABLE budget_app.user
(
    id           BIGSERIAL PRIMARY KEY,
    email        VARCHAR(255) NOT NULL UNIQUE,
    password     VARCHAR(255) NOT NULL,
    first_name   VARCHAR(255),
    last_name    VARCHAR(255),
    created_date date         NOT NULL DEFAULT CURRENT_DATE,
    remove_date  date
);
