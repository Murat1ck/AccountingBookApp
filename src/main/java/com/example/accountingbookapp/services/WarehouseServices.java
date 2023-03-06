package com.example.accountingbookapp.services;

import com.example.accountingbookapp.model.Socks;




public interface WarehouseServices {



    Socks addSocks(Socks socks1, Long count);



    Long sendSocks(Socks socks1, Long count);

    Long getSocksCount(Socks socks1);


    boolean deleteSocks(Socks socks);



}
