package com.example.springbootmailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

@Component
public class ScheduledMailSender {

    private MailService mailService;

    @Autowired
    public ScheduledMailSender(MailService mailService) {
        this.mailService = mailService;
    }

    @Scheduled(cron = "1 * * * * ?")
    public void sendMail() throws MessagingException {
        mailService.sendMail("ayb01323@cndps.com",
                "Wygrałeś",
                "<b>10zł</b><br>:P", true);
    }
}
