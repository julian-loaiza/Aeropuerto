import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField txtNumeroVuelo;
    private JTextField txtLineaAerea;
    private JTextField txtDiasOperacion;
    private JTextField txtModeloAvion;
    private JTextField txtCapacidad;
    private JTable vuelosTable;
    private DefaultTableModel vuelosModel;

    public MainFrame() {
        setTitle("Gestión de Vuelos y Aeropuertos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel de formulario
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createTitledBorder("Datos del Vuelo"));

        txtNumeroVuelo = new JTextField();
        txtLineaAerea = new JTextField();
        txtDiasOperacion = new JTextField();
        txtModeloAvion = new JTextField();
        txtCapacidad = new JTextField();

        formPanel.add(new JLabel("Número de Vuelo:"));
        formPanel.add(txtNumeroVuelo);
        formPanel.add(new JLabel("Línea Aérea:"));
        formPanel.add(txtLineaAerea);
        formPanel.add(new JLabel("Días de Operación:"));
        formPanel.add(txtDiasOperacion);
        formPanel.add(new JLabel("Modelo del Avión:"));
        formPanel.add(txtModeloAvion);
        formPanel.add(new JLabel("Capacidad:"));
        formPanel.add(txtCapacidad);

        // Botón para agregar vuelo
        JButton btnAgregar = new JButton("Agregar Vuelo");
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarVuelo();
            }
        });

        // Tabla para mostrar vuelos
        vuelosModel = new DefaultTableModel(new String[]{"Número", "Línea Aérea", "Días", "Modelo", "Capacidad"}, 0);
        vuelosTable = new JTable(vuelosModel);

        JScrollPane tableScrollPane = new JScrollPane(vuelosTable);

        // Panel inferior con botón
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(btnAgregar);

        // Añadir los componentes a la ventana principal
        add(formPanel, BorderLayout.NORTH);
        add(tableScrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    // Método para agregar un vuelo a la tabla
    private void agregarVuelo() {
        String numeroVuelo = txtNumeroVuelo.getText();
        String lineaAerea = txtLineaAerea.getText();
        String diasOperacion = txtDiasOperacion.getText();
        String modelo = txtModeloAvion.getText();
        String capacidad = txtCapacidad.getText();

        vuelosModel.addRow(new Object[]{numeroVuelo, lineaAerea, diasOperacion, modelo, capacidad});
        limpiarCampos();
    }

    // Método para limpiar los campos del formulario
    private void limpiarCampos() {
        txtNumeroVuelo.setText("");
        txtLineaAerea.setText("");
        txtDiasOperacion.setText("");
        txtModeloAvion.setText("");
        txtCapacidad.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
