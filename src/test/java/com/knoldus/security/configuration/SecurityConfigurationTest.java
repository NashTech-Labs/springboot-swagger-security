package com.knoldus.security.configuration;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class SecurityConfigurationTest {
    @Autowired
    private SecurityConfiguration securityConfiguration;

    /**
     * Method under test: {@link SecurityConfiguration#configure(AuthenticationManagerBuilder)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConfigure() throws Exception {
        // TODO: Complete this test.
        //   Reason: R021 Missing Spring component.
        //   MissingSpringComponentException: Missing Spring component. Cause: null

        // Arrange
        // TODO: Populate arranged inputs
        AuthenticationManagerBuilder auth = null;

        // Act
        this.securityConfiguration.configure(auth);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link SecurityConfiguration#configure(HttpSecurity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConfigure2() throws Exception {

        // TODO: Complete this test.
        //   Reason: R021 Missing Spring component.
        //   MissingSpringComponentException: Missing Spring component. Cause: null

        // Arrange
        // TODO: Populate arranged inputs
        HttpSecurity http = null;

        // Act
        this.securityConfiguration.configure(http);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link SecurityConfiguration#passwordEncoder()}
     */
    @Test
    void testPasswordEncoder() {
        assertTrue((new SecurityConfiguration()).passwordEncoder() instanceof BCryptPasswordEncoder);
    }
}

