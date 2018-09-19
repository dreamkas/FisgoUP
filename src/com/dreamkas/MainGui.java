package com.dreamkas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class MainGui extends JFrame {
    private static final int mWidth = 350;
    private static final int mHeighth = 400;
    private JButton updateDrawer;
    private JPanel MainPanel;
    private FrontEnd m_fe;
    private JTextField ipTextField;
    private JTextArea LogField;
    private JTable configTable;
    private JButton getConfigButton;
    private JButton saveDataBase;
    private JTextField textFieldUuid;
    private JButton buttonGenUuid;

    private JButton buttonGetClone;
    private JLabel labelInputIp;
    private JButton connectToCashBoxButton;
    private JFormattedTextField asdFormattedTextField;
    private JFrame additionalFrame;
    private String currentOperation;


    private Vector<String> configFieldTypes;


    private static final String COMMAND_RM_BACKUP = "rm -r /updateBackup/";
    private static final String IP = "192.168.242.151";

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        MainPanel = new JPanel();
        MainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(7, 3, new Insets(0, 0, 0, 0), -1, -1));
        ipTextField = new JTextField();
        MainPanel.add(ipTextField, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        saveDataBase = new JButton();
        saveDataBase.setText("Сохранить конфиг (НУЖНО ВЫПИЛИТЬ ЕЁ)");
        MainPanel.add(saveDataBase, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonGetClone = new JButton();
        buttonGetClone.setText("Копировать каталог FisGo на ПК");
        MainPanel.add(buttonGetClone, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        updateDrawer = new JButton();
        updateDrawer.setText("Обновить кассу");
        MainPanel.add(updateDrawer, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        getConfigButton = new JButton();
        getConfigButton.setText("Загрузить конфиг");
        MainPanel.add(getConfigButton, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        LogField = new JTextArea();
        MainPanel.add(LogField, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 50), null, 0, false));
        labelInputIp = new JLabel();
        labelInputIp.setText("Введите IP ");
        MainPanel.add(labelInputIp, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        MainPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        MainPanel.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return MainPanel;
    }

    public class ConnectToCashBoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Ssh ssh = new Ssh();
            ssh.setIp(IP);

            ssh.executeSshCommand(COMMAND_RM_BACKUP);
        }
    }

    //обработчик нажатия кнопки левой
    public class LeftButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            LogField.setText("");
            System.out.println(ipTextField.getText());
            m_fe.updateDrawer(ipTextField.getText());


            updateDrawer.setEnabled(false);
            saveDataBase.setEnabled(false);
            getConfigButton.setEnabled(false);
        }

    }

    //слушатель кнопки загрузки конфига с кассы
    public class DownloadConfigListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            LogField.setText("");
            System.out.println(ipTextField.getText());
            m_fe.downloadConfig(ipTextField.getText());


            getConfigButton.setEnabled(false);
            updateDrawer.setEnabled(false);
        }
    }

    //слушатель кнопки загрузки конфига с кассы
