package com.enoch.studio.auth;

import java.security.cert.X509Certificate;

public interface IVerify {
	public boolean verify(String data, long timestamp, String encodedEncryptedStr,
                          X509Certificate userCert) throws Exception;
}
