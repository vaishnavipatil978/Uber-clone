package com.vaishnavi.uberapp.services;

import com.vaishnavi.uberapp.entities.Ride;
import com.vaishnavi.uberapp.entities.User;
import com.vaishnavi.uberapp.entities.Wallet;
import com.vaishnavi.uberapp.entities.enums.TransactionMethod;

public interface WalletService {

    Wallet addMoneyToWallet(User user, Double amount,
                            String transactionId, Ride ride,
                            TransactionMethod transactionMethod);

    Wallet deductMoneyFromWallet(User user, Double amount,
                                 String transactionId, Ride ride,
                                 TransactionMethod transactionMethod);

    void withdrawAllMyMoneyFromWallet();

    Wallet findWalletById(Long walletId);

    Wallet createNewWallet(User user);

    Wallet findByUser(User user);

}
