package com.musicapp.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.musicapp.model.MusicModel;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.musicapp.controller.MusicValidationUtil;

/**
 *
 * @author chick
 */
public class Musicapp extends javax.swing.JFrame {

    private java.awt.CardLayout cardLayout;
    private List<MusicModel> musicList;
    private final MusicValidationUtil musicValidationUtil;
    private final Color errorColor = new Color(255, 51, 0);
    private final Color yellowColor = new Color(239, 192, 32);

    /**
     * Creates new form Musicapp
     */
    public Musicapp() {
        initComponents();
        startProgress();
        musicList = new LinkedList<>();
        musicValidationUtil = new MusicValidationUtil();
        initializeLayout();
        loadInitialData();
    }

    private void initializeLayout() {
        cardLayout = new java.awt.CardLayout();
        getContentPane().setLayout(cardLayout);

        // Add panels with unique identifiers
        getContentPane().add(pnlLoadingScreen, "LoadingScreen");
        getContentPane().add(pnlLoginScreen, "LoginScreen");
        getContentPane().add(pnlMainScreen, "MainScreen");

        // Start with the loading screen
        loadScreen("LoadingScreen");
    }

    private void loadInitialData() {
        // Registering sample songs
        MusicModel music1 = new MusicModel(
                19057565, // Song ID
                "Lekhnath Tandukar", // Song Title
                "Radha", // Artist
                53000, // Views
                "Pop", // Genre
                LocalDate.of(2020, 10, 11), // Release Date
                "Nepal", // Country
                "Lekhnath Hits", // Album
                10 // Track Total
        );

        MusicModel music2 = new MusicModel(
                19057566, // Song ID
                "Subin Chhetri", // Song Title
                "Radha", // Artist
                1, // Views
                "Pop", // Genre
                LocalDate.of(2012, 12, 7), // Release Date
                "Nepal", // Country
                "Subin Classics", // Album
                8 // Track Total
        );

        MusicModel music3 = new MusicModel(
                19057567, // Song ID
                "Sajjan Raj Vaidya", // Song Title
                "Hataarindai Bataasindai", // Artist
                120000, // Views
                "Indie", // Genre
                LocalDate.of(2019, 5, 24), // Release Date
                "Nepal", // Country
                "Sajjan Hits", // Album
                12 // Track Total
        );

        MusicModel music4 = new MusicModel(
                19057568, // Song ID
                "Bipul Chettri", // Song Title
                "Syndicate", // Artist
                98000, // Views
                "Folk Rock", // Genre
                LocalDate.of(2014, 8, 15), // Release Date
                "India", // Country
                "Bipul Classics", // Album
                15 // Track Total
        );

        MusicModel music5 = new MusicModel(
                19057569, // Song ID
                "Tribal Rain", // Song Title
                "Bhanai", // Artist
                75000, // Views
                "Fusion", // Genre
                LocalDate.of(2016, 3, 5), // Release Date
                "Nepal", // Country
                "Tribal Sounds", // Album
                9 // Track Total
        );

        // Adding all MusicModel objects to the list
        musicList.add(music1);
        musicList.add(music2);
        musicList.add(music3);
        musicList.add(music4);
        musicList.add(music5);

        // Adding the list to the table
        addListToTable();
    }

    private void addListToTable() {
        DefaultTableModel model = (DefaultTableModel) tblMusic.getModel();
        model.setRowCount(0); // Clear existing rows

        for (MusicModel music : musicList) {
            Object[] row = new Object[]{
                music.getSongId(),
                music.getSongTitle(),
                music.getArtist(),
                music.getView(),
                music.getGenre(),
                music.getReleaseDate(),
                music.getCountry(),
                music.getAlbum(),
                music.getTrackTotal()
            };
            model.addRow(row);
        }
    }

    // Start the progress simulation
    private void startProgress() {
        javax.swing.SwingWorker<Void, Integer> worker = new javax.swing.SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                // Simulate progress
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(30); // Simulated delay (30ms for each step)
                    publish(i); // Publish progress value
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                // Update the progress bar with the latest value
                int progress = chunks.get(chunks.size() - 1);
                ProgressBar.setValue(progress);
            }

