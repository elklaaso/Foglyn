package com.foglyn.core;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

public class FoglynPublicKey {
    public static PublicKey getPublicKey() throws GeneralSecurityException {
        // Following part is generated (manually, via KeyHolderGenerator)
        byte[] data = new byte[94];
        data[93] = 1;
        data[51] = 31;
        data[1] = 92;
        data[46] = -10;
        data[41] = -51;
        data[21] = 72;
        data[92] = 0;
        data[53] = 75;
        data[91] = 1;
        data[2] = 48;
        data[26] = 79;
        data[54] = 59;
        data[29] = 46;
        data[60] = -12;
        data[34] = 117;
        data[19] = 0;
        data[35] = 91;
        data[52] = 114;
        data[11] = 13;
        data[27] = -66;
        data[12] = 1;
        data[43] = -44;
        data[28] = 38;
        data[13] = 1;
        data[4] = 6;
        data[55] = 42;
        data[30] = 22;
        data[39] = -48;
        data[56] = 8;
        data[42] = -67;
        data[57] = 69;
        data[3] = 13;
        data[17] = 3;
        data[66] = 44;
        data[7] = -122;
        data[14] = 1;
        data[58] = -86;
        data[20] = 48;
        data[90] = 3;
        data[61] = -38;
        data[40] = 58;
        data[75] = -59;
        data[15] = 5;
        data[22] = 2;
        data[31] = 126;
        data[59] = 57;
        data[32] = -60;
        data[36] = -52;
        data[33] = 99;
        data[73] = -47;
        data[16] = 0;
        data[44] = 41;
        data[10] = -9;
        data[45] = 79;
        data[62] = -86;
        data[63] = -96;
        data[37] = 122;
        data[38] = -70;
        data[85] = -124;
        data[64] = 56;
        data[72] = 43;
        data[65] = 59;
        data[86] = -54;
        data[18] = 75;
        data[47] = -87;
        data[5] = 9;
        data[23] = 65;
        data[48] = -37;
        data[49] = -97;
        data[67] = -29;
        data[0] = 48;
        data[50] = 61;
        data[24] = 0;
        data[6] = 42;
        data[83] = 97;
        data[25] = -19;
        data[76] = 14;
        data[81] = 106;
        data[77] = -119;
        data[68] = -18;
        data[69] = 51;
        data[70] = -111;
        data[71] = 53;
        data[8] = 72;
        data[74] = 64;
        data[78] = -122;
        data[9] = -122;
        data[79] = 105;
        data[80] = 123;
        data[82] = -109;
        data[84] = 72;
        data[87] = 35;
        data[88] = 41;
        data[89] = 2;
		// end of generated code
		
        X509EncodedKeySpec pubSpec = new X509EncodedKeySpec(data);

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(pubSpec);
        return publicKey;
    }

    public static PublicKey getPublicBetaKey() throws GeneralSecurityException {
        // Following part is generated (manually, via KeyHolderGenerator)
        byte[] data = new byte[94];
        data[29] = 71;
        data[34] = -71;
        data[1] = 92;
        data[13] = 1;
        data[39] = -45;
        data[73] = -2;
        data[92] = 0;
        data[22] = 2;
        data[14] = 1;
        data[55] = 114;
        data[70] = -21;
        data[86] = 107;
        data[84] = 4;
        data[25] = -66;
        data[64] = 39;
        data[28] = 117;
        data[56] = 118;
        data[4] = 6;
        data[35] = -20;
        data[60] = -25;
        data[37] = 66;
        data[47] = 95;
        data[36] = -61;
        data[54] = -68;
        data[61] = 43;
        data[20] = 48;
        data[66] = 37;
        data[15] = 5;
        data[76] = 107;
        data[2] = 48;
        data[9] = -122;
        data[57] = -53;
        data[5] = 9;
        data[31] = -117;
        data[3] = 13;
        data[46] = 67;
        data[16] = 0;
        data[11] = 13;
        data[50] = -117;
        data[91] = 1;
        data[38] = -110;
        data[30] = -12;
        data[40] = -12;
        data[77] = 94;
        data[41] = 117;
        data[72] = -55;
        data[78] = 39;
        data[51] = -98;
        data[44] = -59;
        data[42] = 27;
        data[93] = 1;
        data[45] = 63;
        data[6] = 42;
        data[7] = -122;
        data[8] = 72;
        data[10] = -9;
        data[21] = 72;
        data[23] = 65;
        data[43] = -34;
        data[69] = 48;
        data[52] = -56;
        data[74] = -102;
        data[18] = 75;
        data[49] = 109;
        data[63] = -36;
        data[12] = 1;
        data[19] = 0;
        data[48] = 42;
        data[53] = 90;
        data[79] = 88;
        data[62] = -51;
        data[65] = 28;
        data[68] = -10;
        data[88] = 105;
        data[67] = -1;
        data[17] = 3;
        data[80] = -127;
        data[81] = -63;
        data[58] = -96;
        data[59] = 119;
        data[71] = 24;
        data[75] = 122;
        data[82] = -126;
        data[83] = -127;
        data[24] = 0;
        data[85] = 66;
        data[87] = 21;
        data[89] = 2;
        data[90] = 3;
        data[26] = -60;
        data[32] = -16;
        data[33] = 44;
        data[27] = -94;
        data[0] = 48;
        // end of generated code
        
        X509EncodedKeySpec pubSpec = new X509EncodedKeySpec(data);

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(pubSpec);
        return publicKey;
    }
}
