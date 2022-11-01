package OgrenciBilgiSistemi;

public class Student {
    private Course history;
    private Course physics;
    private Course chemistry;
    private String name;
    private String studentNo;
    private String subjects;
    private double average;
    private boolean isPass;

    public Student(final String name, final String studentNo, final String subjects, final Course history, final Course physics, final Course chemistry){
        this.name = name;
        this.studentNo = studentNo;
        this.subjects = subjects;
        this.history = history;
        this.physics = physics;
        this.chemistry = chemistry;
        this.average = 0.0;
        boolean isPass = false;
    }

    public void AddBulkExamNote(int tarihen, int fiziken, int kimyaen, double tarihpn, double fizikpn, double kimyapn){
        this.history.average(tarihpn, tarihen);
        this.physics.average(fizikpn, fiziken);
        this.chemistry.average(kimyapn, kimyaen);
    }

    void print_note(){
        System.out.println("___________________________");
        System.out.println("Öğrenci Adı:  " + name);
        System.out.println("Öğrenci No:  " + studentNo);
        System.out.println("Ders: " + history.getName() + " \tNot: " + history.getCode());
        System.out.println("Ders: " + physics.getName() + " \tNot: " + physics.getCode());
        System.out.println("Ders: " + chemistry.getName() + " \tNot: " + chemistry.getCode());
        System.out.println("Ortalamaniz: " + average);
    }

    public void IsPass(){
        isPass = IsCheckPass();
        print_note();
        average = (history.getNote() + physics.getNote() + chemistry.getNote()) / 3.0;

        if (isPass){
            System.out.println(name + " Sınıfı Geçtin!");
        }else{
            System.out.println(name + "Sınıfta Kaldın!");
        }

    }

    void CalcAverage(){
        average = (history.getNote() + physics.getNote() + chemistry.getNote()) / 3.0;
    }

    boolean IsCheckPass(){
        CalcAverage();
        return average > 55;
    }
}
