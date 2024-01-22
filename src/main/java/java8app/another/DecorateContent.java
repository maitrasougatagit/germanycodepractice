package java8app.another;

@FunctionalInterface
public interface DecorateContent <T>{

    public String decorateContent(T content);
}
