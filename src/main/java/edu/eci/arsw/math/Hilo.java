package edu.eci.arsw.math;

import java.util.List;

public class Hilo extends Thread{

    private int start;
    private int account;
    private byte[] resultado;


    public Hilo(int start, int account) {
        this.start = start;
        this.account = account;
        this.resultado = null;
    }

    @Override
    public void run() {
        this.setResultado(PiDigits.getDigits(start, account));
    }

    public byte[] getResultado() {
        return resultado;
    }

    public void setResultado(byte[] resultado) {
        this.resultado = resultado;
    }
}
