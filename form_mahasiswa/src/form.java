import javax.swing.*;

public class form extends JFrame
{
    JLabel data,nama,nim,j_kelamin,agama,alamat;
    JTextField isinama,isinim;
    JTextArea isialamat;
    JRadioButton perempuan,laki;
    JComboBox isiagama;
    JButton ok;
    public void form()
    {
        setTitle("DATA DIRI MAHASISWA");
        data = new JLabel("DATA DIRI MAHASISWA");
        nama = new JLabel("Nama");
        nim = new JLabel("NIM");
        j_kelamin = new JLabel("Jenis Kelamin");
        agama = new JLabel("Agama");
        String[] nama_agama = {"Islam","Kristen","Katolik","Hindu","Budha" };
        isiagama = new JComboBox(nama_agama);
        alamat = new JLabel("Alamat");
        isinama = new JTextField();
        isinim = new JTextField();
        isialamat = new JTextArea();
        perempuan = new JRadioButton("P");
        laki = new JRadioButton("L");
        ok = new JButton("OK");
        ButtonGroup group = new ButtonGroup();
        group.add(perempuan);
        group.add(laki);
        
        setLayout(null);
        add (data);
        add (nama);
        add (nim);
        add (j_kelamin);
        add (agama);
        add (alamat);
        add (isinama);
        add (isinim);
        add (isialamat);
        add (perempuan);
        add (laki);
        add (isiagama);
        add (ok);
        
        data.setBounds(170,20,200,20);
        nama.setBounds(20,50,100,20);
        isinama.setBounds(140,50,200,20);
        nim.setBounds(20,100,90,20);
        isinim.setBounds(140,90,200,20);
        j_kelamin.setBounds(20,130,100,20);
        perempuan.setBounds(140,130,100,20);
        laki.setBounds(240,130,100,20);
        agama.setBounds(20,170,100,20);
        isiagama.setBounds(140,170,200,20);
        alamat.setBounds(20,210,100,20);
        isialamat.setBounds(140,210,250,150);
        ok.setBounds(330,365,60,20);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
