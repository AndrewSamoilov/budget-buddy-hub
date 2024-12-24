ALTER TABLE budget.purchase
    ADD COLUMN user_id BIGINT NOT NULL;

ALTER TABLE budget.purchase
    ADD CONSTRAINT fk_category_user
        FOREIGN KEY (user_id) REFERENCES budget.user (id)
            ON DELETE CASCADE;