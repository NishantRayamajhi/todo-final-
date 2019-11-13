package com.example.nishant.todoapp.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.nishant.todoapp.database.AppDatabase;

public class EntryViewModelFactory extends ViewModelProvider.NewInstanceFactory{
    private final AppDatabase mDb;
    private final int entryId;

    public EntryViewModelFactory(AppDatabase database, int entryId) {
        mDb = database;
        this.entryId = entryId;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new EntryViewModel(mDb, entryId);
    }
}
