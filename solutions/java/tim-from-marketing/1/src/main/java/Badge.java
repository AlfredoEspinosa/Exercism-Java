class Badge {
    public String print(Integer id, String name, String department) {
        String badge;
        department = department != null? department.toUpperCase():"OWNER"; 
        if(id != null){
            badge = "["+String.valueOf(id)+"] - "+name+" - "+department;
        }else{
            badge = name+" - "+department;
        }
        return badge;
    }
}
