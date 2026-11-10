import java.security.MessageDigest
fun weakHash(input: ByteArray): ByteArray {
    return MessageDigest.getInstance("MD5").digest(input)
}