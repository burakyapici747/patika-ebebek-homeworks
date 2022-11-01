package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Burak","482912","Kimya");
        Teacher t2 = new Teacher("İlayda", "132721", "Müzik");
        Teacher t3 = new Teacher("Zekeriya", "123321","");

        Course music = new Course("Müzik","101","MSC");
        music.addTeacher(t1);

        Course history = new Course("Tarih","102","HST");
        music.addTeacher(t2);

        Course chemical = new Course("Kimya", "103", "KMY");
        chemical.addTeacher(t3);

        Student s1 = new Student("Burak", "21907321","3",music, history, chemical);
        s1.AddBulkExamNote(90,98,70, 76,72,25);
        s1.IsPass();

        Student s2 = new Student("İlayda", "32123452", "2", music, history, chemical);
        s2.AddBulkExamNote(92,75,55,20,60,79);
        s2.IsPass();

    }
}
