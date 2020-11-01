package me.hansong.ioc.field_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("singer")
public class Singer {

    @Autowired
    private Inspiration inspirationBean;

    public void sing() {
        System.out.println("... " + inspirationBean.getLyric());
    }

}
