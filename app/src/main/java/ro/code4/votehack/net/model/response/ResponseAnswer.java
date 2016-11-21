package ro.code4.votehack.net.model.response;


import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ResponseAnswer extends RealmObject implements Serializable{
    @PrimaryKey
    private Integer idOptiune;
    private String textRaspuns;

    public ResponseAnswer(){

    }

    public ResponseAnswer(Integer idOptiune) {
        this.idOptiune = idOptiune;
    }

    public ResponseAnswer(Integer idOptiune, String textRaspuns) {
        this.idOptiune = idOptiune;
        this.textRaspuns = textRaspuns;
    }

    public Integer getIdOptiune() {
        return idOptiune;
    }

    public void setIdOptiune(Integer idOptiune) {
        this.idOptiune = idOptiune;
    }

    public String getTextRaspuns() {
        return textRaspuns;
    }

    public void setTextRaspuns(String textRaspuns) {
        this.textRaspuns = textRaspuns;
    }
}