

import java.awt.EventQueue;
import view.JFrameInicial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Principal {
    
  public static void main(String[] args){
      EventQueue.invokeLater( new Runnable(){
      @Override
      public void run(){
          JFrameInicial inicial = new JFrameInicial();
      }
  });
  }
    
}
