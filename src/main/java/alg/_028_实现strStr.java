package alg;

public class _028_实现strStr {

    public static int strStr1(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        if (needle.length() <= haystack.length()) {
            for (int i = 0; i < haystack.length(); i++) {
                for (int j = 0; j < needle.length(); j++) {
                    if (i + j >= haystack.length())
                        return -1;
                    if (haystack.charAt(i + j) != needle.charAt(j))
                        break;
                    if (j == needle.length() - 1)
                        return i;
                }
                if (haystack.length() - 1 - i < needle.length())
                    return -1;
            }
        }
        return -1;
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        if (needle.length() <= haystack.length()) {
            char[] hc = haystack.toCharArray();
            char[] nc = needle.toCharArray();
            int hLen = hc.length, nLen = nc.length;
            for (int i = 0; i < hLen; i++) {
                for (int j = 0; j < nLen; j++) {
                    if (i + j >= hLen)
                        return -1;
                    if (hc[i + j] != nc[j])
                        break;
                    if (j == nLen - 1)
                        return i;
                }
                if (hLen - 1 - i < nLen)
                    return -1;
            }
        }
        return -1;
    }
}
