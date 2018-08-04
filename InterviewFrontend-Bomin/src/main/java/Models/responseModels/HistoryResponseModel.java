package Models.responseModels;

import Models.entities.HistoryEntity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 김보민 on 2017-08-14.
 */

@XmlRootElement
public class HistoryResponseModel {

    ArrayList<HistoryEntity> list = new ArrayList<>();


    public HistoryResponseModel(ArrayList<HistoryEntity> list) {
        this.list = list;
    }

    public HistoryResponseModel() {}


    public ArrayList<HistoryEntity> getList() { return list; }

    public void setList(ArrayList<HistoryEntity> list) { this.list = list; }
}