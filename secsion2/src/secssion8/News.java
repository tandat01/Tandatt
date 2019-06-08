package secssion8;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
    public int id;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void Display(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap Title");
        Title=scanner.nextLine();
        System.out.println("Title la: "+Title);
        System.out.println("Nhap PublishDate");
        PublishDate=scanner.nextLine();
        System.out.println("PublishDate la: "+PublishDate);
        System.out.println("Nhap Author");
        Author=scanner.nextLine();
        System.out.println("Author la: "+Author);
        System.out.println("Nhap Content");
        Content=scanner.nextLine();
        System.out.println("Content la: "+Content);
        System.out.println("Nhap AverageRate");
        AverageRate=scanner.nextByte();
        System.out.println("AverageRate la: "+AverageRate);
    }
    public void Calculate(){
        int tem=0;
        float x;
        for (int i=0;i<3;i++){
            tem=tem+i;
        }
        x=(float)tem/3;
        x=RateList;

    }
}
