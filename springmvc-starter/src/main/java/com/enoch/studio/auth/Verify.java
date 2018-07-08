package com.enoch.studio.auth;

import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

import javax.crypto.Cipher;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

public class Verify implements IVerify {

	public boolean verify(String data, long timestamp, String encodedEncryptedStr,
			X509Certificate userCert) throws Exception {
		MessageDigest md = MessageDigest.getInstance("SHA1");
		md.update(data.getBytes());
		md.update(EncodeUtil.toBE(timestamp));
		byte[] hash = md.digest();

		byte[] encryptedStr = HexBin.decode(encodedEncryptedStr);
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.DECRYPT_MODE, userCert);
		byte[] plain = cipher.doFinal(encryptedStr);
		boolean ok = Arrays.equals(hash, plain);
		return ok;
	}

}
