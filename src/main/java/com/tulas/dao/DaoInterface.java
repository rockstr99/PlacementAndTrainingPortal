package com.tulas.dao;

public interface DaoInterface {
    //contains all the abstract methods for the dao layer
    public boolean addMember(Object o);
    public boolean removeMember(Object o);
    public boolean updateMember(Object o);
    public boolean searchMember(Object o);
    public boolean searchMember(String id);


}
