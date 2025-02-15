package com.andrewsmv.budgetbuddyhub.usermanagement.infrastructure.repository.impl;

import com.andrewsmv.budgetbuddyhub.usermanagement.infrastructure.entity.User;
import com.andrewsmv.budgetbuddyhub.usermanagement.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public boolean existsByEmail(String email) {
        String sql = "SELECT EXISTS(SELECT 1 FROM budget_app.user WHERE email =:email);";

        MapSqlParameterSource params = new MapSqlParameterSource()
                .addValue("email", email);

        return jdbcTemplate.queryForObject(sql, params, Boolean.class);
    }


    @Override
    public User create(User user) {

        MapSqlParameterSource params = new MapSqlParameterSource()
                .addValue("email", user.getEmail())
                .addValue("password", user.getPassword())
                .addValue("firstName", user.getFirstName())
                .addValue("lastName", user.getLastName());

        GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update("""
                INSERT INTO budget_app.user (email, password, first_name, last_name)
                VALUES (:email, :password, :firstName, :lastName)
                """, params, generatedKeyHolder, new String[]{"id"});


        return User.builder()
                .id(generatedKeyHolder.getKeyAs(Long.class))
                .email(user.getEmail())
                .password(user.getPassword())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }
}
