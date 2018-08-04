package Models.entities;

import java.util.ArrayList;

/**
 * Created by 김보민 on 2017-09-01.
 */
public class HistoryCollectionEntity {

    ArrayList<HistoryEntity> list = new ArrayList<>();


    public HistoryCollectionEntity(ArrayList<HistoryEntity> list) {
        this.list = list;
    }

    public HistoryCollectionEntity() {
    }


    public ArrayList<HistoryEntity> getList() {
        return list;
    }

    public void setList(ArrayList<HistoryEntity> list) {
        this.list = list;
    }
}
