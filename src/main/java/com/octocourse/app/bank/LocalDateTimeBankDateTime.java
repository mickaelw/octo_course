package com.octocourse.app.bank;

import java.time.LocalDateTime;

class LocalDateTimeBankDateTime implements BankDateTime {

    @Override
    public LocalDateTime now() {
        return LocalDateTime.now();
    }

}
