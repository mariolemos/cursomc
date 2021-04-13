package com.mariolemos.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.mariolemos.cursomc.domain.Pedido;

public interface EmailService {
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}

