package proyecto;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class ProyectoPrograma {

	private JFrame frmByteme;
	private JTextField textIdPersona;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDia;
	private JTextField textMes;
	private JTextField textYear;
	private JTextField textIdVehiculoBarco;
	private JTextField textNombreBarco;
	private JTextField textColorBarco;
	private JTextField textEslora;
	private JTextField textManga;
	private JTextField textIdVehiculoAvion;
	private JTextField textNombreAvion;
	private JTextField textColorAvion;
	private JTextField textLongitud;
	private JTextField textCantPasajeros;
	private JTextField textDueñoBarco;
	private JTextField textDueñoAvion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoPrograma window = new ProyectoPrograma();
					window.frmByteme.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProyectoPrograma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmByteme = new JFrame();
		frmByteme.setIconImage(Toolkit.getDefaultToolkit().getImage(ProyectoPrograma.class.getResource("/img/logoByteMe.png")));
		frmByteme.setTitle("ByteMe");
		frmByteme.setResizable(false);
		frmByteme.setBounds(100, 100, 816, 597);
		frmByteme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmByteme.getContentPane().setLayout(null);

		
		LinkedList<Persona>lista = new LinkedList<Persona>();
		
		LinkedList<Vehiculo> vehiculos = new LinkedList<Vehiculo>();
		LinkedList<Barco> barcos = new LinkedList<Barco>();
		LinkedList<Avion> aviones = new LinkedList<Avion>();
		
	
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 41, 279, 209);
		frmByteme.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblIdPersona = new JLabel("ID Persona");
		lblIdPersona.setBounds(10, 11, 69, 14);
		panel.add(lblIdPersona);

		textIdPersona = new JTextField();
		textIdPersona.setBounds(95, 8, 52, 20);
		panel.add(textIdPersona);
		textIdPersona.setColumns(10);
		
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 42, 69, 14);
		panel.add(lblNombre);

		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(93, 39, 176, 20);
		panel.add(textNombre);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 70, 69, 14);
		panel.add(lblApellido);

		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(93, 64, 176, 20);
		panel.add(textApellido);

		JLabel lblDptoResidencia = new JLabel("Dpto. de Res.");
		lblDptoResidencia.setBounds(10, 95, 89, 14);
		panel.add(lblDptoResidencia);


		JComboBox cbDptoResidencia = new JComboBox();
		cbDptoResidencia.setModel(new DefaultComboBoxModel(new String[] {"Ingresa un Departamento", "Artigas", "Canelones", "Cerro Largo", "Colonia", "Durazno", "Flores", "Florida", "Lavalleja", "Maldonado", "Montevideo", "Paysandú", "Río Negro\t", "Rivera", "Rocha", "Salto", "San José", "Soriano", "Tacuarembó", "Treinta y Tres"}));
		cbDptoResidencia.setMaximumRowCount(20);
		cbDptoResidencia.setBounds(93, 92, 177, 20);
		panel.add(cbDptoResidencia);

		JLabel lblNewLabel = new JLabel("Cantidad de Hijos");
		lblNewLabel.setBounds(10, 120, 112, 14);
		panel.add(lblNewLabel);

		JComboBox cbCantHijos = new JComboBox();
		cbCantHijos.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cbCantHijos.setMaximumRowCount(10);
		cbCantHijos.setBounds(132, 120, 44, 14);
		panel.add(cbCantHijos);

		JLabel lblNewLabel_1 = new JLabel("Fcha de Nacimiento ");
		lblNewLabel_1.setBounds(10, 155, 115, 14);
		panel.add(lblNewLabel_1);

		textDia = new JTextField();
		textDia.setBounds(142, 149, 23, 20);
		panel.add(textDia);
		textDia.setColumns(10);

		textMes = new JTextField();
		textMes.setColumns(10);
		textMes.setBounds(170, 149, 23, 20);
		panel.add(textMes);

		textYear = new JTextField();
		textYear.setColumns(10);
		textYear.setBounds(204, 149, 33, 20);
		panel.add(textYear);

		JLabel lblBaseDeDatos = new JLabel("Base de Datos");
		lblBaseDeDatos.setBounds(10, 16, 90, 14);
		frmByteme.getContentPane().add(lblBaseDeDatos);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(312, 41, 469, 209);
		frmByteme.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String idPersona = textIdPersona.getText();
				String nombre = textNombre.getText();
				String apellido = textApellido.getText();
				String dptoResidencia = cbDptoResidencia.getSelectedItem().toString(); // Comando para ingresar un combaxBox
				
				String cantHijosString = cbCantHijos.getSelectedItem().toString(); 
				int cantHijosInt = Integer.parseInt(cantHijosString); //se paso de string a int la cantidad de hijos
				byte cantHijos=(byte)cantHijosInt;// y luego pasamos de int a byte la cantidad de hijos
				
				
					int diaInt;
					int mesInt;
					int yearInt;
					String diaString = textDia.getText();
					diaInt = Integer.parseInt(diaString); ////Pasamos el mes que era un dato tipo String y lo Volvimos un dato int
					String mesString = textMes.getText();
					mesInt = Integer.parseInt(mesString);//Pasamos el mes que era un dato tipo String y lo Volvimos un dato int
					String yearString = textYear.getText();
					yearInt = Integer.parseInt(yearString);
					
					LocalDate fechaNacimiento = LocalDate.of(yearInt, mesInt, diaInt);
					
					if(textIdPersona.getText().equals("")||textNombre.getText().equals("")||textApellido.getText().equals("")||cbDptoResidencia.getSelectedItem().toString().equals("Ingresa un Departamento")||cbCantHijos.getSelectedItem().toString().equals("-1")||textDia.getText().equals("")||textMes.getText().equals("")||textYear.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Ingrese todos los campos");
						
					}else if(!textNombre.getText().matches("[a-z]")||!textApellido.getText().matches("[a-z]")) {
						JOptionPane.showMessageDialog(null, "Ingrese solo Letras");
					}else if(!textIdPersona.getText().matches("[0-9]*")){
						JOptionPane.showMessageDialog(null, "Ingrese solo numeros"); 
				
					}
					else {
					
					Persona p=new Persona(idPersona,nombre,apellido,dptoResidencia,cantHijos,fechaNacimiento,barcos,aviones);

							
					lista.add(p);
					
						
				
				textIdPersona.setText("");
				textNombre.setText("");
				textApellido.setText("");
				textDia.setText("");
				textMes.setText("");
				textYear.setText("");
				cbDptoResidencia.setSelectedItem("Ingresa un Departamento");
				cbCantHijos.setSelectedItem("-1");
					}
				
			}
		});
		
		btnIngresar.setBounds(147, 175, 89, 23);
		panel.add(btnIngresar);

		JLabel lblNewLabel_2 = new JLabel("Dia");
		lblNewLabel_2.setBounds(145, 135, 20, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Mes");
		lblNewLabel_3.setBounds(172, 135, 32, 14);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Año");
		lblNewLabel_4.setBounds(210, 135, 32, 14);
		panel.add(lblNewLabel_4);
		
		JButton btnBuscar = new JButton("Buscar ID"); //*
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				for(int i = 0; i<lista.size(); i++) {
				
					if(textIdPersona.getText().equals(lista.get(i).getIdPersona())){ //si el contenido del input es igual al id del arreglo de la lista, mostrar datos en pantalla
						textArea.setText("");
						textArea.append(" ID: "+lista.get(i).getIdPersona()+" || "+"Nombre: " + lista.get(i).getNombre()+" || Apellido: "
						+lista.get(i).getApellido()+" || "+"Dpto. de Residencia: "+ lista.get(i).getDptoResidencia() +" || "+
						"Cantidad de Hijos: "+lista.get(i).getCantHijos()+" || "+" Fecha de Nacimiento:" +lista.get(i).getFechaNacimiento()+
						" ||\n");
					}	
				}
			}			
		});
		btnBuscar.setBounds(180, 7, 89, 23);
		panel.add(btnBuscar);


		JButton btnRegistro = new JButton("Registro");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(Persona pers:lista) {
					textArea.append(" ID: "+pers.idPersona+" || "+"Nombre: " + pers.nombre+" || Apellido: "
							+pers.apellido+" || "+"Dpto. de Residencia: "+pers.dptoResidencia+" || "+
							"Cantidad de Hijos: "+pers.getCantHijos()+" || "+" Fecha de Nacimiento:" + pers.getFechaNacimiento() + " Vehiculos: " + pers.barcos + pers.aviones +
							" ||\n");
					
				}
				
				
			}
			
		});
		btnRegistro.setBounds(692, 260, 89, 23);
		frmByteme.getContentPane().add(btnRegistro);

		JLabel lblUsuarioRegistrados = new JLabel("Usuarios Registrados");
		lblUsuarioRegistrados.setBounds(312, 16, 144, 14);
		frmByteme.getContentPane().add(lblUsuarioRegistrados);
		
		//creamos un boton para limpiar el contenido de textArea
		JButton btnNewButton = new JButton("Limpiar"); 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});
		btnNewButton.setBounds(593, 260, 89, 23);
		frmByteme.getContentPane().add(btnNewButton);
				
				JPanel panelVehiculo = new JPanel();
				panelVehiculo.setBorder(new LineBorder(new Color(0, 0, 0)));
				panelVehiculo.setBounds(10, 290, 242, 209);
				frmByteme.getContentPane().add(panelVehiculo);
				panelVehiculo.setLayout(null);
				
				JLabel lblIdVehiculo = new JLabel("ID Vehiculo");
				lblIdVehiculo.setBounds(10, 11, 90, 14);
				panelVehiculo.add(lblIdVehiculo);
				
				JLabel lblBarco = new JLabel("Nombre Barco");
				lblBarco.setBounds(10, 35, 90, 14);
				panelVehiculo.add(lblBarco);
				
				JLabel lblColor = new JLabel("Color");
				lblColor.setBounds(10, 65, 90, 14);
				panelVehiculo.add(lblColor);
				
				textIdVehiculoBarco = new JTextField();
				textIdVehiculoBarco.setColumns(10);
				textIdVehiculoBarco.setBounds(81, 8, 66, 20);
				panelVehiculo.add(textIdVehiculoBarco);
				
				textNombreBarco = new JTextField();
				textNombreBarco.setColumns(10);
				textNombreBarco.setBounds(81, 33, 151, 20);
				panelVehiculo.add(textNombreBarco);
				
				textColorBarco = new JTextField();
				textColorBarco.setColumns(10);
				textColorBarco.setBounds(81, 63, 151, 20);
				panelVehiculo.add(textColorBarco);
				
				JButton btnIngresarBarco = new JButton("Ingresar");
				btnIngresarBarco.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String idVehiculoString = textIdVehiculoBarco.getText();
						int idVehiculo;
						idVehiculo = Integer.parseInt(idVehiculoString); /*Pasamos de un dato String a un int con el metodo Integer.parseInt()*/
						String nombreVehiculo = textNombreBarco.getText();
						String colorVehiculo = textColorBarco.getText();
					
						String esloraString = textEslora.getText();
						double esloras;
						esloras = Double.parseDouble(esloraString);
						
						String mangaString = textManga.getText(); 
						double mangas;
						mangas = Double.parseDouble(mangaString);
						
						Barco objBarco= new Barco(idVehiculo,nombreVehiculo,colorVehiculo,esloras,mangas);
						barcos.add(objBarco);
						
						
						
						/*ESTO NOSE SI VA O NO ESTA FUNCIONANDO CON BARCO Y AVION
						 * 
						 * Vehiculo objVehiculo = new Vehiculo(idVehiculo, nombreVehiculo, colorVehiculo);
						vehiculos.add(objVehiculo);*/
				
						
						textIdVehiculoBarco.setText("");
						textNombreBarco.setText("");
						textColorBarco.setText("");	
						textEslora.setText(" ");
						textManga.setText(" ");
						
						
					}
					

					
				});
				btnIngresarBarco.setBounds(143, 176, 89, 23);
				panelVehiculo.add(btnIngresarBarco);
				
				JLabel lblEslora = new JLabel("Eslora");
				lblEslora.setBounds(10, 93, 45, 13);
				panelVehiculo.add(lblEslora);
				
				JLabel lblManga = new JLabel("Manga");
				lblManga.setBounds(10, 125, 45, 13);
				panelVehiculo.add(lblManga);
				
				textEslora = new JTextField();
				textEslora.setBounds(81, 93, 151, 19);
				panelVehiculo.add(textEslora);
				textEslora.setColumns(10);
				
				textManga = new JTextField();
				textManga.setBounds(81, 122, 151, 19);
				panelVehiculo.add(textManga);
				textManga.setColumns(10);
				
				JButton btnBuscarBarco = new JButton("Buscar ID");
				btnBuscarBarco.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
