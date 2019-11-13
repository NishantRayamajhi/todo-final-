package com.example.nishant.todoapp.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.nishant.todoapp.database.AppDatabase;
import com.example.nishant.todoapp.model.Entries;

public class EntryViewModel extends ViewModel{

    private LiveData<Entries> entry;

    public EntryViewModel(AppDatabase database, int entryId) {
        entry = database.appDao().loadEntryById(entryId);
    }

    public LiveData<Entries> getEntry() {
        return entry;
    }
}
