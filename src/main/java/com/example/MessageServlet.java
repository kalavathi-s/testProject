package com.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet(name = "MessageServlet", urlPatterns = "/api/message")
public class MessageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json;charset=UTF-8");

        String payload = String.format(
                "{\"message\":\"Maven WAR build is working!\",\"timestamp\":\"%s\"}",
                LocalDateTime.now()
        );

        try (PrintWriter out = response.getWriter()) {
            out.print(payload);
        }
    }
}
