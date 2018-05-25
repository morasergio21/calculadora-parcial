/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micalculadora;

/**
 *
 * @author Estudiantes
 */
class Punto extends Calculador {
    
    private int x;
    private int y;

    public void setX(int n) {
        this.x = n;
    }

    public void setY(int m) {
        this.y = m;
    }
    
    public void setPoint(int n, int m) {
        this.x,y = n, m;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
   
    
}
