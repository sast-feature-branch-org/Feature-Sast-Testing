import java.security.MessageDigest
object WeakHash {
  def weakHash(input: Array[Byte]): Array[Byte] =
    MessageDigest.getInstance("MD5").digest(input)
}