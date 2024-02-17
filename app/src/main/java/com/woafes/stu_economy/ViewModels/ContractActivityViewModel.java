package com.woafes.stu_economy.ViewModels;

import androidx.lifecycle.MutableLiveData;

import com.woafes.stu_economy.Models.Contract;
import com.woafes.stu_economy.Repository.ContractRepo;

public class ContractActivityViewModel {
    private MutableLiveData<Contract> contractMutableLiveData;

    public void getContractByDice(int yellow, int blue, int red, boolean is_mainStage){
        Contract contract = ContractRepo.getContract(yellow, blue, red, is_mainStage);
        contractMutableLiveData.setValue(contract);
    }
}
