package GameSimulation.gameSimulation.Managers;

import GameSimulation.gameSimulation.Services.CrudService;

public class BaseCrudManager<T> implements CrudService<T> {
    public T getAll() {
        System.out.println("Tüm gamerler getirildi");
        return null;
    }

    public void add(T entity) {
        System.out.println("Nesne eklendi");
    }

    public void update(T entity) {
        System.out.println("Nesne update");
    }

    public void delete(T entity) {
        System.out.println("Nesne silindi");
    }
}