/* esta funcion hay q modificar para que funcione el boton de buscar barco
						for(int i = 0; i<lista.size(); i++) {
						
							if(textIdPersona.getText().equals(lista.get(i).getIdPersona())){ //si el contenido del input es igual al id del arreglo de la lista, mostrar datos en pantalla
								textArea.setText("");
								textArea.append(" ID: "+lista.get(i).getIdPersona()+" || "+"Nombre: " + lista.get(i).getNombre()+" || Apellido: "
								+lista.get(i).getApellido()+" || "+"Dpto. de Residencia: "+ lista.get(i).getDptoResidencia() +" || "+
								"Cantidad de Hijos: "+lista.get(i).getCantHijos()+" || "+" Fecha de Nacimiento:" +lista.get(i).getFechaNacimiento()+
								" ||\n");
							}	//debemos desarrollar en caso que el usuario no exista. Resolver logica en base a ello.
						}*/
					}
				});
				btnBuscarBarco.setBounds(157, 7, 75, 23);
				panelVehiculo.add(btnBuscarBarco);
				
				textDueñoBarco = new JTextField();
				textDueñoBarco.setBounds(81, 151, 151, 19);
				panelVehiculo.add(textDueñoBarco);
				textDueñoBarco.setColumns(10);
				
				JLabel lblDueño = new JLabel("Dueño ID");
				lblDueño.setBounds(10, 157, 45, 13);
				panelVehiculo.add(lblDueño);
				
				JLabel lblVehiculo = new JLabel("Vehiculos");
				lblVehiculo.setBounds(10, 260, 90, 14);
				frmByteme.getContentPane().add(lblVehiculo);
				
				JPanel panelVehiculo_1 = new JPanel();
				panelVehiculo_1.setLayout(null);
				panelVehiculo_1.setBorder(new LineBorder(new Color(0, 0, 0)));
				panelVehiculo_1.setBounds(272, 290, 242, 209);
				frmByteme.getContentPane().add(panelVehiculo_1);
				
				JLabel lblIdVehiculoAvion = new JLabel("ID Vehiculo");
				lblIdVehiculoAvion.setBounds(10, 11, 90, 14);
				panelVehiculo_1.add(lblIdVehiculoAvion);
				
				JLabel lblNombreAvion = new JLabel("Nombre Avion");
				lblNombreAvion.setBounds(10, 35, 90, 14);
				panelVehiculo_1.add(lblNombreAvion);
				
				JLabel lblColorAvion = new JLabel("Color");
				lblColorAvion.setBounds(10, 65, 90, 14);
				panelVehiculo_1.add(lblColorAvion);
				
				textIdVehiculoAvion = new JTextField();
				textIdVehiculoAvion.setColumns(10);
				textIdVehiculoAvion.setBounds(81, 8, 66, 20);
				panelVehiculo_1.add(textIdVehiculoAvion);
				
				textNombreAvion = new JTextField();
				textNombreAvion.setColumns(10);
				textNombreAvion.setBounds(81, 33, 151, 20);
				panelVehiculo_1.add(textNombreAvion);
				
				textColorAvion = new JTextField();
				textColorAvion.setColumns(10);
				textColorAvion.setBounds(81, 63, 151, 20);
				panelVehiculo_1.add(textColorAvion);
				
				
				
				
				
				
				JButton btnIngresarAvion = new JButton("Ingresar");
				btnIngresarAvion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String idVehiculoString = textIdVehiculoAvion.getText();
						int idVehiculo;
						idVehiculo = Integer.parseInt(idVehiculoString); /*Pasamos de un dato String a un int con el metodo Integer.parseInt()*/
						
						
						String nombre = textNombreAvion.getText();
						String color= textColorAvion.getText();
						
						String longitudString = textLongitud.getText(); //Pasamos de un double a un String
						double longitudes;
						longitudes = Double.parseDouble(longitudString);
						
						
						String cantPasajeroString= textCantPasajeros.getText(); //Pasamos de un int a un String
						int cantPasajeros;
						cantPasajeros = Integer.parseInt(cantPasajeroString);
						
						/*String dueñoString = textDueñoAvion.getText();
						int dueñoAvionId;
						dueñoAvionId = Integer.parseInt(dueñoString);*/
						
			
						
						Avion objAvion= new Avion(idVehiculo,nombre,color,longitudes,cantPasajeros);
						aviones.add(objAvion);
						
						textIdVehiculoAvion.setText("");
						textNombreAvion.setText("");
						textColorAvion.setText("");	
						textLongitud.setText(" ");
						textCantPasajeros.setText(" ");
					}
				});
				btnIngresarAvion.setBounds(143, 176, 89, 23);
				panelVehiculo_1.add(btnIngresarAvion);
				
				JLabel lblLongitud = new JLabel("Longitud");
				lblLongitud.setBounds(10, 93, 45, 13);
				panelVehiculo_1.add(lblLongitud);
				
				JLabel lblCantPasajeros = new JLabel("Cant Pasajeros");
				lblCantPasajeros.setBounds(10, 125, 45, 13);
				panelVehiculo_1.add(lblCantPasajeros);
				
				textLongitud = new JTextField();
				textLongitud.setColumns(10);
				textLongitud.setBounds(81, 93, 151, 19);
				panelVehiculo_1.add(textLongitud);
				
				textCantPasajeros = new JTextField();
				textCantPasajeros.setColumns(10);
				textCantPasajeros.setBounds(81, 122, 151, 19);
				panelVehiculo_1.add(textCantPasajeros);
				
				JButton btnBuscarAvion = new JButton("Buscar ID");
				btnBuscarAvion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						/* esta funcion hay q modificar para que funcione el boton de buscar avion
						for(int i = 0; i<lista.size(); i++) {
						
							if(textIdPersona.getText().equals(lista.get(i).getIdPersona())){ //si el contenido del input es igual al id del arreglo de la lista, mostrar datos en pantalla
								textArea.setText("");
								textArea.append(" ID: "+lista.get(i).getIdPersona()+" || "+"Nombre: " + lista.get(i).getNombre()+" || Apellido: "
								+lista.get(i).getApellido()+" || "+"Dpto. de Residencia: "+ lista.get(i).getDptoResidencia() +" || "+
								"Cantidad de Hijos: "+lista.get(i).getCantHijos()+" || "+" Fecha de Nacimiento:" +lista.get(i).getFechaNacimiento()+
								" ||\n");
							}	//debemos desarrollar en caso que el usuario no exista. Resolver logica en base a ello.
						}*/
						
					}
				});
				btnBuscarAvion.setBounds(157, 7, 75, 23);
				panelVehiculo_1.add(btnBuscarAvion);
				
				textDueñoAvion = new JTextField();
				textDueñoAvion.setBounds(81, 151, 151, 19);
				panelVehiculo_1.add(textDueñoAvion);
				textDueñoAvion.setColumns(10);
				
				JLabel lblDueñoAvion = new JLabel("Dueño ID");
				lblDueñoAvion.setBounds(10, 157, 45, 13);
				panelVehiculo_1.add(lblDueñoAvion);

				
				/*
					//lista de vehiculos
				LinkedList<Vehiculo> vehiculos2 = new LinkedList<Vehiculo>();
				Vehiculo v1 = new Vehiculo (1, "Vehiculo 350", "rojo");
				Vehiculo v2 = new Vehiculo (2, "Vehiculo 220", "verde");
				Vehiculo v3 = new Vehiculo (3, "Vehiculo300", "azul");
				
				vehiculos2.add(v1);
				vehiculos2.add(v2);
				vehiculos2.add(v3);
				
				//recorrer la lista
				
				for (Vehiculo v:vehiculos2)
				System.out.println(v);
				
				//recorrer a la inversa
				System.out.println("Orden inverso de vehiculos: ");
				Iterator<Vehiculo> it = vehiculos2.descendingIterator();
				while (it.hasNext()) {
		            System.out.println(it.next());
		        }
				
				
				//lista de barcos
				//LinkedList<Barco> barcos = new LinkedList<Barco>();
				Barco b1 = new Barco (1, "Barco Maria", "rojo",2.2, 2.2);
				Barco b2 = new Barco (2, "Barco Estrella", "verde", 3.2, 5.2);
				Barco b3 = new Barco (3, "Barco Isla", "azul",7.5,9.6);
				
				barcos.add(b1);
				barcos.add(b2);
				barcos.add(b3);
				
					//recorre la lista
					for (Barco v:barcos)
					System.out.println(v);
					
					//recorrer a la inversa
					System.out.println("Orden inverso de Barcos: ");
					Iterator<Barco> itt = barcos.descendingIterator();
					while (itt.hasNext()) {
			            System.out.println(itt.next());
			        }
					
					
					//lista de aviones
					
					//lista de barcos
					//LinkedList<Avion> aviones = new LinkedList<Avion>();
					Avion a1 = new Avion (1, "Avion1", "rojo",2.2, 2);
					Avion a2 = new Avion (2, "Avion2", "verde", 3.2, 5);
					Avion a3 = new Avion (3, "Avion3", "azul",7.5,9);
					
					aviones.add(a1);
					aviones.add(a2);
					aviones.add(a3);
				
					//recorre la lista
						for (Avion v:aviones)
						System.out.println(v);
						
						//recorrer a la inversa
						System.out.println("Orden inverso de Aviones: ");
						Iterator<Avion> ittt = aviones.descendingIterator();
						while (ittt.hasNext()) {
				            System.out.println(ittt.next());
				        }
				*/
				
	}
}
