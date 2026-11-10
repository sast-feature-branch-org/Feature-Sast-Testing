#include <openssl/md5.h>
void weak_hash(const unsigned char *input, unsigned long length, unsigned char *digest) {
    MD5(input, length, digest);
}