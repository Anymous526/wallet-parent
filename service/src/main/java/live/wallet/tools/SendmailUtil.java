package live.wallet.tools;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendmailUtil {

	private final static String VALUE_SMTP = "smtp.exmail.qq.com";

	private static boolean VALUE_PROPS = true;
	private String SEND_USER = "webmaster@szgyzb.com";
	private String SEND_UNAME = "webmaster@szgyzb.com";
	private String SEND_PWD = "Gyzb2016414";
	private MimeMessage message;
	private Session session;

	/**
	 * 初始化方法
	 **/
	public SendmailUtil() {
		Properties props = System.getProperties();
		props.setProperty("mail.smtp.host", VALUE_SMTP);
		props.put("mail.smtp.auth", VALUE_PROPS);
		session = Session.getDefaultInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(SEND_UNAME, SEND_PWD);
			}
		});
		session.setDebug(true);
		message = new MimeMessage(session);
	}

	/**
	 * 发送邮件
	 * 
	 * @param headName
	 *            邮件头文件名
	 * @param sendHtml
	 *            邮件内容
	 * @param receiveUser
	 *            收件人地址
	 */
	public void doSendHtmlEmail(String headName, String sendHtml, String receiveUser) {
		try {
			
			message.setFrom(new InternetAddress(SEND_USER, "七分钱支付", "UTF-8"));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(receiveUser));
			message.setSubject(headName);
			String content = sendHtml.toString();
			// 邮件内容,也可以使纯文本"text/plain"
			message.setContent(content, "text/html;charset=GBK");
			message.saveChanges();
			Transport transport = session.getTransport("smtp");
			// smtp验证，就是你用来发邮件的邮箱用户名密码
			transport.connect(VALUE_SMTP, SEND_UNAME, SEND_PWD);
			// 发送
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SendmailUtil se = new SendmailUtil();
		se.doSendHtmlEmail("邮件头文件名", "邮件内容", "service@qifenqian.com");
	}
}
