package second.shortcuts;

import java.util.List;

public class ClassThatHaveItAll implements InterfaceOne {
    public ClassThatHaveItAll(String name, List<Long> lista, Integer number) {
        this.name = name;
        this.lista = lista;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLista(List<Long> lista) {
        this.lista = lista;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public List<Long> getLista() {
        return lista;
    }

    public Integer getNumber() {
        return number;
    }

    String name;
    List<Long> lista;
    Integer number;

    @Override
    public void printMe(String info) {
    }
}
