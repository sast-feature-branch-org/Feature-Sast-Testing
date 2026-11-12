package fixture
import "crypto/md5"
func weakHash(input []byte) [16]byte {
    return md5.Sum(input)
}