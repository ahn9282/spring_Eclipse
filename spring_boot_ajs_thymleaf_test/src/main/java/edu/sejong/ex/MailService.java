package edu.sejong.ex;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MailService {

    private final JavaMailSender javaMailSender;

    private static final String senderEmail= "junsyub@gmail.com";

    public void CreateMail(MailVo mailVo){

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(mailVo.getReceiver());
        message.setFrom(senderEmail);
        message.setSubject(mailVo.getTitle());
        message.setText(mailVo.getContent());

        javaMailSender.send(message);
    }
}