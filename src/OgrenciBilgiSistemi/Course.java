package OgrenciBilgiSistemi;

public class Course {
    private Teacher teacher;
    private String name;
    private String code;
    private String prefix;
    private double note;
    private double examNote;
    private double presentationNote;

    public Course(final String name, final String code, final String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0.0;
    }


    public void average(final double presentationNote, final double examNote){

        if (presentationNote >= 0 && presentationNote <= 100 && examNote >= 0 && examNote <= 100){
            note = presentationNote * 0.20 + examNote * 0.60;
        }

    }

    public void addTeacher(final Teacher teacher){
        if (teacher.getBranch().equals(this.prefix)){
            this.teacher = teacher;
            System.out.println(teacher.getName() + " Adlı Öğretmen " + getClass() + " Dersine Eklendi! ");
        }else{
            System.out.println(name + " Dersi ile Öğretmen uyuşmuyor!");
        }
    }

    public void printTeacher(){
        if (teacher != null) {
            teacher.print();
        } else {
            System.out.println("İşlem Gerçekleşmedi!");
        }
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public double getExamNote() {
        return examNote;
    }

    public void setExamNote(double examNote) {
        this.examNote = examNote;
    }

    public double getPresentationNote() {
        return presentationNote;
    }

    public void setPresentationNote(double presentationNote) {
        this.presentationNote = presentationNote;
    }
}
