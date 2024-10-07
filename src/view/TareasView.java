package view;

import model.Tarea;
import services.DataTareas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class TareasView extends JFrame {
    private int [] pantalla = {1300, 800};

    private JTextField titleTextField;
    private JTextField descripcionField;
    private JTextField fechalimField;
    private JTextField estadoField;
    private JButton newTareaButton;
    private JButton deleteTareaButton;

    private ArrayList<Tarea> listaDeTareas;

    public TareasView() {
        this.setTitle("Ventana De Tareas");
        this.setSize(pantalla[0], pantalla[1]);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,1));
        this.setLocationRelativeTo(null);

    JPanel panelControles = new JPanel();
    panelControles.setSize(1300,400);
    panelControles.setBackground(Color.BLUE);
    panelControles.setLayout(new GridLayout(1,2));

    this.add(panelControles);


    JPanel panelNuevaTarea = new JPanel();
    panelNuevaTarea.setSize(400,300);
    panelNuevaTarea.setBackground(Color.darkGray);
    panelNuevaTarea.setLayout(new GridLayout(5,1,30,30));
    panelNuevaTarea.setBorder(new EmptyBorder(30,30,30,30));

    titleTextField = new JTextField(15);
    descripcionField = new JTextField(15);
    fechalimField = new JTextField(15);
    estadoField = new JTextField(15);
    newTareaButton = new JButton();
    deleteTareaButton = new JButton();


    panelControles.add(panelNuevaTarea, BorderLayout.WEST);

    JPanel panelEliminarTarea = new JPanel();
        panelEliminarTarea.setSize(400,300);
        panelEliminarTarea.setBackground(Color.red);
        panelEliminarTarea.setLayout(new GridLayout(6,1,00,10));
        panelEliminarTarea.setBorder(new EmptyBorder(50,50,50,50));


        panelControles.add(panelEliminarTarea);


        newTareaButton.setText("Nueva Tarea");
        deleteTareaButton.setText("Eliminar Tarea");


        panelNuevaTarea.add(titleTextField);
        panelEliminarTarea.add(titleTextField);
        panelNuevaTarea.add(descripcionField);
        panelNuevaTarea.add(fechalimField);
        panelNuevaTarea.add(estadoField);
        panelNuevaTarea.add(newTareaButton);
        panelEliminarTarea.add(deleteTareaButton);


        JPanel paneldeTareas = new JPanel();
        paneldeTareas.setSize(200,200);
        paneldeTareas.setBackground(Color.green);
        paneldeTareas.setLayout(new GridLayout(1,5));

        DataTareas dataTareas = new DataTareas();
        this.listaDeTareas = (ArrayList<Tarea>) dataTareas.getTareas();

        for (Tarea tarea : listaDeTareas) {
            paneldeTareas.add(new JLabel(tarea.getTitulos(), JLabel.CENTER));
            paneldeTareas.add(new JLabel(String.valueOf(tarea.getDescripcion()), JLabel.CENTER));
            paneldeTareas.add(new JLabel(tarea.getFechaLimite(), JLabel.CENTER));
            paneldeTareas.add(new JLabel(tarea.getEstado().toString(), JLabel.CENTER));
        }





        this.add(paneldeTareas);



        this.setVisible(true);

    }
}