            @Override
            protected void done() {
                // Transition to the next screen after loading completes
                loadScreen("LoginScreen");
            }
        };

        worker.execute(); // Start the worker thread
    }

    private void loadScreen(String screenName) {
        cardLayout.show(getContentPane(), screenName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainScreen = new javax.swing.JPanel();
        Tab3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMusic = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtViews = new javax.swing.JTextField();
        txtSongId = new javax.swing.JTextField();
        txtSongTitle = new javax.swing.JTextField();
        txtArtist = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtReleaseDate = new javax.swing.JTextField();
        txtGenre = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        txtCountry = new javax.swing.JTextField();
        txtAlbum = new javax.swing.JTextField();
        txtTrackTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pnlLoginScreen = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pnlLoadingScreen = new javax.swing.JPanel();
        ProgressBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        pnlMainScreen.setBackground(new java.awt.Color(255, 255, 255));
        pnlMainScreen.setMaximumSize(new java.awt.Dimension(1280, 720));
        pnlMainScreen.setMinimumSize(new java.awt.Dimension(1280, 720));
        pnlMainScreen.setPreferredSize(new java.awt.Dimension(800, 600));

        Tab3.setBackground(new java.awt.Color(0, 0, 0));
        Tab3.setForeground(new java.awt.Color(255, 255, 255));
        Tab3.setMaximumSize(new java.awt.Dimension(1280, 720));
        Tab3.setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/musicapp/resources/2.gif"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/musicapp/resources/4-1.gif"))); // NOI18N
        jLabel7.setText("jLabel7");

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Here are the most recently updated newsletters.");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText(" If you’d like to make any changes, ");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("please click the button below to update them.");
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/musicapp/resources/text.gif"))); // NOI18N
        jLabel9.setText("jLabel9");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EDIT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Tab3.addTab("Newsletter", jPanel1);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        tblMusic.setBackground(new java.awt.Color(0, 0, 0));
        tblMusic.setForeground(new java.awt.Color(255, 255, 255));
        tblMusic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Song Id", "Song Title", "Artist", "Views", "Genre", "Release Date", "Country", "Album", "Track Total"
            }
        ));
        jScrollPane1.setViewportView(tblMusic);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/musicapp/resources/oo-Photoroom.png"))); // NOI18N
        jLabel14.setText("jLabel14");

        jLabel12.setText("jLabel12");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/musicapp/resources/pp-modified-Photoroom.png"))); // NOI18N
        jLabel15.setText("jLabel15");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(827, 827, 827)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Tab3.addTab("Songs", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/musicapp/resources/download.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 2315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tab3.addTab("Revenue", jPanel4);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(600, 800));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 800));
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtViews.setBackground(new java.awt.Color(0, 0, 0));
        txtViews.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        txtViews.setForeground(new java.awt.Color(255, 255, 255));
        txtViews.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Views Count", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(txtViews, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 230, 50));

        txtSongId.setBackground(new java.awt.Color(0, 0, 0));
        txtSongId.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        txtSongId.setForeground(new java.awt.Color(255, 255, 255));
        txtSongId.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Song Id", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(txtSongId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 230, 55));

        txtSongTitle.setBackground(new java.awt.Color(0, 0, 0));
        txtSongTitle.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        txtSongTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtSongTitle.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Song Title", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(txtSongTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 233, 55));

        txtArtist.setBackground(new java.awt.Color(0, 0, 0));
        txtArtist.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        txtArtist.setForeground(new java.awt.Color(255, 255, 255));
        txtArtist.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Artist", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(txtArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 234, 55));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 342, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 340, -1, -1));

        txtReleaseDate.setBackground(new java.awt.Color(0, 0, 0));
        txtReleaseDate.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        txtReleaseDate.setForeground(new java.awt.Color(255, 255, 255));
        txtReleaseDate.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Release Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(txtReleaseDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 234, 54));

        txtGenre.setBackground(new java.awt.Color(0, 0, 0));
        txtGenre.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        txtGenre.setForeground(new java.awt.Color(255, 255, 255));
        txtGenre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Genre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(txtGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 233, 54));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        txtCountry.setBackground(new java.awt.Color(0, 0, 0));
        txtCountry.setForeground(new java.awt.Color(255, 255, 255));
        txtCountry.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Country", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 230, 50));

        txtAlbum.setBackground(new java.awt.Color(0, 0, 0));
        txtAlbum.setForeground(new java.awt.Color(255, 255, 255));
        txtAlbum.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Album", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txtAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlbumActionPerformed(evt);
            }
        });
        jPanel2.add(txtAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 233, 57));

        txtTrackTotal.setBackground(new java.awt.Color(0, 0, 0));
        txtTrackTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTrackTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Track Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(txtTrackTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 234, 54));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/musicapp/resources/bb253fe8fb1aadd47582a94749f5b256-Photoroom.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 480, 670));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/musicapp/resources/1ada35740357f43f88d3ae77145a6b2f-Photoroom.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 460, 560));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/musicapp/resources/68513bd02a06cf6cb27a899f30520020-Photoroom.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 340, 840));

        Tab3.addTab("Data Entry", jPanel2);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/musicapp/resources/large (2).png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LOG OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainScreenLayout = new javax.swing.GroupLayout(pnlMainScreen);
        pnlMainScreen.setLayout(pnlMainScreenLayout);
        pnlMainScreenLayout.setHorizontalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainScreenLayout.createSequentialGroup()
                        .addComponent(Tab3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlMainScreenLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 545, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        pnlMainScreenLayout.setVerticalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainScreenLayout.createSequentialGroup()
                .addGroup(pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainScreenLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMainScreenLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tab3, javax.swing.GroupLayout.PREFERRED_SIZE, 611, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pnlLoginScreen.setBackground(new java.awt.Color(255, 255, 255));
        pnlLoginScreen.setMaximumSize(new java.awt.Dimension(800, 600));
        pnlLoginScreen.setMinimumSize(new java.awt.Dimension(800, 600));
        pnlLoginScreen.setPreferredSize(new java.awt.Dimension(800, 600));
        pnlLoginScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Condensed", 1, 18))); // NOI18N
        pnlLoginScreen.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 420, 50));

        txtpassword.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Condensed", 1, 18))); // NOI18N
        pnlLoginScreen.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 420, 50));

        btnLogin.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        btnLogin.setText("Enter");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlLoginScreen.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 230, 70));

        jTextField1.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jTextField1.setText(" LOGIN  ");
        pnlLoginScreen.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 200, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/musicapp/resources/peach-goma-peach-and-goma.gif"))); // NOI18N
        pnlLoginScreen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 190, 100));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlLoadingScreen.setBackground(new java.awt.Color(255, 255, 255));
        pnlLoadingScreen.setPreferredSize(new java.awt.Dimension(12367, 12767));
        pnlLoadingScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlLoadingScreen.add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 275, 39));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/musicapp/resources/giphy.gif"))); // NOI18N
        pnlLoadingScreen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 509, 265));

        jLabel6.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        jLabel6.setText("Loading.....");
        pnlLoadingScreen.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 190, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLoadingScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLoadingScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        // Retrieve the entered username and password
        String username = txtUsername.getText().trim();
        String password = new String(txtpassword.getPassword()).trim();

        // Validate the credentials
        if (validateLogin(username, password)) {
            // Success: Transition to the main screen
            JOptionPane.showMessageDialog(this, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadScreen("MainScreen");
        } else {
            // Failure: Show error message
            JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }

// Utility method for login validation
    private boolean validateLogin(String username, String password) {
        return "siya".equals(username) && "siya123".equals(password);


    }//GEN-LAST:event_btnLoginActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void txtAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlbumActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearFields();         // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRow = tblMusic.getSelectedRow(); // Get the selected row

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Retrieve updated values from text fields
        String songId = txtSongId.getText();
        String songTitle = txtSongTitle.getText();
        String artist = txtArtist.getText();
        String views = txtViews.getText();
        String genre = txtGenre.getText();
        String releaseDateStr = txtReleaseDate.getText(); // Assuming date input is in "YYYY-MM-DD" format
        String country = txtCountry.getText();
        String album = txtAlbum.getText();
        String trackTotal = txtTrackTotal.getText();

        // Validation
        if (!MusicValidationUtil.isValidSongId(songId)
            || !MusicValidationUtil.isValidSongTitle(songTitle)
            || !MusicValidationUtil.isValidArtistName(artist)
            || !MusicValidationUtil.isValidViews(views)
            || !MusicValidationUtil.isValidGenre(genre)
            || !MusicValidationUtil.isValidReleaseDate(releaseDateStr)
            || !MusicValidationUtil.isValidCountry(country)
            || !MusicValidationUtil.isValidAlbum(album)
            || !MusicValidationUtil.isValidTrackTotal(trackTotal)) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please check your entries.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            LocalDate releaseDate = LocalDate.parse(releaseDateStr); // Parse release date

            // Update the row in the table
            DefaultTableModel model = (DefaultTableModel) tblMusic.getModel();
            model.setValueAt(songId, selectedRow, 0);
            model.setValueAt(songTitle, selectedRow, 1);
            model.setValueAt(artist, selectedRow, 2);
            model.setValueAt(views, selectedRow, 3);
            model.setValueAt(genre, selectedRow, 4);
            model.setValueAt(releaseDate, selectedRow, 5);
            model.setValueAt(country, selectedRow, 6); // Update country
            model.setValueAt(album, selectedRow, 7); // Update album
            model.setValueAt(trackTotal, selectedRow, 8); // Update track total

            JOptionPane.showMessageDialog(this, "Record updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Optionally clear fields
            clearFields();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Use YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // Retrieve inputs from text fields
        String songId = txtSongId.getText();
        String songTitle = txtSongTitle.getText();
        String artist = txtArtist.getText();
        String genre = txtGenre.getText();
        String views = txtViews.getText();
        String releaseDate = txtReleaseDate.getText(); // Release Date as String
        String country = txtCountry.getText();
        String album = txtAlbum.getText();
        String trackTotal = txtTrackTotal.getText();

        // Validate input fields
        if (!MusicValidationUtil.isValidSongId(songId)) {
            JOptionPane.showMessageDialog(null, "Invalid Song ID. It should be numeric.", "Validation Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!MusicValidationUtil.isValidSongTitle(songTitle)) {
            JOptionPane.showMessageDialog(null, "Invalid Song Title. It should be alphanumeric (max 50 characters).", "Validation Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!MusicValidationUtil.isValidArtistName(artist)) {
            JOptionPane.showMessageDialog(null, "Invalid Artist Name. It should only contain letters.", "Validation Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!MusicValidationUtil.isValidGenre(genre)) {
            JOptionPane.showMessageDialog(null, "Invalid Genre. It should only contain letters.", "Validation Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!MusicValidationUtil.isValidViews(views)) {
            JOptionPane.showMessageDialog(null, "Invalid Views. It should be numeric.", "Validation Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!MusicValidationUtil.isValidReleaseDate(releaseDate)) {
            JOptionPane.showMessageDialog(null, "Invalid Release Date. Ensure it's not a future date and follows YYYY-MM-DD format.", "Validation Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!MusicValidationUtil.isValidCountry(country)) {
            JOptionPane.showMessageDialog(null, "Invalid Country. It should only contain letters.", "Validation Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!MusicValidationUtil.isValidAlbum(album)) {
            JOptionPane.showMessageDialog(null, "Invalid Album Name. It should be alphanumeric (max 50 characters).", "Validation Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!MusicValidationUtil.isValidTrackTotal(trackTotal)) {
            JOptionPane.showMessageDialog(null, "Invalid Track Total. It should be numeric.", "Validation Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // If all validations pass, add the song to the table
        DefaultTableModel model = (DefaultTableModel) tblMusic.getModel();
        model.addRow(new Object[]{
            songId,
            songTitle,
            artist,
            views,
            genre,
            releaseDate,
            country,
            album,
            trackTotal
        });

        JOptionPane.showMessageDialog(null, "Song added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

        // Optionally clear input fields
        txtSongId.setText("");
        txtSongTitle.setText("");
        txtArtist.setText("");
        txtGenre.setText("");
        txtViews.setText("");
        txtReleaseDate.setText("");
        txtCountry.setText("");
        txtAlbum.setText("");
        txtTrackTotal.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblMusic.getSelectedRow(); // Get the selected row

        // Validate if a row is selected
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to delete the selected record?",
            "Confirm Deletion",
            JOptionPane.YES_NO_OPTION);

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            // Get the Song ID of the selected row
            DefaultTableModel model = (DefaultTableModel) tblMusic.getModel();
            String songId = model.getValueAt(selectedRow, 0).toString();

            // Remove the row from the table
            model.removeRow(selectedRow);

            // Show success message
            JOptionPane.showMessageDialog(this, "Record deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred while deleting the record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// Confirm logout action
    int confirmation = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to logout?",
            "Logout Confirmation",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
    );

    if (confirmation == JOptionPane.YES_OPTION) {
        // Clear any session data if applicable (optional)
        clearFields(); // Clears input fields
        txtUsername.setText(""); // Reset username field
        txtpassword.setText(""); // Reset password field

        // Transition back to the login screen
        loadScreen("LoginScreen");

        JOptionPane.showMessageDialog(this, "You have been logged out.", "Logout Successful", JOptionPane.INFORMATION_MESSAGE);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    private void clearFields() {
        txtSongId.setText("");
        txtSongTitle.setText("");
        txtArtist.setText("");
        txtViews.setText("");
        txtGenre.setText("");
        txtReleaseDate.setText("");
        txtCountry.setText(""); // Clear country field
        txtAlbum.setText(""); // Clear album field
        txtTrackTotal.setText(""); // Clear track total field
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Musicapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Musicapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Musicapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Musicapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Musicapp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JTabbedPane Tab3;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel pnlLoadingScreen;
    private javax.swing.JPanel pnlLoginScreen;
    private javax.swing.JPanel pnlMainScreen;
    private javax.swing.JTable tblMusic;
    private javax.swing.JTextField txtAlbum;
    private javax.swing.JTextField txtArtist;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtGenre;
    private javax.swing.JTextField txtReleaseDate;
    private javax.swing.JTextField txtSongId;
    private javax.swing.JTextField txtSongTitle;
    private javax.swing.JTextField txtTrackTotal;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtViews;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
