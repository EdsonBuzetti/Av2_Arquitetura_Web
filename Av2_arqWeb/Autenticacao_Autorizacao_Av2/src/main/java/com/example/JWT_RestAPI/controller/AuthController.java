package com.example.JWT_RestAPI.controller;
import com.example.JWT_RestAPI.model.LoginRequest;
import com.example.JWT_RestAPI.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController

public class AuthController {
    @Autowired
    private AuthService authService;
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        String token = authService.generateToken(request.getUsername());
        return token;
    }
    @GetMapping("/username/{token}")
    public String extractUsername(@PathVariable String token) {

        String username = authService.extractUsername(token);
        return username;
    }
    // Somente o admin terá acesso
    @Secured("ADMIN")
    @GetMapping("/admin")
    public String onlyAdmin(Authentication authentication) {

        return "Admin: " + authentication.getName();
    }

    //Somente o gerente terá acesso
    @Secured("GERENTE")
    @GetMapping("/gerenteProduto")
    public String onlyGerenteProduto(Authentication authentication) {
        return "GerenteProduto: " + authentication.getName();
    }

    //Somente o vendedor terá acesso
    @Secured("VENDEDOR")
    @GetMapping("/vendedor")
    public String onlyVendedor(Authentication authentication) {
        return "Vendedor: " + authentication.getName();
    }
    //Área do cliente
    @Secured("CLIENTE")
    @GetMapping("/cliente")
    public String onlyCliente(Authentication authentication) {
        return "Cliente: " + authentication.getName();
    }

}

