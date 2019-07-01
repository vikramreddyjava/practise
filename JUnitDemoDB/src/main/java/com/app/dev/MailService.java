package com.app.dev;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailService {
	public static boolean sendEmail(String toAddr, String subject, String text) {
		boolean isMailSent = true;
		final String username = getProperties().getProperty("username");
		final String password = getProperties().getProperty("password");
		Properties props = new Properties();
		props.put(getProperties().getProperty("AuthKey"), "true");
		props.put(getProperties().getProperty("TLSKey"), "true");
		props.put(getProperties().getProperty("HostKey"), "smtp.gmail.com");
		props.put(getProperties().getProperty("PortKey"), "587");
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(getProperties().getProperty("username")));
			message.setRecipients(Message.RecipientType.TO, InternetAddrss.parse(toAddr));
			message.setSubject(subject);// subject
			message.setText(text);// message
			Transport.send(message);
			System.out.println("Done");
		} catch (MessagingException e) {
			isMailSent = false;
			e.printStackTrace();
		}
		return isMailSent;
	}

}
