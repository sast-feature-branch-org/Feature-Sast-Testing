import java.security.MessageDigest;
final class WeakHash {
    static byte[] hash(byte[] input) throws Exception {
        return MessageDigest.getInstance("MD5").digest(input);
    }
}