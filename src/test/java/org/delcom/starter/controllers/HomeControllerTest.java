package org.delcom.starter.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class HomeControllerUnitTest {
    @Test
    @DisplayName("Mengembalikan pesan selamat datang yang benar")
    void hello_ShouldReturnWelcomeMessage() {
        // Arrange
        HomeController controller = new HomeController();

        // Act
        String result = controller.hello();

        // Assert
        assertEquals("Hay Abdullah, selamat datang di pengembangan aplikasi dengan Spring Boot!", result);
    }
}
