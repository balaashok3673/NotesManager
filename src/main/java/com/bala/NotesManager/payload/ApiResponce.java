package com.bala.NotesManager.payload;

import lombok.Getter;
import lombok.Setter;

public class ApiResponce {

    @Getter
    @Setter
    private boolean status;

    @Getter
    @Setter
    private String message;

    public ApiResponce(boolean status , String message){
        this.status=status;
        this.message=message;
    }


}
