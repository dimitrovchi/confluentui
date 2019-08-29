package org.dimitrovchi.confluentui.ui

import java.awt.BorderLayout

import javax.swing.{JPanel, JScrollPane}

class Dashboard extends JPanel {

  private val servicesTable = new ServicesTable
  private val tablePane = new JScrollPane(servicesTable)

  {
    setLayout(new BorderLayout())
    add(tablePane, BorderLayout.CENTER)
  }
}
