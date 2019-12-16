package br.com.java.email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnviaEmail {
	
	public void enviar(Email email) throws Exception {
		System.out.println("Inicio do programa");
		
		Properties props = new Properties();
		props.setProperty("mail.smtp.host", "smtp.googlemail.com");
		props.setProperty("mail.smtp.socketFactory.class",
						"javax.net.ssl.SSLSocketFactory");
		props.setProperty("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.auth", "true");
		props.put("mail.debug", "true");
		props.put("mail.store.protocol", "pop3");
		props.put("mail.transport.protocol", "smtp");
		
		Session session = Session.getInstance(props, new Acesso(email.getDe(), 
				email.getSenha()));
		
		session.setDebug(true);
		
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(email.getDe()));
		message.setRecipients(Message.RecipientType.TO, 
				InternetAddress.parse(email.getPara()));
		message.setSubject(email.getTitulo());
		message.setText(email.getCorpo());
		
		Transport.send(message);
		System.out.println("Concluído");
	}
}
