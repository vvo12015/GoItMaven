package unit6.task2;

import unit8.task1.ConstantsPrintShop;

public class Instrument implements ConstantsPrintShop {

    protected String name;
    protected double price;
    protected String article;
    protected String description;
    protected String color;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instrument(String name, double price, String article, String description, String color) {
        this.name = name;
        this.price = price;
        this.article = article;
        this.description = description;
        this.color = color;
    }

    public Instrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toStringForTable() {
        return "Instrument{" +
                "name='" + name + '\'' +
                SEPARATOR_BETWEEN_FIELDS + "price=" + price +
                SEPARATOR_BETWEEN_FIELDS + "article='" + article + '\'' +
                SEPARATOR_BETWEEN_FIELDS + "description='" + description + '\'' +
                SEPARATOR_BETWEEN_FIELDS + "color=" + color + '\'' +
                '}';
    }
}
