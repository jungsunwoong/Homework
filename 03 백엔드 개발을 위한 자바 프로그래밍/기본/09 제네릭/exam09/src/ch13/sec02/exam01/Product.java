package ch13.sec02.exam01;

public class Product<K,M> {
    K kind;
    M model;

    K getKind() {
        return kind;
    }
    M getModel() {
        return model;
    }

    K setKind(K kind) {
        this.kind = kind;
        return kind;
    }
    M setModel(M model) {
        this.model = model;
        return model;
    }
}
