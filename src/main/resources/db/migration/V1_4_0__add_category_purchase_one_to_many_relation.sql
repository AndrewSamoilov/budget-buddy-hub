ALTER TABLE budget-app.purchase
    ADD COLUMN category_id BIGINT NOT NULL;

ALTER TABLE budget.purchase
    ADD CONSTRAINT fk_category_category
        FOREIGN KEY (category_id) REFERENCES budget-app.category (id)
            ON DELETE CASCADE;
