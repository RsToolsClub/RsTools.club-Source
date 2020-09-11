// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.core;

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class b
{
    private static final Object[] m;
    private static final Class[] x;
    private static final int[] p;
    private static final short[] C;
    private static final int T;
    private static final int a;
    
    static {
        T = Integer.parseInt(CoreStatement$CoreStatement.F("\u29a4\uba4e\u4750\ubc6a\ud73e\ubc1e\uad8a\ud546\uc77e\u33dc\u71fb"));
        a = Integer.parseInt(CoreStatement$CoreStatement.F("\u29a4\uba4f\u4750\ubc6d\ud73d\ubc1a\uad8b\ud545\uc778\u33d1"));
        m = new Object[201];
        x = new Class[42];
        p = new int[201];
        final char[] charArray = CoreStatement$CoreStatement.F("\u89ba\u6ace\uae13\u08b9\uc3fa\u129a\u5979\u5ba7\ubea2\u4c78\ua445\u3770\ue066\ua9de\ueccf\ua520\uf87d\uaced\u6a43\ub639\ud1c2\u4bb5\u38a2\u8933\u5768\uf27e\ufafe\u7ffc\ucfc2\u0985\uda4c\uf9a5\u241f\u0cf3\ue024\u40a7\ue743\u9a65\u010f\u4176\u3b6d\u2627\u8705\u34db\ua4be\ud58a\u5fe3\u112b\uc724\u63ce\u73fe\u52ef\ubc3a\u39e6\u07ba\ued5a\u4f62\u613f\u22e9\ucab0\ue9ff\u8d99\u5de5\uf0d0\ua4da\ub485\u3396\u8a9d\uc4ca\u5f3d\u63dd\ue258\u66f8\u5c76\u4c3c\u28cc\uecbd\u5f25\u8325\u9dd3\u1efd\u7f79\ubb60\u3ab9\uf366\u2fcc\ue4a5\u4e1c\u2ba8\uf460\ubf3c\u3a11\ua302\u2ec7\u88b6\u48c6\u2808\ud69d\u2ff2\uafc1\u3536\u4f40\ued43\u1aeb\u3410\u3094\ue225\u4ecc\u5cad\ub0d4\u3aff\uee48\u1eab\u96d3\u6391\ua3a5\u60e0\u880d\u6e86\uec45\ua3d8\u299d\ua7e2\u2e94\ub501\uc499\u3448\ucb61\u5d59\u6167\u8a8f\u3ef3\u5ad7\u05b3\uae94\u2e7b\uc4cf\ub70d\u9c0e\uf22f\u3883\uca32\u286b\udc9f\u5318\u0b95\u3dd8\u3f61\u3260\u72eb\u11a9\u0e65\uc609\u84df\u8ee5\ubd20\u57e4\u5bdb\u2ba2\ua1f2\uf2a4\u1728\udb4c\u32d3\u569b\u88dc\ud2b2\u41d2\ud7a7\u615f\ueca1\u27a3\ufb7a\u5fd2\u715c\uf01b\u155e\ua2f5\u5855\u3475\u6362\u5c7a\u9f3f\uee1c\u0b13\u6fb2\u3975\u3d9e\u9323\u7933\u3f9e\ub0f2\u2144\u31a5\u4928\u2eff\uaa0b\u3c5a\u67c3\u7d8c\u5314\u0e99\u0733\u5815\ue17a\u8381\u5f8d\u9af7\u9eb8\ue737\uf59c\u4c8b\u8d3d\u5857\u07e1\u1a11\ucac5\u77b2\u72fc\ub8ba\u07ef\u4295\u59d5\u2f69\u0b80\uca48\ua335\u966b\u1298\u93fc\u5d5a\ubb23\ub581\u2720\u904b\u38f9\ub0c5\u59a4\u9022\u7dc2\u092c\u54ad\ued85\u6bc4\u1c9e\u43a8\ufc5f\u602c\u7e46\u9919\u8223\u9926\uf636\u6567\u91d1\uf72e\uabb1\u45c6\ud2e9\u4034\ufd37\u95c2\u0861\uf7ee\u26f0\u8ce7\udcd7½\ue1c6\uff41\u5a6a\u2e17\u04b4\ubc6e\u1ab6\ue3a6\ua8e3\ub599\u228a\ude53\u18fe\u2dfe\ub845\uf796\u0f92\u7f0a\u393a\uf9e8\u5965\u355e\u1b2f\uff56\udfa2\ua1be\u2c83\udc3f\uf9dc\u8508\ud8ee\ua96b\u48b8\u3b86\u7453\u1668\ua1e1\uc86d\u01e7\ua236\u7b23\u2494\u42f6\u40e5\uc256\u7565\u79ae\uf719\u35fc\u8145\u03fc\ua0d7\u7043\u5124\u1560\u29b5\u734f\u793e\u3571\u466e\u63dd\u40da\ub372\uf4e0\ucf24\uab89\u2ab5\u0189\udaa1\u896b\u9881\u62c5\ufadb\u55e5\ue24d\u000e\u7719\u1d64\ucae2\u84cd\ud329\uebfa\ud1a1\u7505\u05a1\ucd5f\u51d2\u0e79\u97c5\u2820\ufc7a\u5ad3\uaa77\u6702\u6169\ubaca\u7c15\u1bda\uab37\ufc99\u22f2\uf03d\u4026\u1737\ud15f\u5d13\u5b9c\uc9d2\ucc05\u5602\u4f76\u92be\uc0ca\u4452\ufd6f\u9cc9\u8aea\u3264\u691e\uc3b1\uc7f1\ud653\udcf2\ue057\ue7d7\uc9d5\u2a05\uc990\uaeb8\u1256\uda0e\u4a75\u520b\ua86d").toCharArray();
        for (int i = 0; i < 201; ++i) {
            b.p[i] = (charArray[i * 2] | charArray[i * 2 + 1] << 16);
        }
        C = new short[201];
        final char[] charArray2 = CoreStatement$CoreStatement.F("\u29ac\uba66\u477f\ubc41\ud700\ubc27\uadaf\ud561\uc76c\u33e0\u71d9\ud166\u24af\u2ff2\u9889\uad40\u62e5\ue499\u952a\ufa54\u16ce\ufa75\uf8da\u45ed\ub0a8\ue188\u28f4\udda2\ua815\u2c13\u9c62\ua97e\ue094\u87d5\ufd2c\uc247\u6fc1\uff7d\uad1b\u4a61\ud89b\u5b91\u31c0\u16a4\u7f46\u2077\uc562\uc058\u4db9\uafcb\uff7b\u88e7\u35c9\u2ade\u7007\u804a\u9a3c\ub4e3\ud2cc\uf18f\u917f\u7eb7\u1f3e\u1f9f\u8719\u1402\u3753\u4284\u7ac9\u11f2\u4ee4\u919d\uea25\u978e\u460a\u456e\uc712\u58f7\uc21b\u6b80\u155b\u539b\u54a9\u05ea\uefc3\uaedb\uac8a\u10d6\ua20e\u5789\u55f3\u7639\u199b\u6689\u1ff7\u6d3d\u3c40\ue718\ua856\u062e\u0266\u7f99\u81f8\u69eb\ubfad\u09e1\u0d0f\ud56b\u99dc\ufbeb\u7a50\ub2f7\uc40f\uf338\uc6ef\u7875\u371c\u2cfe\uaabd\u93f5\u919d\ubdc9\u449b\u0cc4\u8089\u57b8\uff36\u6571\uc7ec\u8985\u44f7\u0d45\u881b\u0e93\u9848\ud60c\u42ca\u3bb2\ucc1d\u5da6\u8956\u9e3b\u125b\ud2da\uec32\u140e\u0f45\u86e9\ubffe\u8920\u0b04\u6c49\u8abb\u155f\u4112\u2b26\u4566\u73fe\u63d4\u0337\u4a27\u828d\ud229\uf6d9\u1a1f\u5ace\u47f8\ufc2a\uf998\u802d\u381b\uf579\ud891\ua6f4\u3eb5\u6b10\u9512\u880b\u9253\u7c3e\uc7f1\u4a8b\u14e9\ue5e2\ufdb1\u5e58\u21d9\u960d\u561a\u34f9\u53b0\u2fe9\u4eff\u4f9e\u384f\u8d27\u462b\u2d7d\u07ad\u87a8\ubc62").toCharArray();
        for (int j = 0; j < 201; ++j) {
            b.C[j] = (short)charArray2[j];
        }
    }
    
    private static Class u(final int n, final int n2) {
        final int n3 = ((b.C[n] & 0xFFFF) + n2) % 42;
        final Class clazz = b.x[n3];
        if (clazz != null) {
            return clazz;
        }
        return b.x[n3] = u(n3);
    }
    
    private static Class u(final int i) {
        String className = null;
        switch (i) {
            case 0: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5453\u51e3\u576b\ud409\u7ef4\u7086\u7948\uf3a1\uc04b\ufd57\ubf4f\u94a4\ue694");
                break;
            }
            case 1: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5463\u51dd\u5755\ud405\u7eae\u70ad\u7963\uf391\uc060\ufd62\ubf66\u948f\ue6b7\u6db3\uc2ef\u9106");
                break;
            }
            case 2: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue326\u3194\u05d2\ue0f0\ub198\u05fb\u547c\u51c9\u5761\ud40f\u7ebf\u70b8\u795d\uf3bc\uc04d\ufd4f");
                break;
            }
            case 3: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue339\u3184\u05d0\ue0b9\ub1e5\u05f9\u5444\u51fe\u5770\ud402\u7ebd");
                break;
            }
            case 4: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue339\u3184\u05d0\ue0b9\ub1e5\u05f8\u5445\u51e2\u576d\ud405\u7eb7\u70ad\u796c\uf3ad\uc041\ufd44\ubf5a\u9494\ue6bf\u6db8\uc2e4");
                break;
            }
            case 5: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue339\u3184\u05d0\ue0b9\ub1e5\u05f9\u5449\u51ff\u576d\ud409\u7eb7");
                break;
            }
            case 6: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5453\u51e3\u576b\ud409\u7ef4\u708b\u7946\uf3a7\uc047\ufd71\ubf58\u9485\ue6a6\u6db6\uc2f8\u9111\uc9d4\uab75\uc670\u06da\ua112\u1e53\u4f5e\ub416\u3a17\uacbb");
                break;
            }
            case 7: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5463\u51dd\u5755\ud405\u7eae\u70ad\u796a\uf3ba\uc04c\ufd4f\ubf4f\u9483\ue6a2\u6dbe\uc2e5\u911a");
                break;
            }
            case 8: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5453\u51e3\u576b\ud409\u7ef4\u708c\u796b");
                break;
            }
            case 9: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5453\u51e3\u576b\ud409\u7ef4\u708b\u7946\uf3a7\uc047\ufd73\ubf4f\u9493\ue6a3\u6dbb\uc2fe\u9127\uc9d5\uab52");
                break;
            }
            case 10: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue320\u3191\u05d7\ue0b2\ub1e5\u05e8\u5459\u51f8\u574a\ud409\u7eae");
                break;
            }
            case 11: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5453\u51e3\u576b\ud409\u7ef4\u708b\u7946\uf3a7\uc047\ufd71\ubf58\u9485\ue6a6\u6db6\uc2f8\u9111\uc9d4\uab75\uc670\u06da\ua112\u1e53\u4f5e\ub416\u3a17\uacbb\u632e\uec1a");
                break;
            }
            case 12: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5463\u51dd\u5755\ud405\u7eae\u70ad\u796a\uf3ba\uc04c\ufd4f\ubf4f\u9483\ue6a2\u6dbe\uc2e5\u911a\uc9f3\uab49\uc66a\u06dd\ua10f\u1e51");
                break;
            }
            case 13: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5463\u51dd\u5755\ud405\u7eae\u70ad\u796a\uf3ba\uc04c\ufd47\ubf43\u9487\ue6f2\u6d93\uc2eb\u9100\uc9d5\uab65\uc668\u06da\ua115\u1e45");
                break;
            }
            case 14: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue320\u3191\u05d7\ue0b2\ub1e5\u05e9\u5451\u51e0\u577c\ud402\u7ebe\u70a9\u795b");
                break;
            }
            case 15: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5454\u51ed\u576d\ud409\u7ef4\u708e\u7948\uf3a6\uc056\ufd65\ubf4b\u9494\ue6b3\u6d91\uc2e5\u9106\uc9dd\uab47\uc670");
                break;
            }
            case 16: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue339\u3184\u05d0\ue0b9\ub1e5\u05e6\u545f\u51e2\u577e");
                break;
            }
            case 17: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue326\u3194\u05d2\ue0f0\ub18f\u05cb\u5444\u51e9");
                break;
            }
            case 18: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue339\u3184\u05d0\ue0b9\ub1e5\u05ee\u545f\u51f9\u577b\ud400\u7ebf");
                break;
            }
            case 19: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5453\u51e3\u576b\ud409\u7ef4\u708b\u7946\uf3a7\uc047\ufd65\ubf4b\u9494\ue6b7\u6db5\uc2eb\u9107\uc9d5\uab6b\uc661\u06cf\ua107\u1e72\u4f52\ub407\u3a18");
                break;
            }
            case 20: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue326\u3194\u05d2\ue0f0\ub19b\u05d8\u5455\u51fc\u5778\ud41e\u7ebf\u70ac\u797a\uf3a1\uc043\ufd55\ubf4f\u948d\ue6b3\u6db9\uc2fe");
                break;
            }
            case 21: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue339\u3184\u05d0\ue0b9\ub1e5\u05f9\u5444\u51fe\u5770\ud402\u7ebd\u708a\u795c\uf3bc\uc04e\ufd45\ubf4f\u9492");
                break;
            }
            case 22: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue320\u3191\u05d7\ue0b2\ub1e5\u05d8\u5455\u51eb\u577c\ud414\u7ef4\u7098\u7948\uf3a1\uc056\ufd44\ubf58\u948e");
                break;
            }
            case 23: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue320\u3191\u05d7\ue0b2\ub1e5\u05c9\u545f\u51e2\u577a\ud419\u7ea8\u70ba\u794c\uf3bb\uc056\ufd0f\ubf4b\u9494\ue6b9\u6dba\uc2e3\u9117\uc99e\uab67\uc670\u06d4\ua10b\u1e5f\u4f50\ub431\u3a16\uaca0\u6366\uec4e\u5020\udbdd");
                break;
            }
            case 24: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue320\u3191\u05d7\ue0b2\ub1e5\u05e2\u5451\u51ff\u5771\ud421\u7ebb\u70b8");
                break;
            }
            case 25: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5463\u51dd\u5755\ud405\u7eae\u70ad\u796a\uf3ba\uc04c\ufd47\ubf43\u9487");
                break;
            }
            case 26: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue320\u3191\u05d7\ue0b2\ub1e5\u05e7\u5451\u51fc");
                break;
            }
            case 27: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue320\u3191\u05d7\ue0b2\ub1e5\u05f9\u5455\u51f8");
                break;
            }
            case 28: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue320\u3191\u05d7\ue0b2\ub1e5\u05e3\u5444\u51e9\u576b\ud40d\u7eae\u70a7\u795b");
                break;
            }
            case 29: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue320\u3191\u05d7\ue0b2\ub1e5\u05e7\u5451\u51fc\u573d\ud429\u7eb4\u70bc\u795b\uf3ac");
                break;
            }
            case 30: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5453\u51e3\u576b\ud409\u7ef4\u708b\u7946\uf3a7\uc047\ufd72\ubf5e\u9481\ue6a2\u6db2\uc2e7\u9111\uc9de\uab52");
                break;
            }
            case 31: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue339\u3184\u05d0\ue0b9\ub1e5\u05e4\u5445\u51e0\u5775\ud43c\u7eb5\u70a1\u7947\uf3a1\uc047\ufd53\ubf6f\u9498\ue6b5\u6db2\uc2fa\u9100\uc9d9\uab49\uc66a");
                break;
            }
            case 32: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue339\u3184\u05d0\ue0b9\ub1e5\u05e3\u545e\u51f8\u577c\ud40b\u7ebf\u70ba");
                break;
            }
            case 33: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue339\u3184\u05d0\ue0b9\ub1e5\u05f9\u5458\u51e3\u576b\ud418");
                break;
            }
            case 34: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue339\u3184\u05d0\ue0b9\ub1e5\u05ec\u545c\u51e3\u5778\ud418");
                break;
            }
            case 35: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue339\u3184\u05d0\ue0b9\ub1e5\u05e5\u5452\u51e6\u577c\ud40f\u7eae");
                break;
            }
            case 36: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue326\u3194\u05d2\ue0f0\ub189\u05cb\u5444\u51ef\u5771\ud439\u7eaa\u70ac\u7948\uf3a1\uc047\ufd64\ubf52\u9483\ue6b3\u6da7\uc2fe\u911d\uc9df\uab48");
                break;
            }
            case 37: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5463\u51dd\u5755\ud405\u7eae\u70ad\u796c\uf3a7\uc050\ufd4e\ubf58\u94a3\ue6b9\u6db3\uc2ef");
                break;
            }
            case 38: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u5463\u51dd\u5755\ud405\u7eae\u70ad\u796c\uf3ad\uc041\ufd44\ubf5a\u9494\ue6bf\u6db8\uc2e4");
                break;
            }
            case 39: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue339\u3184\u05d0\ue0b9\ub1e5\u05e3\u545c\u51e0\u577c\ud40b\u7ebb\u70a4\u797a\uf3a1\uc043\ufd55\ubf4f\u94a5\ue6ae\u6db4\uc2ef\u9104\uc9c4\uab4f\uc66b\u06d5");
                break;
            }
            case 40: {
                className = CoreStatement$CoreStatement.F("\ub70c\uc8ef\u1de4\u63ab\u2bf3\ue326\u3194\u05d2\ue0f0\ub198\u05de\u5451\u51f8\u577c\ud401\u7ebf\u70a6\u795d");
                break;
            }
            case 41: {
                className = CoreStatement$CoreStatement.F("\ub709\uc8fc\u1df5\u63e4\u2bae\ue324\u3189\u05d7\ue0aa\ub1ae\u0584\u545a\u51e8\u577b\ud40f\u7eee\u70e6\u7963\uf391\uc060\ufd62\ubf1e\u94b2\ue6b3\u6da4\uc2ff\u9118\uc9c4\uab75\uc661\u06cf");
                break;
            }
            default: {
                throw new NoClassDefFoundError(Integer.toString(i));
            }
        }
        return Class.forName(className);
    }
    
    static Method U(int n) {
        n = ((n - 1447018734 ^ b.T) + 303230597 ^ 0x976F85FD) + b.a;
        final int n2 = n >>> 16;
        n &= 0xFFFF;
        final Method method = (Method)b.m[n];
        if (method != null) {
            return method;
        }
        final Class u;
        Class superclass = u = u(n, n2);
        final int n3 = b.p[n];
        while (superclass != null) {
            for (final Method method2 : superclass.isInterface() ? superclass.getMethods() : superclass.getDeclaredMethods()) {
                int n4 = 31 * (n2 * 31 + method2.getName().hashCode()) + 40;
                final Class<?>[] parameterTypes = method2.getParameterTypes();
                for (int j = 0; j < parameterTypes.length; ++j) {
                    final Class<?> clazz = parameterTypes[j];
                    if (j != 0) {
                        n4 = 31 * n4 + 44;
                    }
                    n4 = 31 * n4 + clazz.getName().hashCode();
                }
                if (n3 == 31 * (31 * (31 * n4 + 41) + method2.getReturnType().getName().hashCode()) + n2) {
                    method2.setAccessible(true);
                    return (Method)(b.m[n] = method2);
                }
            }
            superclass = superclass.getSuperclass();
        }
        for (Class superclass2 = u; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
            final Class[] interfaces = superclass2.getInterfaces();
            for (int length2 = interfaces.length, k = 0; k < length2; ++k) {
                for (final Method method3 : interfaces[k].getMethods()) {
                    int n5 = 31 * (n2 * 31 + method3.getName().hashCode()) + 40;
                    final Class<?>[] parameterTypes2 = method3.getParameterTypes();
                    for (int n6 = 0; n6 < parameterTypes2.length; ++n6) {
                        final Class<?> clazz2 = parameterTypes2[n6];
                        if (n6 != 0) {
                            n5 = 31 * n5 + 44;
                        }
                        n5 = 31 * n5 + clazz2.getName().hashCode();
                    }
                    if (n3 == 31 * (31 * (31 * n5 + 41) + method3.getReturnType().getName().hashCode()) + n2) {
                        method3.setAccessible(true);
                        return (Method)(b.m[n] = method3);
                    }
                }
            }
        }
        return null;
    }
    
    static Object K(final int i, final Object[] args) {
        try {
            final Method u = U(i);
            if (u == null) {
                throw new NoSuchMethodError(Integer.toString(i));
            }
            return u.invoke(null, args);
        }
        catch (InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
    
    static Object N(final Object obj, final int i, final Object[] args) {
        try {
            final Method u = U(i);
            if (u == null) {
                throw new NoSuchMethodError(Integer.toString(i));
            }
            return u.invoke(obj, args);
        }
        catch (InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
    
    static Object j(int i, final Object[] initargs) {
        try {
            i = ((i - 1447018734 ^ b.T) + 303230597 ^ 0x976F85FD) + b.a;
            final int n = i >>> 16;
            i &= 0xFFFF;
            final Class u = u(i, n);
            Constructor constructor = (Constructor)b.m[i];
            if (constructor == null) {
                final int n2 = b.p[i];
                for (final Constructor constructor2 : u.getDeclaredConstructors()) {
                    int n3 = n * 31 + 40;
                    final Class[] parameterTypes = constructor2.getParameterTypes();
                    for (int k = 0; k < parameterTypes.length; ++k) {
                        final Class clazz = parameterTypes[k];
                        if (k != 0) {
                            n3 = 31 * n3 + 44;
                        }
                        n3 = 31 * n3 + clazz.getName().hashCode();
                    }
                    if (n2 == 31 * (31 * n3 + 41) + n) {
                        constructor2.setAccessible(true);
                        b.m[i] = constructor2;
                        constructor = constructor2;
                        break;
                    }
                }
            }
            if (constructor == null) {
                throw new NoSuchMethodError(Integer.toString(i));
            }
            return constructor.newInstance(initargs);
        }
        catch (InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
    
    private static Field y(int n) throws Throwable {
        n = ((n - 1447018734 ^ b.T) + 303230597 ^ 0x976F85FD) + b.a;
        final int n2 = n >>> 16;
        n &= 0xFFFF;
        final Class u;
        Class superclass = u = u(n, n2);
        final Field field = (Field)b.m[n];
        if (field != null) {
            return field;
        }
        final int n3 = b.p[n];
        while (superclass != null) {
            for (final Field obj : superclass.getDeclaredFields()) {
                if (n3 == 31 * (31 * (31 * (31 * n2 + obj.getName().hashCode()) + 58) + obj.getType().getName().hashCode()) + n2) {
                    obj.setAccessible(true);
                    if (Modifier.isStatic(obj.getModifiers()) && Modifier.isFinal(obj.getModifiers())) {
                        final Field declaredField = Field.class.getDeclaredField(CoreStatement$CoreStatement.F("\u7b03\ud0bf\u2ee5\u749f\u17de\u521a\u0df1\u1f54\ud9f9"));
                        declaredField.setAccessible(true);
                        declaredField.setInt(obj, obj.getModifiers() & 0xFFFFFFEF);
                    }
                    return (Field)(b.m[n] = obj);
                }
            }
            superclass = superclass.getSuperclass();
        }
        for (Class clazz = u; clazz != null; clazz = clazz.getSuperclass()) {
            final Class[] interfaces = clazz.getInterfaces();
            for (int length2 = interfaces.length, j = 0; j < length2; ++j) {
                for (final Field obj2 : interfaces[j].getFields()) {
                    if (n3 == 31 * (31 * (31 * (31 * n2 + obj2.getName().hashCode()) + 58) + obj2.getType().getName().hashCode()) + n2) {
                        obj2.setAccessible(true);
                        if (Modifier.isStatic(obj2.getModifiers()) && Modifier.isFinal(obj2.getModifiers())) {
                            final Field declaredField2 = Field.class.getDeclaredField(CoreStatement$CoreStatement.F("\u7b03\ud0bf\u2ee5\u749f\u17de\u521a\u0df1\u1f54\ud9f9"));
                            declaredField2.setAccessible(true);
                            declaredField2.setInt(obj2, obj2.getModifiers() & 0xFFFFFFEF);
                        }
                        return (Field)(b.m[n] = obj2);
                    }
                }
                clazz = clazz.getSuperclass();
            }
        }
        return null;
    }
    
    static Object h(final Object obj, final int i) {
        final Field y = y(i);
        if (y == null) {
            throw new NoSuchFieldError(Integer.toString(i));
        }
        return y.get(obj);
    }
    
    static void J(final Object obj, final int i, final Object value) throws Throwable {
        final Field y = y(i);
        if (y == null) {
            throw new NoSuchFieldError(Integer.toString(i));
        }
        y.set(obj, value);
    }
    
    static Object b(final int n) {
        return h(null, n);
    }
    
    static void l(final int n, final Object o) {
        J(null, n, o);
    }
}
