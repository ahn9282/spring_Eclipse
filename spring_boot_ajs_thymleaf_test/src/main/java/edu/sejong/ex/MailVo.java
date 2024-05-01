package edu.sejong.ex;
import lombok.Data;

@Data
public class MailVo {

    private String receiver;
    private String title;
    private String content;
}