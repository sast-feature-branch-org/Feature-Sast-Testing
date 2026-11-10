using System.Security.Cryptography;
public static class WeakHash {
    public static byte[] Hash(byte[] input) {
        using var md5 = MD5.Create();
        return md5.ComputeHash(input);
    }
}