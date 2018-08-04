package Models.Interfaces;

/**
 * Created by 김보민 on 2017-08-03.
 */
public interface MAPFunction<E, T> {

    public T mapping (E e);
    //  convert를 해야한다는 메소드(인터페이스로 작성하여 InterviewMapper의 convert 메소드에다가 써준다.)

}
