// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc3;

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class j
{
    private static final Object[] b;
    private static final Class[] w;
    private static final int[] g;
    private static final short[] s;
    private static final int K;
    private static final int f;
    
    static {
        K = Integer.parseInt(JDBC3ResultSet$JDBC3Savepoint.i("\u79e7\u4e5f\ub2b5\ue697\u44cc\u3a6b\uc87b\u85dd\u8a39"));
        f = Integer.parseInt(JDBC3ResultSet$JDBC3Savepoint.i("\u79f8\u4e5d\ub2b5\ue696\u44c1\u3a67\uc87c\u85d5\u8a38\u28df"));
        b = new Object[350];
        w = new Class[66];
        g = new int[350];
        final char[] charArray = JDBC3ResultSet$JDBC3Savepoint.i("\u3c8a\u8849\u2ef3\ua631\u7801\ub92a\u9c91\u1db7\ufba9\u2704\u6649\u8b4b\uecca\u1bc7\uf3fc\u4327\u6482\u066b\u9590\u14d2\u073d\ud89a\ud244\ud7bc\u048a\u9168\u5d24\u1a80\uf2c9\uf4b2\u0eaa\ue8b1\u9e47\u7838\u4bd7\ud365\ua123\uda70\u5426\uc271\u77d7\u84d0\u0ad3\u382c\ub588\u0d00\uc558\ub424\ue820\u1e06\u3e47\u237c\ub6dd\uf60e\u8220\u64c3\uaf59\u78d8\u93f7\u3ca3\u046e\ua98b\ue4ca\ubd12\u873e\u373a\u9a31\u47cd\ua780\u5d28\u1237\uaf5c\u7654\u611b\ud73b\uad19\u8340\u2580\u6556\u8a7e\u6a6c\u371c\u838c\ue142\ufaac\ucae6\u6946\u1e85\u6b34\u6478\u3c19\ue53c\u223d\u74cb\ud66a\ub020\u6302\uf491\u4b4a\udce2\u7bfe\u38e0\u2aac\u2ccb\uacd0\u30b3\u7258\u2038\ud6ac\ucf1f\ud853\ua014\u6ff1\u1550\u4442\uf651\u90de\u4d3f\u15b9\u022c\uea65\ude2b\ue1c4\ufde7\u161a\u5e03\ucfe2\ue4f9\u0b53\u2fde\ue288\ud6a6\u3ba1\u8392\uce97\uc6a8\u84da\uc405\u6794\u4150\u50e5\u0710\u7d86\u4c1b\u6cdd\u1b75\uc11e\u7818\ub2e7\ud121\uaab3\u5d27\u80fa\u24eb\u902a\u0e94\u24d2\ucb4c\u6e96\u952b\u76fb\uf082\u7651\u08a1\u3ef0\u1553\u4178\ua128\uc6cc\u15cd\u721f\ufbc7\uf31f\ueb6b\u3790\u3cf5\u55ce\udfaa\ud82e\ucbab\u6afd\u82d5\u3fc0\u9558\uf5ac\u35d6\uc0cb\u2a11\u35b8\ufe2c\u97e2\uc230\ua125\u2a86\uf8ed\ub54b\u0c91\ua049\ub9ee\u1e9c\u199b\uec49\u0d5a\u14ce\u6be0\u4d03\ue0a1\u49a1\u80ca\u3f75\uc193\ubb5e\ud17d\u8730\u8610\u705c\u5b2d\u9c53\u596e\u8248\uceb4\u9ad2\uec15\u389f\ua250\u3866\u278d\ua6de\u6016\u6ad4\ufc51\uabe7\ub189\u726a\u6e4d\u5664\uc6af\ufc2f\uf999\u9c00\uc2ba\u1d63\ufe46\uccf6\u742a\u7ce8\uea07\u65d0\ubda4\u284e\uf0c8\u5732\u2579\u02f5\u1386\u4291\u5abc\uf48c\u0099\u7775\u8cce\ub331\u3de8\uc40e\u2469\ud237\ue20c\u6235\u4c6a\u8852\u5709\u7a65\u8c69\u4ab2\u6013\ucd2a\u31c5\ueda9\u6564\u177b\u2ed6\ufa1d\uad50\u69d2\u90ed\u3e11\uff83\ub946\ua109\ua798\u590a\ua5b4\u2557\u2283\ub90b\ud7a2\u634c\u9beb\u1b03\u2156\ue723\u298c\u0415\u0616\u01c8\u8548\uf252\u584e\uc631\uf1cd\u3898\ue858\uc79e\u224c\u7f70\ua1b9\u294e\uba89\u4a51\u9d99\u904e\u7bd5\ufb6c\u1745\u03d1\uaa91\u2a8c\ua2af\u4386\u073d\u3266\u3391\u7d34\u8d29\u89d1\ucce9\uf83b\u5576\u3d50\u4294\ufab9\uc740\u1e72\uc108\ue1bf\u80eb\u70c5\uad69\ufd4d\udb43\u548f\ue1b7\ud004\u1900\uda00\ud799\ucaf0\ua817\uc2b0\u6d31\uf16e\u2d06\u1ca9\u7271\u60e3\u5e34\u067d\u8ada\ue43c\u7490\u0d39\u52df\u06f2\u7187\ue67b\u9dea\u0e2f\u1495\u29a1\u4cdf\ue72e\u1836\u03f9\u457a\ud30c\u8c3e\u39b9\u3b7f\u1c71\u1303\ue8e3\ubebd\ue096\uab70\ua20e\u43e6\uf34b\uc432\u1607\u7ac4\ub05e\ud06e\u22ae\ua7f5\uf8a2\u4564\ufd5b\ub871\uaae9\u547f\u837a\u20d6\u9eaf\u9927\u2606\ua8e7\uad28\u1cd4\ufe98\ud03b\u076b\ue352\uf7ab\ua99e\u08e6\u1b8e\ub51d\u489d\u8267\ufa31\uacb0\uc59c\uabdd\u8039\ude9b\u5c03\u34fc\u6957\u51cc\ub930\ud553\u133b\u48bc\ue900\udfc5\u9732\ueb2f\u2ff4\u1c4c\u63fc\u46ac\u3d13\uda4c\u9034\u5e89\u8ce0\u1e4f\u1a15\ua4a3\u17a2\ue163\u8382\u182b\ub6c5\u1fb1\u0da6\u59d1\u71f0\uda01\u20d7\u0a6b\u13d3\u6b7e\u67c8\udbe2\u73c1\u8dcd\ua691\u20aa\u7210\u4ab4\u8b59\u7689\ucb84\u753e\u44c8\ufce5\u8baa\uc650\u2c00\u1d36\u301d\u83f2\u9a36\u3cf4\u1c7d\u2000\u2123\uab36\ub704\u0540\u41a6\u00e8\uddb4\ud36d\u3105\u9a59\ua67d\ucb5f\u1171\u93d7\ub983\u1e07\u0fe1\u3a8a\u4329\u487c\ub2ba\u4fd1\u71aa\u6bd2\uc5c9\u91ce\uf6f0\u4602\u79fd\ub9b9\u93eb\ueec6\ua324\ub245\uf08f\u3f11\u6a21\uac22\u5dec\u9209\ufc05\ue57f\ucdd4\u1628\udb2a\uf14d\ua1f9\u8e7f\ub2e2\uf49f\u252c\ube4d\uf255\u1fad\u82d7\ua8d0\uc784\uf47a\u53f5\u9053\u2620\u084d\u7316\ud027\u2375\ue6dc\u0f2d\u900a\u48fa\u04d2\u3e69\ubc1c\udb48\ucb3e\u7399\u54fc\uaf1b\uabc6\u6e93\u2756\ue8a8\ud50e\u5598\u6523\u035e\ude3c\ucfac\ub8fc\uaa84\ua911\u5863\uec25\u07b8\ue69f\u67c9\u6c0b\u23c2\u352f\uf017\u575d\uf23d\u76d2\ue669\u3bda\u1acf\u18eb\u7333\uf184\u7bab\u9b1a\u8225\u338b\ucb0b\ube63\u13a7\u5a11\u9b51\u2327\u655b\u422b\ub63a\ua396\u440a\ue8e0\u6fb6\ucf06\uf820\ub1e0\uec9d\u0a6d\u5185\u12dd\u4030\ua348\u65a1\u8056\u13ee\u0e93\u2d21\u425c\u2f39\u7dee\uef2f\u0c7f\u66fd\u9375\u268b\uf2be\u7b5a\ucea2\u8cd3\u6772\u4d8f\u14f3\u0ef2\u60a9\ufb4e\u2978\u1000\u4614\u62fc\uc3d9\uedde\ufb29\ub77e\u77f2\u19a0\uce0f\u3025\u8d71\u0227\u5dd9\ub240\u7e3d\u975e\u7d46\u89c1\u5c3c\u59db\uff20\u59e1\u53be\u0aa2\u5f06\u6546\u39a6\uf871\uc9c9\u771c\u0551\u3a20\ufe95\ue15b\u488e\u6d13\u92b8\u0b43\u2be6\uf66f\u6f1b\u7ae0\u2bdc\u7436").toCharArray();
        for (int i = 0; i < 350; ++i) {
            j.g[i] = (charArray[i * 2] | charArray[i * 2 + 1] << 16);
        }
        s = new short[350];
        final char[] charArray2 = JDBC3ResultSet$JDBC3Savepoint.i("\u79c3\u4e66\ub286\ue6b8\u44e2\u3a52\uc86a\u85fb\u8a4d\u28ff\ucf93\u4335\u3e16\u39de\u2a30\u3daa\u923e\ue24c\u69bd\ue816\u5095\u2a6a\u75ba\ud536\u7fd6\u565c\u190b\u384d\u3dad\ub5ac\u3012\u19c9\u2d62\u97b0\u7d95\uc30f\u145b\ub429\u23ed\u348e\u7d5b\u0848\ue474\udb63\ub2ea\u4d07\u274b\u1114\u3473\u1c2c\u9595\u68b9\ua36a\u37a0\u4a1a\uf7f6\udbd1\ud0fb\uc3be\u942a\u0a87\udbee\u82ec\u6cfd\u01a1\ubc9e\ubb33\ucfeb\u2d98\ub3cc\u9eb9\u1367\u4073\ue7f4\u36c9\u84f7\u77ea\uae25\u5942\u9d09\u6aa0\u4c85\u61ff\u6392\u6207\uf3b2\u6476\u08f5\uae15\uca7d\u026a\u1fe2\uc0e1\u7bc7\u1ccf\ue7bd\u7086\uca3d\u0992\uc212\u0a7c\u752f\u7628\u5188\uf145\uf9c5\u3700\uffaf\u7727\ue725\u3937\uf726\udac5\u7a21\u8cc8\ue33d\ub867\u1774\u9304\u8e76\u84c9\u9340\u03d5\ufc81\uce14\u8ffa\u8411\u7aa5\u9ca9\uf459\uc61f\u81d1\u8e2d\ua7e0\u0800\u01f1\u9cf6\ua209\u5017\u531b\ua9ac\u62f7\u050b\u906e\uaf06\u25e6\u9f42\u7547\u8aa1\u8519\u2044\u9c95\uf621\u4a44\ub91e\ub0e9\udec4\u290f\u5e9a\u4abe\ub326\u0ecc\u8b19\ubef1\ued51\u2bd1\u91d9\ub5dd\ua077\u5cae\ub846\u07d7\u3fe7\u584d\u8ae1\u8345\u3257\u99bb\u5ffe\u3499\u813c\uddda\u4f97\uea00\u4983\u309a\u28b0\ue24d\ua9d5\u68e9\u2b45\u22d2\u45ad\ub61e\u95f1\uc70b\ub9dd\u42b9\u0152\u7d9a\u716e\u4848\u1b0d\u3708\uecf0\ua0c9\ub6d9\u17db\u9600\u56b1\ub4b7\u36ee\u3115\uc846\u4d90\u1d3e\u020b\u61bc\ua157\ufd53\u2f39\uc8f7\u97e9\u21e0\u799c\u4989\uc75e\u0809\ub32e\u9af7\ue3a4\ud058\u07a1\u86ca\ua98e\u6cef\ub3ea\u11f4\ubb5e\u8f33\uc39e\u42ea\uf4ac\ud31a\uf081\ub309\u203e\u5c7d\uc1b0\uee16\u3f4e\u4176\u926a\uc089\u4cd8\u83d6\ufdb4\ucc07\ub001\u1939\uc0e3\u86a2\u12e7\u258e\u8a26\u6365\ueb76\uc4be\u2aec\u0adc\uba96\u666e\uefad\ue1bc\ufff4\u457c\ua019w\u4c72\ue2f8\u88ad\u5c80\u5358\u8f42\u237e\ua6f5\uda58\ud44e\ud4fb\uf81c\u3d2f\udc63\u2adf\u3232\u69bd\ub100\u5670\u2422\ub808\u72d6\u3021\ucc95\u27c0\uf68e\ua5ea\u8bbd\u582c\u5e70\u56f3\u4f1e\ud674\uc075\uec42\uf125\u2259\ueb1a\u529c\u2e15\uc878\u8f3b\u3906\u17c8\u8628\u0dcf\uef0d\uf879\u1dec\u2e3c\uc1a5\ua54c\ub89c\u1960\u0a9f\u49cb\u05d4\u4caa\u74c4\u5821\u63ff\u015b\uf05c\u48d9\u5fa1\ued5b\u7c4a\ubc59\u470c\ue331\udac6\uf51a").toCharArray();
        for (int j = 0; j < 350; ++j) {
            j.s[j] = (short)charArray2[j];
        }
    }
    
    private static Class y(final int n, final int n2) {
        final int n3 = ((j.s[n] & 0xFFFF) + n2) % 66;
        final Class clazz = j.w[n3];
        if (clazz != null) {
            return clazz;
        }
        return j.w[n3] = b(n3);
    }
    
    private static Class b(final int i) {
        String className = null;
        switch (i) {
            case 0: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63d3\u196f\u212f\ud8ed\udb75\u7426\u219e\ub6ca\u3d56\u0693\u2eeb\u829e\ua111\ucfff\uf2b0\u18d8\u6fa0\u9e15\u165e\u5eff");
                break;
            }
            case 1: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7dd8\u63d7\u197f\u2128\ud8e9\udb23\u747a");
                break;
            }
            case 2: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7dc2\u63cd\u1979\u2124\ud8e0\udb21");
                break;
            }
            case 3: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7dc2\u63cd\u1979\u2124\ud8e0\udb21\u744a\u21a1\ub6e7\u3d78\u06b4\u2ebd\u82be");
                break;
            }
            case 4: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u693e\ud5d5\u62e7\ub401\u0d7d\u7dc0\u63f5\u194e\u2135\ud8ed\udb23\u7478\u21a0\ub6e7\u3d7b\u06be");
                break;
            }
            case 5: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63da\u1964\u213f\ud8eb\udb68\u744b\u21bb\ub6fc\u3d71\u0683\u2eac\u82ad\ua100\ucfe9\uf2a8\u18d1\u6fba\u9e32");
                break;
            }
            case 6: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63da\u1964\u213f\ud8eb\udb68\u744c\u2196");
                break;
            }
            case 7: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6920\ud5c5\u62ff\ub447\u0d00\u7dd3\u63d0\u196c\u2109\ud8eb\udb25\u7461\u21b9\ub6ef\u3d78");
                break;
            }
            case 8: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6924\ud5cb\u62a5\ub46d\u0d57\u7de5\u63dc\u194a\u213f\ud8fc\udb27\u7471\u219d\ub6e0\u3d64\u06a5\u2eac\u829f\ua100\ucffe\uf2a0\u18d5\u6fb9");
                break;
            }
            case 9: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6924\ud5cb\u62a5\ub47c\u0d5a\u7de3\u63d0\u1965\u212a\ud8dc\udb23\u7469\u21b0\ub6eb\u3d66");
                break;
            }
            case 10: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63ea\u195a\u2101\ud8e7\udb32\u746d\u2197\ub6e1\u3d7a\u06be\u2ebd\u82af\ua100\ucfe5\uf2aa\u18da\u6f97\u9e29\u1655\u5eed\ud7cf\u4c16");
                break;
            }
            case 11: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63dd\u196a\u2139\ud8eb\udb68\u744e\u21b5\ub6fd\u3d60\u0694\u2eb9\u82b8\ua111\ucfca\uf2aa\u18c6\u6fb9\u9e27\u164f");
                break;
            }
            case 12: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6938\ud5d0\u62e2\ub443\u0d00\u7dd5\u63d8\u197f\u2128");
                break;
            }
            case 13: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u693e\ud5d5\u62e7\ub401\u0d6a\u7df0\u63cd\u196e");
                break;
            }
            case 14: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7dd5\u63d6\u197e\u212f\ud8e2\udb23");
                break;
            }
            case 15: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6938\ud5d0\u62e2\ub443\u0d00\u7dd2\u63d8\u1967\u2128\ud8e0\udb22\u7469\u21a6");
                break;
            }
            case 16: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u693e\ud5d5\u62e7\ub401\u0d7a\u7df8\u63d4\u196e");
                break;
            }
            case 17: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u693e\ud5d5\u62e7\ub401\u0d7a\u7df8\u63d4\u196e\u213e\ud8fa\udb27\u7465\u21a4");
                break;
            }
            case 18: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7ddd\u63d6\u1965\u212a");
                break;
            }
            case 19: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6938\ud5d0\u62e2\ub443\u0d00\u7de3\u63dc\u196c\u2128\ud8f6\udb68\u7458\u21b5\ub6fa\u3d60\u06b5\u2eaa\u82a2");
                break;
            }
            case 20: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6938\ud5d0\u62e2\ub443\u0d00\u7de3\u63dc\u196c\u2128\ud8f6\udb68\u7445\u21b5\ub6fa\u3d77\u06b8\u2ebd\u82be");
                break;
            }
            case 21: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6938\ud5d0\u62e2\ub443\u0d00\u7ddd\u63d6\u1968\u212c\ud8e2\udb23");
                break;
            }
            case 22: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7ddf\u63cc\u1967\u2121\ud8de\udb29\u7461\u21ba\ub6fa\u3d71\u06a2\u2e9d\u82b4\ua117\ucfe9\uf2b5\u18c0\u6fbd\u9e29\u1655");
                break;
            }
            case 23: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63d3\u196f\u212f\ud8ed\udb75\u7426\u219e\ub6ca\u3d56\u0693\u2eeb\u829f\ua100\ucfed\uf2b1\u18d1\u6fb9\u9e23\u1655\u5eff");
                break;
            }
            case 24: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63fc\u1973\u2139\ud8eb\udb28\u746c\u21b1\ub6ea\u3d57\u06bf\u2eb5\u82a1\ua115\ucfe2\uf2a1");
                break;
            }
            case 25: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63ea\u195a\u2101\ud8e7\udb32\u746d\u2197\ub6e1\u3d7a\u06be\u2ebd\u82af\ua100\ucfe5\uf2aa\u18da");
                break;
            }
            case 26: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63fc\u1973\u2139\ud8eb\udb28\u746c\u21b1\ub6ea\u3d57\u06bf\u2eb5\u82a1\ua115\ucfe2\uf2a1\u1890\u6f87\u9e17\u1677\u5ece\ud7de\u4c05\u6d97\uba4c\u1ccc\ua42d\u457c\u8746");
                break;
            }
            case 27: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63da\u1964\u213f\ud8eb\udb68\u744b\u21bb\ub6fc\u3d71\u0682\u2ebd\u82bf\ua101\ucfe0\uf2b1\u18e7\u6fb1\u9e32");
                break;
            }
            case 28: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7ddc\u63d8\u197f\u2125");
                break;
            }
            case 29: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7dc2\u63c0\u1978\u2139\ud8eb\udb2b");
                break;
            }
            case 30: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u693e\ud5d5\u62e7\ub401\u0d6c\u7df0\u63cd\u1968\u2125\ud8db\udb36\u746c\u21b5\ub6fa\u3d71\u0695\u2ea0\u82af\ua111\ucffc\uf2b1\u18dd\u6fbb\u9e28");
                break;
            }
            case 31: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u693e\ud5d5\u62e7\ub401\u0d7c\u7df4\u63ca\u197e\u2121\ud8fa\udb15\u746d\u21a0");
                break;
            }
            case 32: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63da\u1964\u213f\ud8eb\udb68\u744b\u21bb\ub6fc\u3d71\u0694\u2eb9\u82b8\ua115\ucfee\uf2a4\u18c7\u6fb1\u9e0b\u165e\u5eff\ud7c7\u4c35\u6d93\uba56\u1cde");
                break;
            }
            case 33: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6938\ud5d0\u62e2\ub443\u0d00\u7df2\u63d6\u1965\u212e\ud8fb\udb34\u747a\u21b1\ub6e0\u3d60\u06fe\u2eb9\u82b8\ua11b\ucfe1\uf2ac\u18d7\u6ffa\u9e07\u164f\u5ee4\ud7cb\u4c18\u6d91\uba6b\u1cd1\ua430\u4576\u874f\u630d\u1188");
                break;
            }
            case 34: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63d3\u196f\u212f\ud8ed\udb75\u7426\u219e\ub6ca\u3d56\u0693\u2eeb\u828f\ua11b\ucfe2\uf2ab\u18d1\u6fb7\u9e32\u1652\u5ee4\ud7c8");
                break;
            }
            case 35: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6938\ud5d0\u62e2\ub443\u0d00\u7dd9\u63d8\u1978\u2125\ud8c3\udb27\u7478");
                break;
            }
            case 36: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63ea\u195a\u2101\ud8e7\udb32\u746d\u2197\ub6e1\u3d7a\u06b6\u2eb1\u82ab");
                break;
            }
            case 37: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63ea\u195a\u2101\ud8e7\udb32\u746d\u219b\ub6fe\u3d71\u06be\u2e95\u82a3\ua110\ucfe9");
                break;
            }
            case 38: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63d3\u196f\u212f\ud8ed\udb75\u7426\u219e\ub6ca\u3d56\u0693\u2eeb\u829f\ua115\ucffa\uf2a0\u18c4\u6fbb\u9e2f\u1655\u5eff");
                break;
            }
            case 39: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u693e\ud5d5\u62e7\ub401\u0d7d\u7df0\u63cf\u196e\u213d\ud8e1\udb2f\u7466\u21a0");
                break;
            }
            case 40: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6924\ud5cb\u62a5\ub47f\u0d5c\u7df8\u63d7\u197f\u211e\ud8fa\udb34\u746d\u21b5\ub6e3");
                break;
            }
            case 41: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6938\ud5d0\u62e2\ub443\u0d00\u7dd0\u63cb\u1979\u212c\ud8f7\udb0a\u7461\u21a7\ub6fa");
                break;
            }
            case 42: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63d3\u196f\u212f\ud8ed\udb75\u7426\u219e\ub6ca\u3d56\u0693\u2eeb\u8288\ua115\ucff8\uf2a4\u18d6\u6fb5\u9e35\u165e\u5ec6\ud7c3\u4c05\u6d93\uba66\u1cde\ua430\u4572\u870c\u6321\u1197\u4c4f\u24d8\ub87e\u6ead\u1371\uacff\uee35\u48da\u7b2f\u6b54\ud5de\ue1be\u6dbe\udaa1\u3871\uaf12\u5fc3\u89dd\u092d\u7960\ued49\ud5cd\ub334\u87ab\u7223\u0e8b");
                break;
            }
            case 43: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6938\ud5d0\u62e2\ub443\u0d00\u7ddd\u63d0\u1978\u2139");
                break;
            }
            case 44: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63d3\u196f\u212f\ud8ed\udb75\u7426\u219e\ub6ca\u3d56\u0693\u2eeb\u8288\ua115\ucff8\uf2a4\u18d6\u6fb5\u9e35\u165e\u5ec6\ud7c3\u4c05\u6d93\uba66\u1cde\ua430\u4572\u870c\u6338\u1188\u4c56\u24da\ub86d\u6eab\u136d\uacd0\uee1b\u48c6\u7b10\u6b7b\ud5d9\ue1b4\u6dbf\udab6");
                break;
            }
            case 45: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63d3\u196f\u212f\ud8ed\udb75\u7426\u219e\ub6ca\u3d56\u0693\u2eeb\u8288\ua115\ucff8\uf2a4\u18d6\u6fb5\u9e35\u165e\u5ec6\ud7c3\u4c05\u6d93\uba66\u1cde\ua430\u4572");
                break;
            }
            case 46: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u693e\ud5d5\u62e7\ub401\u0d7d\u7de5\u63d8\u197f\u2128\ud8e3\udb23\u7466\u21a0");
                break;
            }
            case 47: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63d3\u196f\u212f\ud8ed\udb75\u7426\u219e\ub6ca\u3d56\u0693\u2eeb\u8288\ua115\ucff8\uf2a4\u18d6\u6fb5\u9e35\u165e\u5ec6\ud7c3\u4c05\u6d93\uba66\u1cde\ua430\u4572\u870c\u6321\u1197\u4c4f\u24d8\ub87e\u6ead\u1371\uacff\uee35\u48da\u7b2f\u6b54\ud5de\ue1be\u6dbe\udaa1\u3871");
                break;
            }
            case 48: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6938\ud5d0\u62e2\ub443\u0d00\u7dd2\u63d6\u1967\u2121\ud8eb\udb25\u747c\u21bd\ub6e1\u3d7a\u06a3");
                break;
            }
            case 49: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u693e\ud5d5\u62e7\ub401\u0d7e\u7de3\u63dc\u197b\u212c\ud8fc\udb23\u746c\u2187\ub6fa\u3d75\u06a4\u2ebd\u82a1\ua111\ucfe2\uf2b1");
                break;
            }
            case 50: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7dd4\u63c1\u1968\u2128\ud8fe\udb32\u7461\u21bb\ub6e0");
                break;
            }
            case 51: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6938\ud5d0\u62e2\ub443\u0d00\u7dd8\u63cd\u196e\u213f\ud8ef\udb32\u7467\u21a6");
                break;
            }
            case 52: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6938\ud5d0\u62e2\ub443\u0d00\u7ddc\u63d8\u197b");
                break;
            }
            case 53: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7dde\u63db\u1961\u2128\ud8ed\udb32");
                break;
            }
            case 54: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63cc\u197f\u2124\ud8e2\udb68\u745b\u21a0\ub6fc\u3d7d\u06be\u2ebf\u8299\ua100\ucfe5\uf2a9\u18c7");
                break;
            }
            case 55: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7dd2\u63d5\u196a\u213e\ud8fd");
                break;
            }
            case 56: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6924\ud5cb\u62a5\ub466\u0d61\u7dd4\u63c1\u1968\u2128\ud8fe\udb32\u7461\u21bb\ub6e0");
                break;
            }
            case 57: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6938\ud5d0\u62e2\ub443\u0d00\u7dc1\u63cb\u1964\u213d\ud8eb\udb34\u747c\u21bd\ub6eb\u3d67");
                break;
            }
            case 58: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6924\ud5cb\u62a5\ub466\u0d40\u7de1\u63cc\u197f\u211e\ud8fa\udb34\u746d\u21b5\ub6e3");
                break;
            }
            case 59: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273f\u345a\u5915\u9b24\u4ccd\u693c\ud5c8\u62e2\ub45b\u0d4b\u7dbf\u63d3\u196f\u212f\ud8ed\udb75\u7426\u219e\ub6ca\u3d56\u0693\u2eeb\u829c\ua106\ucfe9\uf2b5\u18d5\u6fa6\u9e23\u165f\u5ed8\ud7d2\u4c10\u6d86\uba47\u1cd2\ua421\u457d\u875c");
                break;
            }
            case 60: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6938\ud5d0\u62e2\ub443\u0d00\u7dd3\u63d0\u197f\u211e\ud8eb\udb32");
                break;
            }
            case 61: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7dd7\u63d5\u1964\u212c\ud8fa");
                break;
            }
            case 62: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7dc2\u63d1\u1964\u213f\ud8fa");
                break;
            }
            case 63: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7dd3\u63d6\u1964\u2121\ud8eb\udb27\u7466");
                break;
            }
            case 64: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6921\ud5c5\u62e5\ub448\u0d00\u7dc2\u63cd\u1979\u2124\ud8e0\udb21\u744a\u21a1\ub6e8\u3d72\u06b5\u2eaa");
                break;
            }
            case 65: {
                className = JDBC3ResultSet$JDBC3Savepoint.i("\u273a\u3449\u5904\u9b6b\u4c90\u6924\ud5cb\u62a5\ub47d\u0d4b\u7df0\u63dd\u196e\u213f");
                break;
            }
            default: {
                throw new NoClassDefFoundError(Integer.toString(i));
            }
        }
        return Class.forName(className);
    }
    
    static Method K(int n) {
        n = ((n + 1318970881 ^ j.K) + 1689597752 ^ 0x43091617) + j.f;
        final int n2 = n >>> 16;
        n &= 0xFFFF;
        final Method method = (Method)j.b[n];
        if (method != null) {
            return method;
        }
        final Class y;
        Class superclass = y = y(n, n2);
        final int n3 = j.g[n];
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
                    return (Method)(j.b[n] = method2);
                }
            }
            superclass = superclass.getSuperclass();
        }
        for (Class superclass2 = y; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
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
                        return (Method)(j.b[n] = method3);
                    }
                }
            }
        }
        return null;
    }
    
    static Object x(final int i, final Object[] args) {
        try {
            final Method k = K(i);
            if (k == null) {
                throw new NoSuchMethodError(Integer.toString(i));
            }
            return k.invoke(null, args);
        }
        catch (InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
    
    static Object g(final Object obj, final int i, final Object[] args) {
        try {
            final Method k = K(i);
            if (k == null) {
                throw new NoSuchMethodError(Integer.toString(i));
            }
            return k.invoke(obj, args);
        }
        catch (InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
    
    static Object H(int i, final Object[] initargs) {
        try {
            i = ((i + 1318970881 ^ j.K) + 1689597752 ^ 0x43091617) + j.f;
            final int n = i >>> 16;
            i &= 0xFFFF;
            final Class y = y(i, n);
            Constructor constructor = (Constructor)j.b[i];
            if (constructor == null) {
                final int n2 = j.g[i];
                for (final Constructor constructor2 : y.getDeclaredConstructors()) {
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
                        j.b[i] = constructor2;
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
    
    private static Field t(int n) throws Throwable {
        n = ((n + 1318970881 ^ j.K) + 1689597752 ^ 0x43091617) + j.f;
        final int n2 = n >>> 16;
        n &= 0xFFFF;
        final Class y;
        Class superclass = y = y(n, n2);
        final Field field = (Field)j.b[n];
        if (field != null) {
            return field;
        }
        final int n3 = j.g[n];
        while (superclass != null) {
            for (final Field obj : superclass.getDeclaredFields()) {
                if (n3 == 31 * (31 * (31 * (31 * n2 + obj.getName().hashCode()) + 58) + obj.getType().getName().hashCode()) + n2) {
                    obj.setAccessible(true);
                    if (Modifier.isStatic(obj.getModifiers()) && Modifier.isFinal(obj.getModifiers())) {
                        final Field declaredField = Field.class.getDeclaredField(JDBC3Connection$JDBC3PreparedStatement.N("\u7aa4\ua77f\u44dd\u2371\u3333\u1581\u9a49\u21ad\u6a12"));
                        declaredField.setAccessible(true);
                        declaredField.setInt(obj, obj.getModifiers() & 0xFFFFFFEF);
                    }
                    return (Field)(j.b[n] = obj);
                }
            }
            superclass = superclass.getSuperclass();
        }
        for (Class clazz = y; clazz != null; clazz = clazz.getSuperclass()) {
            final Class[] interfaces = clazz.getInterfaces();
            for (int length2 = interfaces.length, j = 0; j < length2; ++j) {
                for (final Field obj2 : interfaces[j].getFields()) {
                    if (n3 == 31 * (31 * (31 * (31 * n2 + obj2.getName().hashCode()) + 58) + obj2.getType().getName().hashCode()) + n2) {
                        obj2.setAccessible(true);
                        if (Modifier.isStatic(obj2.getModifiers()) && Modifier.isFinal(obj2.getModifiers())) {
                            final Field declaredField2 = Field.class.getDeclaredField(JDBC3Connection$JDBC3PreparedStatement.N("\u7aa4\ua77f\u44dd\u2371\u3333\u1581\u9a49\u21ad\u6a12"));
                            declaredField2.setAccessible(true);
                            declaredField2.setInt(obj2, obj2.getModifiers() & 0xFFFFFFEF);
                        }
                        return (Field)(j.b[n] = obj2);
                    }
                }
                clazz = clazz.getSuperclass();
            }
        }
        return null;
    }
    
    static Object Y(final Object obj, final int i) {
        final Field t = t(i);
        if (t == null) {
            throw new NoSuchFieldError(Integer.toString(i));
        }
        return t.get(obj);
    }
    
    static void i(final Object obj, final int i, final Object value) throws Throwable {
        final Field t = t(i);
        if (t == null) {
            throw new NoSuchFieldError(Integer.toString(i));
        }
        t.set(obj, value);
    }
    
    static Object B(final int n) {
        return Y(null, n);
    }
    
    static void T(final int n, final Object o) {
        i(null, n, o);
    }
}
