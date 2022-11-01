package OgrenciBilgiSistemi;

public class Teacher {

    private String name;
    private String mobileNo;
    private String branch;

    public Teacher(String name, String mobileNo, String branch){
        this.name = name;
        this.mobileNo = mobileNo;
        this.branch = branch;
    }

    public void print(){
        System.out.println("Ad:  " + name);
        System.out.println("Telefon:  "+ mobileNo);
        System.out.println("Bülüm:  " + branch);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