//    public class ConfigCreatorListener implements ActionListener {
//
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("ConfigCreatorListener");
//
//            JFrame configCreator = new ConfigCreator();
//
//            configCreator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//            configCreator.setBounds(30, 50, 800, 600);
//            configCreator.setVisible(true);
//
//        }
//    }

    //слушатель кнопки генерации uuid
    public class GenUuidListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String uuid = UUID.randomUUID().toString();
            if (buttonGenUuid.getText().equals("Сгенерировать UUID")) {
                textFieldUuid.setText(uuid);
            }
        }
    }

    //обработчик нажатия кнопки загрузки правленного конфига на кассу
    public class UploadConfigListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            LogField.setText("");
            System.out.println("Save config to drawer!");
            int rows = configTable.getModel().getRowCount();

            Vector<Vector<String>> queryTab = new Vector<>();

            for (int i = 0; i < rows; i++) {
                Vector<String> queryLine = new Vector<>();
                queryLine.add((String) configTable.getModel().getValueAt(i, 0));
                queryLine.add((String) configTable.getModel().getValueAt(i, 1));
                queryLine.add(configFieldTypes.get(i));
                queryTab.add(queryLine);
            }


            m_fe.uploadConfig(ipTextField.getText(), queryTab);
            additionalFrame.setVisible(false);

            saveDataBase.setEnabled(false);

            updateDrawer.setEnabled(false);
            currentOperation = "Saving config";
        }
    }

    //обработчик нажатия кнопки клонирования кассы
    public class CloneDrawerListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            LogField.setText("");
            System.out.println(ipTextField.getText());
            m_fe.cloneDrawer(ipTextField.getText());


            updateDrawer.setEnabled(false);
            saveDataBase.setEnabled(false);
            getConfigButton.setEnabled(false);
        }
    }

    public void drawConfigPanel(ArrayList<ArrayList<String>> config) {
        ConfigFieldsBuilder configFieldsBuilder = new ConfigFieldsBuilder();
        JFrame configCreator = new ConfigCreator(configFieldsBuilder.filterConfigFields(config));

        configCreator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        configCreator.setBounds(30, 50, 850, 600);
        configCreator.setVisible(true);
    }


    //нарисовать таблицу конфига
    public void drawConfigTable(ArrayList<ArrayList<String>> config) {
        configFieldTypes = new Vector<>();
        configTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        //заполнить массивы полей и значений
        Vector<String> columns = new Vector<>();

        columns.add("Name");
        columns.add("Value");

        Object[] colArr = columns.toArray();
        DefaultTableModel tableModel = new DefaultTableModel(colArr, 0);

        try {
            for (int i = 0; i < config.size(); i++) {
                Vector<String> row = new Vector<>();
                row.add(config.get(i).get(0));
                String changedEncode = config.get(i).get(2);
                row.add(changedEncode);
                configFieldTypes.add(config.get(i).get(1));
                tableModel.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        //рисовать таблицу
        configTable.setModel(tableModel);
        configTable.setAutoscrolls(true);
        configTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JScrollPane scroll = new JScrollPane(configTable,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        additionalFrame = new JFrame("PagingTableModel");
        additionalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        additionalFrame.setContentPane(scroll);
        additionalFrame.setBounds(30, 50, 1300, 600);
        additionalFrame.setVisible(true);

        saveDataBase.setEnabled(true);
        getConfigButton.setEnabled(false);

    }

    //сброс гуевых юнитов в дефолтное состояние
    public void resetGui(String msg) {
        if (msg.equals("Success")) {
            if (currentOperation.equals("Saving config")) {
                saveDataBase.setEnabled(false);
                getConfigButton.setEnabled(true);
                currentOperation = "";

                updateDrawer.setEnabled(true);
                System.out.println("GUI: ОПЕРАЦИЯ УСПЕШНО ЗАВЕРШЕНА!!!");
                printLogString("GUI: ОПЕРАЦИЯ УСПЕШНО ЗАВЕРШЕНА!!!\n");
                return;
            }
        } else {
            saveDataBase.setEnabled(false);
            getConfigButton.setEnabled(true);
            currentOperation = "";
        }


        updateDrawer.setEnabled(true);

        if (msg.equals("Success")) {
            System.out.println("GUI: ОПЕРАЦИЯ УСПЕШНО ЗАВЕРШЕНА!!!");
            printLogString("GUI: ОПЕРАЦИЯ УСПЕШНО ЗАВЕРШЕНА!!!\n");
        } else if (msg.equals("Failed")) {
            System.out.println("GUI: ОПЕРАЦИЯ ПРОВАЛЕНА!!!");
            printLogString("GUI: ОПЕРАЦИЯ ПРОВАЛЕНА!!!\n");
        }
    }

    public MainGui() {
        setContentPane(MainPanel);
        setSize(mWidth, mHeighth);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        saveDataBase.setEnabled(false);

        currentOperation = "";

        configTable = new JTable();

        LeftButtonListener buttonLeft = new LeftButtonListener();
        updateDrawer.addActionListener(buttonLeft);

        DownloadConfigListener buttonDownloadConfig = new DownloadConfigListener();
        getConfigButton.addActionListener(buttonDownloadConfig);

        UploadConfigListener buttonUploadConfig = new UploadConfigListener();
        saveDataBase.addActionListener(buttonUploadConfig);

        CloneDrawerListener buttonCloneDrawerListener = new CloneDrawerListener();
        buttonGetClone.addActionListener(buttonCloneDrawerListener);


//        ConfigCreatorListener configCreatorListener = new ConfigCreatorListener();
//        changeConfigButton.addActionListener(configCreatorListener);

        /*try {
            MaskFormatter mf = new MaskFormatter("###.###.###.###");
            mf.setPlaceholderCharacter(' ');
            formattedTextField1.setFormatterFactory(new DefaultFormatterFactory(mf));
            formattedTextField1.requestFocus();
            formattedTextField1.selectAll();
        } catch (Exception e) {
            System.out.println(e.toString());
        }*/
    }

    //установить ссылку на frontEnd
    public void setFrontEnd(FrontEnd fe) {
        this.m_fe = fe;
    }

    //напечатать строку лога
    public void printLogString(String logString) {
        LogField.append(logString);
    }
}
