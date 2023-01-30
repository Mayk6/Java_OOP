package HomeWork.Calc.Core.MVP;
/*
Interface with definition of operations
 */
public interface Model<T> {

    T sum(T obj);

    T div(T obj);

    T sub(T obj);

    T mul(T obj);

}
