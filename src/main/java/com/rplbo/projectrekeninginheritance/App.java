package com.rplbo.projectrekeninginheritance;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RekeningBisnis rb = new RekeningBisnis(new Nasabah("a","1","jl 1"), 100000);
        rb.penyetoran(100000);
        rb.penarikan(25000);
        System.out.println(rb.getSaldo());

        RekeningKeluarga rk = new RekeningKeluarga(new Nasabah("b","2","jl 2"), 1000);
        rk.penyetoran(1000);
        rk.penarikan(500);
        System.out.println(rk.getSaldo());

        RekeningSyariah rs = new RekeningSyariah(new Nasabah("c","3","jl 3"),150000);
        rs.penyetoran(150000);
        rs.penarikan(50000);
        rs.sedekah(10000);

        RekeningUtama ru = new RekeningUtama(new Nasabah("d","4","jl 4"),300000);
        ru.penyetoran(30000);
        ru.penarikan(20000);

    }

}
