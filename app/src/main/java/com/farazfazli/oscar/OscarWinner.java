package com.farazfazli.oscar;

/**
 * Created by faraz on 2/29/16.
 */
public class OscarWinner {
    private String mName;
    private String mDOB;
    private String mOscarsWon;

    public OscarWinner(String name, String DOB, String oscarsWon) {
        mName = name;
        mDOB = DOB;
        mOscarsWon = oscarsWon;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDOB() {
        return mDOB;
    }

    public void setDOB(String DOB) {
        mDOB = DOB;
    }

    public String getOscarsWon() {
        return mOscarsWon;
    }

    public void setOscarsWon(String oscarsWon) {
        mOscarsWon = oscarsWon;
    }
}
