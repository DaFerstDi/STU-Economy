package com.woafes.stu_economy.ViewModels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.woafes.stu_economy.Models.Contract;
import com.woafes.stu_economy.Repository.ContractRepo;

public class ContractActivityViewModel extends ViewModel {
    private MutableLiveData<Contract> contractMutableLiveData = new MutableLiveData<>();

    public LiveData<Contract> getContract(){
        return contractMutableLiveData;
    }

    public void getContractByDice(int yellow, int blue, int red, boolean is_mainStage){
        Contract contract = ContractRepo.getContract(yellow, blue, red, is_mainStage);
        contractMutableLiveData.setValue(contract);
    }

    @Override
    public void onCleared(){
        super.onCleared();
        Log.e("AAA", "ContractActivity VM destroyed");
    }
}
