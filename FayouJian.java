package com.framedev;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.testng.annotations.Test;

import java.util.Date;
import java.util.Properties;
public class FayouJian {
    public String myEmailAccount = "vipwyk0506@163.com";
    public String myEmailPassword = "asd1234567";
    public String myEmailSMTPHost = "smtp.163.com";
    public  String attachedFileName="D:\\QQ\\1121176445\\FileRecv\\nk.txt";
    private String htmlContent="zhengwen";
    public String receiveMailAccount = "1121176445@qq.com";
    @Test
    public  void aa() throws Exception {
    	System.out.println("aaaa");
        Properties props = new Properties();                    // ��������
        props.setProperty("mail.transport.protocol", "smtp");   // ʹ�õ�Э�飨JavaMail�淶Ҫ��
        props.setProperty("mail.smtp.host", myEmailSMTPHost);   // �����˵������ SMTP ��������ַ
        props.setProperty("mail.smtp.auth", "true");            // ��Ҫ������֤
        Session session = Session.getInstance(props);
        session.setDebug(true);                                 // ����Ϊdebugģʽ, ���Բ鿴��ϸ�ķ��� log
       MimeMessage message = createMimeMessage(session, myEmailAccount, receiveMailAccount);
        Transport transport = session.getTransport();
        transport.connect(myEmailAccount, myEmailPassword);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
    public MimeMessage createMimeMessage(Session session, String sendMail, String receiveMail) throws Exception {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(sendMail, "hundu", "UTF-8"));
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail, "uu", "UTF-8"));
        message.setSubject("�����һ�", "UTF-8"); 
        Multipart multipart = new MimeMultipart();
        System.out.println(" has attached file ");
        BodyPart attchmentPart = new MimeBodyPart();
        DataSource source = new FileDataSource(attachedFileName);
        attchmentPart.setDataHandler(new DataHandler(source));
        attchmentPart.setFileName(attachedFileName);
        multipart.addBodyPart(attchmentPart);
        message.setContent(multipart);   
        BodyPart htmlPart = new MimeBodyPart();
        htmlPart.setContent(htmlContent, "text/html;charset=UTF-8");
        multipart.addBodyPart(htmlPart);
        message.setSentDate(new Date());
        message.saveChanges();
        return message;
    }
}