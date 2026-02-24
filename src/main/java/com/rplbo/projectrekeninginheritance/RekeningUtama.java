package com.rplbo.projectrekeninginheritance;

public class RekeningUtama extends RekeningKeluarga{
    public RekeningUtama(Nasabah nasabah,int saldo) {
        super(nasabah, saldo);
        
    }

    public RekeningUtama(Nasabah nasabah) {
        super(nasabah,0);
    }

    @Override
    public void penarikan(int jumlah) {
        
    }
}
