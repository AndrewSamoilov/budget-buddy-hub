ALTER TABLE budget-app.transaction
    ADD COLUMN user_id BIGINT NOT NULL;

ALTER TABLE budget-app.transaction
    ADD CONSTRAINT fk_category_user
        FOREIGN KEY (user_id) REFERENCES budget-app.user (id)
            ON DELETE CASCADE;