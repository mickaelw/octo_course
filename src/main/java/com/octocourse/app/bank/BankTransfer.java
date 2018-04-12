package com.octocourse.app.bank;

import sun.net.www.http.HttpClient;

import javax.net.ssl.HttpsURLConnection;
import java.io.DataOutputStream;

interface BankTransfer {

    void post(HttpClient con) throws Exception;

}
