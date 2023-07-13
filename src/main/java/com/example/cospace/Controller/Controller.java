package com.example.cospace.Controller;

import com.example.cospace.Model.Buchung;
import com.example.cospace.Model.Mitglied;
import com.example.cospace.service.BuchungRepo;
import com.example.cospace.service.MitgliederRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {
    private BuchungRepo brepo;
    private ArrayList<Buchung> blist;

    private MitgliederRepo mrepo;;
    private ArrayList<Mitglied> mlist;

    @Autowired
    public Controller(BuchungRepo brepo, MitgliederRepo mrepo) {
        this.brepo = brepo;
        this.mrepo = mrepo;
    }
}
